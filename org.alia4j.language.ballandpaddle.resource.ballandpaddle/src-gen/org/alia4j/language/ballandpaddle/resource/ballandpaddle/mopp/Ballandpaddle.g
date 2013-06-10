grammar Ballandpaddle;

options {
	superClass = BallandpaddleANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
	}
}
@header{
	package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;
}

@members{
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
		int followSetID = 141;
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[0]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_alia4j_language_ballandpaddle_Root{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_alia4j_language_ballandpaddle_Root returns [org.alia4j.language.ballandpaddle.Root element = null]
@init{
}
:
	(
		a0_0 = parse_org_alia4j_language_ballandpaddle_Level		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[1]);
	}
	
	(
		(
			a1_0 = parse_org_alia4j_language_ballandpaddle_Paddle			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[2]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[3]);
	}
	
	(
		(
			a2_0 = parse_org_alia4j_language_ballandpaddle_Ball			{
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
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[4]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[5]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[6]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[7]);
	}
	
	(
		(
			a3_0 = parse_org_alia4j_language_ballandpaddle_Block			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[8]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[9]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[10]);
	}
	
	(
		(
			a4_0 = parse_org_alia4j_language_ballandpaddle_Power			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[11]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[12]);
	}
	
	(
		(
			a5_0 = parse_org_alia4j_language_ballandpaddle_Effect			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[13]);
	}
	
;

parse_org_alia4j_language_ballandpaddle_Level returns [org.alia4j.language.ballandpaddle.Level element = null]
@init{
}
:
	a0 = 'level' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[14]);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[15]);
	}
	
	a2 = '{' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[16]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[17]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[18]);
	}
	
	(
		(
			a3 = LEVELLINE			
			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[19]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[20]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[21]);
	}
	
	(
		(
			a4 = 'powerSpawnChance' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_4_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[22]);
			}
			
			a5 = '=' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_4_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[23]);
			}
			
			(
				a6 = FLOAT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[24]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[25]);
	}
	
	a7 = '}' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLevel();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_1_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[26]);
	}
	
;

parse_org_alia4j_language_ballandpaddle_Paddle returns [org.alia4j.language.ballandpaddle.Paddle element = null]
@init{
}
:
	a0 = 'paddle' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[27]);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[28]);
	}
	
	a2 = '{' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[29]);
	}
	
	a3 = 'x' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[30]);
	}
	
	a4 = '=' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[31]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
			}
			if (element == null) {
				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__X), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[32]);
	}
	
	a6 = 'y' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[33]);
	}
	
	a7 = '=' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[34]);
	}
	
	(
		a8 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
			}
			if (element == null) {
				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
				startIncompleteElement(element);
			}
			if (a8 != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__Y), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[35]);
	}
	
	a9 = 'shape' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[36]);
	}
	
	a10 = '=' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[37]);
	}
	
	(
		(
			a11 = 'circle' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_11, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
				// set value of enumeration attribute
				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getShape().getEEnumLiteral(org.alia4j.language.ballandpaddle.Shape.CIRCLE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SHAPE), value);
				completedElement(value, false);
			}
			|			a12 = 'triangle' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_11, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
				// set value of enumeration attribute
				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getShape().getEEnumLiteral(org.alia4j.language.ballandpaddle.Shape.TRIANGLE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SHAPE), value);
				completedElement(value, false);
			}
			|			a13 = 'square' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_11, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
				// set value of enumeration attribute
				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getShape().getEEnumLiteral(org.alia4j.language.ballandpaddle.Shape.SQUARE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SHAPE), value);
				completedElement(value, false);
			}
			|			a14 = 'rectangle' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_11, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
				// set value of enumeration attribute
				Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getShape().getEEnumLiteral(org.alia4j.language.ballandpaddle.Shape.RECTANGLE_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SHAPE), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[38]);
	}
	
	a17 = 'size' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_12, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[39]);
	}
	
	a18 = '=' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_13, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[40]);
	}
	
	(
		a19 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
			}
			if (element == null) {
				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
				startIncompleteElement(element);
			}
			if (a19 != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a19.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SIZE), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a19).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a19).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SIZE), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_14, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a19, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[41]);
	}
	
	a20 = 'orientation' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_15, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a20, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[42]);
	}
	
	a21 = '=' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_16, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[43]);
	}
	
	(
		a22 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
			}
			if (element == null) {
				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
				startIncompleteElement(element);
			}
			if (a22 != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a22.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ORIENTATION), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a22).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a22).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ORIENTATION), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_17, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a22, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[44]);
	}
	
	a23 = '}' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPaddle();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_2_0_0_18, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a23, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[45]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[46]);
	}
	
