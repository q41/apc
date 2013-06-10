/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp;

public class BallandpaddlePrinter implements org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextPrinter {
	
	protected org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolverFactory tokenResolverFactory = new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public BallandpaddlePrinter(java.io.OutputStream outputStream, org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource resource) {
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
		
		if (element instanceof org.alia4j.language.ballandpaddle.Root) {
			print_org_alia4j_language_ballandpaddle_Root((org.alia4j.language.ballandpaddle.Root) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.Level) {
			print_org_alia4j_language_ballandpaddle_Level((org.alia4j.language.ballandpaddle.Level) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.Paddle) {
			print_org_alia4j_language_ballandpaddle_Paddle((org.alia4j.language.ballandpaddle.Paddle) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.Ball) {
			print_org_alia4j_language_ballandpaddle_Ball((org.alia4j.language.ballandpaddle.Ball) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.Block) {
			print_org_alia4j_language_ballandpaddle_Block((org.alia4j.language.ballandpaddle.Block) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.Power) {
			print_org_alia4j_language_ballandpaddle_Power((org.alia4j.language.ballandpaddle.Power) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.Effect) {
			print_org_alia4j_language_ballandpaddle_Effect((org.alia4j.language.ballandpaddle.Effect) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.ObjectTarget) {
			print_org_alia4j_language_ballandpaddle_ObjectTarget((org.alia4j.language.ballandpaddle.ObjectTarget) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.TypeTarget) {
			print_org_alia4j_language_ballandpaddle_TypeTarget((org.alia4j.language.ballandpaddle.TypeTarget) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.MultExpression) {
			print_org_alia4j_language_ballandpaddle_MultExpression((org.alia4j.language.ballandpaddle.MultExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.DivExpression) {
			print_org_alia4j_language_ballandpaddle_DivExpression((org.alia4j.language.ballandpaddle.DivExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.PlusExpression) {
			print_org_alia4j_language_ballandpaddle_PlusExpression((org.alia4j.language.ballandpaddle.PlusExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.MinusExpression) {
			print_org_alia4j_language_ballandpaddle_MinusExpression((org.alia4j.language.ballandpaddle.MinusExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.NegExpression) {
			print_org_alia4j_language_ballandpaddle_NegExpression((org.alia4j.language.ballandpaddle.NegExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.BracketExpression) {
			print_org_alia4j_language_ballandpaddle_BracketExpression((org.alia4j.language.ballandpaddle.BracketExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.IntOperand) {
			print_org_alia4j_language_ballandpaddle_IntOperand((org.alia4j.language.ballandpaddle.IntOperand) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.AttOperand) {
			print_org_alia4j_language_ballandpaddle_AttOperand((org.alia4j.language.ballandpaddle.AttOperand) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.EqParameter) {
			print_org_alia4j_language_ballandpaddle_EqParameter((org.alia4j.language.ballandpaddle.EqParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.SmthParameter) {
			print_org_alia4j_language_ballandpaddle_SmthParameter((org.alia4j.language.ballandpaddle.SmthParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.SeqParameter) {
			print_org_alia4j_language_ballandpaddle_SeqParameter((org.alia4j.language.ballandpaddle.SeqParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.LthParameter) {
			print_org_alia4j_language_ballandpaddle_LthParameter((org.alia4j.language.ballandpaddle.LthParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.LeqParameter) {
			print_org_alia4j_language_ballandpaddle_LeqParameter((org.alia4j.language.ballandpaddle.LeqParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.NeqParameter) {
			print_org_alia4j_language_ballandpaddle_NeqParameter((org.alia4j.language.ballandpaddle.NeqParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.OrParameter) {
			print_org_alia4j_language_ballandpaddle_OrParameter((org.alia4j.language.ballandpaddle.OrParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.AndParameter) {
			print_org_alia4j_language_ballandpaddle_AndParameter((org.alia4j.language.ballandpaddle.AndParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.NegParameter) {
			print_org_alia4j_language_ballandpaddle_NegParameter((org.alia4j.language.ballandpaddle.NegParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.BracketParameter) {
			print_org_alia4j_language_ballandpaddle_BracketParameter((org.alia4j.language.ballandpaddle.BracketParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.AttParameter) {
			print_org_alia4j_language_ballandpaddle_AttParameter((org.alia4j.language.ballandpaddle.AttParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.alia4j.language.ballandpaddle.ValueParameter) {
			print_org_alia4j_language_ballandpaddle_ValueParameter((org.alia4j.language.ballandpaddle.ValueParameter) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleReferenceResolverSwitch) new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.alia4j.language.ballandpaddle.resource.ballandpaddle.mopp.BallandpaddleProblem(errorMessage, org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemType.PRINT_PROBLEM, org.alia4j.language.ballandpaddle.resource.ballandpaddle.BallandpaddleEProblemSeverity.WARNING), cause);
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
	
	public org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTextResource getResource() {
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
	
	public void print_org_alia4j_language_ballandpaddle_Root(org.alia4j.language.ballandpaddle.Root element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__LEVEL));
		printCountingMap.put("level", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__PADDLES));
		printCountingMap.put("paddles", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__BALLS));
		printCountingMap.put("balls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__BLOCKS));
		printCountingMap.put("blocks", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__EFFECTS));
		printCountingMap.put("effects", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__POWERS));
		printCountingMap.put("powers", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("level");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__LEVEL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("level", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("paddles");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__PADDLES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("paddles", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("balls");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__BALLS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("balls", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("blocks");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__BLOCKS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("blocks", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("powers");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__POWERS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("powers", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("effects");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ROOT__EFFECTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("effects", 0);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_Level(org.alia4j.language.ballandpaddle.Level element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__POWER_SPAWN_CHANCE));
		printCountingMap.put("powerSpawnChance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__BLOCKS));
		printCountingMap.put("blocks", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("level");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__ID));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("blocks");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__BLOCKS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("LEVELLINE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__BLOCKS), element));
				out.print(" ");
			}
			printCountingMap.put("blocks", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_alia4j_language_ballandpaddle_Level_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_alia4j_language_ballandpaddle_Level_0(org.alia4j.language.ballandpaddle.Level element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("powerSpawnChance");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("powerSpawnChance");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__POWER_SPAWN_CHANCE));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("FLOAT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEVEL__POWER_SPAWN_CHANCE), element));
				out.print(" ");
			}
			printCountingMap.put("powerSpawnChance", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_Paddle(org.alia4j.language.ballandpaddle.Paddle element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__X));
		printCountingMap.put("x", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__Y));
		printCountingMap.put("y", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SHAPE));
		printCountingMap.put("shape", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SIZE));
		printCountingMap.put("size", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ORIENTATION));
		printCountingMap.put("orientation", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("paddle");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ID));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ID), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__X));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__X), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__Y));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__Y), element));
				out.print(" ");
			}
			printCountingMap.put("y", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("shape");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("shape");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SHAPE));
			if (o != null) {
			}
			printCountingMap.put("shape", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("size");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("size");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SIZE));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__SIZE), element));
				out.print(" ");
			}
			printCountingMap.put("size", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("orientation");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("orientation");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ORIENTATION));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PADDLE__ORIENTATION), element));
				out.print(" ");
			}
			printCountingMap.put("orientation", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_Ball(org.alia4j.language.ballandpaddle.Ball element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__X));
		printCountingMap.put("x", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__Y));
		printCountingMap.put("y", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__SIZE));
		printCountingMap.put("size", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__DIRECTION));
		printCountingMap.put("direction", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__SPEED));
		printCountingMap.put("speed", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ball");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__ID));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__ID), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__X));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__X), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__Y));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__Y), element));
				out.print(" ");
			}
			printCountingMap.put("y", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_alia4j_language_ballandpaddle_Ball_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_alia4j_language_ballandpaddle_Ball_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_alia4j_language_ballandpaddle_Ball_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_alia4j_language_ballandpaddle_Ball_0(org.alia4j.language.ballandpaddle.Ball element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("size");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("size");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__SIZE));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__SIZE), element));
				out.print(" ");
			}
			printCountingMap.put("size", count - 1);
		}
	}
	
	public void print_org_alia4j_language_ballandpaddle_Ball_1(org.alia4j.language.ballandpaddle.Ball element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("direction");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("direction");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__DIRECTION));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__DIRECTION), element));
				out.print(" ");
			}
			printCountingMap.put("direction", count - 1);
		}
	}
	
	public void print_org_alia4j_language_ballandpaddle_Ball_2(org.alia4j.language.ballandpaddle.Ball element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("speed");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("speed");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__SPEED));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BALL__SPEED), element));
				out.print(" ");
			}
			printCountingMap.put("speed", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_Block(org.alia4j.language.ballandpaddle.Block element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__HARDNESS));
		printCountingMap.put("hardness", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__NORMAL_RES));
		printCountingMap.put("normalRes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__FIRE_RES));
		printCountingMap.put("fireRes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__COLD_RES));
		printCountingMap.put("coldRes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__SHOCK_RES));
		printCountingMap.put("shockRes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__POWER));
		printCountingMap.put("power", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("block");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__ID));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHAR");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("hardness");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("hardness");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__HARDNESS));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__HARDNESS), element));
				out.print(" ");
			}
			printCountingMap.put("hardness", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_alia4j_language_ballandpaddle_Block_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_alia4j_language_ballandpaddle_Block_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_alia4j_language_ballandpaddle_Block_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_alia4j_language_ballandpaddle_Block_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_alia4j_language_ballandpaddle_Block_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_alia4j_language_ballandpaddle_Block_0(org.alia4j.language.ballandpaddle.Block element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("resistance normal");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("normalRes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__NORMAL_RES));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__NORMAL_RES), element));
				out.print(" ");
			}
			printCountingMap.put("normalRes", count - 1);
		}
	}
	
	public void print_org_alia4j_language_ballandpaddle_Block_1(org.alia4j.language.ballandpaddle.Block element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("resistance fire");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("fireRes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__FIRE_RES));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__FIRE_RES), element));
				out.print(" ");
			}
			printCountingMap.put("fireRes", count - 1);
		}
	}
	
	public void print_org_alia4j_language_ballandpaddle_Block_2(org.alia4j.language.ballandpaddle.Block element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("resistance cold");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("coldRes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__COLD_RES));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__COLD_RES), element));
				out.print(" ");
			}
			printCountingMap.put("coldRes", count - 1);
		}
	}
	
	public void print_org_alia4j_language_ballandpaddle_Block_3(org.alia4j.language.ballandpaddle.Block element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("resistance shock");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("shockRes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__SHOCK_RES));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__SHOCK_RES), element));
				out.print(" ");
			}
			printCountingMap.put("shockRes", count - 1);
		}
	}
	
	public void print_org_alia4j_language_ballandpaddle_Block_4(org.alia4j.language.ballandpaddle.Block element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("power");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("power");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__POWER));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBlockPowerReferenceResolver().deResolve((org.alia4j.language.ballandpaddle.Power) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__POWER)), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BLOCK__POWER), element));
				out.print(" ");
			}
			printCountingMap.put("power", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_Power(org.alia4j.language.ballandpaddle.Power element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__EFFECTS));
		printCountingMap.put("effects", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__DURATION));
		printCountingMap.put("duration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__POWER_SPAWN_CHANCE));
		printCountingMap.put("powerSpawnChance", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("power");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__ID));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__TARGET));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("effects");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("effects");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__EFFECTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getPowerEffectsReferenceResolver().deResolve((org.alia4j.language.ballandpaddle.Effect) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__EFFECTS)), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__EFFECTS), element));
				out.print(" ");
			}
			printCountingMap.put("effects", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("duration");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("duration");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__DURATION));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__DURATION), element));
				out.print(" ");
			}
			printCountingMap.put("duration", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_org_alia4j_language_ballandpaddle_Power_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_org_alia4j_language_ballandpaddle_Power_0(org.alia4j.language.ballandpaddle.Power element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("powerSpawnChance");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("powerSpawnChance");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__POWER_SPAWN_CHANCE));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("FLOAT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.POWER__POWER_SPAWN_CHANCE), element));
				out.print(" ");
			}
			printCountingMap.put("powerSpawnChance", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_Effect(org.alia4j.language.ballandpaddle.Effect element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__ID));
		printCountingMap.put("id", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__EXPRESSION));
		printCountingMap.put("expression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("effect");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("id");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__ID));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__ID), element));
				out.print(" ");
			}
			printCountingMap.put("id", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TARGET));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__TYPE));
			if (o != null) {
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EFFECT__EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("expression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_ObjectTarget(org.alia4j.language.ballandpaddle.ObjectTarget element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM));
		printCountingMap.put("item", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"item"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"item"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("item");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM));
					if (o != null) {
						org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTargetItemReferenceResolver().deResolve((org.alia4j.language.ballandpaddle.BAPObject) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM)), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM), element));
						out.print(" ");
					}
					printCountingMap.put("item", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("item");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM));
				if (o != null) {
					org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("CHAR");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getObjectTargetItemReferenceResolver().deResolve((org.alia4j.language.ballandpaddle.BAPObject) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM)), element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OBJECT_TARGET__ITEM), element));
					out.print(" ");
				}
				printCountingMap.put("item", count - 1);
			}
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_TypeTarget(org.alia4j.language.ballandpaddle.TypeTarget element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.TYPE_TARGET__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.TYPE_TARGET__PARAMS));
		printCountingMap.put("params", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.TYPE_TARGET__TYPE));
			if (o != null) {
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("params");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.TYPE_TARGET__PARAMS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("params", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_MultExpression(org.alia4j.language.ballandpaddle.MultExpression element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MULT_EXPRESSION__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MULT_EXPRESSION__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MULT_EXPRESSION__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("*");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MULT_EXPRESSION__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_DivExpression(org.alia4j.language.ballandpaddle.DivExpression element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.DIV_EXPRESSION__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.DIV_EXPRESSION__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.DIV_EXPRESSION__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.DIV_EXPRESSION__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_PlusExpression(org.alia4j.language.ballandpaddle.PlusExpression element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PLUS_EXPRESSION__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PLUS_EXPRESSION__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PLUS_EXPRESSION__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("+");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.PLUS_EXPRESSION__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_MinusExpression(org.alia4j.language.ballandpaddle.MinusExpression element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MINUS_EXPRESSION__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MINUS_EXPRESSION__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MINUS_EXPRESSION__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("-");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.MINUS_EXPRESSION__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_NegExpression(org.alia4j.language.ballandpaddle.NegExpression element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEG_EXPRESSION__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("-");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEG_EXPRESSION__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_BracketExpression(org.alia4j.language.ballandpaddle.BracketExpression element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BRACKET_EXPRESSION__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BRACKET_EXPRESSION__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_IntOperand(org.alia4j.language.ballandpaddle.IntOperand element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.INT_OPERAND__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.INT_OPERAND__VALUE));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.INT_OPERAND__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_AttOperand(org.alia4j.language.ballandpaddle.AttOperand element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT));
		printCountingMap.put("att", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("att");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_OPERAND__ATT));
			if (o != null) {
			}
			printCountingMap.put("att", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_EqParameter(org.alia4j.language.ballandpaddle.EqParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EQ_PARAMETER__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EQ_PARAMETER__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EQ_PARAMETER__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.EQ_PARAMETER__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_SmthParameter(org.alia4j.language.ballandpaddle.SmthParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SMTH_PARAMETER__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SMTH_PARAMETER__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SMTH_PARAMETER__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SMTH_PARAMETER__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_SeqParameter(org.alia4j.language.ballandpaddle.SeqParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SEQ_PARAMETER__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SEQ_PARAMETER__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SEQ_PARAMETER__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("<=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.SEQ_PARAMETER__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_LthParameter(org.alia4j.language.ballandpaddle.LthParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LTH_PARAMETER__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LTH_PARAMETER__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LTH_PARAMETER__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LTH_PARAMETER__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_LeqParameter(org.alia4j.language.ballandpaddle.LeqParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEQ_PARAMETER__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEQ_PARAMETER__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEQ_PARAMETER__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.LEQ_PARAMETER__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_NeqParameter(org.alia4j.language.ballandpaddle.NeqParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEQ_PARAMETER__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEQ_PARAMETER__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEQ_PARAMETER__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("!=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEQ_PARAMETER__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_OrParameter(org.alia4j.language.ballandpaddle.OrParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OR_PARAMETER__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OR_PARAMETER__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OR_PARAMETER__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.OR_PARAMETER__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_AndParameter(org.alia4j.language.ballandpaddle.AndParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.AND_PARAMETER__LEFT));
		printCountingMap.put("left", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.AND_PARAMETER__RIGHT));
		printCountingMap.put("right", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("left");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.AND_PARAMETER__LEFT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("left", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("&");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("right");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.AND_PARAMETER__RIGHT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("right", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_NegParameter(org.alia4j.language.ballandpaddle.NegParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEG_PARAMETER__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.NEG_PARAMETER__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_BracketParameter(org.alia4j.language.ballandpaddle.BracketParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BRACKET_PARAMETER__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.BRACKET_PARAMETER__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_AttParameter(org.alia4j.language.ballandpaddle.AttParameter element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT));
		printCountingMap.put("att", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("att");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.ATT_PARAMETER__ATT));
			if (o != null) {
			}
			printCountingMap.put("att", count - 1);
		}
	}
	
	
	public void print_org_alia4j_language_ballandpaddle_ValueParameter(org.alia4j.language.ballandpaddle.ValueParameter element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.VALUE_PARAMETER__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.VALUE_PARAMETER__VALUE));
			if (o != null) {
				org.alia4j.language.ballandpaddle.resource.ballandpaddle.IBallandpaddleTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.alia4j.language.ballandpaddle.BallandpaddlePackage.VALUE_PARAMETER__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
}
