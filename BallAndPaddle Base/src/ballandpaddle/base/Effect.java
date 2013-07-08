package ballandpaddle.base;

import java.util.List;

public abstract class Effect {

	private String id;
	private OperatorType op;
	private int duration;
	private Object value;
	protected EffectTarget effectTarget;
	private EffectedAttribute effectedAttribute;
	protected List<EffectedAttribute> targetAttributes;

	public enum TargetType{
		TYPE, OBJECT;
	}
	
	public enum OperatorType{
		INC, DEC, SET;
	}
	
	public enum EffectTarget{
		BALL, BLOCK, PADDLE;
	}
	
	public enum EffectedAttribute{
		HARDNESS, IMMATERIAL, SIZE, SPEED, DIRECTION, DAMAGE, RESISTANCE;
	}
	
	public Effect(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setOperator(OperatorType op){
		this.op=op;
	}

	public void setDuration(int duration) {
		this.duration = duration;		
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	public void setEffectTarget(EffectTarget effectTarget){
		this.effectTarget = effectTarget;
	}
	
	public void setModifiedAttribute(EffectedAttribute effectedAttribute){
		this.effectedAttribute = effectedAttribute;
	}

	public abstract boolean isLegal(Level level);

	public void setTargetAttributes(List<EffectedAttribute> targetAttributes) {
		this.targetAttributes = targetAttributes;		
	}
}
