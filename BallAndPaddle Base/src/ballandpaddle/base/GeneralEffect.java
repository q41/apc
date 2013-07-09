package ballandpaddle.base;

import java.util.List;

import ballandpaddle.base.Effect.EffectAttribute;
import ballandpaddle.base.Effect.TargetType;

public class GeneralEffect extends Effect {

	//if TargetType is TargetType.Type then target is the class name of the target
	//if TargetType is TargetType.Object then target is the id of the target
	private String target;
	private TargetType type;
	//attributes used in the target line
	private List<EffectAttribute> targetAttributes;

	/**
	 * Creates a new general effect
	 * @param id the id of the effect
	 * @param type the kind of the target, Object or Type
	 * @param target the id or class of the target
	 */
	public GeneralEffect(String id, TargetType type, String target) {
		super(id);
		this.target=target;
		this.type=type;
	}
	
	/**
	 * Sets the target attributes for the target
	 * @param targetAttributes the target's target attributes
	 */
	public void setTargetAttributes(List<EffectAttribute> targetAttributes) {
		this.targetAttributes = targetAttributes;		
	}


	@Override
	public boolean isLegal(Level level) {
		//get type of the target
		EffectTarget targetType = null;
		boolean correct = true;
		if(type == TargetType.OBJECT){
			//search through list of all objects for the id target
			for(Block block : level.getBlocks())
				if(block.getId().equals(target))
					targetType = EffectTarget.BLOCK;
			for(Ball ball : level.getBalls())
				if(ball.getId().equals(target))
					targetType = EffectTarget.BALL;
			for(Paddle paddle : level.getPaddles())
				if(paddle.getId().equals(target))
					targetType = EffectTarget.PADDLE;	
			if(targetType==null)
				return false;
		}
		else{
			if(target.contains("Ball"))
				targetType = EffectTarget.BALL;
			else if(target.contains("Block"))
				targetType = EffectTarget.BLOCK;
			else
				targetType = EffectTarget.PADDLE;
		}
		//now the type is know, check if the effect target matches it.
		//the variable that is targeted does not have to be checked, the parser already does this
		correct &= targetType.equals(effectTarget);
		//check if all the parameters used with the target are legal for this type
		for(EffectAttribute attr : targetAttributes){
			if(targetType.equals(EffectTarget.BALL)){
				correct &= !attr.equals(EffectAttribute.HARDNESS) && !attr.equals(EffectAttribute.RESISTANCE);
			}
			else if(targetType.equals(EffectTarget.BLOCK)){
				correct &= attr.equals(EffectAttribute.HARDNESS) || attr.equals(EffectAttribute.RESISTANCE);
			}
			else{
				correct &= !attr.equals(EffectAttribute.SIZE) && !attr.equals(EffectAttribute.SPEED);
			}
		}
		//check if all the parameters used in the expression for the effect are legal for this type
		System.out.println(correct);
		return correct;
	}
}
