package bp.base;

import java.util.List;

import bp.base.Effect.EffectTarget;
import bp.base.Effect.EffectedAttribute;
import bp.base.Effect.TargetType;

public class CollisionEffect extends Effect {

		//if TargetType is Type then target is the class name of the target
		//if TargetType is Object then target is the id of the target
		private String leftTarget;
		private TargetType leftType;
		private String rightTarget;
		private TargetType rightType;
		
		private List<EffectedAttribute> rightTargetAttributes;
		private List<EffectedAttribute> leftTargetAttributes;
	
	
	public CollisionEffect(String id, TargetType leftType, String leftTarget, TargetType rightType, String rightTarget) {
		super(id);
		this.leftTarget=leftTarget;
		this.leftType=leftType;
		this.rightTarget=rightTarget;
		this.rightType=rightType;
	}
	
	public void setLeftTargetAttributes(
			List<EffectedAttribute> leftTargetAttributes) {
		this.leftTargetAttributes = leftTargetAttributes;		
	}
	
	public void setRightTargetAttributes(
			List<EffectedAttribute> rightTargetAttributes) {
		this.rightTargetAttributes = rightTargetAttributes;
	}
	
	@Override
	public boolean isLegal(Level level) {
		//get type of the target
		EffectTarget targetTypeRight = null;
		EffectTarget targetTypeLeft = null;
		boolean correct = true;
		if(leftType == TargetType.OBJECT){
			//search through list of all objects for the id target
			for(Block block : level.getBlocks())
				if(block.getId().equals(leftTarget))
					targetTypeLeft = EffectTarget.BLOCK;
			for(Ball ball : level.getBalls())
				if(ball.getId().equals(leftTarget))
					targetTypeLeft = EffectTarget.BALL;
			for(Paddle paddle : level.getPaddles())
				if(paddle.getId().equals(leftTarget))
					targetTypeLeft = EffectTarget.PADDLE;	
			if(targetTypeLeft==null)
				return false;
		}
		else{
			if(leftTarget.contains("Ball"))
				targetTypeLeft = EffectTarget.BALL;
			else if(leftTarget.contains("Block"))
				targetTypeLeft = EffectTarget.BLOCK;
			else
				targetTypeLeft = EffectTarget.PADDLE;
		}
		if(rightType == TargetType.OBJECT){
			//search through list of all objects for the id target
			for(Block block : level.getBlocks())
				if(block.getId().equals(rightTarget))
					targetTypeRight = EffectTarget.BLOCK;
			for(Ball ball : level.getBalls())
				if(ball.getId().equals(rightTarget))
					targetTypeRight = EffectTarget.BALL;
			for(Paddle paddle : level.getPaddles())
				if(paddle.getId().equals(rightTarget))
					targetTypeRight = EffectTarget.PADDLE;	
			if(targetTypeRight==null)
				return false;
		}
		else{
			if(rightTarget.contains("Ball"))
				targetTypeRight = EffectTarget.BALL;
			else if(rightTarget.contains("Block"))
				targetTypeRight = EffectTarget.BLOCK;
			else
				targetTypeRight = EffectTarget.PADDLE;
		}			
		//now the types are known, check if the effect target matches one of them.
		//the variable that is targeted does not have to be checked, the parser already does this
		correct &= targetTypeLeft.equals(effectTarget) || targetTypeRight.equals(effectTarget);
		//check if all the parameters used with the target are legal for these types
		for(EffectedAttribute attr : leftTargetAttributes){
			if(leftTarget.equals(EffectTarget.BALL)){
				correct &= !attr.equals(EffectedAttribute.HARDNESS) && !attr.equals(EffectedAttribute.RESISTANCE);
			}
			else if(leftTarget.equals(EffectTarget.BLOCK)){
				correct &= attr.equals(EffectedAttribute.HARDNESS) || attr.equals(EffectedAttribute.RESISTANCE);
			}
			else{
				correct &= !attr.equals(EffectedAttribute.SIZE) && !attr.equals(EffectedAttribute.SPEED);
			}
		}
		for(EffectedAttribute attr : rightTargetAttributes){
			if(rightTarget.equals(EffectTarget.BALL)){
				correct &= !attr.equals(EffectedAttribute.HARDNESS) && !attr.equals(EffectedAttribute.RESISTANCE);
			}
			else if(rightTarget.equals(EffectTarget.BLOCK)){
				correct &= attr.equals(EffectedAttribute.HARDNESS) || attr.equals(EffectedAttribute.RESISTANCE);
			}
			else{
				correct &= !attr.equals(EffectedAttribute.SIZE) && !attr.equals(EffectedAttribute.SPEED);
			}
		}
		
		
		//check if all the parameters used in the expression for the effect are legal for these types
		System.out.println(correct);
		return correct;
	}



}
