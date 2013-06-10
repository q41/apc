grammar Textadventure;

options {
	superClass = TextadventureANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.alia4j.language.textadventure.resource.textadventure.mopp;
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
	package org.alia4j.language.textadventure.resource.textadventure.mopp;
}

@members{
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[0]);
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[1]);
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[2]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_alia4j_language_textadventure_World{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_alia4j_language_textadventure_World returns [org.alia4j.language.textadventure.World element = null]
@init{
}
:
	(
		(
			a0_0 = parse_org_alia4j_language_textadventure_Tile			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[3]);
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[4]);
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[5]);
	}
	
	(
		(
			a1_0 = parse_org_alia4j_language_textadventure_Item			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[6]);
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[7]);
	}
	
	(
		(
			a2_0 = parse_org_alia4j_language_textadventure_Person			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[8]);
	}
	
;

parse_org_alia4j_language_textadventure_Tile returns [org.alia4j.language.textadventure.Tile element = null]
@init{
}
:
	a0 = 'tile' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[9]);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[10]);
	}
	
	a2 = '{' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[11]);
	}
	
	a3 = 'x' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[12]);
	}
	
	a4 = '=' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[13]);
	}
	
	(
		a5 = INTEGER		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[14]);
	}
	
	a6 = 'y' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[15]);
	}
	
	a7 = '=' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[16]);
	}
	
	(
		a8 = INTEGER		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[17]);
	}
	
	a9 = 'description' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[18]);
	}
	
	a10 = '=' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[19]);
	}
	
	(
		a11 = QUOTED_34_34		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[20]);
	}
	
	a12 = '}' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createTile();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_1_0_0_12, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[21]);
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[22]);
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[23]);
	}
	
;

parse_org_alia4j_language_textadventure_Item returns [org.alia4j.language.textadventure.Item element = null]
@init{
}
:
	a0 = 'item' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[24]);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[25]);
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[26]);
	}
	
	(
		(
			a2 = '@' {
				if (element == null) {
					element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_2_0_0_2_0_0_0, null, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[27]);
			}
			
			(
				a3 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[28]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[29]);
	}
	
	a4 = '{' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_2_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[30]);
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[31]);
	}
	
	(
		(
			(
				a5_0 = parse_org_alia4j_language_textadventure_Effect				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[32]);
				addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[33]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[34]);
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[35]);
	}
	
	a6 = '}' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createItem();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_2_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[36]);
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[37]);
	}
	
;

parse_org_alia4j_language_textadventure_Binding returns [org.alia4j.language.textadventure.Binding element = null]
@init{
}
:
	(
		(
			a0 = 'on' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[38]);
	}
	
	(
		a3 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[39]);
	}
	
;

parse_org_alia4j_language_textadventure_WhileEffect returns [org.alia4j.language.textadventure.WhileEffect element = null]
@init{
}
:
	a0 = 'while' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWhileEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[40]);
	}
	
	(
		(
			a1 = 'used' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWhileEffect(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[41]);
	}
	
	(
		a4_0 = parse_org_alia4j_language_textadventure_Binding		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[42]);
	}
	
	a5 = '{' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWhileEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_4_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWhileEffect(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[43]);
	}
	
	(
		a6_0 = parse_org_alia4j_language_textadventure_Action		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[44]);
	}
	
	a7 = '}' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createWhileEffect();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_4_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getItem(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[45]);
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[46]);
	}
	
;

parse_org_alia4j_language_textadventure_RemoveAction returns [org.alia4j.language.textadventure.RemoveAction element = null]
@init{
}
:
	a0 = 'remove' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createRemoveAction();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[47]);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[48]);
	}
	
	a2 = 'from' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createRemoveAction();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getRemoveAction(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[49]);
	}
	
	(
		a3_0 = parse_org_alia4j_language_textadventure_List		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[50]);
	}
	
;

parse_org_alia4j_language_textadventure_List returns [org.alia4j.language.textadventure.List element = null]
@init{
}
:
	(
		(
			a0 = 'result' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[51]);
	}
	
	(
		(
			a3 = 'Tile' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[52]);
	}
	
	(
		(
			a6 = 'Persons' {
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
			|			a7 = 'Items' {
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
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[53]);
	}
	
;

parse_org_alia4j_language_textadventure_Person returns [org.alia4j.language.textadventure.Person element = null]
@init{
}
:
	a0 = 'person' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createPerson();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_7_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[54]);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[55]);
	}
	
	a2 = '@' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createPerson();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_7_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[56]);
	}
	
	(
		a3 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[57]);
	}
	
	a4 = '{' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createPerson();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_7_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getPerson(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[58]);
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[59]);
	}
	
	(
		(
			a5_0 = parse_org_alia4j_language_textadventure_Ability			{
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
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getPerson(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[60]);
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[61]);
	}
	
	a6 = '}' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createPerson();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_7_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getWorld(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[62]);
	}
	
;

parse_org_alia4j_language_textadventure_IgnoreItemAbility returns [org.alia4j.language.textadventure.IgnoreItemAbility element = null]
@init{
}
:
	a0 = 'ignore' {
		if (element == null) {
			element = org.alia4j.language.textadventure.TextadventureFactory.eINSTANCE.createIgnoreItemAbility();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.alia4j.language.textadventure.resource.textadventure.grammar.TextadventureGrammarInformationProvider.TEXTADVENTURE_8_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[63]);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.alia4j.language.textadventure.TextadventurePackage.eINSTANCE.getPerson(), org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[64]);
		addExpectedElement(null, org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureExpectationConstants.EXPECTATIONS[65]);
	}
	
;

parse_org_alia4j_language_textadventure_Effect returns [org.alia4j.language.textadventure.Effect element = null]
:
	c0 = parse_org_alia4j_language_textadventure_WhileEffect{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_alia4j_language_textadventure_Action returns [org.alia4j.language.textadventure.Action element = null]
:
	c0 = parse_org_alia4j_language_textadventure_RemoveAction{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_alia4j_language_textadventure_Ability returns [org.alia4j.language.textadventure.Ability element = null]
:
	c0 = parse_org_alia4j_language_textadventure_IgnoreItemAbility{ element = c0; /* this is a subclass or primitive expression choice */ }
	
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
QUOTED_34_34:
	(('"')(~('"'))*('"'))
;