;

parse_org_alia4j_language_ballandpaddle_Ball returns [org.alia4j.language.ballandpaddle.Ball element = null]
@init{
}
:
	a0 = 'ball' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[47]);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[48]);
	}
	
	a2 = '{' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[49]);
	}
	
	a3 = 'x' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[50]);
	}
	
	a4 = '=' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[51]);
	}
	
	(
		a5 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
			}
			if (element == null) {
				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
				startIncompleteElement(element);
			}
			if (a5 != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__X), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a5).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[52]);
	}
	
	a6 = 'y' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[53]);
	}
	
	a7 = '=' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[54]);
	}
	
	(
		a8 = INTEGER		
		{
			if (terminateParsing) {
				throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
			}
			if (element == null) {
				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
				startIncompleteElement(element);
			}
			if (a8 != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__Y), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[55]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[56]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[57]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[58]);
	}
	
	(
		(
			a9 = 'size' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[59]);
			}
			
			a10 = '=' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_9_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[60]);
			}
			
			(
				a11 = INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[61]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[62]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[63]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[64]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[65]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[66]);
	}
	
	(
		(
			a12 = 'direction' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_10_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[67]);
			}
			
			a13 = '=' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_10_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[68]);
			}
			
			(
				a14 = INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[69]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[70]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[71]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[72]);
	}
	
	(
		(
			a15 = 'speed' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_11_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[73]);
			}
			
			a16 = '=' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_11_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[74]);
			}
			
			(
				a17 = INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[75]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[76]);
	}
	
	a18 = '}' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_3_0_0_12, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[77]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[78]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[79]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[80]);
	}
	
;

parse_org_alia4j_language_ballandpaddle_Block returns [org.alia4j.language.ballandpaddle.Block element = null]
@init{
}
:
	a0 = 'block' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[81]);
	}
	
	(
		a1 = CHAR		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[82]);
	}
	
	a2 = '{' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[83]);
	}
	
	a3 = 'hardness' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[84]);
	}
	
	a4 = '=' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[85]);
	}
	
	(
		a5 = INTEGER		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[86]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[87]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[88]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[89]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[90]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[91]);
	}
	
	(
		(
			a6 = 'resistance normal' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_6_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[92]);
			}
			
			a7 = '=' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_6_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[93]);
			}
			
			(
				a8 = INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[94]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[95]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[96]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[97]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[98]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[99]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[100]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[101]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[102]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[103]);
	}
	
	(
		(
			a9 = 'resistance fire' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_7_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[104]);
			}
			
			a10 = '=' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_7_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[105]);
			}
			
			(
				a11 = INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[106]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[107]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[108]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[109]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[110]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[111]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[112]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[113]);
	}
	
	(
		(
			a12 = 'resistance cold' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_8_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[114]);
			}
			
			a13 = '=' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_8_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[115]);
			}
			
			(
				a14 = INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[116]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[117]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[118]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[119]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[120]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[121]);
	}
	
	(
		(
			a15 = 'resistance shock' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_9_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[122]);
			}
			
			a16 = '=' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_9_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a16, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[123]);
			}
			
			(
				a17 = INTEGER				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[124]);
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[125]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[126]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[127]);
	}
	
	(
		(
			a18 = 'power' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_10_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a18, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[128]);
			}
			
			a19 = '=' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_10_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a19, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[129]);
			}
			
			(
				a20 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[130]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[131]);
	}
	
	a21 = '}' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_4_0_0_11, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a21, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[132]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[133]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[134]);
	}
	
