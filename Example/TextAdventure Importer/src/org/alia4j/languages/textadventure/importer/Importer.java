package org.alia4j.languages.textadventure.importer;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.alia4j.hierarchy.TypeDescriptorConstants;
import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.language.textadventure.Ability;
import org.alia4j.language.textadventure.Action;
import org.alia4j.language.textadventure.Binding;
import org.alia4j.language.textadventure.Condition;
import org.alia4j.language.textadventure.Effect;
import org.alia4j.language.textadventure.IgnoreItemAbility;
import org.alia4j.language.textadventure.Participant;
import org.alia4j.language.textadventure.Position;
import org.alia4j.language.textadventure.TextadventurePackage;
import org.alia4j.language.textadventure.Tile;
import org.alia4j.languages.textadventure.actions.RemoveAction;
import org.alia4j.languages.textadventure.actions.ScopeAction;
import org.alia4j.languages.textadventure.context.TAContextFactory;
import org.alia4j.languages.textadventure.predicate.TAAtomicPredicateFactory;
import org.alia4j.liam.ActionFactory;
import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.Attachment;
import org.alia4j.liam.AttachmentReference;
import org.alia4j.liam.BasicPredicate;
import org.alia4j.liam.CompositionRule;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.ScheduleInfo;
import org.alia4j.liam.Specialization;
import org.alia4j.liam.TruePredicate;
import org.alia4j.liam.pattern.MethodPattern;
import org.alia4j.liam.signature.ResolutionStrategy;
import org.alia4j.patterns.ClassTypePattern;
import org.alia4j.patterns.ExceptionsPattern;
import org.alia4j.patterns.ModifiersPattern;
import org.alia4j.patterns.NamePattern;
import org.alia4j.patterns.ParametersPattern;
import org.alia4j.patterns.TypePattern;
import org.alia4j.patterns.names.ExactNamePattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import textadventure.base.Item;
import textadventure.base.Person;
import textadventure.base.World;

public class Importer implements org.alia4j.fial.Importer {

	static {
		Importer.initializeFactory("textadventure.context",
		"org.alia4j.languages.textadventure.context.TAContextFactory");
		Importer.initializeFactory("textadventure.predicate",
		"org.alia4j.languages.textadventure.predicate.TAAtomicPredicateFactory");
	}

	private boolean initialized = false;

	private List<Attachment> initialAttachments = new ArrayList<Attachment>();
	private List<CompositionRule> initialCompositionRules = new ArrayList<CompositionRule>();
	private Map<org.alia4j.language.textadventure.Item, List<Attachment>> item2behavior = new HashMap<org.alia4j.language.textadventure.Item, List<Attachment>>();


	private Map<Binding, SharedValue> sharedValues = new HashMap<Binding, SharedValue>();


	private static void initializeFactory(final String property,
			final String defaultValue) {
		try {
			final Class<?> factory = ClassLoader.getSystemClassLoader()
					.loadClass(
							java.lang.System
									.getProperty(property, defaultValue));
			factory.newInstance();
		} catch (final Exception e) {
			throw new Error("Cannot initialize factory", e);
		}
	}

	private final ClassLoader systemClassLoader;

	public Importer(ClassLoader systemClassLoader) {
		this.systemClassLoader = systemClassLoader;

	}

