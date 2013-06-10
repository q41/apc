/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.textadventure.resource.textadventure.mopp;

public class TextadventurePrinter implements org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextPrinter {
	
	protected org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolverFactory tokenResolverFactory = new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public TextadventurePrinter(java.io.OutputStream outputStream, org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.alia4j.language.textadventure.World) {
			print_org_alia4j_language_textadventure_World((org.alia4j.language.textadventure.World) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.textadventure.Tile) {
			print_org_alia4j_language_textadventure_Tile((org.alia4j.language.textadventure.Tile) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.textadventure.Item) {
			print_org_alia4j_language_textadventure_Item((org.alia4j.language.textadventure.Item) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.textadventure.Binding) {
			print_org_alia4j_language_textadventure_Binding((org.alia4j.language.textadventure.Binding) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.textadventure.WhileEffect) {
			print_org_alia4j_language_textadventure_WhileEffect((org.alia4j.language.textadventure.WhileEffect) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.textadventure.RemoveAction) {
			print_org_alia4j_language_textadventure_RemoveAction((org.alia4j.language.textadventure.RemoveAction) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.textadventure.List) {
			print_org_alia4j_language_textadventure_List((org.alia4j.language.textadventure.List) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.textadventure.Person) {
			print_org_alia4j_language_textadventure_Person((org.alia4j.language.textadventure.Person) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.textadventure.IgnoreItemAbility) {
			print_org_alia4j_language_textadventure_IgnoreItemAbility((org.alia4j.language.textadventure.IgnoreItemAbility) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureReferenceResolverSwitch) new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.alia4j.language.textadventure.resource.textadventure.mopp.TextadventureProblem(errorMessage, org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemType.PRINT_PROBLEM, org.alia4j.language.textadventure.resource.textadventure.TextadventureEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public org.alia4j.language.textadventure.resource.textadventure.ITextadventureTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_org_alia4j_language_textadventure_World(org.alia4j.language.textadventure.World element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WORLD__ITEMS));
		printCountingMap.put("items", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WORLD__PERSONS));
		printCountingMap.put("persons", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WORLD__TILES));
		printCountingMap.put("tiles", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tiles");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WORLD__TILES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("tiles", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("items");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WORLD__ITEMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("items", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("persons");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WORLD__PERSONS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("persons", 0);
		}
	}
	
	
	public void print_org_alia4j_language_textadventure_Tile(org.alia4j.language.textadventure.Tile element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__X));
		printCountingMap.put("x", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__Y));
		printCountingMap.put("y", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__DESCRIPTION));
		printCountingMap.put("description", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("tile");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__ID));
			if (o != null) {
				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("x");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("x");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__X));
			if (o != null) {
				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__X), element));
				out.print(" ");
			}
			printCountingMap.put("x", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("y");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("y");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__Y));
			if (o != null) {
				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__Y), element));
				out.print(" ");
			}
			printCountingMap.put("y", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("description");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("description");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__DESCRIPTION));
			if (o != null) {
				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.TILE__DESCRIPTION), element));
				out.print(" ");
			}
			printCountingMap.put("description", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_org_alia4j_language_textadventure_Item(org.alia4j.language.textadventure.Item element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__EFFECTS));
		printCountingMap.put("effects", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("item");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__NAME));
			if (o != null) {
				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_alia4j_language_textadventure_Item_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_alia4j_language_textadventure_Item_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_alia4j_language_textadventure_Item_0(org.alia4j.language.textadventure.Item element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("@");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__LOCATION));
			if (o != null) {
				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getItemLocationReferenceResolver().deResolve((org.alia4j.language.textadventure.Tile) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__LOCATION)), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
	}
	
	public void print_org_alia4j_language_textadventure_Item_1(org.alia4j.language.textadventure.Item element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("effects");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.ITEM__EFFECTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("effects", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_textadventure_Binding(org.alia4j.language.textadventure.Binding element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.BINDING__PARTICIPANT));
		printCountingMap.put("participant", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.BINDING__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("participant");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.BINDING__PARTICIPANT));
			if (o != null) {
			}
			printCountingMap.put("participant", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.BINDING__ID));
			if (o != null) {
				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.BINDING__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_textadventure_WhileEffect(org.alia4j.language.textadventure.WhileEffect element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WHILE_EFFECT__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WHILE_EFFECT__BINDING));
		printCountingMap.put("binding", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WHILE_EFFECT__ACTION));
		printCountingMap.put("action", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("while");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WHILE_EFFECT__CONDITION));
			if (o != null) {
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WHILE_EFFECT__BINDING));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binding", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("action");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.WHILE_EFFECT__ACTION));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("action", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_org_alia4j_language_textadventure_RemoveAction(org.alia4j.language.textadventure.RemoveAction element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.REMOVE_ACTION__WHAT));
		printCountingMap.put("what", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.REMOVE_ACTION__FROM));
		printCountingMap.put("from", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("remove");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("what");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.REMOVE_ACTION__WHAT));
			if (o != null) {
				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getRemoveActionWhatReferenceResolver().deResolve((org.alia4j.language.textadventure.Binding) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.REMOVE_ACTION__WHAT)), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.REMOVE_ACTION__WHAT), element));
				out.print(" ");
			}
			printCountingMap.put("what", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("from");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("from");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.REMOVE_ACTION__FROM));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("from", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_textadventure_List(org.alia4j.language.textadventure.List element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.LIST__POSITION));
		printCountingMap.put("position", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.LIST__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.LIST__PROPERTY));
		printCountingMap.put("property", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("position");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.LIST__POSITION));
			if (o != null) {
			}
			printCountingMap.put("position", count - 1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.LIST__TARGET));
			if (o != null) {
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("property");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.LIST__PROPERTY));
			if (o != null) {
			}
			printCountingMap.put("property", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_textadventure_Person(org.alia4j.language.textadventure.Person element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__ABILITIES));
		printCountingMap.put("abilities", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__LOCATION));
		printCountingMap.put("location", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("person");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__NAME));
			if (o != null) {
				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("@");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("location");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__LOCATION));
			if (o != null) {
				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPersonLocationReferenceResolver().deResolve((org.alia4j.language.textadventure.Tile) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__LOCATION)), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__LOCATION), element));
				out.print(" ");
			}
			printCountingMap.put("location", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("abilities");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.PERSON__ABILITIES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("abilities", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_org_alia4j_language_textadventure_IgnoreItemAbility(org.alia4j.language.textadventure.IgnoreItemAbility element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM));
		printCountingMap.put("ignoredItem", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("ignore");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("ignoredItem");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM));
			if (o != null) {
				org.alia4j.language.textadventure.resource.textadventure.ITextadventureTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getIgnoreItemAbilityIgnoredItemReferenceResolver().deResolve((org.alia4j.language.textadventure.Item) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM)), element.eClass().getEStructuralFeature(org.alia4j.language.textadventure.TextadventurePackage.IGNORE_ITEM_ABILITY__IGNORED_ITEM), element));
				out.print(" ");
			}
			printCountingMap.put("ignoredItem", count - 1);
		}
	}
	
	
}