;

parse_org_alia4j_language_ballandpaddle_Power returns [org.alia4j.language.ballandpaddle.Power element = null]
@init{
}
:
	a0 = 'power' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[135]);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[136]);
	}
	
	a2 = '(' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPower(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[137]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPower(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[138]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPower(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[139]);
	}
	
	(
		a3_0 = parse_org_alia4j_language_ballandpaddle_Target		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[140]);
	}
	
	a4 = ')' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[141]);
	}
	
	a5 = '{' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[142]);
	}
	
	a6 = 'effects' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[143]);
	}
	
	a7 = '=' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[144]);
	}
	
	(
		a8 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[145]);
	}
	
	a9 = 'duration' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[146]);
	}
	
	a10 = '=' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[147]);
	}
	
	(
		a11 = INTEGER		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[148]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[149]);
	}
	
	(
		(
			a12 = 'powerSpawnChance' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_12_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[150]);
			}
			
			a13 = '=' {
				if (element == null) {
					element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_12_0_0_1, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[151]);
			}
			
			(
				a14 = FLOAT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[152]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[153]);
	}
	
	a15 = '}' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPower();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_5_0_0_13, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[154]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[155]);
	}
	
;

parse_org_alia4j_language_ballandpaddle_Effect returns [org.alia4j.language.ballandpaddle.Effect element = null]
@init{
}
:
	a0 = 'effect' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[156]);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[157]);
	}
	
	a2 = '(' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[158]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[159]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[160]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[161]);
	}
	
	(
		(
			a3_0 = parse_org_alia4j_language_ballandpaddle_Target			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[162]);
	}
	
	a4 = ')' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[163]);
	}
	
	a5 = '{' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[164]);
	}
	
	(
		(
			a6 = 'x' {
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
			|			a7 = 'y' {
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
			|			a8 = 'size' {
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
			|			a9 = 'orientation' {
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
			|			a10 = 'speed' {
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
			|			a11 = 'hardness' {
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
			|			a12 = 'resistance normal' {
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
			|			a13 = 'resistance fire' {
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
			|			a14 = 'resistance cold' {
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
			|			a15 = 'resistance shock' {
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
			|			a16 = 'normal damage' {
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
			|			a17 = 'fire damage' {
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
			|			a18 = 'cold damage' {
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
			|			a19 = 'shock damage' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[165]);
	}
	
	a22 = '=' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a22, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[166]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[167]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[168]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEffect(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[169]);
	}
	
	(
		a23_0 = parse_org_alia4j_language_ballandpaddle_Expression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[170]);
	}
	
	a24 = '}' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_6_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a24, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getRoot(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[171]);
	}
	
;

parse_org_alia4j_language_ballandpaddle_ObjectTarget returns [org.alia4j.language.ballandpaddle.ObjectTarget element = null]
@init{
}
:
	(
		a0 = CHAR		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[172]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[173]);
	}
	
	
	|	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[174]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[175]);
	}
	
;

parse_org_alia4j_language_ballandpaddle_TypeTarget returns [org.alia4j.language.ballandpaddle.TypeTarget element = null]
@init{
}
:
	(
		(
			a0 = 'block' {
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
			|			a1 = 'paddle' {
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
			|			a2 = 'ball' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[176]);
	}
	
	a5 = '{' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createTypeTarget();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTypeTarget(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[177]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTypeTarget(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[178]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTypeTarget(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[179]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getTypeTarget(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[180]);
	}
	
	(
		a6_0 = parse_org_alia4j_language_ballandpaddle_BooleanExpression		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[181]);
	}
	
	a7 = '}' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createTypeTarget();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_8_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[182]);
		addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[183]);
	}
	
;

parseop_Expression_level_1 returns [org.alia4j.language.ballandpaddle.Expression element = null]
@init{
}
:
	leftArg = parseop_Expression_level_2	((
		()
		{ element = null; }
		a0 = '*' {
			if (element == null) {
				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createMultExpression();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_9_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMultExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[184]);
			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMultExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[185]);
			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMultExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[186]);
			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMultExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[187]);
		}
		
		rightArg = parseop_Expression_level_2		{
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
		{
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
		{ leftArg = element; /* this may become an argument in the next iteration */ }
		|		
		()
		{ element = null; }
		a0 = '/' {
			if (element == null) {
				element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createDivExpression();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_10_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getDivExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[188]);
			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getDivExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[189]);
			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getDivExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[190]);
			addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getDivExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[191]);
		}
		
		rightArg = parseop_Expression_level_2		{
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
		{
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
		{ leftArg = element; /* this may become an argument in the next iteration */ }
	)+ | /* epsilon */ { element = leftArg; }
	
)
;

parseop_Expression_level_2 returns [org.alia4j.language.ballandpaddle.Expression element = null]
@init{
}
:
leftArg = parseop_Expression_level_3((
	()
	{ element = null; }
	a0 = '+' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createPlusExpression();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_11_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPlusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[192]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPlusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[193]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPlusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[194]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getPlusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[195]);
	}
	
	rightArg = parseop_Expression_level_3	{
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
	{
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
	{ leftArg = element; /* this may become an argument in the next iteration */ }
	|	
	()
	{ element = null; }
	a0 = '-' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createMinusExpression();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_12_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMinusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[196]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMinusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[197]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMinusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[198]);
		addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getMinusExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[199]);
	}
	
	rightArg = parseop_Expression_level_3	{
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
	{
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
	{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_Expression_level_3 returns [org.alia4j.language.ballandpaddle.Expression element = null]
@init{
}
:
a0 = '-' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createNegExpression();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_13_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[200]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[201]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[202]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[203]);
}

arg = parseop_Expression_level_4{
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
|

arg = parseop_Expression_level_4{ element = arg; }
;

parseop_Expression_level_4 returns [org.alia4j.language.ballandpaddle.Expression element = null]
@init{
}
:
c0 = parse_org_alia4j_language_ballandpaddle_BracketExpression{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_org_alia4j_language_ballandpaddle_IntOperand{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_org_alia4j_language_ballandpaddle_AttOperand{ element = c2; /* this is a subclass or primitive expression choice */ }
;

parse_org_alia4j_language_ballandpaddle_BracketExpression returns [org.alia4j.language.ballandpaddle.BracketExpression element = null]
@init{
}
:
a0 = '(' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBracketExpression();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_14_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[204]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[205]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[206]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketExpression(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[207]);
}

(
a1_0 = parse_org_alia4j_language_ballandpaddle_Expression{
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
)
{
// expected elements (follow set)
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[208]);
}

a2 = ')' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBracketExpression();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_14_0_0_2, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
// expected elements (follow set)
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[209]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[210]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[211]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[212]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[213]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[214]);
}

;

parse_org_alia4j_language_ballandpaddle_IntOperand returns [org.alia4j.language.ballandpaddle.IntOperand element = null]
@init{
}
:
(
a0 = INTEGER
{
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
)
{
// expected elements (follow set)
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[215]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[216]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[217]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[218]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[219]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[220]);
}

;

parse_org_alia4j_language_ballandpaddle_AttOperand returns [org.alia4j.language.ballandpaddle.AttOperand element = null]
@init{
}
:
(
(
	a0 = 'x' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.X_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a1 = 'y' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.Y_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a2 = 'size' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SIZE_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a3 = 'orientation' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.ORIENTATION_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a4 = 'speed' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SPEED_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a5 = 'hardness' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.HARDNESS_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a6 = 'resistance normal' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.NORMAL_RES_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a7 = 'resistance fire' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.FIRE_RES_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a8 = 'resistance cold' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.COLD_RES_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a9 = 'resistance shock' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SHOCK_RES_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a10 = 'normal damage' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.NORMAL_DAM_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a11 = 'fire damage' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.FIRE_DAM_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a12 = 'cold damage' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.COLD_DAM_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
	|	a13 = 'shock damage' {
		if (element == null) {
			element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttOperand();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_16_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
		// set value of enumeration attribute
		Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SHOCK_DAM_VALUE).getInstance();
		element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT), value);
		completedElement(value, false);
	}
)
)
{
// expected elements (follow set)
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[221]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[222]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[223]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[224]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[225]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[226]);
}

;

parseop_BooleanExpression_level_1 returns [org.alia4j.language.ballandpaddle.BooleanExpression element = null]
@init{
}
:
leftArg = parseop_BooleanExpression_level_2((
()
{ element = null; }
a0 = '|' {
	if (element == null) {
		element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createOrParameter();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_23_0_0_1, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getOrParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[227]);
	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getOrParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[228]);
	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getOrParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[229]);
	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getOrParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[230]);
}

rightArg = parseop_BooleanExpression_level_2{
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
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_23_0_0_0, leftArg, true);
		copyLocalizationInfos(leftArg, element);
	}
}
{
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
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_23_0_0_2, rightArg, true);
		copyLocalizationInfos(rightArg, element);
	}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
