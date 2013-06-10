package org.alia4j.languages.textadventure.predicate;

import org.alia4j.languages.textadventure.predicate.IsSamePredicate;
import org.alia4j.liam.AtomicPredicate;
import org.alia4j.liam.Context;
import org.alia4j.util.PairHashMap;

public class TAAtomicPredicateFactory {
    
	public TAAtomicPredicateFactory() {
        if (TAAtomicPredicateFactory.singleton != null)
            throw new IllegalStateException();
        TAAtomicPredicateFactory.singleton = this;
    }
    
    private static TAAtomicPredicateFactory getInstance() {
        return TAAtomicPredicateFactory.singleton;
    }
    
    private static TAAtomicPredicateFactory singleton;

	public static AtomicPredicate findOrCreateIsSamePredicate(Context firstOperandContext, Context secondOperandContext) {
		if (!canonicalIsSamePredicates.containsKeys(firstOperandContext, secondOperandContext)) {
			canonicalIsSamePredicates.put(firstOperandContext, secondOperandContext, getInstance().createIsSamePredicate(firstOperandContext, secondOperandContext));
		}
		return canonicalIsSamePredicates.get(firstOperandContext, secondOperandContext);
	}
	
	private static PairHashMap<Context, Context, AtomicPredicate> canonicalIsSamePredicates = new PairHashMap<Context, Context, AtomicPredicate>();
	
	protected AtomicPredicate createIsSamePredicate(Context firstOperandContext,
			Context secondOperandContext) {
		return new IsSamePredicate(firstOperandContext, secondOperandContext);
	}

}
