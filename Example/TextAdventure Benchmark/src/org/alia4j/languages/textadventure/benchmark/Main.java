package org.alia4j.languages.textadventure.benchmark;

import org.alia4j.languages.textadventure.predicate.TAAtomicPredicateFactory;
import org.alia4j.languages.textadventure.predicate.sirin.TAAtomicPredicateFactorySiRIn;
import org.alia4j.languages.textadventure.predicate.sirin.TAAtomicPredicateFactorySiRInBS;

import benchmark.JoinPointClass;

public class Main {

	private static final int ITERATIONS = 10000;

	private static int count;

	public static void advice() {
		count++;
	}

	public static void main(String[] args) {
		new TAAtomicPredicateFactory();
//		new TAAtomicPredicateFactorySiRIn();
//		new TAAtomicPredicateFactorySiRInBS();

		Util.deployAttachment("not null", "not null");

		for (int j = 0; j < 10; j++) {
			long start = System.currentTimeMillis();
			for (int i = 0; i < ITERATIONS; i ++) {
				JoinPointClass.invokeJoinPoint();
			}
			long time = (System.currentTimeMillis() - start);
			System.out.println("milli seconds for " + ITERATIONS + " join points: " + time);
		}

		System.out.println("advice execution count: " + count);
	}

}