	@Override
	public void performImport() {
		if (initialized)
			throw new Error("Importer has already been executed.");
		initialized = true;

		URL mainFile = systemClassLoader.getResource(System
				.getProperty("textadventure.main") + ".xmi");
		if (mainFile == null) {
			System.out.println("No text adventure file specified (use VM argument -Dtextadventure.main=<class-path-relative-file-name>");
		}

		//-----------------------
		// Read AST
		//-----------------------

		// Initialize the model
		TextadventurePackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI
				.createURI(mainFile.toExternalForm()), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		org.alia4j.language.textadventure.World worldDefinition = (org.alia4j.language.textadventure.World) resource.getContents().get(0);

		//-----------------------
		// Process AST
		//-----------------------

		World world = World.getInstance();

		// determine dimension of the World and initialize the tiles
		EList<Tile> tiles = worldDefinition.getTiles();
		int width = 0;
		int height = 0;
		for (Tile tile : tiles) {
			if (tile.getX() >= width)
				width = tile.getX() + 1;
			if (tile.getY() >= height)
				height = tile.getY() + 1;
		}
		world.setDimension(width, height);

		for (Tile tile : tiles) {
			world.setTile(new textadventure.base.Tile(tile.getId(), tile.getDescription()), tile.getX(), tile.getY());
		}

		for (org.alia4j.language.textadventure.Item item : worldDefinition.getItems()) {
			Item i = new Item(item.getName());
			textadventure.base.Tile.getTile(item.getLocation().getId()).addItem(i);
			setupBehavior(item);
		}

		for (org.alia4j.language.textadventure.Person person : worldDefinition.getPersons()) {
			Person p = new Person(person.getName());
			textadventure.base.Tile.getTile(person.getLocation().getId()).addPerson(p);
			setupBehavior(person);
		}

		//-----------------------
		// Deploy all definitions
		//-----------------------

		CompositionRule[] toDeployRules = new CompositionRule[initialCompositionRules.size()];
		org.alia4j.fial.System.deploy(initialCompositionRules.toArray(toDeployRules));
		Attachment[] toDeploy = new Attachment[initialAttachments.size()];
		org.alia4j.fial.System.deploy(initialAttachments.toArray(toDeploy));
	}

	private void setupBehavior(
			org.alia4j.language.textadventure.Person person) {
		for (Ability ability : person.getAbilities()) {
			if (ability instanceof IgnoreItemAbility) {
				setupIgnoreAbility(person, ability);
			}
			else {
				throw new UnsupportedOperationException();
			}
		}
	}

	private void setupBehavior(org.alia4j.language.textadventure.Item item) {
		List<Attachment> allActionAttachments = new ArrayList<Attachment>();
		for (Effect effect : item.getEffects()) {
			EList<Action> actions = effect.getAction();
			List<Attachment> actionAttachments = new ArrayList<Attachment>();
			for (Action action : actions) {
				if (action instanceof org.alia4j.language.textadventure.RemoveAction) {
					setupRemoveAction(actionAttachments, action);
				}
				else {
					throw new UnsupportedOperationException();
				}
			}
			allActionAttachments.addAll(actionAttachments);

			Condition condition = effect.getCondition();
			if (condition == Condition.USED) {
				setupUsageScope(item, effect, actionAttachments);
			}
			else {
				throw new UnsupportedOperationException();
			}
		}
		item2behavior.put(item, allActionAttachments);
	}

	private void setupIgnoreAbility(
			org.alia4j.language.textadventure.Person person, Ability ability) {
		MethodPattern pattern = new MethodPattern(ModifiersPattern.ANY,
				TypePattern.ANY, ClassTypePattern.ANY,
				NamePattern.ANY, ParametersPattern.ANY,
				ExceptionsPattern.ANY);

		Specialization specialization = new Specialization(pattern,
				new BasicPredicate<AtomicPredicate>(
						TAAtomicPredicateFactory.findOrCreateIsSamePredicate(
								ContextFactory.findOrCreateObjectConstantContext(Person.getPerson(person.getName())),
								TAContextFactory.findOrCreateLocalVariableContext("ego")),
								true),
				Collections.<Context>emptyList());

		Set<AttachmentReference> toIgnore = new HashSet<AttachmentReference>();
		toIgnore.addAll(item2behavior.get(((IgnoreItemAbility) ability).getIgnoredItem()));
		Attachment ignoreAttachment = new Attachment(
				Collections.singleton(specialization),
				ActionFactory.findOrCreateNoOpAction(), ScheduleInfo.BEFORE);
		initialCompositionRules.add(new CompositionRule(
				Collections.singleton(ignoreAttachment),
				Collections.<AttachmentReference>emptySet(),
				Collections.<AttachmentReference>emptySet(),
				toIgnore,
				true));
		initialAttachments.add(ignoreAttachment);
	}