|
()
{ element = null; }
a0 = '&' {
	if (element == null) {
		element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAndParameter();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_24_0_0_1, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAndParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[231]);
	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAndParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[232]);
	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAndParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[233]);
	addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAndParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[234]);
}

rightArg = parseop_BooleanExpression_level_2{
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
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_24_0_0_0, leftArg, true);
		copyLocalizationInfos(leftArg, element);
	}
}
{
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
		retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_24_0_0_2, rightArg, true);
		copyLocalizationInfos(rightArg, element);
	}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_BooleanExpression_level_2 returns [org.alia4j.language.ballandpaddle.BooleanExpression element = null]
@init{
}
:
leftArg = parseop_BooleanExpression_level_3((
()
{ element = null; }
a0 = '=' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createEqParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[235]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[236]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[237]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getEqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[238]);
}

rightArg = parseop_BooleanExpression_level_3{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_0, leftArg, true);
	copyLocalizationInfos(leftArg, element);
}
}
{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_17_0_0_2, rightArg, true);
	copyLocalizationInfos(rightArg, element);
}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
|
()
{ element = null; }
a0 = '<' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createSmthParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_18_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSmthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[239]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSmthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[240]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSmthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[241]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSmthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[242]);
}

rightArg = parseop_BooleanExpression_level_3{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_18_0_0_0, leftArg, true);
	copyLocalizationInfos(leftArg, element);
}
}
{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_18_0_0_2, rightArg, true);
	copyLocalizationInfos(rightArg, element);
}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
|
()
{ element = null; }
a0 = '<=' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createSeqParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_19_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[243]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[244]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[245]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getSeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[246]);
}

