package ballandpaddle.base;

import ballandpaddle.base.Effect.TargetType;

public class CollisionEffect extends Effect {

		//if TargetType is This, then target is ""
		//if TargetType is Type then target is the class name of the target
		//if TargetType is Object then target is the id of the target
		private String leftTarget;
		private TargetType leftType;
		private String rightTarget;
		private TargetType rightType;
	
	
	public CollisionEffect(String id, TargetType leftType, String leftTarget, TargetType rightType, String rightTarget) {
		super(id);
		this.leftTarget=leftTarget;
		this.leftType=leftType;
		this.rightTarget=rightTarget;
		this.rightType=rightType;
	}

}
