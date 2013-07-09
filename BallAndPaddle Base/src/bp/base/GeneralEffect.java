package bp.base;

import java.util.Collections;
import java.util.List;

import org.alia4j.hierarchy.TypeHierarchyProvider;
import org.alia4j.languages.bp.action.DoubleAttributeAssignAction;
import org.alia4j.languages.bp.action.DoubleAttributeIncAction;
import org.alia4j.languages.bp.action.IntAttributeIncAction;
import org.alia4j.languages.bp.context.LocalDoubleVariableContext;
import org.alia4j.liam.Action;
import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.AtomicPredicateFactory;
import org.alia4j.liam.Attachment;
import org.alia4j.liam.BasicPredicate;
import org.alia4j.liam.Context;
import org.alia4j.liam.ContextFactory;
import org.alia4j.liam.ScheduleInfo;
import org.alia4j.liam.Specialization;
import org.alia4j.liam.pattern.MethodPattern;
import org.alia4j.patterns.ExceptionsPattern;
import org.alia4j.patterns.ModifiersPattern;
import org.alia4j.patterns.ParametersPattern;
import org.alia4j.patterns.TypePattern;
import org.alia4j.patterns.names.ExactNamePattern;
import org.alia4j.patterns.types.ExactClassTypePattern;

public class GeneralEffect extends Effect {

	private Attachment attachment;
	private AttributeType attributeType;
	private String attribute;
	
	//target
	private TargetType targetType;
	private Class<? extends BAPObject> bpObjectClass;
	private BAPObject bpObject;
	
	public GeneralEffect(String id, Class<? extends BAPObject> bpObjectClass) {
		super(id);
		targetType = TargetType.TYPE;
		this.bpObjectClass = bpObjectClass;
	}
	
	public GeneralEffect(String id, BAPObject bpObject) {
		super(id);
		targetType = TargetType.TYPE;
		this.bpObject = bpObject;
	}
	
	public enum AttributeType {
		DOUBLE,
		INT,
		BOOLEAN
	}
	
	private void generateAttachment() {
		//create attribute getter pattern 
		MethodPattern attributeGetter = new MethodPattern(
			ModifiersPattern.ANY,
			TypePattern.ANY,
			new ExactClassTypePattern(TypeHierarchyProvider.findOrCreateFromClass(bpObjectClass)),
			new ExactNamePattern("get"+Character.toUpperCase(attribute.charAt(0))+attribute.substring(1).toLowerCase()),
			ParametersPattern.ANY,
			ExceptionsPattern.ANY
		);
		
		//create pattern matching predicate
		BasicPredicate<AtomicPredicate> predicate = generatePredicate();

		//create attribute assign action
		Action attributeAssignAction = null;
		switch(attributeType) {
		case DOUBLE: attributeAssignAction = DoubleAttributeAssignAction.methodCallAction; break;
		case INT: attributeAssignAction = DoubleAttributeAssignAction.methodCallAction; break;
		case BOOLEAN: attributeAssignAction = DoubleAttributeAssignAction.methodCallAction; break;
		}
		
		Action attributeIncAction = null;
		switch(attributeType) {
		case DOUBLE: attributeIncAction = DoubleAttributeIncAction.methodCallAction; break;
		case INT: attributeIncAction = IntAttributeIncAction.methodCallAction; break;
		case BOOLEAN: assert(false);
		}
		
		Context newSize = ContextFactory.findOrCreateIntegerConstantContext(90);
		
		//contruct specialization
		//Predicate<AtomicPredicate> andPredicate = new AndPredicate<AtomicPredicate>(testPred, isFinalPred);
		Specialization specialization = new Specialization(attributeGetter, predicate, Collections.singletonList(newSize));
		
		attachment = new Attachment(Collections.singleton(specialization), attributeIncAction, ScheduleInfo.AROUND);
	}
	
	private BasicPredicate<AtomicPredicate> generatePredicate() {
		Context calleeContext = ContextFactory.findOrCreateCalleeContext();
		Context speedContext = new LocalDoubleVariableContext(calleeContext, "speed");
		Context thresholdContext = ContextFactory.findOrCreateDoubleConstantContext(1.5);
		Context exceedsContext = ContextFactory.findOrCreateGreaterContext(speedContext, thresholdContext);
		return new BasicPredicate<AtomicPredicate>(AtomicPredicateFactory.findOrCreateContextValuePredicate(exceedsContext), true);
	}
	
	
	
	
	///--------------------------------------------------------------------------------------------------
	
	
	
	
	
	//if TargetType is TargetType.Type then target is the class name of the target
	//if TargetType is TargetType.Object then target is the id of the target
	private String target;
	private TargetType type;
	//attributes used in the target line
	private List<EffectAttribute> targetAttributes;

	/**
	 * Creates a new general effect
	 * @param id the id of the effect
	 * @param type the kind of the target, Object or Type
	 * @param target the id or class of the target
	 */
	public GeneralEffect(String id, TargetType type, String target) {
		super(id);
		this.target=target;
		this.type=type;
	}
	
	/**
	 * Sets the target attributes for the target
	 * @param targetAttributes the target's target attributes
	 */
	public void setTargetAttributes(List<EffectAttribute> targetAttributes) {
		this.targetAttributes = targetAttributes;		
	}


	@Override
	public boolean isLegal(Level level) {
		//get type of the target
		EffectTarget targetType = null;
		boolean correct = true;
		if(type == TargetType.OBJECT){
			//search through list of all objects for the id target
			for(Block block : level.getBlocks())
				if(block.getId().equals(target))
					targetType = EffectTarget.BLOCK;
			for(Ball ball : level.getBalls())
				if(ball.getId().equals(target))
					targetType = EffectTarget.BALL;
			for(Paddle paddle : level.getPaddles())
				if(paddle.getId().equals(target))
					targetType = EffectTarget.PADDLE;	
			if(targetType==null)
				return false;
		}
		else{
			if(target.contains("Ball"))
				targetType = EffectTarget.BALL;
			else if(target.contains("Block"))
				targetType = EffectTarget.BLOCK;
			else
				targetType = EffectTarget.PADDLE;
		}
		//now the type is know, check if the effect target matches it.
		//the variable that is targeted does not have to be checked, the parser already does this
		correct &= targetType.equals(effectTarget);
		//check if all the parameters used with the target are legal for this type
		for(EffectAttribute attr : targetAttributes){
			if(targetType.equals(EffectTarget.BALL)){
				correct &= !attr.equals(EffectAttribute.HARDNESS) && !attr.equals(EffectAttribute.RESISTANCE);
			}
			else if(targetType.equals(EffectTarget.BLOCK)){
				correct &= attr.equals(EffectAttribute.HARDNESS) || attr.equals(EffectAttribute.RESISTANCE);
			}
			else{
				correct &= !attr.equals(EffectAttribute.SIZE) && !attr.equals(EffectAttribute.SPEED);
			}
		}
		//check if all the parameters used in the expression for the effect are legal for this type
		System.out.println(correct);
		return correct;
	}
}