rightArg = parseop_BooleanExpression_level_3{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_19_0_0_0, leftArg, true);
	copyLocalizationInfos(leftArg, element);
}
}
{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_19_0_0_2, rightArg, true);
	copyLocalizationInfos(rightArg, element);
}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
|
()
{ element = null; }
a0 = '>' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLthParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_20_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[247]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[248]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[249]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLthParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[250]);
}

rightArg = parseop_BooleanExpression_level_3{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_20_0_0_0, leftArg, true);
	copyLocalizationInfos(leftArg, element);
}
}
{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_20_0_0_2, rightArg, true);
	copyLocalizationInfos(rightArg, element);
}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
|
()
{ element = null; }
a0 = '>=' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createLeqParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_21_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[251]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[252]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[253]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getLeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[254]);
}

rightArg = parseop_BooleanExpression_level_3{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_21_0_0_0, leftArg, true);
	copyLocalizationInfos(leftArg, element);
}
}
{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_21_0_0_2, rightArg, true);
	copyLocalizationInfos(rightArg, element);
}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
|
()
{ element = null; }
a0 = '!=' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createNeqParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_22_0_0_1, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[255]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[256]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[257]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNeqParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[258]);
}

rightArg = parseop_BooleanExpression_level_3{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_22_0_0_0, leftArg, true);
	copyLocalizationInfos(leftArg, element);
}
}
{
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
	retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_22_0_0_2, rightArg, true);
	copyLocalizationInfos(rightArg, element);
}
}
{ leftArg = element; /* this may become an argument in the next iteration */ }
)+ | /* epsilon */ { element = leftArg; }

)
;

