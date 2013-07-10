package bp.base;

import java.util.List;

public class GeneralEffect extends Effect {

//	//if TargetType is This, then target is ""
//	//if TargetType is Type then target is the class name of the target
//	//if TargetType is Object then target is the id of the target
//	private String target;
//	private TargetType type;
//	//attributes used in the target line
//	private List<EffectedAttribute> targetAttributes;
//
//	public GeneralEffect(String id, TargetType type, String target) {
//		super(id);
//		this.target=target;
//		this.type=type;
//	}
//	
//
//	public void setTargetAttributes(List<EffectedAttribute> targetAttributes) {
//		this.targetAttributes = targetAttributes;		
//	}
//
//
//	@Override
//	public boolean isLegal(Level level) {
//		//get type of the target
//		EffectTarget targetType = null;
//		boolean correct = true;
//		if(type == TargetType.OBJECT){
//			//search through list of all objects for the id target
//			for(Block block : level.getBlocks())
//				if(block.getId().equals(target))
//					targetType = EffectTarget.BLOCK;
//			for(Ball ball : level.getBalls())
//				if(ball.getId().equals(target))
//					targetType = EffectTarget.BALL;
//			for(Paddle paddle : level.getPaddles())
//				if(paddle.getId().equals(target))
//					targetType = EffectTarget.PADDLE;	
//			if(targetType==null)
//				return false;
//		}
//		else{
//			if(target.contains("Ball"))
//				targetType = EffectTarget.BALL;
//			else if(target.contains("Block"))
//				targetType = EffectTarget.BLOCK;
//			else
//				targetType = EffectTarget.PADDLE;
//		}
//		//now the type is know, check if the effect target matches it.
//		//the variable that is targeted does not have to be checked, the parser already does this
//		correct &= targetType.equals(effectTarget);
//		//check if all the parameters used with the target are legal for this type
//		for(EffectedAttribute attr : targetAttributes){
//			if(targetType.equals(EffectTarget.BALL)){
//				correct &= !attr.equals(EffectedAttribute.HARDNESS) && !attr.equals(EffectedAttribute.RESISTANCE);
//			}
//			else if(targetType.equals(EffectTarget.BLOCK)){
//				correct &= attr.equals(EffectedAttribute.HARDNESS) || attr.equals(EffectedAttribute.RESISTANCE);
//			}
//			else{
//				correct &= !attr.equals(EffectedAttribute.SIZE) && !attr.equals(EffectedAttribute.SPEED);
//			}
//		}
//		//check if all the parameters used in the expression for the effect are legal for this type
//		System.out.println(correct);
//		return correct;
//	}
}
