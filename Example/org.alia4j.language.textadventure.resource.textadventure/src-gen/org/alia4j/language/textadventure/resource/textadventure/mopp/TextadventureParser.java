// $ANTLR 3.4

	package org.alia4j.language.textadventure.resource.textadventure.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TextadventureParser extends TextadventureANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "FLOAT", "INTEGER", "LINEBREAK", "QUOTED_34_34", "TEXT", "WHITESPACE", "'='", "'@'", "'Items'", "'Persons'", "'Tile'", "'description'", "'from'", "'ignore'", "'item'", "'on'", "'person'", "'remove'", "'result'", "'tile'", "'used'", "'while'", "'x'", "'y'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int COMMENT=4;
    public static final int FLOAT=5;
    public static final int INTEGER=6;
    public static final int LINEBREAK=7;
    public static final int QUOTED_34_34=8;
    public static final int TEXT=9;
    public static final int WHITESPACE=10;

    // delegates
    public TextadventureANTLRParserBase[] getDelegates() {
        return new TextadventureANTLRParserBase[] {};
    }

    // delegators


    public TextadventureParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TextadventureParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(20 + 1);
         

    }

    public String[] getTokenNames() { return TextadventureParser.tokenNames; }
    public String getGrammarFileName() { return "Textadventure.g"; }


    	private org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolverFactory tokenResolverFactory = new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal> expectedElements = new java.util.ArrayList<org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new org.alia4j.language.textadventure.resource.textadventure.ITextadventureCommand<org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource>() {
    			public boolean execute(org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.alia4j.language.textadventure.resource.textadventure.ITextadventureProblem() {
    					public org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemSeverity getSeverity() {
    						return org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemSeverity.ERROR;
    					}
    					public org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemType getType() {
    						return org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		int terminalID = ids[0];
    		int followSetID = ids[1];
    		org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement terminal = org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureFollowSetProvider.TERMINALS[terminalID];
    		org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContainedFeature[] containmentFeatures = new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureFollowSetProvider.LINKS[ids[i]];
    		}
    		org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureContainmentTrace containmentTrace = new org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal expectedElement = new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal(container, terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    			this.expectedElementsIndexOfLastCompleteElement = 0;
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.alia4j.language.textadventure.resource.textadventure.ITextadventureCommand<org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource>() {
    			public boolean execute(org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource resource) {
    				org.alia4j.language.textadventure.resource.textadventure.ITextadventureLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.alia4j.language.textadventure.resource.textadventure.ITextadventureCommand<org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource>() {
    			public boolean execute(org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource resource) {
    				org.alia4j.language.textadventure.resource.textadventure.ITextadventureLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.ITextadventureCommand<org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.alia4j.language.textadventure.resource.textadventure.ITextadventureCommand<org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource>() {
    			public boolean execute(org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource resource) {
    				org.alia4j.language.textadventure.resource.textadventure.ITextadventureLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new TextadventureParser(new org.antlr.runtime3_4_0.CommonTokenStream(new TextadventureLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new TextadventureParser(new org.antlr.runtime3_4_0.CommonTokenStream(new TextadventureLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new org.alia4j.language.textadventure.resource.textadventure.util.TextadventureRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public TextadventureParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((TextadventureLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((TextadventureLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.alia4j.language.textadventure.World.class) {
    				return parse_org_alia4j_language_textadventure_World();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.textadventure.Tile.class) {
    				return parse_org_alia4j_language_textadventure_Tile();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.textadventure.Item.class) {
    				return parse_org_alia4j_language_textadventure_Item();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.textadventure.Binding.class) {
    				return parse_org_alia4j_language_textadventure_Binding();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.textadventure.WhileEffect.class) {
    				return parse_org_alia4j_language_textadventure_WhileEffect();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.textadventure.RemoveAction.class) {
    				return parse_org_alia4j_language_textadventure_RemoveAction();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.textadventure.List.class) {
    				return parse_org_alia4j_language_textadventure_List();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.textadventure.Person.class) {
    				return parse_org_alia4j_language_textadventure_Person();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.textadventure.IgnoreItemAbility.class) {
    				return parse_org_alia4j_language_textadventure_IgnoreItemAbility();
    			}
    		}
    		throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(org.alia4j.language.textadventure.resource.textadventure.ITextadventureOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.alia4j.language.textadventure.resource.textadventure.ITextadventureCommand<org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource>>();
    		org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureParseResult parseResult = new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		org.alia4j.language.textadventure.resource.textadventure.ITextadventureParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (org.alia4j.language.textadventure.resource.textadventure.ITextadventureCommand<org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal>();
    		java.util.List<org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal> newFollowSet = new java.util.ArrayList<org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 50;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.alia4j.language.textadventure.resource.textadventure.util.TextadventurePair<org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.alia4j.language.textadventure.resource.textadventure.util.TextadventurePair<org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContainedFeature[]> newFollowerPair : newFollowers) {
    							org.alia4j.language.textadventure.resource.textadventure.ITextadventureExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureContainmentTrace containmentTrace = new org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureContainmentTrace(null, newFollowerPair.getRight());
    							org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal newFollowTerminal = new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal(container, newFollower, followSetID, containmentTrace);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
    			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
    			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private void startIncompleteElement(Object object) {
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
    		}
    	}
    	
    	private void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			boolean exists = this.incompleteObjects.remove(object);
    			if (!exists) {
    			}
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
    		if (incompleteObjects.isEmpty()) {
    			return null;
    		}
    		return incompleteObjects.get(incompleteObjects.size() - 1);
    	}
    	



    // $ANTLR start "start"
    // Textadventure.g:523:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_alia4j_language_textadventure_World ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        org.alia4j.language.textadventure.World c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Textadventure.g:524:2: ( (c0= parse_org_alia4j_language_textadventure_World ) EOF )
            // Textadventure.g:525:2: (c0= parse_org_alia4j_language_textadventure_World ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[0]);
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[1]);
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[2]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Textadventure.g:532:2: (c0= parse_org_alia4j_language_textadventure_World )
            // Textadventure.g:533:3: c0= parse_org_alia4j_language_textadventure_World
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_World_in_start82);
            c0=parse_org_alia4j_language_textadventure_World();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_org_alia4j_language_textadventure_World"
    // Textadventure.g:541:1: parse_org_alia4j_language_textadventure_World returns [org.alia4j.language.textadventure.World element = null] : ( (a0_0= parse_org_alia4j_language_textadventure_Tile ) )* ( (a1_0= parse_org_alia4j_language_textadventure_Item ) )* ( (a2_0= parse_org_alia4j_language_textadventure_Person ) )* ;
    public final org.alia4j.language.textadventure.World parse_org_alia4j_language_textadventure_World() throws RecognitionException {
        org.alia4j.language.textadventure.World element =  null;

        int parse_org_alia4j_language_textadventure_World_StartIndex = input.index();

        org.alia4j.language.textadventure.Tile a0_0 =null;

        org.alia4j.language.textadventure.Item a1_0 =null;

        org.alia4j.language.textadventure.Person a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Textadventure.g:544:2: ( ( (a0_0= parse_org_alia4j_language_textadventure_Tile ) )* ( (a1_0= parse_org_alia4j_language_textadventure_Item ) )* ( (a2_0= parse_org_alia4j_language_textadventure_Person ) )* )
            // Textadventure.g:545:2: ( (a0_0= parse_org_alia4j_language_textadventure_Tile ) )* ( (a1_0= parse_org_alia4j_language_textadventure_Item ) )* ( (a2_0= parse_org_alia4j_language_textadventure_Person ) )*
            {
            // Textadventure.g:545:2: ( (a0_0= parse_org_alia4j_language_textadventure_Tile ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Textadventure.g:546:3: (a0_0= parse_org_alia4j_language_textadventure_Tile )
            	    {
            	    // Textadventure.g:546:3: (a0_0= parse_org_alia4j_language_textadventure_Tile )
            	    // Textadventure.g:547:4: a0_0= parse_org_alia4j_language_textadventure_Tile
            	    {
            	    pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_Tile_in_parse_org_alia4j_language_textadventure_World124);
            	    a0_0=parse_org_alia4j_language_textadventure_Tile();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWorld();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a0_0 != null) {
            	    					if (a0_0 != null) {
            	    						Object value = a0_0;
            	    						addObjectToList(element, org.alia4j.language.textadventure.TextadventurePackage.WORLD__TILES, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_0_0_0_0, a0_0, true);
            	    					copyLocalizationInfos(a0_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[4]);
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[5]);
            	}

            // Textadventure.g:575:2: ( (a1_0= parse_org_alia4j_language_textadventure_Item ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Textadventure.g:576:3: (a1_0= parse_org_alia4j_language_textadventure_Item )
            	    {
            	    // Textadventure.g:576:3: (a1_0= parse_org_alia4j_language_textadventure_Item )
            	    // Textadventure.g:577:4: a1_0= parse_org_alia4j_language_textadventure_Item
            	    {
            	    pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_Item_in_parse_org_alia4j_language_textadventure_World159);
            	    a1_0=parse_org_alia4j_language_textadventure_Item();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWorld();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a1_0 != null) {
            	    					if (a1_0 != null) {
            	    						Object value = a1_0;
            	    						addObjectToList(element, org.alia4j.language.textadventure.TextadventurePackage.WORLD__ITEMS, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_0_0_0_1, a1_0, true);
            	    					copyLocalizationInfos(a1_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[6]);
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[7]);
            	}

            // Textadventure.g:604:2: ( (a2_0= parse_org_alia4j_language_textadventure_Person ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Textadventure.g:605:3: (a2_0= parse_org_alia4j_language_textadventure_Person )
            	    {
            	    // Textadventure.g:605:3: (a2_0= parse_org_alia4j_language_textadventure_Person )
            	    // Textadventure.g:606:4: a2_0= parse_org_alia4j_language_textadventure_Person
            	    {
            	    pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_Person_in_parse_org_alia4j_language_textadventure_World194);
            	    a2_0=parse_org_alia4j_language_textadventure_Person();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWorld();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a2_0 != null) {
            	    					if (a2_0 != null) {
            	    						Object value = a2_0;
            	    						addObjectToList(element, org.alia4j.language.textadventure.TextadventurePackage.WORLD__PERSONS, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_0_0_0_2, a2_0, true);
            	    					copyLocalizationInfos(a2_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[8]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_alia4j_language_textadventure_World_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_World"



    // $ANTLR start "parse_org_alia4j_language_textadventure_Tile"
    // Textadventure.g:634:1: parse_org_alia4j_language_textadventure_Tile returns [org.alia4j.language.textadventure.Tile element = null] : a0= 'tile' (a1= TEXT ) a2= '{' a3= 'x' a4= '=' (a5= INTEGER ) a6= 'y' a7= '=' (a8= INTEGER ) a9= 'description' a10= '=' (a11= QUOTED_34_34 ) a12= '}' ;
    public final org.alia4j.language.textadventure.Tile parse_org_alia4j_language_textadventure_Tile() throws RecognitionException {
        org.alia4j.language.textadventure.Tile element =  null;

        int parse_org_alia4j_language_textadventure_Tile_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Textadventure.g:637:2: (a0= 'tile' (a1= TEXT ) a2= '{' a3= 'x' a4= '=' (a5= INTEGER ) a6= 'y' a7= '=' (a8= INTEGER ) a9= 'description' a10= '=' (a11= QUOTED_34_34 ) a12= '}' )
            // Textadventure.g:638:2: a0= 'tile' (a1= TEXT ) a2= '{' a3= 'x' a4= '=' (a5= INTEGER ) a6= 'y' a7= '=' (a8= INTEGER ) a9= 'description' a10= '=' (a11= QUOTED_34_34 ) a12= '}'
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_textadventure_Tile235); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[9]);
            	}

            // Textadventure.g:652:2: (a1= TEXT )
            // Textadventure.g:653:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Tile253); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[10]);
            	}

            a2=(Token)match(input,29,FOLLOW_29_in_parse_org_alia4j_language_textadventure_Tile274); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[11]);
            	}

            a3=(Token)match(input,27,FOLLOW_27_in_parse_org_alia4j_language_textadventure_Tile288); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[12]);
            	}

            a4=(Token)match(input,11,FOLLOW_11_in_parse_org_alia4j_language_textadventure_Tile302); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[13]);
            	}

            // Textadventure.g:730:2: (a5= INTEGER )
            // Textadventure.g:731:3: a5= INTEGER
            {
            a5=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_textadventure_Tile320); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            				startIncompleteElement(element);
            			}
            			if (a5 != null) {
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__X), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__X), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_5, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[14]);
            	}

            a6=(Token)match(input,28,FOLLOW_28_in_parse_org_alia4j_language_textadventure_Tile341); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[15]);
            	}

            a7=(Token)match(input,11,FOLLOW_11_in_parse_org_alia4j_language_textadventure_Tile355); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[16]);
            	}

            // Textadventure.g:794:2: (a8= INTEGER )
            // Textadventure.g:795:3: a8= INTEGER
            {
            a8=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_textadventure_Tile373); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            				startIncompleteElement(element);
            			}
            			if (a8 != null) {
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__Y), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__Y), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_8, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[17]);
            	}

            a9=(Token)match(input,16,FOLLOW_16_in_parse_org_alia4j_language_textadventure_Tile394); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[18]);
            	}

            a10=(Token)match(input,11,FOLLOW_11_in_parse_org_alia4j_language_textadventure_Tile408); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[19]);
            	}

            // Textadventure.g:858:2: (a11= QUOTED_34_34 )
            // Textadventure.g:859:3: a11= QUOTED_34_34
            {
            a11=(Token)match(input,QUOTED_34_34,FOLLOW_QUOTED_34_34_in_parse_org_alia4j_language_textadventure_Tile426); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            				startIncompleteElement(element);
            			}
            			if (a11 != null) {
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__DESCRIPTION), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__DESCRIPTION), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_11, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[20]);
            	}

            a12=(Token)match(input,30,FOLLOW_30_in_parse_org_alia4j_language_textadventure_Tile447); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_12, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[21]);
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[22]);
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[23]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_alia4j_language_textadventure_Tile_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_Tile"



    // $ANTLR start "parse_org_alia4j_language_textadventure_Item"
    // Textadventure.g:912:1: parse_org_alia4j_language_textadventure_Item returns [org.alia4j.language.textadventure.Item element = null] : a0= 'item' (a1= TEXT ) ( (a2= '@' (a3= TEXT ) ) )? a4= '{' ( ( (a5_0= parse_org_alia4j_language_textadventure_Effect ) ) )* a6= '}' ;
    public final org.alia4j.language.textadventure.Item parse_org_alia4j_language_textadventure_Item() throws RecognitionException {
        org.alia4j.language.textadventure.Item element =  null;

        int parse_org_alia4j_language_textadventure_Item_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        org.alia4j.language.textadventure.Effect a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Textadventure.g:915:2: (a0= 'item' (a1= TEXT ) ( (a2= '@' (a3= TEXT ) ) )? a4= '{' ( ( (a5_0= parse_org_alia4j_language_textadventure_Effect ) ) )* a6= '}' )
            // Textadventure.g:916:2: a0= 'item' (a1= TEXT ) ( (a2= '@' (a3= TEXT ) ) )? a4= '{' ( ( (a5_0= parse_org_alia4j_language_textadventure_Effect ) ) )* a6= '}'
            {
            a0=(Token)match(input,19,FOLLOW_19_in_parse_org_alia4j_language_textadventure_Item476); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[24]);
            	}

            // Textadventure.g:930:2: (a1= TEXT )
            // Textadventure.g:931:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Item494); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_2_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[25]);
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[26]);
            	}

            // Textadventure.g:967:2: ( (a2= '@' (a3= TEXT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Textadventure.g:968:3: (a2= '@' (a3= TEXT ) )
                    {
                    // Textadventure.g:968:3: (a2= '@' (a3= TEXT ) )
                    // Textadventure.g:969:4: a2= '@' (a3= TEXT )
                    {
                    a2=(Token)match(input,12,FOLLOW_12_in_parse_org_alia4j_language_textadventure_Item524); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_2_0_0_2_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[27]);
                    			}

                    // Textadventure.g:983:4: (a3= TEXT )
                    // Textadventure.g:984:5: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Item550); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
                    						startIncompleteElement(element);
                    					}
                    					if (a3 != null) {
                    						org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    						tokenResolver.setOptions(getOptions());
                    						org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__LOCATION), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
                    						}
                    						String resolved = (String) resolvedObject;
                    						org.alia4j.language.textadventure.Tile proxy = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
                    						collectHiddenTokens(element);
                    						registerContextDependentProxy(new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContextDependentURIFragmentFactory<org.alia4j.language.textadventure.Item, org.alia4j.language.textadventure.Tile>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getItemLocationReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__LOCATION), resolved, proxy);
                    						if (proxy != null) {
                    							Object value = proxy;
                    							element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__LOCATION), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_2_0_0_2_0_0_1, proxy, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[28]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[29]);
            	}

            a4=(Token)match(input,29,FOLLOW_29_in_parse_org_alia4j_language_textadventure_Item596); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_2_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[30]);
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[31]);
            	}

            // Textadventure.g:1045:2: ( ( (a5_0= parse_org_alia4j_language_textadventure_Effect ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Textadventure.g:1046:3: ( (a5_0= parse_org_alia4j_language_textadventure_Effect ) )
            	    {
            	    // Textadventure.g:1046:3: ( (a5_0= parse_org_alia4j_language_textadventure_Effect ) )
            	    // Textadventure.g:1047:4: (a5_0= parse_org_alia4j_language_textadventure_Effect )
            	    {
            	    // Textadventure.g:1047:4: (a5_0= parse_org_alia4j_language_textadventure_Effect )
            	    // Textadventure.g:1048:5: a5_0= parse_org_alia4j_language_textadventure_Effect
            	    {
            	    pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_Effect_in_parse_org_alia4j_language_textadventure_Item625);
            	    a5_0=parse_org_alia4j_language_textadventure_Effect();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a5_0 != null) {
            	    						if (a5_0 != null) {
            	    							Object value = a5_0;
            	    							addObjectToList(element, org.alia4j.language.textadventure.TextadventurePackage.ITEM__EFFECTS, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_2_0_0_4_0_0_0, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[32]);
            	    				addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[33]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[34]);
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[35]);
            	}

            a6=(Token)match(input,30,FOLLOW_30_in_parse_org_alia4j_language_textadventure_Item666); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_2_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[36]);
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[37]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_alia4j_language_textadventure_Item_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_Item"



    // $ANTLR start "parse_org_alia4j_language_textadventure_Binding"
    // Textadventure.g:1099:1: parse_org_alia4j_language_textadventure_Binding returns [org.alia4j.language.textadventure.Binding element = null] : ( (a0= 'on' ) ) (a3= TEXT ) ;
    public final org.alia4j.language.textadventure.Binding parse_org_alia4j_language_textadventure_Binding() throws RecognitionException {
        org.alia4j.language.textadventure.Binding element =  null;

        int parse_org_alia4j_language_textadventure_Binding_StartIndex = input.index();

        Token a0=null;
        Token a3=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Textadventure.g:1102:2: ( ( (a0= 'on' ) ) (a3= TEXT ) )
            // Textadventure.g:1103:2: ( (a0= 'on' ) ) (a3= TEXT )
            {
            // Textadventure.g:1103:2: ( (a0= 'on' ) )
            // Textadventure.g:1104:3: (a0= 'on' )
            {
            // Textadventure.g:1104:3: (a0= 'on' )
            // Textadventure.g:1105:4: a0= 'on'
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_org_alia4j_language_textadventure_Binding704); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            				if (element == null) {
            					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createBinding();
            					startIncompleteElement(element);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_3_0_0_0, null, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            				// set value of enumeration attribute
            				Object value = org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getParticipant().getEEnumLiteral(org.alia4j.language.textadventure.Participant.ON_VALUE).getInstance();
            				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.BINDING__PARTICIPANT), value);
            				completedElement(value, false);
            			}

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[38]);
            	}

            // Textadventure.g:1125:2: (a3= TEXT )
            // Textadventure.g:1126:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Binding729); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createBinding();
            				startIncompleteElement(element);
            			}
            			if (a3 != null) {
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.BINDING__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.BINDING__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_3_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[39]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_alia4j_language_textadventure_Binding_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_Binding"



    // $ANTLR start "parse_org_alia4j_language_textadventure_WhileEffect"
    // Textadventure.g:1163:1: parse_org_alia4j_language_textadventure_WhileEffect returns [org.alia4j.language.textadventure.WhileEffect element = null] : a0= 'while' ( (a1= 'used' ) ) (a4_0= parse_org_alia4j_language_textadventure_Binding ) a5= '{' (a6_0= parse_org_alia4j_language_textadventure_Action ) a7= '}' ;
    public final org.alia4j.language.textadventure.WhileEffect parse_org_alia4j_language_textadventure_WhileEffect() throws RecognitionException {
        org.alia4j.language.textadventure.WhileEffect element =  null;

        int parse_org_alia4j_language_textadventure_WhileEffect_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a5=null;
        Token a7=null;
        org.alia4j.language.textadventure.Binding a4_0 =null;

        org.alia4j.language.textadventure.Action a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Textadventure.g:1166:2: (a0= 'while' ( (a1= 'used' ) ) (a4_0= parse_org_alia4j_language_textadventure_Binding ) a5= '{' (a6_0= parse_org_alia4j_language_textadventure_Action ) a7= '}' )
            // Textadventure.g:1167:2: a0= 'while' ( (a1= 'used' ) ) (a4_0= parse_org_alia4j_language_textadventure_Binding ) a5= '{' (a6_0= parse_org_alia4j_language_textadventure_Action ) a7= '}'
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_org_alia4j_language_textadventure_WhileEffect765); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWhileEffect();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_4_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[40]);
            	}

            // Textadventure.g:1181:2: ( (a1= 'used' ) )
            // Textadventure.g:1182:3: (a1= 'used' )
            {
            // Textadventure.g:1182:3: (a1= 'used' )
            // Textadventure.g:1183:4: a1= 'used'
            {
            a1=(Token)match(input,25,FOLLOW_25_in_parse_org_alia4j_language_textadventure_WhileEffect788); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            				if (element == null) {
            					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWhileEffect();
            					startIncompleteElement(element);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_4_0_0_1, null, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            				// set value of enumeration attribute
            				Object value = org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getCondition().getEEnumLiteral(org.alia4j.language.textadventure.Condition.USED_VALUE).getInstance();
            				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WHILE_EFFECT__CONDITION), value);
            				completedElement(value, false);
            			}

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWhileEffect(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[41]);
            	}

            // Textadventure.g:1203:2: (a4_0= parse_org_alia4j_language_textadventure_Binding )
            // Textadventure.g:1204:3: a4_0= parse_org_alia4j_language_textadventure_Binding
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_Binding_in_parse_org_alia4j_language_textadventure_WhileEffect813);
            a4_0=parse_org_alia4j_language_textadventure_Binding();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWhileEffect();
            				startIncompleteElement(element);
            			}
            			if (a4_0 != null) {
            				if (a4_0 != null) {
            					Object value = a4_0;
            					addObjectToList(element, org.alia4j.language.textadventure.TextadventurePackage.WHILE_EFFECT__BINDING, value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_4_0_0_2, a4_0, true);
            				copyLocalizationInfos(a4_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[42]);
            	}

            a5=(Token)match(input,29,FOLLOW_29_in_parse_org_alia4j_language_textadventure_WhileEffect831); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWhileEffect();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_4_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWhileEffect(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[43]);
            	}

            // Textadventure.g:1243:2: (a6_0= parse_org_alia4j_language_textadventure_Action )
            // Textadventure.g:1244:3: a6_0= parse_org_alia4j_language_textadventure_Action
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_Action_in_parse_org_alia4j_language_textadventure_WhileEffect849);
            a6_0=parse_org_alia4j_language_textadventure_Action();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWhileEffect();
            				startIncompleteElement(element);
            			}
            			if (a6_0 != null) {
            				if (a6_0 != null) {
            					Object value = a6_0;
            					addObjectToList(element, org.alia4j.language.textadventure.TextadventurePackage.WHILE_EFFECT__ACTION, value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_4_0_0_4, a6_0, true);
            				copyLocalizationInfos(a6_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[44]);
            	}

            a7=(Token)match(input,30,FOLLOW_30_in_parse_org_alia4j_language_textadventure_WhileEffect867); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWhileEffect();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_4_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[45]);
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[46]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_alia4j_language_textadventure_WhileEffect_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_WhileEffect"



    // $ANTLR start "parse_org_alia4j_language_textadventure_RemoveAction"
    // Textadventure.g:1286:1: parse_org_alia4j_language_textadventure_RemoveAction returns [org.alia4j.language.textadventure.RemoveAction element = null] : a0= 'remove' (a1= TEXT ) a2= 'from' (a3_0= parse_org_alia4j_language_textadventure_List ) ;
    public final org.alia4j.language.textadventure.RemoveAction parse_org_alia4j_language_textadventure_RemoveAction() throws RecognitionException {
        org.alia4j.language.textadventure.RemoveAction element =  null;

        int parse_org_alia4j_language_textadventure_RemoveAction_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.alia4j.language.textadventure.List a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Textadventure.g:1289:2: (a0= 'remove' (a1= TEXT ) a2= 'from' (a3_0= parse_org_alia4j_language_textadventure_List ) )
            // Textadventure.g:1290:2: a0= 'remove' (a1= TEXT ) a2= 'from' (a3_0= parse_org_alia4j_language_textadventure_List )
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_alia4j_language_textadventure_RemoveAction896); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createRemoveAction();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_5_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[47]);
            	}

            // Textadventure.g:1304:2: (a1= TEXT )
            // Textadventure.g:1305:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_RemoveAction914); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createRemoveAction();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.REMOVE_ACTION__WHAT), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.alia4j.language.textadventure.Binding proxy = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createBinding();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContextDependentURIFragmentFactory<org.alia4j.language.textadventure.RemoveAction, org.alia4j.language.textadventure.Binding>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getRemoveActionWhatReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.REMOVE_ACTION__WHAT), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.REMOVE_ACTION__WHAT), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_5_0_0_1, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[48]);
            	}

            a2=(Token)match(input,17,FOLLOW_17_in_parse_org_alia4j_language_textadventure_RemoveAction935); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createRemoveAction();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_5_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getRemoveAction(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[49]);
            	}

            // Textadventure.g:1358:2: (a3_0= parse_org_alia4j_language_textadventure_List )
            // Textadventure.g:1359:3: a3_0= parse_org_alia4j_language_textadventure_List
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_List_in_parse_org_alia4j_language_textadventure_RemoveAction953);
            a3_0=parse_org_alia4j_language_textadventure_List();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createRemoveAction();
            				startIncompleteElement(element);
            			}
            			if (a3_0 != null) {
            				if (a3_0 != null) {
            					Object value = a3_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.REMOVE_ACTION__FROM), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_5_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[50]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_alia4j_language_textadventure_RemoveAction_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_RemoveAction"



    // $ANTLR start "parse_org_alia4j_language_textadventure_List"
    // Textadventure.g:1386:1: parse_org_alia4j_language_textadventure_List returns [org.alia4j.language.textadventure.List element = null] : ( (a0= 'result' ) ) ( (a3= 'Tile' ) ) ( (a6= 'Persons' |a7= 'Items' ) ) ;
    public final org.alia4j.language.textadventure.List parse_org_alia4j_language_textadventure_List() throws RecognitionException {
        org.alia4j.language.textadventure.List element =  null;

        int parse_org_alia4j_language_textadventure_List_StartIndex = input.index();

        Token a0=null;
        Token a3=null;
        Token a6=null;
        Token a7=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Textadventure.g:1389:2: ( ( (a0= 'result' ) ) ( (a3= 'Tile' ) ) ( (a6= 'Persons' |a7= 'Items' ) ) )
            // Textadventure.g:1390:2: ( (a0= 'result' ) ) ( (a3= 'Tile' ) ) ( (a6= 'Persons' |a7= 'Items' ) )
            {
            // Textadventure.g:1390:2: ( (a0= 'result' ) )
            // Textadventure.g:1391:3: (a0= 'result' )
            {
            // Textadventure.g:1391:3: (a0= 'result' )
            // Textadventure.g:1392:4: a0= 'result'
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_alia4j_language_textadventure_List995); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            				if (element == null) {
            					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createList();
            					startIncompleteElement(element);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_6_0_0_0, null, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            				// set value of enumeration attribute
            				Object value = org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getPosition().getEEnumLiteral(org.alia4j.language.textadventure.Position.RESULT_VALUE).getInstance();
            				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.LIST__POSITION), value);
            				completedElement(value, false);
            			}

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[51]);
            	}

            // Textadventure.g:1412:2: ( (a3= 'Tile' ) )
            // Textadventure.g:1413:3: (a3= 'Tile' )
            {
            // Textadventure.g:1413:3: (a3= 'Tile' )
            // Textadventure.g:1414:4: a3= 'Tile'
            {
            a3=(Token)match(input,15,FOLLOW_15_in_parse_org_alia4j_language_textadventure_List1025); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            				if (element == null) {
            					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createList();
            					startIncompleteElement(element);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_6_0_0_1, null, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            				// set value of enumeration attribute
            				Object value = org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getTarget().getEEnumLiteral(org.alia4j.language.textadventure.Target.TILE_VALUE).getInstance();
            				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.LIST__TARGET), value);
            				completedElement(value, false);
            			}

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[52]);
            	}

            // Textadventure.g:1434:2: ( (a6= 'Persons' |a7= 'Items' ) )
            // Textadventure.g:1435:3: (a6= 'Persons' |a7= 'Items' )
            {
            // Textadventure.g:1435:3: (a6= 'Persons' |a7= 'Items' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Textadventure.g:1436:4: a6= 'Persons'
                    {
                    a6=(Token)match(input,14,FOLLOW_14_in_parse_org_alia4j_language_textadventure_List1055); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createList();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_6_0_0_2, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getProperty().getEEnumLiteral(org.alia4j.language.textadventure.Property.PERSONS_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.LIST__PROPERTY), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Textadventure.g:1449:8: a7= 'Items'
                    {
                    a7=(Token)match(input,13,FOLLOW_13_in_parse_org_alia4j_language_textadventure_List1070); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createList();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_6_0_0_2, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getProperty().getEEnumLiteral(org.alia4j.language.textadventure.Property.ITEMS_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.LIST__PROPERTY), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[53]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_alia4j_language_textadventure_List_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_List"



    // $ANTLR start "parse_org_alia4j_language_textadventure_Person"
    // Textadventure.g:1471:1: parse_org_alia4j_language_textadventure_Person returns [org.alia4j.language.textadventure.Person element = null] : a0= 'person' (a1= TEXT ) a2= '@' (a3= TEXT ) a4= '{' ( (a5_0= parse_org_alia4j_language_textadventure_Ability ) )* a6= '}' ;
    public final org.alia4j.language.textadventure.Person parse_org_alia4j_language_textadventure_Person() throws RecognitionException {
        org.alia4j.language.textadventure.Person element =  null;

        int parse_org_alia4j_language_textadventure_Person_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        org.alia4j.language.textadventure.Ability a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Textadventure.g:1474:2: (a0= 'person' (a1= TEXT ) a2= '@' (a3= TEXT ) a4= '{' ( (a5_0= parse_org_alia4j_language_textadventure_Ability ) )* a6= '}' )
            // Textadventure.g:1475:2: a0= 'person' (a1= TEXT ) a2= '@' (a3= TEXT ) a4= '{' ( (a5_0= parse_org_alia4j_language_textadventure_Ability ) )* a6= '}'
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_org_alia4j_language_textadventure_Person1106); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_7_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[54]);
            	}

            // Textadventure.g:1489:2: (a1= TEXT )
            // Textadventure.g:1490:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Person1124); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createPerson();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__NAME), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_7_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[55]);
            	}

            a2=(Token)match(input,12,FOLLOW_12_in_parse_org_alia4j_language_textadventure_Person1145); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_7_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[56]);
            	}

            // Textadventure.g:1539:2: (a3= TEXT )
            // Textadventure.g:1540:3: a3= TEXT
            {
            a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Person1163); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createPerson();
            				startIncompleteElement(element);
            			}
            			if (a3 != null) {
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__LOCATION), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.alia4j.language.textadventure.Tile proxy = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContextDependentURIFragmentFactory<org.alia4j.language.textadventure.Person, org.alia4j.language.textadventure.Tile>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPersonLocationReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__LOCATION), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__LOCATION), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_7_0_0_3, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[57]);
            	}

            a4=(Token)match(input,29,FOLLOW_29_in_parse_org_alia4j_language_textadventure_Person1184); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_7_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getPerson(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[58]);
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[59]);
            	}

            // Textadventure.g:1594:2: ( (a5_0= parse_org_alia4j_language_textadventure_Ability ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Textadventure.g:1595:3: (a5_0= parse_org_alia4j_language_textadventure_Ability )
            	    {
            	    // Textadventure.g:1595:3: (a5_0= parse_org_alia4j_language_textadventure_Ability )
            	    // Textadventure.g:1596:4: a5_0= parse_org_alia4j_language_textadventure_Ability
            	    {
            	    pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_Ability_in_parse_org_alia4j_language_textadventure_Person1207);
            	    a5_0=parse_org_alia4j_language_textadventure_Ability();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createPerson();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a5_0 != null) {
            	    					if (a5_0 != null) {
            	    						Object value = a5_0;
            	    						addObjectToList(element, org.alia4j.language.textadventure.TextadventurePackage.PERSON__ABILITIES, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_7_0_0_5, a5_0, true);
            	    					copyLocalizationInfos(a5_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getPerson(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[60]);
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[61]);
            	}

            a6=(Token)match(input,30,FOLLOW_30_in_parse_org_alia4j_language_textadventure_Person1233); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createPerson();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_7_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[62]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_alia4j_language_textadventure_Person_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_Person"



    // $ANTLR start "parse_org_alia4j_language_textadventure_IgnoreItemAbility"
    // Textadventure.g:1639:1: parse_org_alia4j_language_textadventure_IgnoreItemAbility returns [org.alia4j.language.textadventure.IgnoreItemAbility element = null] : a0= 'ignore' (a1= TEXT ) ;
    public final org.alia4j.language.textadventure.IgnoreItemAbility parse_org_alia4j_language_textadventure_IgnoreItemAbility() throws RecognitionException {
        org.alia4j.language.textadventure.IgnoreItemAbility element =  null;

        int parse_org_alia4j_language_textadventure_IgnoreItemAbility_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Textadventure.g:1642:2: (a0= 'ignore' (a1= TEXT ) )
            // Textadventure.g:1643:2: a0= 'ignore' (a1= TEXT )
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_org_alia4j_language_textadventure_IgnoreItemAbility1262); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createIgnoreItemAbility();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_8_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[63]);
            	}

            // Textadventure.g:1657:2: (a1= TEXT )
            // Textadventure.g:1658:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_IgnoreItemAbility1280); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createIgnoreItemAbility();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.alia4j.language.textadventure.Item proxy = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureContextDependentURIFragmentFactory<org.alia4j.language.textadventure.IgnoreItemAbility, org.alia4j.language.textadventure.Item>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getIgnoreItemAbilityIgnoredItemReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_8_0_0_1, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getPerson(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[64]);
            		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[65]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_alia4j_language_textadventure_IgnoreItemAbility_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_IgnoreItemAbility"



    // $ANTLR start "parse_org_alia4j_language_textadventure_Effect"
    // Textadventure.g:1700:1: parse_org_alia4j_language_textadventure_Effect returns [org.alia4j.language.textadventure.Effect element = null] : c0= parse_org_alia4j_language_textadventure_WhileEffect ;
    public final org.alia4j.language.textadventure.Effect parse_org_alia4j_language_textadventure_Effect() throws RecognitionException {
        org.alia4j.language.textadventure.Effect element =  null;

        int parse_org_alia4j_language_textadventure_Effect_StartIndex = input.index();

        org.alia4j.language.textadventure.WhileEffect c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Textadventure.g:1701:2: (c0= parse_org_alia4j_language_textadventure_WhileEffect )
            // Textadventure.g:1702:2: c0= parse_org_alia4j_language_textadventure_WhileEffect
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_WhileEffect_in_parse_org_alia4j_language_textadventure_Effect1312);
            c0=parse_org_alia4j_language_textadventure_WhileEffect();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_org_alia4j_language_textadventure_Effect_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_Effect"



    // $ANTLR start "parse_org_alia4j_language_textadventure_Action"
    // Textadventure.g:1706:1: parse_org_alia4j_language_textadventure_Action returns [org.alia4j.language.textadventure.Action element = null] : c0= parse_org_alia4j_language_textadventure_RemoveAction ;
    public final org.alia4j.language.textadventure.Action parse_org_alia4j_language_textadventure_Action() throws RecognitionException {
        org.alia4j.language.textadventure.Action element =  null;

        int parse_org_alia4j_language_textadventure_Action_StartIndex = input.index();

        org.alia4j.language.textadventure.RemoveAction c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Textadventure.g:1707:2: (c0= parse_org_alia4j_language_textadventure_RemoveAction )
            // Textadventure.g:1708:2: c0= parse_org_alia4j_language_textadventure_RemoveAction
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_RemoveAction_in_parse_org_alia4j_language_textadventure_Action1333);
            c0=parse_org_alia4j_language_textadventure_RemoveAction();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_org_alia4j_language_textadventure_Action_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_Action"



    // $ANTLR start "parse_org_alia4j_language_textadventure_Ability"
    // Textadventure.g:1712:1: parse_org_alia4j_language_textadventure_Ability returns [org.alia4j.language.textadventure.Ability element = null] : c0= parse_org_alia4j_language_textadventure_IgnoreItemAbility ;
    public final org.alia4j.language.textadventure.Ability parse_org_alia4j_language_textadventure_Ability() throws RecognitionException {
        org.alia4j.language.textadventure.Ability element =  null;

        int parse_org_alia4j_language_textadventure_Ability_StartIndex = input.index();

        org.alia4j.language.textadventure.IgnoreItemAbility c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Textadventure.g:1713:2: (c0= parse_org_alia4j_language_textadventure_IgnoreItemAbility )
            // Textadventure.g:1714:2: c0= parse_org_alia4j_language_textadventure_IgnoreItemAbility
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_textadventure_IgnoreItemAbility_in_parse_org_alia4j_language_textadventure_Ability1354);
            c0=parse_org_alia4j_language_textadventure_IgnoreItemAbility();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_org_alia4j_language_textadventure_Ability_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_textadventure_Ability"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_World_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_Tile_in_parse_org_alia4j_language_textadventure_World124 = new BitSet(new long[]{0x0000000001280002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_Item_in_parse_org_alia4j_language_textadventure_World159 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_Person_in_parse_org_alia4j_language_textadventure_World194 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_textadventure_Tile235 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Tile253 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_org_alia4j_language_textadventure_Tile274 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_org_alia4j_language_textadventure_Tile288 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_org_alia4j_language_textadventure_Tile302 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_textadventure_Tile320 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_org_alia4j_language_textadventure_Tile341 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_org_alia4j_language_textadventure_Tile355 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_textadventure_Tile373 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_org_alia4j_language_textadventure_Tile394 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_org_alia4j_language_textadventure_Tile408 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTED_34_34_in_parse_org_alia4j_language_textadventure_Tile426 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_org_alia4j_language_textadventure_Tile447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_parse_org_alia4j_language_textadventure_Item476 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Item494 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_12_in_parse_org_alia4j_language_textadventure_Item524 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Item550 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_org_alia4j_language_textadventure_Item596 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_Effect_in_parse_org_alia4j_language_textadventure_Item625 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_30_in_parse_org_alia4j_language_textadventure_Item666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_org_alia4j_language_textadventure_Binding704 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Binding729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_org_alia4j_language_textadventure_WhileEffect765 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_org_alia4j_language_textadventure_WhileEffect788 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_Binding_in_parse_org_alia4j_language_textadventure_WhileEffect813 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_org_alia4j_language_textadventure_WhileEffect831 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_Action_in_parse_org_alia4j_language_textadventure_WhileEffect849 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_org_alia4j_language_textadventure_WhileEffect867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_org_alia4j_language_textadventure_RemoveAction896 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_RemoveAction914 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_alia4j_language_textadventure_RemoveAction935 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_List_in_parse_org_alia4j_language_textadventure_RemoveAction953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_org_alia4j_language_textadventure_List995 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_alia4j_language_textadventure_List1025 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_parse_org_alia4j_language_textadventure_List1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_parse_org_alia4j_language_textadventure_List1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_org_alia4j_language_textadventure_Person1106 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Person1124 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_alia4j_language_textadventure_Person1145 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_Person1163 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_parse_org_alia4j_language_textadventure_Person1184 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_Ability_in_parse_org_alia4j_language_textadventure_Person1207 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_30_in_parse_org_alia4j_language_textadventure_Person1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_org_alia4j_language_textadventure_IgnoreItemAbility1262 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_textadventure_IgnoreItemAbility1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_WhileEffect_in_parse_org_alia4j_language_textadventure_Effect1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_RemoveAction_in_parse_org_alia4j_language_textadventure_Action1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_textadventure_IgnoreItemAbility_in_parse_org_alia4j_language_textadventure_Ability1354 = new BitSet(new long[]{0x0000000000000002L});

}