parseop_BooleanExpression_level_3 returns [org.alia4j.language.ballandpaddle.BooleanExpression element = null]
@init{
}
:
a0 = '!' {
if (element == null) {
element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createNegParameter();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_25_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[259]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[260]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[261]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getNegParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[262]);
}

arg = parseop_BooleanExpression_level_4{
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
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_25_0_0_1, arg, true);
copyLocalizationInfos(arg, element);
}
}
|

arg = parseop_BooleanExpression_level_4{ element = arg; }
;

parseop_BooleanExpression_level_4 returns [org.alia4j.language.ballandpaddle.BooleanExpression element = null]
@init{
}
:
c0 = parse_org_alia4j_language_ballandpaddle_BracketParameter{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_org_alia4j_language_ballandpaddle_AttParameter{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_org_alia4j_language_ballandpaddle_ValueParameter{ element = c2; /* this is a subclass or primitive expression choice */ }
;

parse_org_alia4j_language_ballandpaddle_BracketParameter returns [org.alia4j.language.ballandpaddle.BracketParameter element = null]
@init{
}
:
a0 = '(' {
if (element == null) {
element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBracketParameter();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_26_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
// expected elements (follow set)
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[263]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[264]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[265]);
addExpectedElement(org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getBracketParameter(), org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[266]);
}

(
a1_0 = parse_org_alia4j_language_ballandpaddle_BooleanExpression{
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
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_26_0_0_1, a1_0, true);
copyLocalizationInfos(a1_0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[267]);
}

a2 = ')' {
if (element == null) {
element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createBracketParameter();
startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_26_0_0_2, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
// expected elements (follow set)
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[268]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[269]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[270]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[271]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[272]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[273]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[274]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[275]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[276]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[277]);
}

;

parse_org_alia4j_language_ballandpaddle_AttParameter returns [org.alia4j.language.ballandpaddle.AttParameter element = null]
@init{
}
:
(
(
a0 = 'x' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
// set value of enumeration attribute
Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.X_VALUE).getInstance();
element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
completedElement(value, false);
}
|a1 = 'y' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
// set value of enumeration attribute
Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.Y_VALUE).getInstance();
element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
completedElement(value, false);
}
|a2 = 'size' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
// set value of enumeration attribute
Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SIZE_VALUE).getInstance();
element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
completedElement(value, false);
}
|a3 = 'orientation' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
// set value of enumeration attribute
Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.ORIENTATION_VALUE).getInstance();
element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
completedElement(value, false);
}
|a4 = 'speed' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
// set value of enumeration attribute
Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SPEED_VALUE).getInstance();
element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
completedElement(value, false);
}
|a5 = 'hardness' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
// set value of enumeration attribute
Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.HARDNESS_VALUE).getInstance();
element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
completedElement(value, false);
}
|a6 = 'resistance normal' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
// set value of enumeration attribute
Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.NORMAL_RES_VALUE).getInstance();
element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
completedElement(value, false);
}
|a7 = 'resistance fire' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
// set value of enumeration attribute
Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.FIRE_RES_VALUE).getInstance();
element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
completedElement(value, false);
}
|a8 = 'resistance cold' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
// set value of enumeration attribute
Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.COLD_RES_VALUE).getInstance();
element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
completedElement(value, false);
}
|a9 = 'resistance shock' {
if (element == null) {
	element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createAttParameter();
	startIncompleteElement(element);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_27_0_0_0, null, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
// set value of enumeration attribute
Object value = org.alia4j.language.ballandpaddle.BallandpaddlePackage.eINSTANCE.getAttribute().getEEnumLiteral(org.alia4j.language.ballandpaddle.Attribute.SHOCK_RES_VALUE).getInstance();
element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT), value);
completedElement(value, false);
}
)
)
{
// expected elements (follow set)
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[278]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[279]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[280]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[281]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[282]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[283]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[284]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[285]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[286]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[287]);
}

