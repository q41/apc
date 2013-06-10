package org.alia4j.languages.textadventure.predicate.sirin;

import org.alia4j.languages.textadventure.predicate.TAAtomicPredicateFactory;
import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.Context;

public class TAAtomicPredicateFactorySiRInBS extends TAAtomicPredicateFactory {
    
	protected AtomicPredicate createIsSamePredicate(Context firstOperandContext,
			Context secondOperandContext) {
		return new IsSamePredicateSiRInBS(firstOperandContext, secondOperandContext);
	}

}
