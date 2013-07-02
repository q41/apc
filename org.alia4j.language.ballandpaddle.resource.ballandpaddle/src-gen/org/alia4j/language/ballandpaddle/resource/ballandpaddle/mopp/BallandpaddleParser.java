// $ANTLR 3.4

	package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BallandpaddleParser extends BallandpaddleANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANDOR", "CHAR", "COMMENT", "FLOAT", "INTEGER", "LEVELLINE", "LINEBREAK", "TEXT", "WHITESPACE", "'!'", "'!='", "'&'", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "'<'", "'<='", "'='", "'>'", "'>='", "'ball'", "'block'", "'cold damage'", "'direction'", "'duration'", "'effect'", "'effects'", "'fire damage'", "'hardness'", "'level'", "'normal damage'", "'orientation'", "'paddle'", "'power'", "'powerSpawnChance'", "'resistance cold'", "'resistance fire'", "'resistance normal'", "'resistance shock'", "'shock damage'", "'size'", "'speed'", "'x'", "'y'", "'{'", "'|'", "'}'"
    };

    public static final int EOF=-1;
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
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int ANDOR=4;
    public static final int CHAR=5;
    public static final int COMMENT=6;
    public static final int FLOAT=7;
    public static final int INTEGER=8;
    public static final int LEVELLINE=9;
    public static final int LINEBREAK=10;
    public static final int TEXT=11;
    public static final int WHITESPACE=12;

    // delegates
    public BallandpaddleANTLRParserBase[] getDelegates() {
        return new BallandpaddleANTLRParserBase[] {};
    }

    // delegators


    public BallandpaddleParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public BallandpaddleParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(109 + 1);
         

    }

    public String[] getTokenNames() { return BallandpaddleParser.tokenNames; }
    public String getGrammarFileName() { return "Ballandpaddle.g"; }


    	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolverFactory tokenResolverFactory = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTokenResolverFactory();
    	
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
    	private java.util.List<org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal> expectedElements = new java.util.ArrayList<org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal>();
    	
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
    		postParseCommands.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleCommand<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource>() {
    			public boolean execute(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleProblem() {
    					public org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemSeverity getSeverity() {
    						return org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemSeverity.ERROR;
    					}
    					public org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemType getType() {
    						return org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleQuickFix> getQuickFixes() {
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
    		org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement terminal = org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleFollowSetProvider.TERMINALS[terminalID];
    		org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContainedFeature[] containmentFeatures = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleFollowSetProvider.LINKS[ids[i]];
    		}
    		org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleContainmentTrace containmentTrace = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal expectedElement = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
    		postParseCommands.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleCommand<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource>() {
    			public boolean execute(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource resource) {
    				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleLocationMap locationMap = resource.getLocationMap();
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
    		postParseCommands.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleCommand<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource>() {
    			public boolean execute(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource resource) {
    				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleLocationMap locationMap = resource.getLocationMap();
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
    	protected void setLocalizationEnd(java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleCommand<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleCommand<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource>() {
    			public boolean execute(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource resource) {
    				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleLocationMap locationMap = resource.getLocationMap();
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
    	
    	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new BallandpaddleParser(new org.antlr.runtime3_4_0.CommonTokenStream(new BallandpaddleLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new BallandpaddleParser(new org.antlr.runtime3_4_0.CommonTokenStream(new BallandpaddleLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddleRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public BallandpaddleParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((BallandpaddleLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((BallandpaddleLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.alia4j.language.ballandpaddle.Root.class) {
    				return parse_org_alia4j_language_ballandpaddle_Root();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.ballandpaddle.Level.class) {
    				return parse_org_alia4j_language_ballandpaddle_Level();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.ballandpaddle.Paddle.class) {
    				return parse_org_alia4j_language_ballandpaddle_Paddle();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.ballandpaddle.Ball.class) {
    				return parse_org_alia4j_language_ballandpaddle_Ball();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.ballandpaddle.Block.class) {
    				return parse_org_alia4j_language_ballandpaddle_Block();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.ballandpaddle.Power.class) {
    				return parse_org_alia4j_language_ballandpaddle_Power();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.ballandpaddle.Effect.class) {
    				return parse_org_alia4j_language_ballandpaddle_Effect();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.ballandpaddle.ObjectTarget.class) {
    				return parse_org_alia4j_language_ballandpaddle_ObjectTarget();
    			}
    			if (type.getInstanceClass() == org.alia4j.language.ballandpaddle.TypeTarget.class) {
    				return parse_org_alia4j_language_ballandpaddle_TypeTarget();
    			}
    		}
    		throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleUnexpectedContentTypeException(typeObject);
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
    			typeObject = options.get(org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleCommand<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource>>();
    		org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleParseResult parseResult = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleParseResult();
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
    	
    	public java.util.List<org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleParseResult result = parse();
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
    			for (org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleCommand<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal>();
    		java.util.List<org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal> newFollowSet = new java.util.ArrayList<org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 140;
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
    				for (org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddlePair<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.alia4j.language.ballandpaddle.resource.ballandpaddle.util.BallandpaddlePair<org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContainedFeature[]> newFollowerPair : newFollowers) {
    							org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleContainmentTrace containmentTrace = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleContainmentTrace(null, newFollowerPair.getRight());
    							org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal newFollowTerminal = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
    		for (org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectedTerminal expectedElement, int tokenIndex) {
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
    // Ballandpaddle.g:523:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_alia4j_language_ballandpaddle_Root ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        org.alia4j.language.ballandpaddle.Root c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Ballandpaddle.g:524:2: ( (c0= parse_org_alia4j_language_ballandpaddle_Root ) EOF )
            // Ballandpaddle.g:525:2: (c0= parse_org_alia4j_language_ballandpaddle_Root ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Ballandpaddle.g:530:2: (c0= parse_org_alia4j_language_ballandpaddle_Root )
            // Ballandpaddle.g:531:3: c0= parse_org_alia4j_language_ballandpaddle_Root
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_Root_in_start82);
            c0=parse_org_alia4j_language_ballandpaddle_Root();

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



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_Root"
    // Ballandpaddle.g:539:1: parse_org_alia4j_language_ballandpaddle_Root returns [org.alia4j.language.ballandpaddle.Root element = null] : (a0_0= parse_org_alia4j_language_ballandpaddle_Level ) ( (a1_0= parse_org_alia4j_language_ballandpaddle_Paddle ) )+ ( (a2_0= parse_org_alia4j_language_ballandpaddle_Ball ) )+ ( (a3_0= parse_org_alia4j_language_ballandpaddle_Block ) )* ( (a4_0= parse_org_alia4j_language_ballandpaddle_Power ) )* ( (a5_0= parse_org_alia4j_language_ballandpaddle_Effect ) )* ;
    public final org.alia4j.language.ballandpaddle.Root parse_org_alia4j_language_ballandpaddle_Root() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Root element =  null;

        int parse_org_alia4j_language_ballandpaddle_Root_StartIndex = input.index();

        org.alia4j.language.ballandpaddle.Level a0_0 =null;

        org.alia4j.language.ballandpaddle.Paddle a1_0 =null;

        org.alia4j.language.ballandpaddle.Ball a2_0 =null;

        org.alia4j.language.ballandpaddle.Block a3_0 =null;

        org.alia4j.language.ballandpaddle.Power a4_0 =null;

        org.alia4j.language.ballandpaddle.Effect a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Ballandpaddle.g:542:2: ( (a0_0= parse_org_alia4j_language_ballandpaddle_Level ) ( (a1_0= parse_org_alia4j_language_ballandpaddle_Paddle ) )+ ( (a2_0= parse_org_alia4j_language_ballandpaddle_Ball ) )+ ( (a3_0= parse_org_alia4j_language_ballandpaddle_Block ) )* ( (a4_0= parse_org_alia4j_language_ballandpaddle_Power ) )* ( (a5_0= parse_org_alia4j_language_ballandpaddle_Effect ) )* )
            // Ballandpaddle.g:543:2: (a0_0= parse_org_alia4j_language_ballandpaddle_Level ) ( (a1_0= parse_org_alia4j_language_ballandpaddle_Paddle ) )+ ( (a2_0= parse_org_alia4j_language_ballandpaddle_Ball ) )+ ( (a3_0= parse_org_alia4j_language_ballandpaddle_Block ) )* ( (a4_0= parse_org_alia4j_language_ballandpaddle_Power ) )* ( (a5_0= parse_org_alia4j_language_ballandpaddle_Effect ) )*
            {
            // Ballandpaddle.g:543:2: (a0_0= parse_org_alia4j_language_ballandpaddle_Level )
            // Ballandpaddle.g:544:3: a0_0= parse_org_alia4j_language_ballandpaddle_Level
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_Level_in_parse_org_alia4j_language_ballandpaddle_Root119);
            a0_0=parse_org_alia4j_language_ballandpaddle_Level();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createRoot();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__LEVEL), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_0_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[1]);
            	}

            // Ballandpaddle.g:569:2: ( (a1_0= parse_org_alia4j_language_ballandpaddle_Paddle ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Ballandpaddle.g:570:3: (a1_0= parse_org_alia4j_language_ballandpaddle_Paddle )
            	    {
            	    // Ballandpaddle.g:570:3: (a1_0= parse_org_alia4j_language_ballandpaddle_Paddle )
            	    // Ballandpaddle.g:571:4: a1_0= parse_org_alia4j_language_ballandpaddle_Paddle
            	    {
            	    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_Paddle_in_parse_org_alia4j_language_ballandpaddle_Root146);
            	    a1_0=parse_org_alia4j_language_ballandpaddle_Paddle();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createRoot();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a1_0 != null) {
            	    					if (a1_0 != null) {
            	    						Object value = a1_0;
            	    						addObjectToList(element, org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__PADDLES, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_0_0_0_1, a1_0, true);
            	    					copyLocalizationInfos(a1_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[2]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[3]);
            	}

            // Ballandpaddle.g:598:2: ( (a2_0= parse_org_alia4j_language_ballandpaddle_Ball ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==27) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Ballandpaddle.g:599:3: (a2_0= parse_org_alia4j_language_ballandpaddle_Ball )
            	    {
            	    // Ballandpaddle.g:599:3: (a2_0= parse_org_alia4j_language_ballandpaddle_Ball )
            	    // Ballandpaddle.g:600:4: a2_0= parse_org_alia4j_language_ballandpaddle_Ball
            	    {
            	    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_Ball_in_parse_org_alia4j_language_ballandpaddle_Root181);
            	    a2_0=parse_org_alia4j_language_ballandpaddle_Ball();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createRoot();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a2_0 != null) {
            	    					if (a2_0 != null) {
            	    						Object value = a2_0;
            	    						addObjectToList(element, org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__BALLS, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_0_0_0_2, a2_0, true);
            	    					copyLocalizationInfos(a2_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[4]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[5]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[6]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[7]);
            	}

            // Ballandpaddle.g:629:2: ( (a3_0= parse_org_alia4j_language_ballandpaddle_Block ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==28) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Ballandpaddle.g:630:3: (a3_0= parse_org_alia4j_language_ballandpaddle_Block )
            	    {
            	    // Ballandpaddle.g:630:3: (a3_0= parse_org_alia4j_language_ballandpaddle_Block )
            	    // Ballandpaddle.g:631:4: a3_0= parse_org_alia4j_language_ballandpaddle_Block
            	    {
            	    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_Block_in_parse_org_alia4j_language_ballandpaddle_Root216);
            	    a3_0=parse_org_alia4j_language_ballandpaddle_Block();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createRoot();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a3_0 != null) {
            	    					if (a3_0 != null) {
            	    						Object value = a3_0;
            	    						addObjectToList(element, org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__BLOCKS, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_0_0_0_3, a3_0, true);
            	    					copyLocalizationInfos(a3_0, element);
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
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[8]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[9]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[10]);
            	}

            // Ballandpaddle.g:659:2: ( (a4_0= parse_org_alia4j_language_ballandpaddle_Power ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==40) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Ballandpaddle.g:660:3: (a4_0= parse_org_alia4j_language_ballandpaddle_Power )
            	    {
            	    // Ballandpaddle.g:660:3: (a4_0= parse_org_alia4j_language_ballandpaddle_Power )
            	    // Ballandpaddle.g:661:4: a4_0= parse_org_alia4j_language_ballandpaddle_Power
            	    {
            	    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_Power_in_parse_org_alia4j_language_ballandpaddle_Root251);
            	    a4_0=parse_org_alia4j_language_ballandpaddle_Power();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createRoot();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a4_0 != null) {
            	    					if (a4_0 != null) {
            	    						Object value = a4_0;
            	    						addObjectToList(element, org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__POWERS, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_0_0_0_4, a4_0, true);
            	    					copyLocalizationInfos(a4_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[11]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[12]);
            	}

            // Ballandpaddle.g:688:2: ( (a5_0= parse_org_alia4j_language_ballandpaddle_Effect ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Ballandpaddle.g:689:3: (a5_0= parse_org_alia4j_language_ballandpaddle_Effect )
            	    {
            	    // Ballandpaddle.g:689:3: (a5_0= parse_org_alia4j_language_ballandpaddle_Effect )
            	    // Ballandpaddle.g:690:4: a5_0= parse_org_alia4j_language_ballandpaddle_Effect
            	    {
            	    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_Effect_in_parse_org_alia4j_language_ballandpaddle_Root286);
            	    a5_0=parse_org_alia4j_language_ballandpaddle_Effect();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createRoot();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a5_0 != null) {
            	    					if (a5_0 != null) {
            	    						Object value = a5_0;
            	    						addObjectToList(element, org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__EFFECTS, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_0_0_0_5, a5_0, true);
            	    					copyLocalizationInfos(a5_0, element);
            	    				}
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
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[13]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_alia4j_language_ballandpaddle_Root_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_Root"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_Level"
    // Ballandpaddle.g:718:1: parse_org_alia4j_language_ballandpaddle_Level returns [org.alia4j.language.ballandpaddle.Level element = null] : a0= 'level' (a1= TEXT ) a2= '{' ( (a3= LEVELLINE ) )* ( (a4= 'powerSpawnChance' a5= '=' (a6= FLOAT ) ) )? a7= '}' ;
    public final org.alia4j.language.ballandpaddle.Level parse_org_alia4j_language_ballandpaddle_Level() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Level element =  null;

        int parse_org_alia4j_language_ballandpaddle_Level_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Ballandpaddle.g:721:2: (a0= 'level' (a1= TEXT ) a2= '{' ( (a3= LEVELLINE ) )* ( (a4= 'powerSpawnChance' a5= '=' (a6= FLOAT ) ) )? a7= '}' )
            // Ballandpaddle.g:722:2: a0= 'level' (a1= TEXT ) a2= '{' ( (a3= LEVELLINE ) )* ( (a4= 'powerSpawnChance' a5= '=' (a6= FLOAT ) ) )? a7= '}'
            {
            a0=(Token)match(input,36,FOLLOW_36_in_parse_org_alia4j_language_ballandpaddle_Level327); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[14]);
            	}

            // Ballandpaddle.g:736:2: (a1= TEXT )
            // Ballandpaddle.g:737:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Level345); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[15]);
            	}

            a2=(Token)match(input,51,FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Level366); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[16]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[17]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[18]);
            	}

            // Ballandpaddle.g:788:2: ( (a3= LEVELLINE ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==LEVELLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Ballandpaddle.g:789:3: (a3= LEVELLINE )
            	    {
            	    // Ballandpaddle.g:789:3: (a3= LEVELLINE )
            	    // Ballandpaddle.g:790:4: a3= LEVELLINE
            	    {
            	    a3=(Token)match(input,LEVELLINE,FOLLOW_LEVELLINE_in_parse_org_alia4j_language_ballandpaddle_Level389); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a3 != null) {
            	    					org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("LEVELLINE");
            	    					tokenResolver.setOptions(getOptions());
            	    					org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            	    					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__BLOCKS), result);
            	    					Object resolvedObject = result.getResolvedToken();
            	    					if (resolvedObject == null) {
            	    						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
            	    					}
            	    					java.lang.String resolved = (java.lang.String) resolvedObject;
            	    					if (resolved != null) {
            	    						Object value = resolved;
            	    						addObjectToList(element, org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__BLOCKS, value);
            	    						completedElement(value, false);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_3, resolved, true);
            	    					copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[19]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[20]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[21]);
            	}

            // Ballandpaddle.g:828:2: ( (a4= 'powerSpawnChance' a5= '=' (a6= FLOAT ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==41) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Ballandpaddle.g:829:3: (a4= 'powerSpawnChance' a5= '=' (a6= FLOAT ) )
                    {
                    // Ballandpaddle.g:829:3: (a4= 'powerSpawnChance' a5= '=' (a6= FLOAT ) )
                    // Ballandpaddle.g:830:4: a4= 'powerSpawnChance' a5= '=' (a6= FLOAT )
                    {
                    a4=(Token)match(input,41,FOLLOW_41_in_parse_org_alia4j_language_ballandpaddle_Level428); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_4_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[22]);
                    			}

                    a5=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Level448); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_4_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[23]);
                    			}

                    // Ballandpaddle.g:858:4: (a6= FLOAT )
                    // Ballandpaddle.g:859:5: a6= FLOAT
                    {
                    a6=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Level474); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
                    						startIncompleteElement(element);
                    					}
                    					if (a6 != null) {
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
                    						tokenResolver.setOptions(getOptions());
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__POWER_SPAWN_CHANCE), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a6).getStopIndex());
                    						}
                    						java.lang.Float resolved = (java.lang.Float) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__POWER_SPAWN_CHANCE), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_4_0_0_2, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a6, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[24]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[25]);
            	}

            a7=(Token)match(input,53,FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Level520); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[26]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_alia4j_language_ballandpaddle_Level_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_Level"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_Paddle"
    // Ballandpaddle.g:917:1: parse_org_alia4j_language_ballandpaddle_Paddle returns [org.alia4j.language.ballandpaddle.Paddle element = null] : a0= 'paddle' (a1= TEXT ) a2= '{' a3= 'x' a4= '=' (a5= FLOAT ) a6= 'y' a7= '=' (a8= FLOAT ) a9= 'size' a10= '=' (a11= INTEGER ) a12= 'orientation' a13= '=' (a14= INTEGER ) a15= '}' ;
    public final org.alia4j.language.ballandpaddle.Paddle parse_org_alia4j_language_ballandpaddle_Paddle() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Paddle element =  null;

        int parse_org_alia4j_language_ballandpaddle_Paddle_StartIndex = input.index();

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
        Token a13=null;
        Token a14=null;
        Token a15=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Ballandpaddle.g:920:2: (a0= 'paddle' (a1= TEXT ) a2= '{' a3= 'x' a4= '=' (a5= FLOAT ) a6= 'y' a7= '=' (a8= FLOAT ) a9= 'size' a10= '=' (a11= INTEGER ) a12= 'orientation' a13= '=' (a14= INTEGER ) a15= '}' )
            // Ballandpaddle.g:921:2: a0= 'paddle' (a1= TEXT ) a2= '{' a3= 'x' a4= '=' (a5= FLOAT ) a6= 'y' a7= '=' (a8= FLOAT ) a9= 'size' a10= '=' (a11= INTEGER ) a12= 'orientation' a13= '=' (a14= INTEGER ) a15= '}'
            {
            a0=(Token)match(input,39,FOLLOW_39_in_parse_org_alia4j_language_ballandpaddle_Paddle549); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[27]);
            	}

            // Ballandpaddle.g:935:2: (a1= TEXT )
            // Ballandpaddle.g:936:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Paddle567); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[28]);
            	}

            a2=(Token)match(input,51,FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Paddle588); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[29]);
            	}

            a3=(Token)match(input,49,FOLLOW_49_in_parse_org_alia4j_language_ballandpaddle_Paddle602); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[30]);
            	}

            a4=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Paddle616); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[31]);
            	}

            // Ballandpaddle.g:1013:2: (a5= FLOAT )
            // Ballandpaddle.g:1014:3: a5= FLOAT
            {
            a5=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Paddle634); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            				startIncompleteElement(element);
            			}
            			if (a5 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__X), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
            				}
            				java.lang.Double resolved = (java.lang.Double) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__X), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_5, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[32]);
            	}

            a6=(Token)match(input,50,FOLLOW_50_in_parse_org_alia4j_language_ballandpaddle_Paddle655); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[33]);
            	}

            a7=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Paddle669); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[34]);
            	}

            // Ballandpaddle.g:1077:2: (a8= FLOAT )
            // Ballandpaddle.g:1078:3: a8= FLOAT
            {
            a8=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Paddle687); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            				startIncompleteElement(element);
            			}
            			if (a8 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__Y), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
            				}
            				java.lang.Double resolved = (java.lang.Double) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__Y), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_8, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[35]);
            	}

            a9=(Token)match(input,47,FOLLOW_47_in_parse_org_alia4j_language_ballandpaddle_Paddle708); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[36]);
            	}

            a10=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Paddle722); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[37]);
            	}

            // Ballandpaddle.g:1141:2: (a11= INTEGER )
            // Ballandpaddle.g:1142:3: a11= INTEGER
            {
            a11=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Paddle740); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            				startIncompleteElement(element);
            			}
            			if (a11 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SIZE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SIZE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_11, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[38]);
            	}

            a12=(Token)match(input,38,FOLLOW_38_in_parse_org_alia4j_language_ballandpaddle_Paddle761); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_12, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[39]);
            	}

            a13=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Paddle775); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_13, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[40]);
            	}

            // Ballandpaddle.g:1205:2: (a14= INTEGER )
            // Ballandpaddle.g:1206:3: a14= INTEGER
            {
            a14=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Paddle793); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            				startIncompleteElement(element);
            			}
            			if (a14 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ORIENTATION), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ORIENTATION), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_14, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a14, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[41]);
            	}

            a15=(Token)match(input,53,FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Paddle814); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_15, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[42]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[43]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_alia4j_language_ballandpaddle_Paddle_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_Paddle"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_Ball"
    // Ballandpaddle.g:1258:1: parse_org_alia4j_language_ballandpaddle_Ball returns [org.alia4j.language.ballandpaddle.Ball element = null] : a0= 'ball' (a1= TEXT ) a2= '{' a3= 'x' a4= '=' (a5= FLOAT ) a6= 'y' a7= '=' (a8= FLOAT ) ( (a9= 'size' a10= '=' (a11= INTEGER ) ) )? ( (a12= 'direction' a13= '=' (a14= INTEGER ) ) )? ( (a15= 'speed' a16= '=' (a17= INTEGER ) ) )? a18= '}' ;
    public final org.alia4j.language.ballandpaddle.Ball parse_org_alia4j_language_ballandpaddle_Ball() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Ball element =  null;

        int parse_org_alia4j_language_ballandpaddle_Ball_StartIndex = input.index();

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
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Ballandpaddle.g:1261:2: (a0= 'ball' (a1= TEXT ) a2= '{' a3= 'x' a4= '=' (a5= FLOAT ) a6= 'y' a7= '=' (a8= FLOAT ) ( (a9= 'size' a10= '=' (a11= INTEGER ) ) )? ( (a12= 'direction' a13= '=' (a14= INTEGER ) ) )? ( (a15= 'speed' a16= '=' (a17= INTEGER ) ) )? a18= '}' )
            // Ballandpaddle.g:1262:2: a0= 'ball' (a1= TEXT ) a2= '{' a3= 'x' a4= '=' (a5= FLOAT ) a6= 'y' a7= '=' (a8= FLOAT ) ( (a9= 'size' a10= '=' (a11= INTEGER ) ) )? ( (a12= 'direction' a13= '=' (a14= INTEGER ) ) )? ( (a15= 'speed' a16= '=' (a17= INTEGER ) ) )? a18= '}'
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_org_alia4j_language_ballandpaddle_Ball843); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[44]);
            	}

            // Ballandpaddle.g:1276:2: (a1= TEXT )
            // Ballandpaddle.g:1277:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Ball861); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[45]);
            	}

            a2=(Token)match(input,51,FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Ball882); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[46]);
            	}

            a3=(Token)match(input,49,FOLLOW_49_in_parse_org_alia4j_language_ballandpaddle_Ball896); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[47]);
            	}

            a4=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Ball910); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[48]);
            	}

            // Ballandpaddle.g:1354:2: (a5= FLOAT )
            // Ballandpaddle.g:1355:3: a5= FLOAT
            {
            a5=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Ball928); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
            				startIncompleteElement(element);
            			}
            			if (a5 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__X), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
            				}
            				java.lang.Double resolved = (java.lang.Double) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__X), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_5, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[49]);
            	}

            a6=(Token)match(input,50,FOLLOW_50_in_parse_org_alia4j_language_ballandpaddle_Ball949); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[50]);
            	}

            a7=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Ball963); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[51]);
            	}

            // Ballandpaddle.g:1418:2: (a8= FLOAT )
            // Ballandpaddle.g:1419:3: a8= FLOAT
            {
            a8=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Ball981); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
            				startIncompleteElement(element);
            			}
            			if (a8 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__Y), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
            				}
            				java.lang.Double resolved = (java.lang.Double) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__Y), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_8, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[52]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[53]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[54]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[55]);
            	}

            // Ballandpaddle.g:1457:2: ( (a9= 'size' a10= '=' (a11= INTEGER ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==47) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Ballandpaddle.g:1458:3: (a9= 'size' a10= '=' (a11= INTEGER ) )
                    {
                    // Ballandpaddle.g:1458:3: (a9= 'size' a10= '=' (a11= INTEGER ) )
                    // Ballandpaddle.g:1459:4: a9= 'size' a10= '=' (a11= INTEGER )
                    {
                    a9=(Token)match(input,47,FOLLOW_47_in_parse_org_alia4j_language_ballandpaddle_Ball1011); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_9_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[56]);
                    			}

                    a10=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Ball1031); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_9_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[57]);
                    			}

                    // Ballandpaddle.g:1487:4: (a11= INTEGER )
                    // Ballandpaddle.g:1488:5: a11= INTEGER
                    {
                    a11=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Ball1057); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
                    						startIncompleteElement(element);
                    					}
                    					if (a11 != null) {
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__SIZE), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__SIZE), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_9_0_0_2, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[58]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[59]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[60]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[61]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[62]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[63]);
            	}

            // Ballandpaddle.g:1534:2: ( (a12= 'direction' a13= '=' (a14= INTEGER ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Ballandpaddle.g:1535:3: (a12= 'direction' a13= '=' (a14= INTEGER ) )
                    {
                    // Ballandpaddle.g:1535:3: (a12= 'direction' a13= '=' (a14= INTEGER ) )
                    // Ballandpaddle.g:1536:4: a12= 'direction' a13= '=' (a14= INTEGER )
                    {
                    a12=(Token)match(input,30,FOLLOW_30_in_parse_org_alia4j_language_ballandpaddle_Ball1112); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_10_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[64]);
                    			}

                    a13=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Ball1132); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_10_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[65]);
                    			}

                    // Ballandpaddle.g:1564:4: (a14= INTEGER )
                    // Ballandpaddle.g:1565:5: a14= INTEGER
                    {
                    a14=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Ball1158); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
                    						startIncompleteElement(element);
                    					}
                    					if (a14 != null) {
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__DIRECTION), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__DIRECTION), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_10_0_0_2, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a14, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[66]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[67]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[68]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[69]);
            	}

            // Ballandpaddle.g:1609:2: ( (a15= 'speed' a16= '=' (a17= INTEGER ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==48) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Ballandpaddle.g:1610:3: (a15= 'speed' a16= '=' (a17= INTEGER ) )
                    {
                    // Ballandpaddle.g:1610:3: (a15= 'speed' a16= '=' (a17= INTEGER ) )
                    // Ballandpaddle.g:1611:4: a15= 'speed' a16= '=' (a17= INTEGER )
                    {
                    a15=(Token)match(input,48,FOLLOW_48_in_parse_org_alia4j_language_ballandpaddle_Ball1213); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_11_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[70]);
                    			}

                    a16=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Ball1233); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_11_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[71]);
                    			}

                    // Ballandpaddle.g:1639:4: (a17= INTEGER )
                    // Ballandpaddle.g:1640:5: a17= INTEGER
                    {
                    a17=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Ball1259); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
                    						startIncompleteElement(element);
                    					}
                    					if (a17 != null) {
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a17.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__SPEED), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a17).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a17).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a17).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a17).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__SPEED), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_11_0_0_2, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a17, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[72]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[73]);
            	}

            a18=(Token)match(input,53,FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Ball1305); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_12, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[74]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[75]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[76]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[77]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_alia4j_language_ballandpaddle_Ball_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_Ball"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_Block"
    // Ballandpaddle.g:1701:1: parse_org_alia4j_language_ballandpaddle_Block returns [org.alia4j.language.ballandpaddle.Block element = null] : a0= 'block' (a1= CHAR ) a2= '{' a3= 'hardness' a4= '=' (a5= INTEGER ) ( (a6= 'resistance normal' a7= '=' (a8= INTEGER ) ) )? ( (a9= 'resistance fire' a10= '=' (a11= INTEGER ) ) )? ( (a12= 'resistance cold' a13= '=' (a14= INTEGER ) ) )? ( (a15= 'resistance shock' a16= '=' (a17= INTEGER ) ) )? ( (a18= 'power' a19= '=' (a20= TEXT ) ) )? a21= '}' ;
    public final org.alia4j.language.ballandpaddle.Block parse_org_alia4j_language_ballandpaddle_Block() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Block element =  null;

        int parse_org_alia4j_language_ballandpaddle_Block_StartIndex = input.index();

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
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a20=null;
        Token a21=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Ballandpaddle.g:1704:2: (a0= 'block' (a1= CHAR ) a2= '{' a3= 'hardness' a4= '=' (a5= INTEGER ) ( (a6= 'resistance normal' a7= '=' (a8= INTEGER ) ) )? ( (a9= 'resistance fire' a10= '=' (a11= INTEGER ) ) )? ( (a12= 'resistance cold' a13= '=' (a14= INTEGER ) ) )? ( (a15= 'resistance shock' a16= '=' (a17= INTEGER ) ) )? ( (a18= 'power' a19= '=' (a20= TEXT ) ) )? a21= '}' )
            // Ballandpaddle.g:1705:2: a0= 'block' (a1= CHAR ) a2= '{' a3= 'hardness' a4= '=' (a5= INTEGER ) ( (a6= 'resistance normal' a7= '=' (a8= INTEGER ) ) )? ( (a9= 'resistance fire' a10= '=' (a11= INTEGER ) ) )? ( (a12= 'resistance cold' a13= '=' (a14= INTEGER ) ) )? ( (a15= 'resistance shock' a16= '=' (a17= INTEGER ) ) )? ( (a18= 'power' a19= '=' (a20= TEXT ) ) )? a21= '}'
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_org_alia4j_language_ballandpaddle_Block1334); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[78]);
            	}

            // Ballandpaddle.g:1719:2: (a1= CHAR )
            // Ballandpaddle.g:1720:3: a1= CHAR
            {
            a1=(Token)match(input,CHAR,FOLLOW_CHAR_in_parse_org_alia4j_language_ballandpaddle_Block1352); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHAR");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[79]);
            	}

            a2=(Token)match(input,51,FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Block1373); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[80]);
            	}

            a3=(Token)match(input,35,FOLLOW_35_in_parse_org_alia4j_language_ballandpaddle_Block1387); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[81]);
            	}

            a4=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1401); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[82]);
            	}

            // Ballandpaddle.g:1797:2: (a5= INTEGER )
            // Ballandpaddle.g:1798:3: a5= INTEGER
            {
            a5=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Block1419); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
            				startIncompleteElement(element);
            			}
            			if (a5 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__HARDNESS), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__HARDNESS), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_5, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a5, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[83]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[84]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[85]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[86]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[87]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[88]);
            	}

            // Ballandpaddle.g:1838:2: ( (a6= 'resistance normal' a7= '=' (a8= INTEGER ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Ballandpaddle.g:1839:3: (a6= 'resistance normal' a7= '=' (a8= INTEGER ) )
                    {
                    // Ballandpaddle.g:1839:3: (a6= 'resistance normal' a7= '=' (a8= INTEGER ) )
                    // Ballandpaddle.g:1840:4: a6= 'resistance normal' a7= '=' (a8= INTEGER )
                    {
                    a6=(Token)match(input,44,FOLLOW_44_in_parse_org_alia4j_language_ballandpaddle_Block1449); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_6_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[89]);
                    			}

                    a7=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1469); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_6_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[90]);
                    			}

                    // Ballandpaddle.g:1868:4: (a8= INTEGER )
                    // Ballandpaddle.g:1869:5: a8= INTEGER
                    {
                    a8=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Block1495); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    						startIncompleteElement(element);
                    					}
                    					if (a8 != null) {
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__NORMAL_RES), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__NORMAL_RES), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_6_0_0_2, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[91]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[92]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[93]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[94]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[95]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[96]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[97]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[98]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[99]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[100]);
            	}

            // Ballandpaddle.g:1919:2: ( (a9= 'resistance fire' a10= '=' (a11= INTEGER ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Ballandpaddle.g:1920:3: (a9= 'resistance fire' a10= '=' (a11= INTEGER ) )
                    {
                    // Ballandpaddle.g:1920:3: (a9= 'resistance fire' a10= '=' (a11= INTEGER ) )
                    // Ballandpaddle.g:1921:4: a9= 'resistance fire' a10= '=' (a11= INTEGER )
                    {
                    a9=(Token)match(input,43,FOLLOW_43_in_parse_org_alia4j_language_ballandpaddle_Block1550); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_7_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[101]);
                    			}

                    a10=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1570); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_7_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[102]);
                    			}

                    // Ballandpaddle.g:1949:4: (a11= INTEGER )
                    // Ballandpaddle.g:1950:5: a11= INTEGER
                    {
                    a11=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Block1596); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    						startIncompleteElement(element);
                    					}
                    					if (a11 != null) {
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__FIRE_RES), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__FIRE_RES), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_7_0_0_2, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[103]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[104]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[105]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[106]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[107]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[108]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[109]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[110]);
            	}

            // Ballandpaddle.g:1998:2: ( (a12= 'resistance cold' a13= '=' (a14= INTEGER ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Ballandpaddle.g:1999:3: (a12= 'resistance cold' a13= '=' (a14= INTEGER ) )
                    {
                    // Ballandpaddle.g:1999:3: (a12= 'resistance cold' a13= '=' (a14= INTEGER ) )
                    // Ballandpaddle.g:2000:4: a12= 'resistance cold' a13= '=' (a14= INTEGER )
                    {
                    a12=(Token)match(input,42,FOLLOW_42_in_parse_org_alia4j_language_ballandpaddle_Block1651); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_8_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[111]);
                    			}

                    a13=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1671); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_8_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[112]);
                    			}

                    // Ballandpaddle.g:2028:4: (a14= INTEGER )
                    // Ballandpaddle.g:2029:5: a14= INTEGER
                    {
                    a14=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Block1697); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    						startIncompleteElement(element);
                    					}
                    					if (a14 != null) {
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__COLD_RES), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__COLD_RES), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_8_0_0_2, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a14, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[113]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[114]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[115]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[116]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[117]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[118]);
            	}

            // Ballandpaddle.g:2075:2: ( (a15= 'resistance shock' a16= '=' (a17= INTEGER ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Ballandpaddle.g:2076:3: (a15= 'resistance shock' a16= '=' (a17= INTEGER ) )
                    {
                    // Ballandpaddle.g:2076:3: (a15= 'resistance shock' a16= '=' (a17= INTEGER ) )
                    // Ballandpaddle.g:2077:4: a15= 'resistance shock' a16= '=' (a17= INTEGER )
                    {
                    a15=(Token)match(input,45,FOLLOW_45_in_parse_org_alia4j_language_ballandpaddle_Block1752); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_9_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[119]);
                    			}

                    a16=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1772); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_9_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[120]);
                    			}

                    // Ballandpaddle.g:2105:4: (a17= INTEGER )
                    // Ballandpaddle.g:2106:5: a17= INTEGER
                    {
                    a17=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Block1798); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    						startIncompleteElement(element);
                    					}
                    					if (a17 != null) {
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
                    						tokenResolver.setOptions(getOptions());
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a17.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__SHOCK_RES), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a17).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a17).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a17).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a17).getStopIndex());
                    						}
                    						java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__SHOCK_RES), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_9_0_0_2, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a17, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[121]);
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[122]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[123]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[124]);
            	}

            // Ballandpaddle.g:2150:2: ( (a18= 'power' a19= '=' (a20= TEXT ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Ballandpaddle.g:2151:3: (a18= 'power' a19= '=' (a20= TEXT ) )
                    {
                    // Ballandpaddle.g:2151:3: (a18= 'power' a19= '=' (a20= TEXT ) )
                    // Ballandpaddle.g:2152:4: a18= 'power' a19= '=' (a20= TEXT )
                    {
                    a18=(Token)match(input,40,FOLLOW_40_in_parse_org_alia4j_language_ballandpaddle_Block1853); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_10_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[125]);
                    			}

                    a19=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1873); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_10_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a19, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[126]);
                    			}

                    // Ballandpaddle.g:2180:4: (a20= TEXT )
                    // Ballandpaddle.g:2181:5: a20= TEXT
                    {
                    a20=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Block1899); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
                    						startIncompleteElement(element);
                    					}
                    					if (a20 != null) {
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    						tokenResolver.setOptions(getOptions());
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a20.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__POWER), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a20).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a20).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a20).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a20).getStopIndex());
                    						}
                    						String resolved = (String) resolvedObject;
                    						org.alia4j.language.ballandpaddle.Power proxy = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
                    						collectHiddenTokens(element);
                    						registerContextDependentProxy(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContextDependentURIFragmentFactory<org.alia4j.language.ballandpaddle.Block, org.alia4j.language.ballandpaddle.Power>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBlockPowerReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__POWER), resolved, proxy);
                    						if (proxy != null) {
                    							Object value = proxy;
                    							element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__POWER), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_10_0_0_2, proxy, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a20, element);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a20, proxy);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[127]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[128]);
            	}

            a21=(Token)match(input,53,FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Block1945); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_11, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[129]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[130]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[131]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_alia4j_language_ballandpaddle_Block_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_Block"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_Power"
    // Ballandpaddle.g:2245:1: parse_org_alia4j_language_ballandpaddle_Power returns [org.alia4j.language.ballandpaddle.Power element = null] : a0= 'power' (a1= TEXT ) a2= '(' (a3_0= parse_org_alia4j_language_ballandpaddle_Target ) a4= ')' a5= '{' a6= 'effects' a7= '=' (a8= TEXT ) a9= 'duration' a10= '=' (a11= INTEGER ) ( (a12= 'powerSpawnChance' a13= '=' (a14= FLOAT ) ) )? a15= '}' ;
    public final org.alia4j.language.ballandpaddle.Power parse_org_alia4j_language_ballandpaddle_Power() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Power element =  null;

        int parse_org_alia4j_language_ballandpaddle_Power_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        org.alia4j.language.ballandpaddle.Target a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Ballandpaddle.g:2248:2: (a0= 'power' (a1= TEXT ) a2= '(' (a3_0= parse_org_alia4j_language_ballandpaddle_Target ) a4= ')' a5= '{' a6= 'effects' a7= '=' (a8= TEXT ) a9= 'duration' a10= '=' (a11= INTEGER ) ( (a12= 'powerSpawnChance' a13= '=' (a14= FLOAT ) ) )? a15= '}' )
            // Ballandpaddle.g:2249:2: a0= 'power' (a1= TEXT ) a2= '(' (a3_0= parse_org_alia4j_language_ballandpaddle_Target ) a4= ')' a5= '{' a6= 'effects' a7= '=' (a8= TEXT ) a9= 'duration' a10= '=' (a11= INTEGER ) ( (a12= 'powerSpawnChance' a13= '=' (a14= FLOAT ) ) )? a15= '}'
            {
            a0=(Token)match(input,40,FOLLOW_40_in_parse_org_alia4j_language_ballandpaddle_Power1974); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[132]);
            	}

            // Ballandpaddle.g:2263:2: (a1= TEXT )
            // Ballandpaddle.g:2264:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Power1992); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[133]);
            	}

            a2=(Token)match(input,16,FOLLOW_16_in_parse_org_alia4j_language_ballandpaddle_Power2013); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPower(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[134]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPower(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[135]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPower(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[136]);
            	}

            // Ballandpaddle.g:2315:2: (a3_0= parse_org_alia4j_language_ballandpaddle_Target )
            // Ballandpaddle.g:2316:3: a3_0= parse_org_alia4j_language_ballandpaddle_Target
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_Target_in_parse_org_alia4j_language_ballandpaddle_Power2031);
            a3_0=parse_org_alia4j_language_ballandpaddle_Target();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            				startIncompleteElement(element);
            			}
            			if (a3_0 != null) {
            				if (a3_0 != null) {
            					Object value = a3_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__TARGET), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[137]);
            	}

            a4=(Token)match(input,17,FOLLOW_17_in_parse_org_alia4j_language_ballandpaddle_Power2049); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[138]);
            	}

            a5=(Token)match(input,51,FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Power2063); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[139]);
            	}

            a6=(Token)match(input,33,FOLLOW_33_in_parse_org_alia4j_language_ballandpaddle_Power2077); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[140]);
            	}

            a7=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Power2091); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[141]);
            	}

            // Ballandpaddle.g:2397:2: (a8= TEXT )
            // Ballandpaddle.g:2398:3: a8= TEXT
            {
            a8=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Power2109); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            				startIncompleteElement(element);
            			}
            			if (a8 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__EFFECTS), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.alia4j.language.ballandpaddle.Effect proxy = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContextDependentURIFragmentFactory<org.alia4j.language.ballandpaddle.Power, org.alia4j.language.ballandpaddle.Effect>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPowerEffectsReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__EFFECTS), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					addObjectToList(element, org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__EFFECTS, value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_8, proxy, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[142]);
            	}

            a9=(Token)match(input,31,FOLLOW_31_in_parse_org_alia4j_language_ballandpaddle_Power2130); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[143]);
            	}

            a10=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Power2144); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[144]);
            	}

            // Ballandpaddle.g:2465:2: (a11= INTEGER )
            // Ballandpaddle.g:2466:3: a11= INTEGER
            {
            a11=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Power2162); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            				startIncompleteElement(element);
            			}
            			if (a11 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a11.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__DURATION), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a11).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a11).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__DURATION), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_11, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a11, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[145]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[146]);
            	}

            // Ballandpaddle.g:2502:2: ( (a12= 'powerSpawnChance' a13= '=' (a14= FLOAT ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Ballandpaddle.g:2503:3: (a12= 'powerSpawnChance' a13= '=' (a14= FLOAT ) )
                    {
                    // Ballandpaddle.g:2503:3: (a12= 'powerSpawnChance' a13= '=' (a14= FLOAT ) )
                    // Ballandpaddle.g:2504:4: a12= 'powerSpawnChance' a13= '=' (a14= FLOAT )
                    {
                    a12=(Token)match(input,41,FOLLOW_41_in_parse_org_alia4j_language_ballandpaddle_Power2192); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_12_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[147]);
                    			}

                    a13=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Power2212); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_12_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[148]);
                    			}

                    // Ballandpaddle.g:2532:4: (a14= FLOAT )
                    // Ballandpaddle.g:2533:5: a14= FLOAT
                    {
                    a14=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Power2238); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    					if (terminateParsing) {
                    						throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    					}
                    					if (element == null) {
                    						element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
                    						startIncompleteElement(element);
                    					}
                    					if (a14 != null) {
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
                    						tokenResolver.setOptions(getOptions());
                    						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__POWER_SPAWN_CHANCE), result);
                    						Object resolvedObject = result.getResolvedToken();
                    						if (resolvedObject == null) {
                    							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a14).getStopIndex());
                    						}
                    						java.lang.Float resolved = (java.lang.Float) resolvedObject;
                    						if (resolved != null) {
                    							Object value = resolved;
                    							element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__POWER_SPAWN_CHANCE), value);
                    							completedElement(value, false);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_12_0_0_2, resolved, true);
                    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a14, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[149]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[150]);
            	}

            a15=(Token)match(input,53,FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Power2284); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_13, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[151]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[152]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_alia4j_language_ballandpaddle_Power_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_Power"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_Effect"
    // Ballandpaddle.g:2592:1: parse_org_alia4j_language_ballandpaddle_Effect returns [org.alia4j.language.ballandpaddle.Effect element = null] : a0= 'effect' (a1= TEXT ) a2= '(' ( (a3_0= parse_org_alia4j_language_ballandpaddle_Target ) )? a4= ')' a5= '{' ( (a6= 'x' |a7= 'y' |a8= 'size' |a9= 'orientation' |a10= 'speed' |a11= 'hardness' |a12= 'resistance normal' |a13= 'resistance fire' |a14= 'resistance cold' |a15= 'resistance shock' |a16= 'normal damage' |a17= 'fire damage' |a18= 'cold damage' |a19= 'shock damage' ) ) a22= '=' (a23_0= parse_org_alia4j_language_ballandpaddle_Expression ) a24= '}' ;
    public final org.alia4j.language.ballandpaddle.Effect parse_org_alia4j_language_ballandpaddle_Effect() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Effect element =  null;

        int parse_org_alia4j_language_ballandpaddle_Effect_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;
        Token a18=null;
        Token a19=null;
        Token a22=null;
        Token a24=null;
        org.alia4j.language.ballandpaddle.Target a3_0 =null;

        org.alia4j.language.ballandpaddle.Expression a23_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Ballandpaddle.g:2595:2: (a0= 'effect' (a1= TEXT ) a2= '(' ( (a3_0= parse_org_alia4j_language_ballandpaddle_Target ) )? a4= ')' a5= '{' ( (a6= 'x' |a7= 'y' |a8= 'size' |a9= 'orientation' |a10= 'speed' |a11= 'hardness' |a12= 'resistance normal' |a13= 'resistance fire' |a14= 'resistance cold' |a15= 'resistance shock' |a16= 'normal damage' |a17= 'fire damage' |a18= 'cold damage' |a19= 'shock damage' ) ) a22= '=' (a23_0= parse_org_alia4j_language_ballandpaddle_Expression ) a24= '}' )
            // Ballandpaddle.g:2596:2: a0= 'effect' (a1= TEXT ) a2= '(' ( (a3_0= parse_org_alia4j_language_ballandpaddle_Target ) )? a4= ')' a5= '{' ( (a6= 'x' |a7= 'y' |a8= 'size' |a9= 'orientation' |a10= 'speed' |a11= 'hardness' |a12= 'resistance normal' |a13= 'resistance fire' |a14= 'resistance cold' |a15= 'resistance shock' |a16= 'normal damage' |a17= 'fire damage' |a18= 'cold damage' |a19= 'shock damage' ) ) a22= '=' (a23_0= parse_org_alia4j_language_ballandpaddle_Expression ) a24= '}'
            {
            a0=(Token)match(input,32,FOLLOW_32_in_parse_org_alia4j_language_ballandpaddle_Effect2313); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[153]);
            	}

            // Ballandpaddle.g:2610:2: (a1= TEXT )
            // Ballandpaddle.g:2611:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Effect2331); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
            				startIncompleteElement(element);
            			}
            			if (a1 != null) {
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__ID), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__ID), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_1, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[154]);
            	}

            a2=(Token)match(input,16,FOLLOW_16_in_parse_org_alia4j_language_ballandpaddle_Effect2352); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[155]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[156]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[157]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[158]);
            	}

            // Ballandpaddle.g:2663:2: ( (a3_0= parse_org_alia4j_language_ballandpaddle_Target ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==CHAR||LA17_0==TEXT||(LA17_0 >= 27 && LA17_0 <= 28)||LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Ballandpaddle.g:2664:3: (a3_0= parse_org_alia4j_language_ballandpaddle_Target )
                    {
                    // Ballandpaddle.g:2664:3: (a3_0= parse_org_alia4j_language_ballandpaddle_Target )
                    // Ballandpaddle.g:2665:4: a3_0= parse_org_alia4j_language_ballandpaddle_Target
                    {
                    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_Target_in_parse_org_alia4j_language_ballandpaddle_Effect2375);
                    a3_0=parse_org_alia4j_language_ballandpaddle_Target();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (terminateParsing) {
                    					throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    				}
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				if (a3_0 != null) {
                    					if (a3_0 != null) {
                    						Object value = a3_0;
                    						element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TARGET), value);
                    						completedElement(value, true);
                    					}
                    					collectHiddenTokens(element);
                    					retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_3, a3_0, true);
                    					copyLocalizationInfos(a3_0, element);
                    				}
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[159]);
            	}

            a4=(Token)match(input,17,FOLLOW_17_in_parse_org_alia4j_language_ballandpaddle_Effect2401); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[160]);
            	}

            a5=(Token)match(input,51,FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Effect2415); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[161]);
            	}

            // Ballandpaddle.g:2719:2: ( (a6= 'x' |a7= 'y' |a8= 'size' |a9= 'orientation' |a10= 'speed' |a11= 'hardness' |a12= 'resistance normal' |a13= 'resistance fire' |a14= 'resistance cold' |a15= 'resistance shock' |a16= 'normal damage' |a17= 'fire damage' |a18= 'cold damage' |a19= 'shock damage' ) )
            // Ballandpaddle.g:2720:3: (a6= 'x' |a7= 'y' |a8= 'size' |a9= 'orientation' |a10= 'speed' |a11= 'hardness' |a12= 'resistance normal' |a13= 'resistance fire' |a14= 'resistance cold' |a15= 'resistance shock' |a16= 'normal damage' |a17= 'fire damage' |a18= 'cold damage' |a19= 'shock damage' )
            {
            // Ballandpaddle.g:2720:3: (a6= 'x' |a7= 'y' |a8= 'size' |a9= 'orientation' |a10= 'speed' |a11= 'hardness' |a12= 'resistance normal' |a13= 'resistance fire' |a14= 'resistance cold' |a15= 'resistance shock' |a16= 'normal damage' |a17= 'fire damage' |a18= 'cold damage' |a19= 'shock damage' )
            int alt18=14;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt18=1;
                }
                break;
            case 50:
                {
                alt18=2;
                }
                break;
            case 47:
                {
                alt18=3;
                }
                break;
            case 38:
                {
                alt18=4;
                }
                break;
            case 48:
                {
                alt18=5;
                }
                break;
            case 35:
                {
                alt18=6;
                }
                break;
            case 44:
                {
                alt18=7;
                }
                break;
            case 43:
                {
                alt18=8;
                }
                break;
            case 42:
                {
                alt18=9;
                }
                break;
            case 45:
                {
                alt18=10;
                }
                break;
            case 37:
                {
                alt18=11;
                }
                break;
            case 34:
                {
                alt18=12;
                }
                break;
            case 29:
                {
                alt18=13;
                }
                break;
            case 46:
                {
                alt18=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // Ballandpaddle.g:2721:4: a6= 'x'
                    {
                    a6=(Token)match(input,49,FOLLOW_49_in_parse_org_alia4j_language_ballandpaddle_Effect2438); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.X_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:2734:8: a7= 'y'
                    {
                    a7=(Token)match(input,50,FOLLOW_50_in_parse_org_alia4j_language_ballandpaddle_Effect2453); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.Y_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Ballandpaddle.g:2747:8: a8= 'size'
                    {
                    a8=(Token)match(input,47,FOLLOW_47_in_parse_org_alia4j_language_ballandpaddle_Effect2468); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SIZE_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 4 :
                    // Ballandpaddle.g:2760:8: a9= 'orientation'
                    {
                    a9=(Token)match(input,38,FOLLOW_38_in_parse_org_alia4j_language_ballandpaddle_Effect2483); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.ORIENTATION_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 5 :
                    // Ballandpaddle.g:2773:8: a10= 'speed'
                    {
                    a10=(Token)match(input,48,FOLLOW_48_in_parse_org_alia4j_language_ballandpaddle_Effect2498); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SPEED_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 6 :
                    // Ballandpaddle.g:2786:8: a11= 'hardness'
                    {
                    a11=(Token)match(input,35,FOLLOW_35_in_parse_org_alia4j_language_ballandpaddle_Effect2513); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.HARDNESS_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 7 :
                    // Ballandpaddle.g:2799:8: a12= 'resistance normal'
                    {
                    a12=(Token)match(input,44,FOLLOW_44_in_parse_org_alia4j_language_ballandpaddle_Effect2528); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.NORMAL_RES_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 8 :
                    // Ballandpaddle.g:2812:8: a13= 'resistance fire'
                    {
                    a13=(Token)match(input,43,FOLLOW_43_in_parse_org_alia4j_language_ballandpaddle_Effect2543); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.FIRE_RES_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 9 :
                    // Ballandpaddle.g:2825:8: a14= 'resistance cold'
                    {
                    a14=(Token)match(input,42,FOLLOW_42_in_parse_org_alia4j_language_ballandpaddle_Effect2558); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.COLD_RES_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 10 :
                    // Ballandpaddle.g:2838:8: a15= 'resistance shock'
                    {
                    a15=(Token)match(input,45,FOLLOW_45_in_parse_org_alia4j_language_ballandpaddle_Effect2573); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SHOCK_RES_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 11 :
                    // Ballandpaddle.g:2851:8: a16= 'normal damage'
                    {
                    a16=(Token)match(input,37,FOLLOW_37_in_parse_org_alia4j_language_ballandpaddle_Effect2588); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.NORMAL_DAM_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 12 :
                    // Ballandpaddle.g:2864:8: a17= 'fire damage'
                    {
                    a17=(Token)match(input,34,FOLLOW_34_in_parse_org_alia4j_language_ballandpaddle_Effect2603); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.FIRE_DAM_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 13 :
                    // Ballandpaddle.g:2877:8: a18= 'cold damage'
                    {
                    a18=(Token)match(input,29,FOLLOW_29_in_parse_org_alia4j_language_ballandpaddle_Effect2618); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.COLD_DAM_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 14 :
                    // Ballandpaddle.g:2890:8: a19= 'shock damage'
                    {
                    a19=(Token)match(input,46,FOLLOW_46_in_parse_org_alia4j_language_ballandpaddle_Effect2633); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_6, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a19, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SHOCK_DAM_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[162]);
            	}

            a22=(Token)match(input,24,FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Effect2654); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[163]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[164]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[165]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[166]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[167]);
            	}

            // Ballandpaddle.g:2928:2: (a23_0= parse_org_alia4j_language_ballandpaddle_Expression )
            // Ballandpaddle.g:2929:3: a23_0= parse_org_alia4j_language_ballandpaddle_Expression
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_Expression_in_parse_org_alia4j_language_ballandpaddle_Effect2672);
            a23_0=parse_org_alia4j_language_ballandpaddle_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
            				startIncompleteElement(element);
            			}
            			if (a23_0 != null) {
            				if (a23_0 != null) {
            					Object value = a23_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__EXPRESSION), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_8, a23_0, true);
            				copyLocalizationInfos(a23_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[168]);
            	}

            a24=(Token)match(input,53,FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Effect2690); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[169]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_alia4j_language_ballandpaddle_Effect_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_Effect"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_ObjectTarget"
    // Ballandpaddle.g:2970:1: parse_org_alia4j_language_ballandpaddle_ObjectTarget returns [org.alia4j.language.ballandpaddle.ObjectTarget element = null] : ( (a0= CHAR ) | (a1= TEXT ) );
    public final org.alia4j.language.ballandpaddle.ObjectTarget parse_org_alia4j_language_ballandpaddle_ObjectTarget() throws RecognitionException {
        org.alia4j.language.ballandpaddle.ObjectTarget element =  null;

        int parse_org_alia4j_language_ballandpaddle_ObjectTarget_StartIndex = input.index();

        Token a0=null;
        Token a1=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Ballandpaddle.g:2973:2: ( (a0= CHAR ) | (a1= TEXT ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CHAR) ) {
                alt19=1;
            }
            else if ( (LA19_0==TEXT) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // Ballandpaddle.g:2974:2: (a0= CHAR )
                    {
                    // Ballandpaddle.g:2974:2: (a0= CHAR )
                    // Ballandpaddle.g:2975:3: a0= CHAR
                    {
                    a0=(Token)match(input,CHAR,FOLLOW_CHAR_in_parse_org_alia4j_language_ballandpaddle_ObjectTarget2723); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (terminateParsing) {
                    				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    			}
                    			if (element == null) {
                    				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createObjectTarget();
                    				startIncompleteElement(element);
                    			}
                    			if (a0 != null) {
                    				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHAR");
                    				tokenResolver.setOptions(getOptions());
                    				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM), result);
                    				Object resolvedObject = result.getResolvedToken();
                    				if (resolvedObject == null) {
                    					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
                    				}
                    				String resolved = (String) resolvedObject;
                    				org.alia4j.language.ballandpaddle.BAPObject proxy = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
                    				collectHiddenTokens(element);
                    				registerContextDependentProxy(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContextDependentURIFragmentFactory<org.alia4j.language.ballandpaddle.ObjectTarget, org.alia4j.language.ballandpaddle.BAPObject>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTargetItemReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM), resolved, proxy);
                    				if (proxy != null) {
                    					Object value = proxy;
                    					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM), value);
                    					completedElement(value, false);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_7_0_0_0, proxy, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, proxy);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[170]);
                    		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[171]);
                    	}

                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:3016:4: (a1= TEXT )
                    {
                    // Ballandpaddle.g:3016:4: (a1= TEXT )
                    // Ballandpaddle.g:3017:3: a1= TEXT
                    {
                    a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_ObjectTarget2752); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (terminateParsing) {
                    				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    			}
                    			if (element == null) {
                    				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createObjectTarget();
                    				startIncompleteElement(element);
                    			}
                    			if (a1 != null) {
                    				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    				tokenResolver.setOptions(getOptions());
                    				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
                    				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM), result);
                    				Object resolvedObject = result.getResolvedToken();
                    				if (resolvedObject == null) {
                    					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
                    				}
                    				String resolved = (String) resolvedObject;
                    				org.alia4j.language.ballandpaddle.BAPObject proxy = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
                    				collectHiddenTokens(element);
                    				registerContextDependentProxy(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleContextDependentURIFragmentFactory<org.alia4j.language.ballandpaddle.ObjectTarget, org.alia4j.language.ballandpaddle.BAPObject>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTargetItemReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM), resolved, proxy);
                    				if (proxy != null) {
                    					Object value = proxy;
                    					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM), value);
                    					completedElement(value, false);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_7_0_1_0, proxy, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, proxy);
                    			}
                    		}

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[172]);
                    		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[173]);
                    	}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_alia4j_language_ballandpaddle_ObjectTarget_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_ObjectTarget"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_TypeTarget"
    // Ballandpaddle.g:3059:1: parse_org_alia4j_language_ballandpaddle_TypeTarget returns [org.alia4j.language.ballandpaddle.TypeTarget element = null] : ( (a0= 'block' |a1= 'paddle' |a2= 'ball' ) ) a5= '{' (a6_0= parse_org_alia4j_language_ballandpaddle_BooleanExpression ) a7= '}' ;
    public final org.alia4j.language.ballandpaddle.TypeTarget parse_org_alia4j_language_ballandpaddle_TypeTarget() throws RecognitionException {
        org.alia4j.language.ballandpaddle.TypeTarget element =  null;

        int parse_org_alia4j_language_ballandpaddle_TypeTarget_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a5=null;
        Token a7=null;
        org.alia4j.language.ballandpaddle.BooleanExpression a6_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Ballandpaddle.g:3062:2: ( ( (a0= 'block' |a1= 'paddle' |a2= 'ball' ) ) a5= '{' (a6_0= parse_org_alia4j_language_ballandpaddle_BooleanExpression ) a7= '}' )
            // Ballandpaddle.g:3063:2: ( (a0= 'block' |a1= 'paddle' |a2= 'ball' ) ) a5= '{' (a6_0= parse_org_alia4j_language_ballandpaddle_BooleanExpression ) a7= '}'
            {
            // Ballandpaddle.g:3063:2: ( (a0= 'block' |a1= 'paddle' |a2= 'ball' ) )
            // Ballandpaddle.g:3064:3: (a0= 'block' |a1= 'paddle' |a2= 'ball' )
            {
            // Ballandpaddle.g:3064:3: (a0= 'block' |a1= 'paddle' |a2= 'ball' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt20=1;
                }
                break;
            case 39:
                {
                alt20=2;
                }
                break;
            case 27:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // Ballandpaddle.g:3065:4: a0= 'block'
                    {
                    a0=(Token)match(input,28,FOLLOW_28_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2797); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createTypeTarget();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_8_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTargetType().getEEnumLiteral(org.alia4j.language.ballandpaddle.TargetType.BLOCK_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.TYPE_TARGET__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:3078:8: a1= 'paddle'
                    {
                    a1=(Token)match(input,39,FOLLOW_39_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2812); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createTypeTarget();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_8_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTargetType().getEEnumLiteral(org.alia4j.language.ballandpaddle.TargetType.PADDLE_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.TYPE_TARGET__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 3 :
                    // Ballandpaddle.g:3091:8: a2= 'ball'
                    {
                    a2=(Token)match(input,27,FOLLOW_27_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2827); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createTypeTarget();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_8_0_0_0, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    				// set value of enumeration attribute
                    				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTargetType().getEEnumLiteral(org.alia4j.language.ballandpaddle.TargetType.BALL_VALUE).getInstance();
                    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.TYPE_TARGET__TYPE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[174]);
            	}

            a5=(Token)match(input,51,FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2848); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createTypeTarget();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_8_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTypeTarget(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[175]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTypeTarget(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[176]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTypeTarget(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[177]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTypeTarget(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[178]);
            		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTypeTarget(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[179]);
            	}

            // Ballandpaddle.g:3129:2: (a6_0= parse_org_alia4j_language_ballandpaddle_BooleanExpression )
            // Ballandpaddle.g:3130:3: a6_0= parse_org_alia4j_language_ballandpaddle_BooleanExpression
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_BooleanExpression_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2866);
            a6_0=parse_org_alia4j_language_ballandpaddle_BooleanExpression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createTypeTarget();
            				startIncompleteElement(element);
            			}
            			if (a6_0 != null) {
            				if (a6_0 != null) {
            					Object value = a6_0;
            					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.TYPE_TARGET__PARAMS), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_8_0_0_2, a6_0, true);
            				copyLocalizationInfos(a6_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[180]);
            	}

            a7=(Token)match(input,53,FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2884); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createTypeTarget();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_8_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[181]);
            		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[182]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_alia4j_language_ballandpaddle_TypeTarget_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_TypeTarget"



    // $ANTLR start "parseop_Expression_level_1"
    // Ballandpaddle.g:3172:1: parseop_Expression_level_1 returns [org.alia4j.language.ballandpaddle.Expression element = null] : leftArg= parseop_Expression_level_2 ( ( () a0= '*' rightArg= parseop_Expression_level_2 | () a0= '/' rightArg= parseop_Expression_level_2 )+ |) ;
    public final org.alia4j.language.ballandpaddle.Expression parseop_Expression_level_1() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Expression element =  null;

        int parseop_Expression_level_1_StartIndex = input.index();

        Token a0=null;
        org.alia4j.language.ballandpaddle.Expression leftArg =null;

        org.alia4j.language.ballandpaddle.Expression rightArg =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Ballandpaddle.g:3175:2: (leftArg= parseop_Expression_level_2 ( ( () a0= '*' rightArg= parseop_Expression_level_2 | () a0= '/' rightArg= parseop_Expression_level_2 )+ |) )
            // Ballandpaddle.g:3176:2: leftArg= parseop_Expression_level_2 ( ( () a0= '*' rightArg= parseop_Expression_level_2 | () a0= '/' rightArg= parseop_Expression_level_2 )+ |)
            {
            pushFollow(FOLLOW_parseop_Expression_level_2_in_parseop_Expression_level_12913);
            leftArg=parseop_Expression_level_2();

            state._fsp--;
            if (state.failed) return element;

            // Ballandpaddle.g:3176:39: ( ( () a0= '*' rightArg= parseop_Expression_level_2 | () a0= '/' rightArg= parseop_Expression_level_2 )+ |)
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18||LA22_0==21) ) {
                alt22=1;
            }
            else if ( (LA22_0==17||LA22_0==53) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // Ballandpaddle.g:3176:40: ( () a0= '*' rightArg= parseop_Expression_level_2 | () a0= '/' rightArg= parseop_Expression_level_2 )+
                    {
                    // Ballandpaddle.g:3176:40: ( () a0= '*' rightArg= parseop_Expression_level_2 | () a0= '/' rightArg= parseop_Expression_level_2 )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==18) ) {
                            alt21=1;
                        }
                        else if ( (LA21_0==21) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // Ballandpaddle.g:3177:3: () a0= '*' rightArg= parseop_Expression_level_2
                    	    {
                    	    // Ballandpaddle.g:3177:3: ()
                    	    // Ballandpaddle.g:3177:4: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,18,FOLLOW_18_in_parseop_Expression_level_12933); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    			if (element == null) {
                    	    				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createMultExpression();
                    	    				startIncompleteElement(element);
                    	    			}
                    	    			collectHiddenTokens(element);
                    	    			retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_9_0_0_1, null, true);
                    	    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    		}

                    	    if ( state.backtracking==0 ) {
                    	    			// expected elements (follow set)
                    	    			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMultExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[183]);
                    	    			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMultExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[184]);
                    	    			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMultExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[185]);
                    	    			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMultExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[186]);
                    	    			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMultExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[187]);
                    	    		}

                    	    pushFollow(FOLLOW_parseop_Expression_level_2_in_parseop_Expression_level_12950);
                    	    rightArg=parseop_Expression_level_2();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    			if (terminateParsing) {
                    	    				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    			}
                    	    			if (element == null) {
                    	    				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createMultExpression();
                    	    				startIncompleteElement(element);
                    	    			}
                    	    			if (leftArg != null) {
                    	    				if (leftArg != null) {
                    	    					Object value = leftArg;
                    	    					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MULT_EXPRESSION__LEFT), value);
                    	    					completedElement(value, true);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_9_0_0_0, leftArg, true);
                    	    				copyLocalizationInfos(leftArg, element);
                    	    			}
                    	    		}

                    	    if ( state.backtracking==0 ) {
                    	    			if (terminateParsing) {
                    	    				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    			}
                    	    			if (element == null) {
                    	    				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createMultExpression();
                    	    				startIncompleteElement(element);
                    	    			}
                    	    			if (rightArg != null) {
                    	    				if (rightArg != null) {
                    	    					Object value = rightArg;
                    	    					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MULT_EXPRESSION__RIGHT), value);
                    	    					completedElement(value, true);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_9_0_0_2, rightArg, true);
                    	    				copyLocalizationInfos(rightArg, element);
                    	    			}
                    	    		}

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;
                    	case 2 :
                    	    // Ballandpaddle.g:3237:3: () a0= '/' rightArg= parseop_Expression_level_2
                    	    {
                    	    // Ballandpaddle.g:3237:3: ()
                    	    // Ballandpaddle.g:3237:4: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,21,FOLLOW_21_in_parseop_Expression_level_12984); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    			if (element == null) {
                    	    				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createDivExpression();
                    	    				startIncompleteElement(element);
                    	    			}
                    	    			collectHiddenTokens(element);
                    	    			retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_10_0_0_1, null, true);
                    	    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    		}

                    	    if ( state.backtracking==0 ) {
                    	    			// expected elements (follow set)
                    	    			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getDivExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[188]);
                    	    			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getDivExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[189]);
                    	    			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getDivExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[190]);
                    	    			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getDivExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[191]);
                    	    			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getDivExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[192]);
                    	    		}

                    	    pushFollow(FOLLOW_parseop_Expression_level_2_in_parseop_Expression_level_13001);
                    	    rightArg=parseop_Expression_level_2();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    			if (terminateParsing) {
                    	    				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    			}
                    	    			if (element == null) {
                    	    				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createDivExpression();
                    	    				startIncompleteElement(element);
                    	    			}
                    	    			if (leftArg != null) {
                    	    				if (leftArg != null) {
                    	    					Object value = leftArg;
                    	    					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.DIV_EXPRESSION__LEFT), value);
                    	    					completedElement(value, true);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_10_0_0_0, leftArg, true);
                    	    				copyLocalizationInfos(leftArg, element);
                    	    			}
                    	    		}

                    	    if ( state.backtracking==0 ) {
                    	    			if (terminateParsing) {
                    	    				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    			}
                    	    			if (element == null) {
                    	    				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createDivExpression();
                    	    				startIncompleteElement(element);
                    	    			}
                    	    			if (rightArg != null) {
                    	    				if (rightArg != null) {
                    	    					Object value = rightArg;
                    	    					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.DIV_EXPRESSION__RIGHT), value);
                    	    					completedElement(value, true);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_10_0_0_2, rightArg, true);
                    	    				copyLocalizationInfos(rightArg, element);
                    	    			}
                    	    		}

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:3296:21: 
                    {
                    if ( state.backtracking==0 ) { element = leftArg; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parseop_Expression_level_1_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_Expression_level_1"



    // $ANTLR start "parseop_Expression_level_2"
    // Ballandpaddle.g:3301:1: parseop_Expression_level_2 returns [org.alia4j.language.ballandpaddle.Expression element = null] : leftArg= parseop_Expression_level_3 ( ( () a0= '+' rightArg= parseop_Expression_level_3 | () a0= '-' rightArg= parseop_Expression_level_3 )+ |) ;
    public final org.alia4j.language.ballandpaddle.Expression parseop_Expression_level_2() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Expression element =  null;

        int parseop_Expression_level_2_StartIndex = input.index();

        Token a0=null;
        org.alia4j.language.ballandpaddle.Expression leftArg =null;

        org.alia4j.language.ballandpaddle.Expression rightArg =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Ballandpaddle.g:3304:9: (leftArg= parseop_Expression_level_3 ( ( () a0= '+' rightArg= parseop_Expression_level_3 | () a0= '-' rightArg= parseop_Expression_level_3 )+ |) )
            // Ballandpaddle.g:3305:9: leftArg= parseop_Expression_level_3 ( ( () a0= '+' rightArg= parseop_Expression_level_3 | () a0= '-' rightArg= parseop_Expression_level_3 )+ |)
            {
            pushFollow(FOLLOW_parseop_Expression_level_3_in_parseop_Expression_level_23047);
            leftArg=parseop_Expression_level_3();

            state._fsp--;
            if (state.failed) return element;

            // Ballandpaddle.g:3305:37: ( ( () a0= '+' rightArg= parseop_Expression_level_3 | () a0= '-' rightArg= parseop_Expression_level_3 )+ |)
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0 >= 19 && LA24_0 <= 20)) ) {
                alt24=1;
            }
            else if ( (LA24_0==EOF||(LA24_0 >= 17 && LA24_0 <= 18)||LA24_0==21||LA24_0==53) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // Ballandpaddle.g:3305:38: ( () a0= '+' rightArg= parseop_Expression_level_3 | () a0= '-' rightArg= parseop_Expression_level_3 )+
                    {
                    // Ballandpaddle.g:3305:38: ( () a0= '+' rightArg= parseop_Expression_level_3 | () a0= '-' rightArg= parseop_Expression_level_3 )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=3;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==19) ) {
                            alt23=1;
                        }
                        else if ( (LA23_0==20) ) {
                            alt23=2;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Ballandpaddle.g:3306:2: () a0= '+' rightArg= parseop_Expression_level_3
                    	    {
                    	    // Ballandpaddle.g:3306:2: ()
                    	    // Ballandpaddle.g:3306:3: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,19,FOLLOW_19_in_parseop_Expression_level_23063); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    		if (element == null) {
                    	    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPlusExpression();
                    	    			startIncompleteElement(element);
                    	    		}
                    	    		collectHiddenTokens(element);
                    	    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_11_0_0_1, null, true);
                    	    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    	}

                    	    if ( state.backtracking==0 ) {
                    	    		// expected elements (follow set)
                    	    		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPlusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[193]);
                    	    		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPlusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[194]);
                    	    		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPlusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[195]);
                    	    		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPlusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[196]);
                    	    		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPlusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[197]);
                    	    	}

                    	    pushFollow(FOLLOW_parseop_Expression_level_3_in_parseop_Expression_level_23077);
                    	    rightArg=parseop_Expression_level_3();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    		if (terminateParsing) {
                    	    			throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    		}
                    	    		if (element == null) {
                    	    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPlusExpression();
                    	    			startIncompleteElement(element);
                    	    		}
                    	    		if (leftArg != null) {
                    	    			if (leftArg != null) {
                    	    				Object value = leftArg;
                    	    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PLUS_EXPRESSION__LEFT), value);
                    	    				completedElement(value, true);
                    	    			}
                    	    			collectHiddenTokens(element);
                    	    			retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_11_0_0_0, leftArg, true);
                    	    			copyLocalizationInfos(leftArg, element);
                    	    		}
                    	    	}

                    	    if ( state.backtracking==0 ) {
                    	    		if (terminateParsing) {
                    	    			throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    		}
                    	    		if (element == null) {
                    	    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPlusExpression();
                    	    			startIncompleteElement(element);
                    	    		}
                    	    		if (rightArg != null) {
                    	    			if (rightArg != null) {
                    	    				Object value = rightArg;
                    	    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PLUS_EXPRESSION__RIGHT), value);
                    	    				completedElement(value, true);
                    	    			}
                    	    			collectHiddenTokens(element);
                    	    			retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_11_0_0_2, rightArg, true);
                    	    			copyLocalizationInfos(rightArg, element);
                    	    		}
                    	    	}

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;
                    	case 2 :
                    	    // Ballandpaddle.g:3366:2: () a0= '-' rightArg= parseop_Expression_level_3
                    	    {
                    	    // Ballandpaddle.g:3366:2: ()
                    	    // Ballandpaddle.g:3366:3: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,20,FOLLOW_20_in_parseop_Expression_level_23103); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    		if (element == null) {
                    	    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createMinusExpression();
                    	    			startIncompleteElement(element);
                    	    		}
                    	    		collectHiddenTokens(element);
                    	    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_12_0_0_1, null, true);
                    	    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    	}

                    	    if ( state.backtracking==0 ) {
                    	    		// expected elements (follow set)
                    	    		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMinusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[198]);
                    	    		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMinusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[199]);
                    	    		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMinusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[200]);
                    	    		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMinusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[201]);
                    	    		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMinusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[202]);
                    	    	}

                    	    pushFollow(FOLLOW_parseop_Expression_level_3_in_parseop_Expression_level_23117);
                    	    rightArg=parseop_Expression_level_3();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    		if (terminateParsing) {
                    	    			throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    		}
                    	    		if (element == null) {
                    	    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createMinusExpression();
                    	    			startIncompleteElement(element);
                    	    		}
                    	    		if (leftArg != null) {
                    	    			if (leftArg != null) {
                    	    				Object value = leftArg;
                    	    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MINUS_EXPRESSION__LEFT), value);
                    	    				completedElement(value, true);
                    	    			}
                    	    			collectHiddenTokens(element);
                    	    			retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_12_0_0_0, leftArg, true);
                    	    			copyLocalizationInfos(leftArg, element);
                    	    		}
                    	    	}

                    	    if ( state.backtracking==0 ) {
                    	    		if (terminateParsing) {
                    	    			throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    		}
                    	    		if (element == null) {
                    	    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createMinusExpression();
                    	    			startIncompleteElement(element);
                    	    		}
                    	    		if (rightArg != null) {
                    	    			if (rightArg != null) {
                    	    				Object value = rightArg;
                    	    				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MINUS_EXPRESSION__RIGHT), value);
                    	    				completedElement(value, true);
                    	    			}
                    	    			collectHiddenTokens(element);
                    	    			retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_12_0_0_2, rightArg, true);
                    	    			copyLocalizationInfos(rightArg, element);
                    	    		}
                    	    	}

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:3425:20: 
                    {
                    if ( state.backtracking==0 ) { element = leftArg; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parseop_Expression_level_2_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_Expression_level_2"



    // $ANTLR start "parseop_Expression_level_3"
    // Ballandpaddle.g:3430:1: parseop_Expression_level_3 returns [org.alia4j.language.ballandpaddle.Expression element = null] : (a0= '-' arg= parseop_Expression_level_4 |arg= parseop_Expression_level_4 );
    public final org.alia4j.language.ballandpaddle.Expression parseop_Expression_level_3() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Expression element =  null;

        int parseop_Expression_level_3_StartIndex = input.index();

        Token a0=null;
        org.alia4j.language.ballandpaddle.Expression arg =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Ballandpaddle.g:3433:0: (a0= '-' arg= parseop_Expression_level_4 |arg= parseop_Expression_level_4 )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            else if ( ((LA25_0 >= FLOAT && LA25_0 <= INTEGER)||LA25_0==16||LA25_0==29||(LA25_0 >= 34 && LA25_0 <= 35)||(LA25_0 >= 37 && LA25_0 <= 38)||(LA25_0 >= 42 && LA25_0 <= 50)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // Ballandpaddle.g:3434:0: a0= '-' arg= parseop_Expression_level_4
                    {
                    a0=(Token)match(input,20,FOLLOW_20_in_parseop_Expression_level_33158); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createNegExpression();
                    	startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_13_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    }

                    if ( state.backtracking==0 ) {
                    // expected elements (follow set)
                    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[203]);
                    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[204]);
                    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[205]);
                    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[206]);
                    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[207]);
                    }

                    pushFollow(FOLLOW_parseop_Expression_level_4_in_parseop_Expression_level_33169);
                    arg=parseop_Expression_level_4();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (terminateParsing) {
                    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    }
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createNegExpression();
                    	startIncompleteElement(element);
                    }
                    if (arg != null) {
                    	if (arg != null) {
                    		Object value = arg;
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEG_EXPRESSION__BODY), value);
                    		completedElement(value, true);
                    	}
                    	collectHiddenTokens(element);
                    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_13_0_0_1, arg, true);
                    	copyLocalizationInfos(arg, element);
                    }
                    }

                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:3473:5: arg= parseop_Expression_level_4
                    {
                    pushFollow(FOLLOW_parseop_Expression_level_4_in_parseop_Expression_level_33179);
                    arg=parseop_Expression_level_4();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = arg; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parseop_Expression_level_3_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_Expression_level_3"



    // $ANTLR start "parseop_Expression_level_4"
    // Ballandpaddle.g:3476:1: parseop_Expression_level_4 returns [org.alia4j.language.ballandpaddle.Expression element = null] : (c0= parse_org_alia4j_language_ballandpaddle_BracketExpression |c1= parse_org_alia4j_language_ballandpaddle_IntOperand |c2= parse_org_alia4j_language_ballandpaddle_DoubleOperand |c3= parse_org_alia4j_language_ballandpaddle_AttOperand );
    public final org.alia4j.language.ballandpaddle.Expression parseop_Expression_level_4() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Expression element =  null;

        int parseop_Expression_level_4_StartIndex = input.index();

        org.alia4j.language.ballandpaddle.BracketExpression c0 =null;

        org.alia4j.language.ballandpaddle.IntOperand c1 =null;

        org.alia4j.language.ballandpaddle.DoubleOperand c2 =null;

        org.alia4j.language.ballandpaddle.AttOperand c3 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Ballandpaddle.g:3479:0: (c0= parse_org_alia4j_language_ballandpaddle_BracketExpression |c1= parse_org_alia4j_language_ballandpaddle_IntOperand |c2= parse_org_alia4j_language_ballandpaddle_DoubleOperand |c3= parse_org_alia4j_language_ballandpaddle_AttOperand )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt26=1;
                }
                break;
            case INTEGER:
                {
                alt26=2;
                }
                break;
            case FLOAT:
                {
                alt26=3;
                }
                break;
            case 29:
            case 34:
            case 35:
            case 37:
            case 38:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // Ballandpaddle.g:3480:0: c0= parse_org_alia4j_language_ballandpaddle_BracketExpression
                    {
                    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_BracketExpression_in_parseop_Expression_level_43201);
                    c0=parse_org_alia4j_language_ballandpaddle_BracketExpression();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:3481:2: c1= parse_org_alia4j_language_ballandpaddle_IntOperand
                    {
                    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_IntOperand_in_parseop_Expression_level_43209);
                    c1=parse_org_alia4j_language_ballandpaddle_IntOperand();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Ballandpaddle.g:3482:2: c2= parse_org_alia4j_language_ballandpaddle_DoubleOperand
                    {
                    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_DoubleOperand_in_parseop_Expression_level_43217);
                    c2=parse_org_alia4j_language_ballandpaddle_DoubleOperand();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Ballandpaddle.g:3483:2: c3= parse_org_alia4j_language_ballandpaddle_AttOperand
                    {
                    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_AttOperand_in_parseop_Expression_level_43225);
                    c3=parse_org_alia4j_language_ballandpaddle_AttOperand();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parseop_Expression_level_4_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_Expression_level_4"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_BracketExpression"
    // Ballandpaddle.g:3486:1: parse_org_alia4j_language_ballandpaddle_BracketExpression returns [org.alia4j.language.ballandpaddle.BracketExpression element = null] : a0= '(' (a1_0= parse_org_alia4j_language_ballandpaddle_Expression ) a2= ')' ;
    public final org.alia4j.language.ballandpaddle.BracketExpression parse_org_alia4j_language_ballandpaddle_BracketExpression() throws RecognitionException {
        org.alia4j.language.ballandpaddle.BracketExpression element =  null;

        int parse_org_alia4j_language_ballandpaddle_BracketExpression_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        org.alia4j.language.ballandpaddle.Expression a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Ballandpaddle.g:3489:4: (a0= '(' (a1_0= parse_org_alia4j_language_ballandpaddle_Expression ) a2= ')' )
            // Ballandpaddle.g:3490:4: a0= '(' (a1_0= parse_org_alia4j_language_ballandpaddle_Expression ) a2= ')'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_org_alia4j_language_ballandpaddle_BracketExpression3247); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            if (element == null) {
            	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBracketExpression();
            	startIncompleteElement(element);
            }
            collectHiddenTokens(element);
            retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_14_0_0_0, null, true);
            copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[208]);
            addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[209]);
            addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[210]);
            addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[211]);
            addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[212]);
            }

            // Ballandpaddle.g:3508:6: (a1_0= parse_org_alia4j_language_ballandpaddle_Expression )
            // Ballandpaddle.g:3509:6: a1_0= parse_org_alia4j_language_ballandpaddle_Expression
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_Expression_in_parse_org_alia4j_language_ballandpaddle_BracketExpression3260);
            a1_0=parse_org_alia4j_language_ballandpaddle_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (terminateParsing) {
            		throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            	}
            	if (element == null) {
            		element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBracketExpression();
            		startIncompleteElement(element);
            	}
            	if (a1_0 != null) {
            		if (a1_0 != null) {
            			Object value = a1_0;
            			element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BRACKET_EXPRESSION__BODY), value);
            			completedElement(value, true);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_14_0_0_1, a1_0, true);
            		copyLocalizationInfos(a1_0, element);
            	}
            }

            }


            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[213]);
            }

            a2=(Token)match(input,17,FOLLOW_17_in_parse_org_alia4j_language_ballandpaddle_BracketExpression3272); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            if (element == null) {
            	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBracketExpression();
            	startIncompleteElement(element);
            }
            collectHiddenTokens(element);
            retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_14_0_0_2, null, true);
            copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[214]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[215]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[216]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[217]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[218]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[219]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_org_alia4j_language_ballandpaddle_BracketExpression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_BracketExpression"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_IntOperand"
    // Ballandpaddle.g:3555:1: parse_org_alia4j_language_ballandpaddle_IntOperand returns [org.alia4j.language.ballandpaddle.IntOperand element = null] : (a0= INTEGER ) ;
    public final org.alia4j.language.ballandpaddle.IntOperand parse_org_alia4j_language_ballandpaddle_IntOperand() throws RecognitionException {
        org.alia4j.language.ballandpaddle.IntOperand element =  null;

        int parse_org_alia4j_language_ballandpaddle_IntOperand_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Ballandpaddle.g:3558:4: ( (a0= INTEGER ) )
            // Ballandpaddle.g:3559:4: (a0= INTEGER )
            {
            // Ballandpaddle.g:3559:4: (a0= INTEGER )
            // Ballandpaddle.g:3560:4: a0= INTEGER
            {
            a0=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_IntOperand3300); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (terminateParsing) {
            		throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            	}
            	if (element == null) {
            		element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createIntOperand();
            		startIncompleteElement(element);
            	}
            	if (a0 != null) {
            		org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
            		tokenResolver.setOptions(getOptions());
            		org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            		tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.INT_OPERAND__VALUE), result);
            		Object resolvedObject = result.getResolvedToken();
            		if (resolvedObject == null) {
            			addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            		}
            		java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            		if (resolved != null) {
            			Object value = resolved;
            			element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.INT_OPERAND__VALUE), value);
            			completedElement(value, false);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_15_0_0_0, resolved, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            	}
            }

            }


            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[220]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[221]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[222]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[223]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[224]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[225]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_org_alia4j_language_ballandpaddle_IntOperand_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_IntOperand"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_DoubleOperand"
    // Ballandpaddle.g:3602:1: parse_org_alia4j_language_ballandpaddle_DoubleOperand returns [org.alia4j.language.ballandpaddle.DoubleOperand element = null] : (a0= FLOAT ) ;
    public final org.alia4j.language.ballandpaddle.DoubleOperand parse_org_alia4j_language_ballandpaddle_DoubleOperand() throws RecognitionException {
        org.alia4j.language.ballandpaddle.DoubleOperand element =  null;

        int parse_org_alia4j_language_ballandpaddle_DoubleOperand_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Ballandpaddle.g:3605:4: ( (a0= FLOAT ) )
            // Ballandpaddle.g:3606:4: (a0= FLOAT )
            {
            // Ballandpaddle.g:3606:4: (a0= FLOAT )
            // Ballandpaddle.g:3607:4: a0= FLOAT
            {
            a0=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_DoubleOperand3330); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (terminateParsing) {
            		throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            	}
            	if (element == null) {
            		element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createDoubleOperand();
            		startIncompleteElement(element);
            	}
            	if (a0 != null) {
            		org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
            		tokenResolver.setOptions(getOptions());
            		org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            		tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.DOUBLE_OPERAND__VALUE), result);
            		Object resolvedObject = result.getResolvedToken();
            		if (resolvedObject == null) {
            			addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            		}
            		java.lang.Double resolved = (java.lang.Double) resolvedObject;
            		if (resolved != null) {
            			Object value = resolved;
            			element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.DOUBLE_OPERAND__VALUE), value);
            			completedElement(value, false);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, resolved, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            	}
            }

            }


            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[226]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[227]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[228]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[229]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[230]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[231]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_org_alia4j_language_ballandpaddle_DoubleOperand_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_DoubleOperand"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_AttOperand"
    // Ballandpaddle.g:3649:1: parse_org_alia4j_language_ballandpaddle_AttOperand returns [org.alia4j.language.ballandpaddle.AttOperand element = null] : ( (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' |a10= 'normal damage' |a11= 'fire damage' |a12= 'cold damage' |a13= 'shock damage' ) ) ;
    public final org.alia4j.language.ballandpaddle.AttOperand parse_org_alia4j_language_ballandpaddle_AttOperand() throws RecognitionException {
        org.alia4j.language.ballandpaddle.AttOperand element =  null;

        int parse_org_alia4j_language_ballandpaddle_AttOperand_StartIndex = input.index();

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
        Token a13=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // Ballandpaddle.g:3652:2: ( ( (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' |a10= 'normal damage' |a11= 'fire damage' |a12= 'cold damage' |a13= 'shock damage' ) ) )
            // Ballandpaddle.g:3653:2: ( (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' |a10= 'normal damage' |a11= 'fire damage' |a12= 'cold damage' |a13= 'shock damage' ) )
            {
            // Ballandpaddle.g:3653:2: ( (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' |a10= 'normal damage' |a11= 'fire damage' |a12= 'cold damage' |a13= 'shock damage' ) )
            // Ballandpaddle.g:3654:2: (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' |a10= 'normal damage' |a11= 'fire damage' |a12= 'cold damage' |a13= 'shock damage' )
            {
            // Ballandpaddle.g:3654:2: (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' |a10= 'normal damage' |a11= 'fire damage' |a12= 'cold damage' |a13= 'shock damage' )
            int alt27=14;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt27=1;
                }
                break;
            case 50:
                {
                alt27=2;
                }
                break;
            case 47:
                {
                alt27=3;
                }
                break;
            case 38:
                {
                alt27=4;
                }
                break;
            case 48:
                {
                alt27=5;
                }
                break;
            case 35:
                {
                alt27=6;
                }
                break;
            case 44:
                {
                alt27=7;
                }
                break;
            case 43:
                {
                alt27=8;
                }
                break;
            case 42:
                {
                alt27=9;
                }
                break;
            case 45:
                {
                alt27=10;
                }
                break;
            case 37:
                {
                alt27=11;
                }
                break;
            case 34:
                {
                alt27=12;
                }
                break;
            case 29:
                {
                alt27=13;
                }
                break;
            case 46:
                {
                alt27=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // Ballandpaddle.g:3655:2: a0= 'x'
                    {
                    a0=(Token)match(input,49,FOLLOW_49_in_parse_org_alia4j_language_ballandpaddle_AttOperand3363); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.X_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:3668:4: a1= 'y'
                    {
                    a1=(Token)match(input,50,FOLLOW_50_in_parse_org_alia4j_language_ballandpaddle_AttOperand3374); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.Y_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 3 :
                    // Ballandpaddle.g:3681:4: a2= 'size'
                    {
                    a2=(Token)match(input,47,FOLLOW_47_in_parse_org_alia4j_language_ballandpaddle_AttOperand3385); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SIZE_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 4 :
                    // Ballandpaddle.g:3694:4: a3= 'orientation'
                    {
                    a3=(Token)match(input,38,FOLLOW_38_in_parse_org_alia4j_language_ballandpaddle_AttOperand3396); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.ORIENTATION_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 5 :
                    // Ballandpaddle.g:3707:4: a4= 'speed'
                    {
                    a4=(Token)match(input,48,FOLLOW_48_in_parse_org_alia4j_language_ballandpaddle_AttOperand3407); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SPEED_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 6 :
                    // Ballandpaddle.g:3720:4: a5= 'hardness'
                    {
                    a5=(Token)match(input,35,FOLLOW_35_in_parse_org_alia4j_language_ballandpaddle_AttOperand3418); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.HARDNESS_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 7 :
                    // Ballandpaddle.g:3733:4: a6= 'resistance normal'
                    {
                    a6=(Token)match(input,44,FOLLOW_44_in_parse_org_alia4j_language_ballandpaddle_AttOperand3429); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.NORMAL_RES_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 8 :
                    // Ballandpaddle.g:3746:4: a7= 'resistance fire'
                    {
                    a7=(Token)match(input,43,FOLLOW_43_in_parse_org_alia4j_language_ballandpaddle_AttOperand3440); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.FIRE_RES_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 9 :
                    // Ballandpaddle.g:3759:4: a8= 'resistance cold'
                    {
                    a8=(Token)match(input,42,FOLLOW_42_in_parse_org_alia4j_language_ballandpaddle_AttOperand3451); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.COLD_RES_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 10 :
                    // Ballandpaddle.g:3772:4: a9= 'resistance shock'
                    {
                    a9=(Token)match(input,45,FOLLOW_45_in_parse_org_alia4j_language_ballandpaddle_AttOperand3462); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SHOCK_RES_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 11 :
                    // Ballandpaddle.g:3785:4: a10= 'normal damage'
                    {
                    a10=(Token)match(input,37,FOLLOW_37_in_parse_org_alia4j_language_ballandpaddle_AttOperand3473); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.NORMAL_DAM_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 12 :
                    // Ballandpaddle.g:3798:4: a11= 'fire damage'
                    {
                    a11=(Token)match(input,34,FOLLOW_34_in_parse_org_alia4j_language_ballandpaddle_AttOperand3484); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.FIRE_DAM_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 13 :
                    // Ballandpaddle.g:3811:4: a12= 'cold damage'
                    {
                    a12=(Token)match(input,29,FOLLOW_29_in_parse_org_alia4j_language_ballandpaddle_AttOperand3495); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.COLD_DAM_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;
                case 14 :
                    // Ballandpaddle.g:3824:4: a13= 'shock damage'
                    {
                    a13=(Token)match(input,46,FOLLOW_46_in_parse_org_alia4j_language_ballandpaddle_AttOperand3506); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
                    		// set value of enumeration attribute
                    		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SHOCK_DAM_VALUE).getInstance();
                    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
                    		completedElement(value, false);
                    	}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[232]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[233]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[234]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[235]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[236]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[237]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_org_alia4j_language_ballandpaddle_AttOperand_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_AttOperand"



    // $ANTLR start "parseop_BooleanExpression_level_1"
    // Ballandpaddle.g:3851:1: parseop_BooleanExpression_level_1 returns [org.alia4j.language.ballandpaddle.BooleanExpression element = null] : leftArg= parseop_BooleanExpression_level_2 ( ( () a0= '|' rightArg= parseop_BooleanExpression_level_2 | () a0= '&' rightArg= parseop_BooleanExpression_level_2 )+ |) ;
    public final org.alia4j.language.ballandpaddle.BooleanExpression parseop_BooleanExpression_level_1() throws RecognitionException {
        org.alia4j.language.ballandpaddle.BooleanExpression element =  null;

        int parseop_BooleanExpression_level_1_StartIndex = input.index();

        Token a0=null;
        org.alia4j.language.ballandpaddle.BooleanExpression leftArg =null;

        org.alia4j.language.ballandpaddle.BooleanExpression rightArg =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // Ballandpaddle.g:3854:9: (leftArg= parseop_BooleanExpression_level_2 ( ( () a0= '|' rightArg= parseop_BooleanExpression_level_2 | () a0= '&' rightArg= parseop_BooleanExpression_level_2 )+ |) )
            // Ballandpaddle.g:3855:9: leftArg= parseop_BooleanExpression_level_2 ( ( () a0= '|' rightArg= parseop_BooleanExpression_level_2 | () a0= '&' rightArg= parseop_BooleanExpression_level_2 )+ |)
            {
            pushFollow(FOLLOW_parseop_BooleanExpression_level_2_in_parseop_BooleanExpression_level_13536);
            leftArg=parseop_BooleanExpression_level_2();

            state._fsp--;
            if (state.failed) return element;

            // Ballandpaddle.g:3855:44: ( ( () a0= '|' rightArg= parseop_BooleanExpression_level_2 | () a0= '&' rightArg= parseop_BooleanExpression_level_2 )+ |)
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==15||LA29_0==52) ) {
                alt29=1;
            }
            else if ( (LA29_0==17||LA29_0==53) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // Ballandpaddle.g:3855:45: ( () a0= '|' rightArg= parseop_BooleanExpression_level_2 | () a0= '&' rightArg= parseop_BooleanExpression_level_2 )+
                    {
                    // Ballandpaddle.g:3855:45: ( () a0= '|' rightArg= parseop_BooleanExpression_level_2 | () a0= '&' rightArg= parseop_BooleanExpression_level_2 )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==52) ) {
                            alt28=1;
                        }
                        else if ( (LA28_0==15) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Ballandpaddle.g:3856:0: () a0= '|' rightArg= parseop_BooleanExpression_level_2
                    	    {
                    	    // Ballandpaddle.g:3856:2: ()
                    	    // Ballandpaddle.g:3856:2: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,52,FOLLOW_52_in_parseop_BooleanExpression_level_13549); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    	if (element == null) {
                    	    		element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createOrParameter();
                    	    		startIncompleteElement(element);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_24_0_0_1, null, true);
                    	    	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    	// expected elements (follow set)
                    	    	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getOrParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[238]);
                    	    	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getOrParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[239]);
                    	    	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getOrParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[240]);
                    	    	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getOrParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[241]);
                    	    	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getOrParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[242]);
                    	    }

                    	    pushFollow(FOLLOW_parseop_BooleanExpression_level_2_in_parseop_BooleanExpression_level_13560);
                    	    rightArg=parseop_BooleanExpression_level_2();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    	if (terminateParsing) {
                    	    		throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    	}
                    	    	if (element == null) {
                    	    		element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createOrParameter();
                    	    		startIncompleteElement(element);
                    	    	}
                    	    	if (leftArg != null) {
                    	    		if (leftArg != null) {
                    	    			Object value = leftArg;
                    	    			element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OR_PARAMETER__LEFT), value);
                    	    			completedElement(value, true);
                    	    		}
                    	    		collectHiddenTokens(element);
                    	    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_24_0_0_0, leftArg, true);
                    	    		copyLocalizationInfos(leftArg, element);
                    	    	}
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    	if (terminateParsing) {
                    	    		throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    	}
                    	    	if (element == null) {
                    	    		element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createOrParameter();
                    	    		startIncompleteElement(element);
                    	    	}
                    	    	if (rightArg != null) {
                    	    		if (rightArg != null) {
                    	    			Object value = rightArg;
                    	    			element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OR_PARAMETER__RIGHT), value);
                    	    			completedElement(value, true);
                    	    		}
                    	    		collectHiddenTokens(element);
                    	    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_24_0_0_2, rightArg, true);
                    	    		copyLocalizationInfos(rightArg, element);
                    	    	}
                    	    }

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;
                    	case 2 :
                    	    // Ballandpaddle.g:3916:0: () a0= '&' rightArg= parseop_BooleanExpression_level_2
                    	    {
                    	    // Ballandpaddle.g:3916:2: ()
                    	    // Ballandpaddle.g:3916:2: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,15,FOLLOW_15_in_parseop_BooleanExpression_level_13578); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    	if (element == null) {
                    	    		element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAndParameter();
                    	    		startIncompleteElement(element);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_25_0_0_1, null, true);
                    	    	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    	// expected elements (follow set)
                    	    	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAndParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[243]);
                    	    	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAndParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[244]);
                    	    	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAndParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[245]);
                    	    	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAndParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[246]);
                    	    	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAndParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[247]);
                    	    }

                    	    pushFollow(FOLLOW_parseop_BooleanExpression_level_2_in_parseop_BooleanExpression_level_13589);
                    	    rightArg=parseop_BooleanExpression_level_2();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    	if (terminateParsing) {
                    	    		throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    	}
                    	    	if (element == null) {
                    	    		element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAndParameter();
                    	    		startIncompleteElement(element);
                    	    	}
                    	    	if (leftArg != null) {
                    	    		if (leftArg != null) {
                    	    			Object value = leftArg;
                    	    			element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.AND_PARAMETER__LEFT), value);
                    	    			completedElement(value, true);
                    	    		}
                    	    		collectHiddenTokens(element);
                    	    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_25_0_0_0, leftArg, true);
                    	    		copyLocalizationInfos(leftArg, element);
                    	    	}
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    	if (terminateParsing) {
                    	    		throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    	}
                    	    	if (element == null) {
                    	    		element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAndParameter();
                    	    		startIncompleteElement(element);
                    	    	}
                    	    	if (rightArg != null) {
                    	    		if (rightArg != null) {
                    	    			Object value = rightArg;
                    	    			element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.AND_PARAMETER__RIGHT), value);
                    	    			completedElement(value, true);
                    	    		}
                    	    		collectHiddenTokens(element);
                    	    		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_25_0_0_2, rightArg, true);
                    	    		copyLocalizationInfos(rightArg, element);
                    	    	}
                    	    }

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:3975:20: 
                    {
                    if ( state.backtracking==0 ) { element = leftArg; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parseop_BooleanExpression_level_1_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_BooleanExpression_level_1"



    // $ANTLR start "parseop_BooleanExpression_level_2"
    // Ballandpaddle.g:3980:1: parseop_BooleanExpression_level_2 returns [org.alia4j.language.ballandpaddle.BooleanExpression element = null] : leftArg= parseop_BooleanExpression_level_3 ( ( () a0= '=' rightArg= parseop_BooleanExpression_level_3 | () a0= '<' rightArg= parseop_BooleanExpression_level_3 | () a0= '<=' rightArg= parseop_BooleanExpression_level_3 | () a0= '>' rightArg= parseop_BooleanExpression_level_3 | () a0= '>=' rightArg= parseop_BooleanExpression_level_3 | () a0= '!=' rightArg= parseop_BooleanExpression_level_3 )+ |) ;
    public final org.alia4j.language.ballandpaddle.BooleanExpression parseop_BooleanExpression_level_2() throws RecognitionException {
        org.alia4j.language.ballandpaddle.BooleanExpression element =  null;

        int parseop_BooleanExpression_level_2_StartIndex = input.index();

        Token a0=null;
        org.alia4j.language.ballandpaddle.BooleanExpression leftArg =null;

        org.alia4j.language.ballandpaddle.BooleanExpression rightArg =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }

            // Ballandpaddle.g:3983:9: (leftArg= parseop_BooleanExpression_level_3 ( ( () a0= '=' rightArg= parseop_BooleanExpression_level_3 | () a0= '<' rightArg= parseop_BooleanExpression_level_3 | () a0= '<=' rightArg= parseop_BooleanExpression_level_3 | () a0= '>' rightArg= parseop_BooleanExpression_level_3 | () a0= '>=' rightArg= parseop_BooleanExpression_level_3 | () a0= '!=' rightArg= parseop_BooleanExpression_level_3 )+ |) )
            // Ballandpaddle.g:3984:9: leftArg= parseop_BooleanExpression_level_3 ( ( () a0= '=' rightArg= parseop_BooleanExpression_level_3 | () a0= '<' rightArg= parseop_BooleanExpression_level_3 | () a0= '<=' rightArg= parseop_BooleanExpression_level_3 | () a0= '>' rightArg= parseop_BooleanExpression_level_3 | () a0= '>=' rightArg= parseop_BooleanExpression_level_3 | () a0= '!=' rightArg= parseop_BooleanExpression_level_3 )+ |)
            {
            pushFollow(FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23627);
            leftArg=parseop_BooleanExpression_level_3();

            state._fsp--;
            if (state.failed) return element;

            // Ballandpaddle.g:3984:44: ( ( () a0= '=' rightArg= parseop_BooleanExpression_level_3 | () a0= '<' rightArg= parseop_BooleanExpression_level_3 | () a0= '<=' rightArg= parseop_BooleanExpression_level_3 | () a0= '>' rightArg= parseop_BooleanExpression_level_3 | () a0= '>=' rightArg= parseop_BooleanExpression_level_3 | () a0= '!=' rightArg= parseop_BooleanExpression_level_3 )+ |)
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==14||(LA31_0 >= 22 && LA31_0 <= 26)) ) {
                alt31=1;
            }
            else if ( (LA31_0==EOF||LA31_0==15||LA31_0==17||(LA31_0 >= 52 && LA31_0 <= 53)) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // Ballandpaddle.g:3984:45: ( () a0= '=' rightArg= parseop_BooleanExpression_level_3 | () a0= '<' rightArg= parseop_BooleanExpression_level_3 | () a0= '<=' rightArg= parseop_BooleanExpression_level_3 | () a0= '>' rightArg= parseop_BooleanExpression_level_3 | () a0= '>=' rightArg= parseop_BooleanExpression_level_3 | () a0= '!=' rightArg= parseop_BooleanExpression_level_3 )+
                    {
                    // Ballandpaddle.g:3984:45: ( () a0= '=' rightArg= parseop_BooleanExpression_level_3 | () a0= '<' rightArg= parseop_BooleanExpression_level_3 | () a0= '<=' rightArg= parseop_BooleanExpression_level_3 | () a0= '>' rightArg= parseop_BooleanExpression_level_3 | () a0= '>=' rightArg= parseop_BooleanExpression_level_3 | () a0= '!=' rightArg= parseop_BooleanExpression_level_3 )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=7;
                        switch ( input.LA(1) ) {
                        case 24:
                            {
                            alt30=1;
                            }
                            break;
                        case 22:
                            {
                            alt30=2;
                            }
                            break;
                        case 23:
                            {
                            alt30=3;
                            }
                            break;
                        case 25:
                            {
                            alt30=4;
                            }
                            break;
                        case 26:
                            {
                            alt30=5;
                            }
                            break;
                        case 14:
                            {
                            alt30=6;
                            }
                            break;

                        }

                        switch (alt30) {
                    	case 1 :
                    	    // Ballandpaddle.g:3985:0: () a0= '=' rightArg= parseop_BooleanExpression_level_3
                    	    {
                    	    // Ballandpaddle.g:3985:2: ()
                    	    // Ballandpaddle.g:3985:2: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,24,FOLLOW_24_in_parseop_BooleanExpression_level_23640); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    collectHiddenTokens(element);
                    	    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_18_0_0_1, null, true);
                    	    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    // expected elements (follow set)
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[248]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[249]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[250]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[251]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[252]);
                    	    }

                    	    pushFollow(FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23651);
                    	    rightArg=parseop_BooleanExpression_level_3();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (leftArg != null) {
                    	    	if (leftArg != null) {
                    	    		Object value = leftArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EQ_PARAMETER__LEFT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_18_0_0_0, leftArg, true);
                    	    	copyLocalizationInfos(leftArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (rightArg != null) {
                    	    	if (rightArg != null) {
                    	    		Object value = rightArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EQ_PARAMETER__RIGHT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_18_0_0_2, rightArg, true);
                    	    	copyLocalizationInfos(rightArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;
                    	case 2 :
                    	    // Ballandpaddle.g:4045:0: () a0= '<' rightArg= parseop_BooleanExpression_level_3
                    	    {
                    	    // Ballandpaddle.g:4045:2: ()
                    	    // Ballandpaddle.g:4045:2: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,22,FOLLOW_22_in_parseop_BooleanExpression_level_23669); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createSmthParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    collectHiddenTokens(element);
                    	    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_19_0_0_1, null, true);
                    	    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    // expected elements (follow set)
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSmthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[253]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSmthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[254]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSmthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[255]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSmthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[256]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSmthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[257]);
                    	    }

                    	    pushFollow(FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23680);
                    	    rightArg=parseop_BooleanExpression_level_3();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createSmthParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (leftArg != null) {
                    	    	if (leftArg != null) {
                    	    		Object value = leftArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SMTH_PARAMETER__LEFT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_19_0_0_0, leftArg, true);
                    	    	copyLocalizationInfos(leftArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createSmthParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (rightArg != null) {
                    	    	if (rightArg != null) {
                    	    		Object value = rightArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SMTH_PARAMETER__RIGHT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_19_0_0_2, rightArg, true);
                    	    	copyLocalizationInfos(rightArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;
                    	case 3 :
                    	    // Ballandpaddle.g:4105:0: () a0= '<=' rightArg= parseop_BooleanExpression_level_3
                    	    {
                    	    // Ballandpaddle.g:4105:2: ()
                    	    // Ballandpaddle.g:4105:2: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,23,FOLLOW_23_in_parseop_BooleanExpression_level_23698); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createSeqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    collectHiddenTokens(element);
                    	    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_20_0_0_1, null, true);
                    	    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    // expected elements (follow set)
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[258]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[259]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[260]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[261]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[262]);
                    	    }

                    	    pushFollow(FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23709);
                    	    rightArg=parseop_BooleanExpression_level_3();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createSeqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (leftArg != null) {
                    	    	if (leftArg != null) {
                    	    		Object value = leftArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SEQ_PARAMETER__LEFT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_20_0_0_0, leftArg, true);
                    	    	copyLocalizationInfos(leftArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createSeqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (rightArg != null) {
                    	    	if (rightArg != null) {
                    	    		Object value = rightArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SEQ_PARAMETER__RIGHT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_20_0_0_2, rightArg, true);
                    	    	copyLocalizationInfos(rightArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;
                    	case 4 :
                    	    // Ballandpaddle.g:4165:0: () a0= '>' rightArg= parseop_BooleanExpression_level_3
                    	    {
                    	    // Ballandpaddle.g:4165:2: ()
                    	    // Ballandpaddle.g:4165:2: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,25,FOLLOW_25_in_parseop_BooleanExpression_level_23727); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLthParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    collectHiddenTokens(element);
                    	    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_21_0_0_1, null, true);
                    	    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    // expected elements (follow set)
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[263]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[264]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[265]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[266]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[267]);
                    	    }

                    	    pushFollow(FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23738);
                    	    rightArg=parseop_BooleanExpression_level_3();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLthParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (leftArg != null) {
                    	    	if (leftArg != null) {
                    	    		Object value = leftArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LTH_PARAMETER__LEFT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_21_0_0_0, leftArg, true);
                    	    	copyLocalizationInfos(leftArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLthParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (rightArg != null) {
                    	    	if (rightArg != null) {
                    	    		Object value = rightArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LTH_PARAMETER__RIGHT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_21_0_0_2, rightArg, true);
                    	    	copyLocalizationInfos(rightArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;
                    	case 5 :
                    	    // Ballandpaddle.g:4225:0: () a0= '>=' rightArg= parseop_BooleanExpression_level_3
                    	    {
                    	    // Ballandpaddle.g:4225:2: ()
                    	    // Ballandpaddle.g:4225:2: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,26,FOLLOW_26_in_parseop_BooleanExpression_level_23756); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLeqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    collectHiddenTokens(element);
                    	    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_22_0_0_1, null, true);
                    	    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    // expected elements (follow set)
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[268]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[269]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[270]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[271]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[272]);
                    	    }

                    	    pushFollow(FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23767);
                    	    rightArg=parseop_BooleanExpression_level_3();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLeqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (leftArg != null) {
                    	    	if (leftArg != null) {
                    	    		Object value = leftArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEQ_PARAMETER__LEFT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_22_0_0_0, leftArg, true);
                    	    	copyLocalizationInfos(leftArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLeqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (rightArg != null) {
                    	    	if (rightArg != null) {
                    	    		Object value = rightArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEQ_PARAMETER__RIGHT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_22_0_0_2, rightArg, true);
                    	    	copyLocalizationInfos(rightArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;
                    	case 6 :
                    	    // Ballandpaddle.g:4285:0: () a0= '!=' rightArg= parseop_BooleanExpression_level_3
                    	    {
                    	    // Ballandpaddle.g:4285:2: ()
                    	    // Ballandpaddle.g:4285:2: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,14,FOLLOW_14_in_parseop_BooleanExpression_level_23785); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createNeqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    collectHiddenTokens(element);
                    	    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_23_0_0_1, null, true);
                    	    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    // expected elements (follow set)
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[273]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[274]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[275]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[276]);
                    	    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[277]);
                    	    }

                    	    pushFollow(FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23796);
                    	    rightArg=parseop_BooleanExpression_level_3();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createNeqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (leftArg != null) {
                    	    	if (leftArg != null) {
                    	    		Object value = leftArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEQ_PARAMETER__LEFT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_23_0_0_0, leftArg, true);
                    	    	copyLocalizationInfos(leftArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) {
                    	    if (terminateParsing) {
                    	    	throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    	    }
                    	    if (element == null) {
                    	    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createNeqParameter();
                    	    	startIncompleteElement(element);
                    	    }
                    	    if (rightArg != null) {
                    	    	if (rightArg != null) {
                    	    		Object value = rightArg;
                    	    		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEQ_PARAMETER__RIGHT), value);
                    	    		completedElement(value, true);
                    	    	}
                    	    	collectHiddenTokens(element);
                    	    	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_23_0_0_2, rightArg, true);
                    	    	copyLocalizationInfos(rightArg, element);
                    	    }
                    	    }

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:4344:20: 
                    {
                    if ( state.backtracking==0 ) { element = leftArg; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, parseop_BooleanExpression_level_2_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_BooleanExpression_level_2"



    // $ANTLR start "parseop_BooleanExpression_level_3"
    // Ballandpaddle.g:4349:1: parseop_BooleanExpression_level_3 returns [org.alia4j.language.ballandpaddle.BooleanExpression element = null] : (a0= '!' arg= parseop_BooleanExpression_level_4 |arg= parseop_BooleanExpression_level_4 );
    public final org.alia4j.language.ballandpaddle.BooleanExpression parseop_BooleanExpression_level_3() throws RecognitionException {
        org.alia4j.language.ballandpaddle.BooleanExpression element =  null;

        int parseop_BooleanExpression_level_3_StartIndex = input.index();

        Token a0=null;
        org.alia4j.language.ballandpaddle.BooleanExpression arg =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }

            // Ballandpaddle.g:4352:0: (a0= '!' arg= parseop_BooleanExpression_level_4 |arg= parseop_BooleanExpression_level_4 )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==13) ) {
                alt32=1;
            }
            else if ( ((LA32_0 >= FLOAT && LA32_0 <= INTEGER)||LA32_0==16||LA32_0==35||LA32_0==38||(LA32_0 >= 42 && LA32_0 <= 45)||(LA32_0 >= 47 && LA32_0 <= 50)) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // Ballandpaddle.g:4353:0: a0= '!' arg= parseop_BooleanExpression_level_4
                    {
                    a0=(Token)match(input,13,FOLLOW_13_in_parseop_BooleanExpression_level_33834); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createNegParameter();
                    startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_26_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    }

                    if ( state.backtracking==0 ) {
                    // expected elements (follow set)
                    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[278]);
                    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[279]);
                    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[280]);
                    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[281]);
                    addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[282]);
                    }

                    pushFollow(FOLLOW_parseop_BooleanExpression_level_4_in_parseop_BooleanExpression_level_33845);
                    arg=parseop_BooleanExpression_level_4();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (terminateParsing) {
                    throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
                    }
                    if (element == null) {
                    element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createNegParameter();
                    startIncompleteElement(element);
                    }
                    if (arg != null) {
                    if (arg != null) {
                    Object value = arg;
                    element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEG_PARAMETER__BODY), value);
                    completedElement(value, true);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_26_0_0_1, arg, true);
                    copyLocalizationInfos(arg, element);
                    }
                    }

                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:4392:5: arg= parseop_BooleanExpression_level_4
                    {
                    pushFollow(FOLLOW_parseop_BooleanExpression_level_4_in_parseop_BooleanExpression_level_33855);
                    arg=parseop_BooleanExpression_level_4();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = arg; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, parseop_BooleanExpression_level_3_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_BooleanExpression_level_3"



    // $ANTLR start "parseop_BooleanExpression_level_4"
    // Ballandpaddle.g:4395:1: parseop_BooleanExpression_level_4 returns [org.alia4j.language.ballandpaddle.BooleanExpression element = null] : (c0= parse_org_alia4j_language_ballandpaddle_BracketParameter |c1= parse_org_alia4j_language_ballandpaddle_AttParameter |c2= parse_org_alia4j_language_ballandpaddle_IntValueParameter |c3= parse_org_alia4j_language_ballandpaddle_DoubleValueParameter );
    public final org.alia4j.language.ballandpaddle.BooleanExpression parseop_BooleanExpression_level_4() throws RecognitionException {
        org.alia4j.language.ballandpaddle.BooleanExpression element =  null;

        int parseop_BooleanExpression_level_4_StartIndex = input.index();

        org.alia4j.language.ballandpaddle.BracketParameter c0 =null;

        org.alia4j.language.ballandpaddle.AttParameter c1 =null;

        org.alia4j.language.ballandpaddle.IntValueParameter c2 =null;

        org.alia4j.language.ballandpaddle.DoubleValueParameter c3 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }

            // Ballandpaddle.g:4398:0: (c0= parse_org_alia4j_language_ballandpaddle_BracketParameter |c1= parse_org_alia4j_language_ballandpaddle_AttParameter |c2= parse_org_alia4j_language_ballandpaddle_IntValueParameter |c3= parse_org_alia4j_language_ballandpaddle_DoubleValueParameter )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt33=1;
                }
                break;
            case 35:
            case 38:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt33=2;
                }
                break;
            case INTEGER:
                {
                alt33=3;
                }
                break;
            case FLOAT:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // Ballandpaddle.g:4399:0: c0= parse_org_alia4j_language_ballandpaddle_BracketParameter
                    {
                    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_BracketParameter_in_parseop_BooleanExpression_level_43877);
                    c0=parse_org_alia4j_language_ballandpaddle_BracketParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:4400:2: c1= parse_org_alia4j_language_ballandpaddle_AttParameter
                    {
                    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_AttParameter_in_parseop_BooleanExpression_level_43885);
                    c1=parse_org_alia4j_language_ballandpaddle_AttParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Ballandpaddle.g:4401:2: c2= parse_org_alia4j_language_ballandpaddle_IntValueParameter
                    {
                    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_IntValueParameter_in_parseop_BooleanExpression_level_43893);
                    c2=parse_org_alia4j_language_ballandpaddle_IntValueParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Ballandpaddle.g:4402:2: c3= parse_org_alia4j_language_ballandpaddle_DoubleValueParameter
                    {
                    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_DoubleValueParameter_in_parseop_BooleanExpression_level_43901);
                    c3=parse_org_alia4j_language_ballandpaddle_DoubleValueParameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, parseop_BooleanExpression_level_4_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_BooleanExpression_level_4"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_BracketParameter"
    // Ballandpaddle.g:4405:1: parse_org_alia4j_language_ballandpaddle_BracketParameter returns [org.alia4j.language.ballandpaddle.BracketParameter element = null] : a0= '(' (a1_0= parse_org_alia4j_language_ballandpaddle_BooleanExpression ) a2= ')' ;
    public final org.alia4j.language.ballandpaddle.BracketParameter parse_org_alia4j_language_ballandpaddle_BracketParameter() throws RecognitionException {
        org.alia4j.language.ballandpaddle.BracketParameter element =  null;

        int parse_org_alia4j_language_ballandpaddle_BracketParameter_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        org.alia4j.language.ballandpaddle.BooleanExpression a1_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }

            // Ballandpaddle.g:4408:4: (a0= '(' (a1_0= parse_org_alia4j_language_ballandpaddle_BooleanExpression ) a2= ')' )
            // Ballandpaddle.g:4409:4: a0= '(' (a1_0= parse_org_alia4j_language_ballandpaddle_BooleanExpression ) a2= ')'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_org_alia4j_language_ballandpaddle_BracketParameter3923); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            if (element == null) {
            element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBracketParameter();
            startIncompleteElement(element);
            }
            collectHiddenTokens(element);
            retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_0, null, true);
            copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[283]);
            addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[284]);
            addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[285]);
            addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[286]);
            addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[287]);
            }

            // Ballandpaddle.g:4427:6: (a1_0= parse_org_alia4j_language_ballandpaddle_BooleanExpression )
            // Ballandpaddle.g:4428:6: a1_0= parse_org_alia4j_language_ballandpaddle_BooleanExpression
            {
            pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_BooleanExpression_in_parse_org_alia4j_language_ballandpaddle_BracketParameter3936);
            a1_0=parse_org_alia4j_language_ballandpaddle_BooleanExpression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            if (terminateParsing) {
            throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            }
            if (element == null) {
            element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBracketParameter();
            startIncompleteElement(element);
            }
            if (a1_0 != null) {
            if (a1_0 != null) {
            	Object value = a1_0;
            	element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BRACKET_PARAMETER__BODY), value);
            	completedElement(value, true);
            }
            collectHiddenTokens(element);
            retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_1, a1_0, true);
            copyLocalizationInfos(a1_0, element);
            }
            }

            }


            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[288]);
            }

            a2=(Token)match(input,17,FOLLOW_17_in_parse_org_alia4j_language_ballandpaddle_BracketParameter3948); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            if (element == null) {
            element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBracketParameter();
            startIncompleteElement(element);
            }
            collectHiddenTokens(element);
            retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_2, null, true);
            copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[289]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[290]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[291]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[292]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[293]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[294]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[295]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[296]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[297]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[298]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, parse_org_alia4j_language_ballandpaddle_BracketParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_BracketParameter"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_AttParameter"
    // Ballandpaddle.g:4478:1: parse_org_alia4j_language_ballandpaddle_AttParameter returns [org.alia4j.language.ballandpaddle.AttParameter element = null] : ( (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' ) ) ;
    public final org.alia4j.language.ballandpaddle.AttParameter parse_org_alia4j_language_ballandpaddle_AttParameter() throws RecognitionException {
        org.alia4j.language.ballandpaddle.AttParameter element =  null;

        int parse_org_alia4j_language_ballandpaddle_AttParameter_StartIndex = input.index();

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



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }

            // Ballandpaddle.g:4481:0: ( ( (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' ) ) )
            // Ballandpaddle.g:4482:0: ( (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' ) )
            {
            // Ballandpaddle.g:4482:0: ( (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' ) )
            // Ballandpaddle.g:4483:0: (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' )
            {
            // Ballandpaddle.g:4483:0: (a0= 'x' |a1= 'y' |a2= 'size' |a3= 'orientation' |a4= 'speed' |a5= 'hardness' |a6= 'resistance normal' |a7= 'resistance fire' |a8= 'resistance cold' |a9= 'resistance shock' )
            int alt34=10;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt34=1;
                }
                break;
            case 50:
                {
                alt34=2;
                }
                break;
            case 47:
                {
                alt34=3;
                }
                break;
            case 38:
                {
                alt34=4;
                }
                break;
            case 48:
                {
                alt34=5;
                }
                break;
            case 35:
                {
                alt34=6;
                }
                break;
            case 44:
                {
                alt34=7;
                }
                break;
            case 43:
                {
                alt34=8;
                }
                break;
            case 42:
                {
                alt34=9;
                }
                break;
            case 45:
                {
                alt34=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // Ballandpaddle.g:4484:0: a0= 'x'
                    {
                    a0=(Token)match(input,49,FOLLOW_49_in_parse_org_alia4j_language_ballandpaddle_AttParameter3978); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
                    	startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_28_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    // set value of enumeration attribute
                    Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.X_VALUE).getInstance();
                    element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
                    completedElement(value, false);
                    }

                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:4497:2: a1= 'y'
                    {
                    a1=(Token)match(input,50,FOLLOW_50_in_parse_org_alia4j_language_ballandpaddle_AttParameter3987); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
                    	startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_28_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
                    // set value of enumeration attribute
                    Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.Y_VALUE).getInstance();
                    element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
                    completedElement(value, false);
                    }

                    }
                    break;
                case 3 :
                    // Ballandpaddle.g:4510:2: a2= 'size'
                    {
                    a2=(Token)match(input,47,FOLLOW_47_in_parse_org_alia4j_language_ballandpaddle_AttParameter3996); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
                    	startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_28_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    // set value of enumeration attribute
                    Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SIZE_VALUE).getInstance();
                    element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
                    completedElement(value, false);
                    }

                    }
                    break;
                case 4 :
                    // Ballandpaddle.g:4523:2: a3= 'orientation'
                    {
                    a3=(Token)match(input,38,FOLLOW_38_in_parse_org_alia4j_language_ballandpaddle_AttParameter4005); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
                    	startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_28_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
                    // set value of enumeration attribute
                    Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.ORIENTATION_VALUE).getInstance();
                    element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
                    completedElement(value, false);
                    }

                    }
                    break;
                case 5 :
                    // Ballandpaddle.g:4536:2: a4= 'speed'
                    {
                    a4=(Token)match(input,48,FOLLOW_48_in_parse_org_alia4j_language_ballandpaddle_AttParameter4014); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
                    	startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_28_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    // set value of enumeration attribute
                    Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SPEED_VALUE).getInstance();
                    element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
                    completedElement(value, false);
                    }

                    }
                    break;
                case 6 :
                    // Ballandpaddle.g:4549:2: a5= 'hardness'
                    {
                    a5=(Token)match(input,35,FOLLOW_35_in_parse_org_alia4j_language_ballandpaddle_AttParameter4023); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
                    	startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_28_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
                    // set value of enumeration attribute
                    Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.HARDNESS_VALUE).getInstance();
                    element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
                    completedElement(value, false);
                    }

                    }
                    break;
                case 7 :
                    // Ballandpaddle.g:4562:2: a6= 'resistance normal'
                    {
                    a6=(Token)match(input,44,FOLLOW_44_in_parse_org_alia4j_language_ballandpaddle_AttParameter4032); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
                    	startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_28_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    // set value of enumeration attribute
                    Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.NORMAL_RES_VALUE).getInstance();
                    element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
                    completedElement(value, false);
                    }

                    }
                    break;
                case 8 :
                    // Ballandpaddle.g:4575:2: a7= 'resistance fire'
                    {
                    a7=(Token)match(input,43,FOLLOW_43_in_parse_org_alia4j_language_ballandpaddle_AttParameter4041); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
                    	startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_28_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
                    // set value of enumeration attribute
                    Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.FIRE_RES_VALUE).getInstance();
                    element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
                    completedElement(value, false);
                    }

                    }
                    break;
                case 9 :
                    // Ballandpaddle.g:4588:2: a8= 'resistance cold'
                    {
                    a8=(Token)match(input,42,FOLLOW_42_in_parse_org_alia4j_language_ballandpaddle_AttParameter4050); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
                    	startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_28_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
                    // set value of enumeration attribute
                    Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.COLD_RES_VALUE).getInstance();
                    element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
                    completedElement(value, false);
                    }

                    }
                    break;
                case 10 :
                    // Ballandpaddle.g:4601:2: a9= 'resistance shock'
                    {
                    a9=(Token)match(input,45,FOLLOW_45_in_parse_org_alia4j_language_ballandpaddle_AttParameter4059); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    if (element == null) {
                    	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
                    	startIncompleteElement(element);
                    }
                    collectHiddenTokens(element);
                    retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_28_0_0_0, null, true);
                    copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
                    // set value of enumeration attribute
                    Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SHOCK_RES_VALUE).getInstance();
                    element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
                    completedElement(value, false);
                    }

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[299]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[300]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[301]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[302]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[303]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[304]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[305]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[306]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[307]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[308]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, parse_org_alia4j_language_ballandpaddle_AttParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_AttParameter"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_IntValueParameter"
    // Ballandpaddle.g:4632:1: parse_org_alia4j_language_ballandpaddle_IntValueParameter returns [org.alia4j.language.ballandpaddle.IntValueParameter element = null] : (a0= INTEGER ) ;
    public final org.alia4j.language.ballandpaddle.IntValueParameter parse_org_alia4j_language_ballandpaddle_IntValueParameter() throws RecognitionException {
        org.alia4j.language.ballandpaddle.IntValueParameter element =  null;

        int parse_org_alia4j_language_ballandpaddle_IntValueParameter_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }

            // Ballandpaddle.g:4635:4: ( (a0= INTEGER ) )
            // Ballandpaddle.g:4636:4: (a0= INTEGER )
            {
            // Ballandpaddle.g:4636:4: (a0= INTEGER )
            // Ballandpaddle.g:4637:4: a0= INTEGER
            {
            a0=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_IntValueParameter4091); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            if (terminateParsing) {
            throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            }
            if (element == null) {
            element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createIntValueParameter();
            startIncompleteElement(element);
            }
            if (a0 != null) {
            org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
            tokenResolver.setOptions(getOptions());
            org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.INT_VALUE_PARAMETER__VALUE), result);
            Object resolvedObject = result.getResolvedToken();
            if (resolvedObject == null) {
            	addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            }
            java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            if (resolved != null) {
            	Object value = resolved;
            	element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.INT_VALUE_PARAMETER__VALUE), value);
            	completedElement(value, false);
            }
            collectHiddenTokens(element);
            retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_29_0_0_0, resolved, true);
            copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            }
            }

            }


            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[309]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[310]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[311]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[312]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[313]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[314]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[315]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[316]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[317]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[318]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, parse_org_alia4j_language_ballandpaddle_IntValueParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_IntValueParameter"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_DoubleValueParameter"
    // Ballandpaddle.g:4683:1: parse_org_alia4j_language_ballandpaddle_DoubleValueParameter returns [org.alia4j.language.ballandpaddle.DoubleValueParameter element = null] : (a0= FLOAT ) ;
    public final org.alia4j.language.ballandpaddle.DoubleValueParameter parse_org_alia4j_language_ballandpaddle_DoubleValueParameter() throws RecognitionException {
        org.alia4j.language.ballandpaddle.DoubleValueParameter element =  null;

        int parse_org_alia4j_language_ballandpaddle_DoubleValueParameter_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }

            // Ballandpaddle.g:4686:4: ( (a0= FLOAT ) )
            // Ballandpaddle.g:4687:4: (a0= FLOAT )
            {
            // Ballandpaddle.g:4687:4: (a0= FLOAT )
            // Ballandpaddle.g:4688:4: a0= FLOAT
            {
            a0=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_DoubleValueParameter4121); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            if (terminateParsing) {
            throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
            }
            if (element == null) {
            element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createDoubleValueParameter();
            startIncompleteElement(element);
            }
            if (a0 != null) {
            org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FLOAT");
            tokenResolver.setOptions(getOptions());
            org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
            tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.DOUBLE_VALUE_PARAMETER__VALUE), result);
            Object resolvedObject = result.getResolvedToken();
            if (resolvedObject == null) {
            	addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            }
            java.lang.Double resolved = (java.lang.Double) resolvedObject;
            if (resolved != null) {
            	Object value = resolved;
            	element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.DOUBLE_VALUE_PARAMETER__VALUE), value);
            	completedElement(value, false);
            }
            collectHiddenTokens(element);
            retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_30_0_0_0, resolved, true);
            copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            }
            }

            }


            if ( state.backtracking==0 ) {
            // expected elements (follow set)
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[319]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[320]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[321]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[322]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[323]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[324]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[325]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[326]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[327]);
            addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[328]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, parse_org_alia4j_language_ballandpaddle_DoubleValueParameter_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_DoubleValueParameter"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_Target"
    // Ballandpaddle.g:4734:1: parse_org_alia4j_language_ballandpaddle_Target returns [org.alia4j.language.ballandpaddle.Target element = null] : (c0= parse_org_alia4j_language_ballandpaddle_ObjectTarget |c1= parse_org_alia4j_language_ballandpaddle_TypeTarget );
    public final org.alia4j.language.ballandpaddle.Target parse_org_alia4j_language_ballandpaddle_Target() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Target element =  null;

        int parse_org_alia4j_language_ballandpaddle_Target_StartIndex = input.index();

        org.alia4j.language.ballandpaddle.ObjectTarget c0 =null;

        org.alia4j.language.ballandpaddle.TypeTarget c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }

            // Ballandpaddle.g:4735:0: (c0= parse_org_alia4j_language_ballandpaddle_ObjectTarget |c1= parse_org_alia4j_language_ballandpaddle_TypeTarget )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==CHAR||LA35_0==TEXT) ) {
                alt35=1;
            }
            else if ( ((LA35_0 >= 27 && LA35_0 <= 28)||LA35_0==39) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // Ballandpaddle.g:4736:0: c0= parse_org_alia4j_language_ballandpaddle_ObjectTarget
                    {
                    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_ObjectTarget_in_parse_org_alia4j_language_ballandpaddle_Target4145);
                    c0=parse_org_alia4j_language_ballandpaddle_ObjectTarget();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Ballandpaddle.g:4737:2: c1= parse_org_alia4j_language_ballandpaddle_TypeTarget
                    {
                    pushFollow(FOLLOW_parse_org_alia4j_language_ballandpaddle_TypeTarget_in_parse_org_alia4j_language_ballandpaddle_Target4153);
                    c1=parse_org_alia4j_language_ballandpaddle_TypeTarget();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, parse_org_alia4j_language_ballandpaddle_Target_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_Target"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_Expression"
    // Ballandpaddle.g:4741:1: parse_org_alia4j_language_ballandpaddle_Expression returns [org.alia4j.language.ballandpaddle.Expression element = null] : c= parseop_Expression_level_1 ;
    public final org.alia4j.language.ballandpaddle.Expression parse_org_alia4j_language_ballandpaddle_Expression() throws RecognitionException {
        org.alia4j.language.ballandpaddle.Expression element =  null;

        int parse_org_alia4j_language_ballandpaddle_Expression_StartIndex = input.index();

        org.alia4j.language.ballandpaddle.Expression c =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }

            // Ballandpaddle.g:4742:3: (c= parseop_Expression_level_1 )
            // Ballandpaddle.g:4743:3: c= parseop_Expression_level_1
            {
            pushFollow(FOLLOW_parseop_Expression_level_1_in_parse_org_alia4j_language_ballandpaddle_Expression4172);
            c=parseop_Expression_level_1();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c; /* this rule is an expression root */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, parse_org_alia4j_language_ballandpaddle_Expression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_Expression"



    // $ANTLR start "parse_org_alia4j_language_ballandpaddle_BooleanExpression"
    // Ballandpaddle.g:4747:1: parse_org_alia4j_language_ballandpaddle_BooleanExpression returns [org.alia4j.language.ballandpaddle.BooleanExpression element = null] : c= parseop_BooleanExpression_level_1 ;
    public final org.alia4j.language.ballandpaddle.BooleanExpression parse_org_alia4j_language_ballandpaddle_BooleanExpression() throws RecognitionException {
        org.alia4j.language.ballandpaddle.BooleanExpression element =  null;

        int parse_org_alia4j_language_ballandpaddle_BooleanExpression_StartIndex = input.index();

        org.alia4j.language.ballandpaddle.BooleanExpression c =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }

            // Ballandpaddle.g:4748:3: (c= parseop_BooleanExpression_level_1 )
            // Ballandpaddle.g:4749:3: c= parseop_BooleanExpression_level_1
            {
            pushFollow(FOLLOW_parseop_BooleanExpression_level_1_in_parse_org_alia4j_language_ballandpaddle_BooleanExpression4191);
            c=parseop_BooleanExpression_level_1();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c; /* this rule is an expression root */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, parse_org_alia4j_language_ballandpaddle_BooleanExpression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_alia4j_language_ballandpaddle_BooleanExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_Root_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_Level_in_parse_org_alia4j_language_ballandpaddle_Root119 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_Paddle_in_parse_org_alia4j_language_ballandpaddle_Root146 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_Ball_in_parse_org_alia4j_language_ballandpaddle_Root181 = new BitSet(new long[]{0x0000010118000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_Block_in_parse_org_alia4j_language_ballandpaddle_Root216 = new BitSet(new long[]{0x0000010110000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_Power_in_parse_org_alia4j_language_ballandpaddle_Root251 = new BitSet(new long[]{0x0000010100000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_Effect_in_parse_org_alia4j_language_ballandpaddle_Root286 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_36_in_parse_org_alia4j_language_ballandpaddle_Level327 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Level345 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Level366 = new BitSet(new long[]{0x0020020000000200L});
    public static final BitSet FOLLOW_LEVELLINE_in_parse_org_alia4j_language_ballandpaddle_Level389 = new BitSet(new long[]{0x0020020000000200L});
    public static final BitSet FOLLOW_41_in_parse_org_alia4j_language_ballandpaddle_Level428 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Level448 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Level474 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Level520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_parse_org_alia4j_language_ballandpaddle_Paddle549 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Paddle567 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Paddle588 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_parse_org_alia4j_language_ballandpaddle_Paddle602 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Paddle616 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Paddle634 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_parse_org_alia4j_language_ballandpaddle_Paddle655 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Paddle669 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Paddle687 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_parse_org_alia4j_language_ballandpaddle_Paddle708 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Paddle722 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Paddle740 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_org_alia4j_language_ballandpaddle_Paddle761 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Paddle775 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Paddle793 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Paddle814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_org_alia4j_language_ballandpaddle_Ball843 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Ball861 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Ball882 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_parse_org_alia4j_language_ballandpaddle_Ball896 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Ball910 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Ball928 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_parse_org_alia4j_language_ballandpaddle_Ball949 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Ball963 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Ball981 = new BitSet(new long[]{0x0021800040000000L});
    public static final BitSet FOLLOW_47_in_parse_org_alia4j_language_ballandpaddle_Ball1011 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Ball1031 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Ball1057 = new BitSet(new long[]{0x0021000040000000L});
    public static final BitSet FOLLOW_30_in_parse_org_alia4j_language_ballandpaddle_Ball1112 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Ball1132 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Ball1158 = new BitSet(new long[]{0x0021000000000000L});
    public static final BitSet FOLLOW_48_in_parse_org_alia4j_language_ballandpaddle_Ball1213 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Ball1233 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Ball1259 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Ball1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_org_alia4j_language_ballandpaddle_Block1334 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHAR_in_parse_org_alia4j_language_ballandpaddle_Block1352 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Block1373 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_org_alia4j_language_ballandpaddle_Block1387 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1401 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Block1419 = new BitSet(new long[]{0x00203D0000000000L});
    public static final BitSet FOLLOW_44_in_parse_org_alia4j_language_ballandpaddle_Block1449 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1469 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Block1495 = new BitSet(new long[]{0x00202D0000000000L});
    public static final BitSet FOLLOW_43_in_parse_org_alia4j_language_ballandpaddle_Block1550 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1570 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Block1596 = new BitSet(new long[]{0x0020250000000000L});
    public static final BitSet FOLLOW_42_in_parse_org_alia4j_language_ballandpaddle_Block1651 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1671 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Block1697 = new BitSet(new long[]{0x0020210000000000L});
    public static final BitSet FOLLOW_45_in_parse_org_alia4j_language_ballandpaddle_Block1752 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1772 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Block1798 = new BitSet(new long[]{0x0020010000000000L});
    public static final BitSet FOLLOW_40_in_parse_org_alia4j_language_ballandpaddle_Block1853 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Block1873 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Block1899 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Block1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parse_org_alia4j_language_ballandpaddle_Power1974 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Power1992 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_org_alia4j_language_ballandpaddle_Power2013 = new BitSet(new long[]{0x0000008018000820L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_Target_in_parse_org_alia4j_language_ballandpaddle_Power2031 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_alia4j_language_ballandpaddle_Power2049 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Power2063 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_parse_org_alia4j_language_ballandpaddle_Power2077 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Power2091 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Power2109 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_org_alia4j_language_ballandpaddle_Power2130 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Power2144 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_Power2162 = new BitSet(new long[]{0x0020020000000000L});
    public static final BitSet FOLLOW_41_in_parse_org_alia4j_language_ballandpaddle_Power2192 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Power2212 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_Power2238 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Power2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parse_org_alia4j_language_ballandpaddle_Effect2313 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_Effect2331 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_org_alia4j_language_ballandpaddle_Effect2352 = new BitSet(new long[]{0x0000008018020820L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_Target_in_parse_org_alia4j_language_ballandpaddle_Effect2375 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_alia4j_language_ballandpaddle_Effect2401 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_Effect2415 = new BitSet(new long[]{0x0007FC6C20000000L});
    public static final BitSet FOLLOW_49_in_parse_org_alia4j_language_ballandpaddle_Effect2438 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_50_in_parse_org_alia4j_language_ballandpaddle_Effect2453 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_47_in_parse_org_alia4j_language_ballandpaddle_Effect2468 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_38_in_parse_org_alia4j_language_ballandpaddle_Effect2483 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_48_in_parse_org_alia4j_language_ballandpaddle_Effect2498 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_35_in_parse_org_alia4j_language_ballandpaddle_Effect2513 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_44_in_parse_org_alia4j_language_ballandpaddle_Effect2528 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_43_in_parse_org_alia4j_language_ballandpaddle_Effect2543 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_42_in_parse_org_alia4j_language_ballandpaddle_Effect2558 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_45_in_parse_org_alia4j_language_ballandpaddle_Effect2573 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_37_in_parse_org_alia4j_language_ballandpaddle_Effect2588 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_34_in_parse_org_alia4j_language_ballandpaddle_Effect2603 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_29_in_parse_org_alia4j_language_ballandpaddle_Effect2618 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_46_in_parse_org_alia4j_language_ballandpaddle_Effect2633 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_alia4j_language_ballandpaddle_Effect2654 = new BitSet(new long[]{0x0007FC6C20110180L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_Expression_in_parse_org_alia4j_language_ballandpaddle_Effect2672 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_Effect2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_parse_org_alia4j_language_ballandpaddle_ObjectTarget2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_alia4j_language_ballandpaddle_ObjectTarget2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2797 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2812 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_27_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2827 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2848 = new BitSet(new long[]{0x0007BC4800012180L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_BooleanExpression_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2866 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parse_org_alia4j_language_ballandpaddle_TypeTarget2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_Expression_level_2_in_parseop_Expression_level_12913 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_18_in_parseop_Expression_level_12933 = new BitSet(new long[]{0x0007FC6C20110180L});
    public static final BitSet FOLLOW_parseop_Expression_level_2_in_parseop_Expression_level_12950 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_21_in_parseop_Expression_level_12984 = new BitSet(new long[]{0x0007FC6C20110180L});
    public static final BitSet FOLLOW_parseop_Expression_level_2_in_parseop_Expression_level_13001 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_parseop_Expression_level_3_in_parseop_Expression_level_23047 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_parseop_Expression_level_23063 = new BitSet(new long[]{0x0007FC6C20110180L});
    public static final BitSet FOLLOW_parseop_Expression_level_3_in_parseop_Expression_level_23077 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_20_in_parseop_Expression_level_23103 = new BitSet(new long[]{0x0007FC6C20110180L});
    public static final BitSet FOLLOW_parseop_Expression_level_3_in_parseop_Expression_level_23117 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_20_in_parseop_Expression_level_33158 = new BitSet(new long[]{0x0007FC6C20010180L});
    public static final BitSet FOLLOW_parseop_Expression_level_4_in_parseop_Expression_level_33169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_Expression_level_4_in_parseop_Expression_level_33179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_BracketExpression_in_parseop_Expression_level_43201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_IntOperand_in_parseop_Expression_level_43209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_DoubleOperand_in_parseop_Expression_level_43217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_AttOperand_in_parseop_Expression_level_43225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_org_alia4j_language_ballandpaddle_BracketExpression3247 = new BitSet(new long[]{0x0007FC6C20110180L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_Expression_in_parse_org_alia4j_language_ballandpaddle_BracketExpression3260 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_alia4j_language_ballandpaddle_BracketExpression3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_IntOperand3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_DoubleOperand3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_parse_org_alia4j_language_ballandpaddle_AttOperand3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_parse_org_alia4j_language_ballandpaddle_AttOperand3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_parse_org_alia4j_language_ballandpaddle_AttOperand3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_parse_org_alia4j_language_ballandpaddle_AttOperand3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_parse_org_alia4j_language_ballandpaddle_AttOperand3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_org_alia4j_language_ballandpaddle_AttOperand3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_parse_org_alia4j_language_ballandpaddle_AttOperand3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_parse_org_alia4j_language_ballandpaddle_AttOperand3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_org_alia4j_language_ballandpaddle_AttOperand3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_parse_org_alia4j_language_ballandpaddle_AttOperand3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_org_alia4j_language_ballandpaddle_AttOperand3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_org_alia4j_language_ballandpaddle_AttOperand3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_org_alia4j_language_ballandpaddle_AttOperand3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_parse_org_alia4j_language_ballandpaddle_AttOperand3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_2_in_parseop_BooleanExpression_level_13536 = new BitSet(new long[]{0x0010000000008002L});
    public static final BitSet FOLLOW_52_in_parseop_BooleanExpression_level_13549 = new BitSet(new long[]{0x0007BC4800012180L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_2_in_parseop_BooleanExpression_level_13560 = new BitSet(new long[]{0x0010000000008002L});
    public static final BitSet FOLLOW_15_in_parseop_BooleanExpression_level_13578 = new BitSet(new long[]{0x0007BC4800012180L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_2_in_parseop_BooleanExpression_level_13589 = new BitSet(new long[]{0x0010000000008002L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23627 = new BitSet(new long[]{0x0000000007C04002L});
    public static final BitSet FOLLOW_24_in_parseop_BooleanExpression_level_23640 = new BitSet(new long[]{0x0007BC4800012180L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23651 = new BitSet(new long[]{0x0000000007C04002L});
    public static final BitSet FOLLOW_22_in_parseop_BooleanExpression_level_23669 = new BitSet(new long[]{0x0007BC4800012180L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23680 = new BitSet(new long[]{0x0000000007C04002L});
    public static final BitSet FOLLOW_23_in_parseop_BooleanExpression_level_23698 = new BitSet(new long[]{0x0007BC4800012180L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23709 = new BitSet(new long[]{0x0000000007C04002L});
    public static final BitSet FOLLOW_25_in_parseop_BooleanExpression_level_23727 = new BitSet(new long[]{0x0007BC4800012180L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23738 = new BitSet(new long[]{0x0000000007C04002L});
    public static final BitSet FOLLOW_26_in_parseop_BooleanExpression_level_23756 = new BitSet(new long[]{0x0007BC4800012180L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23767 = new BitSet(new long[]{0x0000000007C04002L});
    public static final BitSet FOLLOW_14_in_parseop_BooleanExpression_level_23785 = new BitSet(new long[]{0x0007BC4800012180L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_3_in_parseop_BooleanExpression_level_23796 = new BitSet(new long[]{0x0000000007C04002L});
    public static final BitSet FOLLOW_13_in_parseop_BooleanExpression_level_33834 = new BitSet(new long[]{0x0007BC4800010180L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_4_in_parseop_BooleanExpression_level_33845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_4_in_parseop_BooleanExpression_level_33855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_BracketParameter_in_parseop_BooleanExpression_level_43877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_AttParameter_in_parseop_BooleanExpression_level_43885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_IntValueParameter_in_parseop_BooleanExpression_level_43893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_DoubleValueParameter_in_parseop_BooleanExpression_level_43901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_org_alia4j_language_ballandpaddle_BracketParameter3923 = new BitSet(new long[]{0x0007BC4800012180L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_BooleanExpression_in_parse_org_alia4j_language_ballandpaddle_BracketParameter3936 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_alia4j_language_ballandpaddle_BracketParameter3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_parse_org_alia4j_language_ballandpaddle_AttParameter3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_parse_org_alia4j_language_ballandpaddle_AttParameter3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_parse_org_alia4j_language_ballandpaddle_AttParameter3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_parse_org_alia4j_language_ballandpaddle_AttParameter4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_parse_org_alia4j_language_ballandpaddle_AttParameter4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_org_alia4j_language_ballandpaddle_AttParameter4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_parse_org_alia4j_language_ballandpaddle_AttParameter4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_parse_org_alia4j_language_ballandpaddle_AttParameter4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_org_alia4j_language_ballandpaddle_AttParameter4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_parse_org_alia4j_language_ballandpaddle_AttParameter4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_parse_org_alia4j_language_ballandpaddle_IntValueParameter4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_parse_org_alia4j_language_ballandpaddle_DoubleValueParameter4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_ObjectTarget_in_parse_org_alia4j_language_ballandpaddle_Target4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_alia4j_language_ballandpaddle_TypeTarget_in_parse_org_alia4j_language_ballandpaddle_Target4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_Expression_level_1_in_parse_org_alia4j_language_ballandpaddle_Expression4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_BooleanExpression_level_1_in_parse_org_alia4j_language_ballandpaddle_BooleanExpression4191 = new BitSet(new long[]{0x0000000000000002L});

}