;

parse_org_alia4j_language_ballandpaddle_ValueParameter returns [org.alia4j.language.ballandpaddle.ValueParameter element = null]
@init{
}
:
(
a0 = INTEGER
{
if (terminateParsing) {
throw new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTerminateParsingException();
}
if (element == null) {
element = org.alia4j.language.ballandpaddle.BallandpaddleFactory.eINSTANCE.createValueParameter();
startIncompleteElement(element);
}
if (a0 != null) {
org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
tokenResolver.setOptions(getOptions());
org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolveResult result = getFreshTokenResolveResult();
tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.VALUE_PARAMETER__VALUE), result);
Object resolvedObject = result.getResolvedToken();
if (resolvedObject == null) {
	addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
}
java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
if (resolved != null) {
	Object value = resolved;
	element.eSet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.VALUE_PARAMETER__VALUE), value);
	completedElement(value, false);
}
collectHiddenTokens(element);
retrieveLayoutInformation(element, org.alia4j.language.ballandpaddle.resource.ballandpaddle.grammar.BallandpaddleGrammarInformationProvider.BALLANDPADDLE_28_0_0_0, resolved, true);
copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
}
}
)
{
// expected elements (follow set)
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[288]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[289]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[290]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[291]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[292]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[293]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[294]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[295]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[296]);
addExpectedElement(null, org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleExpectationConstants.EXPECTATIONS[297]);
}

;

parse_org_alia4j_language_ballandpaddle_Target returns [org.alia4j.language.ballandpaddle.Target element = null]
:
c0 = parse_org_alia4j_language_ballandpaddle_ObjectTarget{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_org_alia4j_language_ballandpaddle_TypeTarget{ element = c1; /* this is a subclass or primitive expression choice */ }

;

parse_org_alia4j_language_ballandpaddle_Expression returns [org.alia4j.language.ballandpaddle.Expression element = null]
:
c = parseop_Expression_level_1{ element = c; /* this rule is an expression root */ }

;

parse_org_alia4j_language_ballandpaddle_BooleanExpression returns [org.alia4j.language.ballandpaddle.BooleanExpression element = null]
:
c = parseop_BooleanExpression_level_1{ element = c; /* this rule is an expression root */ }

;

COMMENT:
('//'(~('\n'|'\r'|'\uffff'))*)
{ _channel = 99; }
;
INTEGER:
(('-')?('1'..'9')('0'..'9')*|'0')
;
FLOAT:
(('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ )
;
CHAR:
(('A'..'Z'))
;
LEVELLINE:
((('A'..'Z')|('.'))+)
;
ANDOR:
(('|')|('&'))
{ _channel = 99; }
;
TEXT:
(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
WHITESPACE:
((' ' | '\t' | '\f'))
{ _channel = 99; }
;
LINEBREAK:
(('\r\n' | '\r' | '\n'))
{ _channel = 99; }
;

