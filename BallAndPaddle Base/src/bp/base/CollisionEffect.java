package bp.base;

import java.util.List;

public class CollisionEffect extends Effect {

//		//if TargetType is TargetType.Type then target is the class name of the target
//		//if TargetType is TargetType.Object then target is the id of the target
//		private String leftTarget;
//		private TargetType leftType;
//		private String rightTarget;
//		private TargetType rightType;
//		
//		//the attributes part of the right target, if any
//		private List<EffectAttribute> rightTargetAttributes;
//		//the attributes part of the left target, if any
//		private List<EffectAttribute> leftTargetAttributes;
//	
//	/**
//	 * Creates a new collision effect
//	 * @param id the id of the effect
//	 * @param leftType the kind of the left target, Object or Type
//	 * @param leftTarget the left target, an id or class
//	 * @param rightType the kind of the right target, Object or Type
//	 * @param rightTarget the right target, an id or class
//	 */
//	public CollisionEffect(String id, TargetType leftType, String leftTarget, TargetType rightType, String rightTarget) {
//		super(id);
//		this.leftTarget=leftTarget;
//		this.leftType=leftType;
//		this.rightTarget=rightTarget;
//		this.rightType=rightType;
//	}
//	
//	/**
//	 * Sets the target attributes for the left target
//	 * @param leftTargetAttributes the left target's target attributes
//	 */
//	public void setLeftTargetAttributes(
//			List<EffectAttribute> leftTargetAttributes) {
//		this.leftTargetAttributes = leftTargetAttributes;		
//	}
//	
//	/**
//	 * Sets the target attributes for the right target
//	 * @param rightTargetAttributes the right target's target attributes
//	 */
//	public void setRightTargetAttributes(
//			List<EffectAttribute> rightTargetAttributes) {
//		this.rightTargetAttributes = rightTargetAttributes;
//	}
//	
//	@Override
//	public boolean isLegal(Level level) {
//		//get type of the target
//		EffectTarget targetTypeRight = null;
//		EffectTarget targetTypeLeft = null;
//		boolean correct = true;
//		if(leftType == TargetType.OBJECT){
//			//search through list of all objects for the id target
//			for(Block block : level.getBlocks())
//				if(block.getId().equals(leftTarget))
//					targetTypeLeft = EffectTarget.BLOCK;
//			for(Ball ball : level.getBalls())
//				if(ball.getId().equals(leftTarget))
//					targetTypeLeft = EffectTarget.BALL;
//			for(Paddle paddle : level.getPaddles())
//				if(paddle.getId().equals(leftTarget))
//					targetTypeLeft = EffectTarget.PADDLE;	
//			if(targetTypeLeft==null)
//				return false;
//		}
//		else{
//			if(leftTarget.contains("Ball"))
//				targetTypeLeft = EffectTarget.BALL;
//			else if(leftTarget.contains("Block"))
//				targetTypeLeft = EffectTarget.BLOCK;
//			else
//				targetTypeLeft = EffectTarget.PADDLE;
//		}
//		if(rightType == TargetType.OBJECT){
//			//search through list of all objects for the id target
//			for(Block block : level.getBlocks())
//				if(block.getId().equals(rightTarget))
//					targetTypeRight = EffectTarget.BLOCK;
//			for(Ball ball : level.getBalls())
//				if(ball.getId().equals(rightTarget))
//					targetTypeRight = EffectTarget.BALL;
//			for(Paddle paddle : level.getPaddles())
//				if(paddle.getId().equals(rightTarget))
//					targetTypeRight = EffectTarget.PADDLE;	
//			if(targetTypeRight==null)
//				return false;
//		}
//		else{
//			if(rightTarget.contains("Ball"))
//				targetTypeRight = EffectTarget.BALL;
//			else if(rightTarget.contains("Block"))
//				targetTypeRight = EffectTarget.BLOCK;
//			else
//				targetTypeRight = EffectTarget.PADDLE;
//		}			
//		//now the types are known, check if the effect target matches one of them.
//		//the variable that is targeted does not have to be checked, the parser already does this
//		correct &= targetTypeLeft.equals(effectTarget) || targetTypeRight.equals(effectTarget);
//		//check if all the parameters used with the target are legal for these types
//		for(EffectAttribute attr : leftTargetAttributes){
//			if(leftTarget.equals(EffectTarget.BALL)){
//				correct &= !attr.equals(EffectAttribute.HARDNESS) && !attr.equals(EffectAttribute.RESISTANCE);
//			}
//			else if(leftTarget.equals(EffectTarget.BLOCK)){
//				correct &= attr.equals(EffectAttribute.HARDNESS) || attr.equals(EffectAttribute.RESISTANCE);
//			}
//			else{
//				correct &= !attr.equals(EffectAttribute.SIZE) && !attr.equals(EffectAttribute.SPEED);
//			}
//		}
//		for(EffectAttribute attr : rightTargetAttributes){
//			if(rightTarget.equals(EffectTarget.BALL)){
//				correct &= !attr.equals(EffectAttribute.HARDNESS) && !attr.equals(EffectAttribute.RESISTANCE);
//			}
//			else if(rightTarget.equals(EffectTarget.BLOCK)){
//				correct &= attr.equals(EffectAttribute.HARDNESS) || attr.equals(EffectAttribute.RESISTANCE);
//			}
//			else{
//				correct &= !attr.equals(EffectAttribute.SIZE) && !attr.equals(EffectAttribute.SPEED);
//			}
//		}
//		
//		
//		//check if all the parameters used in the expression for the effect are legal for these types
//		System.out.println(correct);
//		return correct;
//	}
}
