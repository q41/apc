package org.alia4j.languages.ballandpaddle.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplyEffect {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static double apply(double inc) throws Throwable {
		double result = (double) org.alia4j.fial.System.proceed();
		result += inc;
		return result;
	}

}