	private void setupRemoveAction(List<Attachment> actionAttachments,
			Action action) {
		org.alia4j.language.textadventure.RemoveAction removeAction = (org.alia4j.language.textadventure.RemoveAction) action;
		Binding what = removeAction.getWhat();
		Attachment removalAttachment;
		Context scopeSharedValueContext = ContextFactory
				.findOrCreateObjectConstantContext(getSharedValue(what));
		{
			if (removeAction.getFrom().getPosition() == Position.RESULT) {
				MethodPattern pattern = new MethodPattern(ModifiersPattern.ANY,
						TypePattern.ANY, ClassTypePattern.ANY,
						new ExactNamePattern("get" + removeAction.getFrom().getProperty()),
							ParametersPattern.ANY,
						ExceptionsPattern.ANY);

				Specialization specialization = new Specialization(pattern,
						TruePredicate.<AtomicPredicate> truePredicate(),
						Collections.singletonList(scopeSharedValueContext));

				removalAttachment = new Attachment(
						Collections.singleton(specialization),
						ActionFactory.findOrCreateMethodCallAction(
								TypeHierarchyProvider
										.findOrCreateFromClass(RemoveAction.class),
								"removeFromResultList",
								TypeHierarchyProvider
										.findOrCreateFromClasses(new Class[] { SharedValue.class }),
								TypeHierarchyProvider
										.findOrCreateFromClass(List.class),
								ResolutionStrategy.STATIC), ScheduleInfo.AROUND);
				actionAttachments.add(removalAttachment);
			}
			else {
				throw new UnsupportedOperationException();
			}
		}
	}

	private void setupUsageScope(org.alia4j.language.textadventure.Item item,
			Effect effect, List<Attachment> actionAttachments) {

		Context itemContext = ContextFactory
				.findOrCreateObjectConstantContext(Item.getItem(item.getName()));

		//-----------------------
		// Capture begin of scope
		//-----------------------

		Context scopeSharedValueContext = ContextFactory
				.findOrCreateObjectConstantContext(getSharedValue(effect.getBinding().get(0)));

		MethodPattern pattern = new MethodPattern(ModifiersPattern.ANY,
				TypePattern.ANY, ClassTypePattern.ANY,
				new ExactNamePattern("use"), ParametersPattern.ANY,
				ExceptionsPattern.ANY);

		Specialization specialization = new Specialization(
				pattern,
				new BasicPredicate<AtomicPredicate>(TAAtomicPredicateFactory.findOrCreateIsSamePredicate(
						itemContext, ContextFactory
								.findOrCreateCalleeContext()), true),
	            // also depends on "exactly one Binding"
				Arrays.asList(
						getContextFor(effect.getBinding().get(0).getParticipant()),
						scopeSharedValueContext,
						ContextFactory
								.findOrCreateObjectConstantContext(actionAttachments)));

		initialAttachments.add(new Attachment(
				Collections.singleton(specialization),
				ActionFactory.findOrCreateMethodCallAction(
						TypeHierarchyProvider
								.findOrCreateFromClass(ScopeAction.class),
						"enableScope", TypeHierarchyProvider
								.findOrCreateFromClasses(new Class[] {
										Object.class, SharedValue.class,
										List.class }),
						TypeDescriptorConstants.VOID_PRIMITIVE,
						ResolutionStrategy.STATIC), ScheduleInfo.AFTER));

		//-----------------------
		// Capture end of scope
		//-----------------------

		pattern = new MethodPattern(ModifiersPattern.ANY,
				TypePattern.ANY, ClassTypePattern.ANY,
				new ExactNamePattern("removeFromInventory"),
				ParametersPattern.ANY, ExceptionsPattern.ANY);

		specialization = new Specialization(
				pattern,
				new BasicPredicate<AtomicPredicate>(TAAtomicPredicateFactory.findOrCreateIsSamePredicate(
						itemContext, ContextFactory
								.findOrCreateArgumentContext(0)), true),
				Collections.singletonList(ContextFactory
						.findOrCreateObjectConstantContext(actionAttachments)));

		initialAttachments.add(new Attachment(
				Collections.singleton(specialization),
				ActionFactory.findOrCreateMethodCallAction(
						TypeHierarchyProvider
								.findOrCreateFromClass(ScopeAction.class),
						"disableScope",
						TypeHierarchyProvider
								.findOrCreateFromClasses(new Class[] { List.class }),
						TypeDescriptorConstants.VOID_PRIMITIVE,
						ResolutionStrategy.STATIC), ScheduleInfo.AFTER));
	}

	private Context getContextFor(Participant participant) {
		if (participant == Participant.ON)
			return TAContextFactory.findOrCreateLocalVariableContext("ego");
		else
			 throw new UnsupportedOperationException();
	}

	private SharedValue getSharedValue(Binding binding) {
		SharedValue result = sharedValues.get(binding);
		if (result == null) {
			result = new SharedValue();
			sharedValues.put(binding, result);
		}
		return result;
	}

}
