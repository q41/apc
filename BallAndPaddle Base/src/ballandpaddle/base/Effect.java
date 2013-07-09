package ballandpaddle.base;

import java.util.List;

public abstract class Effect {

	/**
	 * the id of this effect
	 */
	private String id;
	/**
	 * the duration of this effect
	 */
	private int duration;
	/**
	 * The type of object that this effect will change
	 */
	protected EffectTarget effectTarget;
	/**
	 * The attribute from the object that this effect will change
	 */
	protected EffectAttribute affectedAttribute;

	/**
	 * The type of target that was specified, either a specific object,
	 * or a type of object like ball, paddle or block
	 */
	public enum TargetType{
		TYPE, OBJECT;
	}
	
	/**
	 * The types of objects that effects can change
	 */
	public enum EffectTarget{
		BALL, BLOCK, PADDLE;
	}
	
	/**
	 * The types of attributes that effects can change
	 */
	public enum EffectAttribute{
		HARDNESS, IMMATERIAL, SIZE, SPEED, DIRECTION, RESISTANCE;
	}
	
	/**
	 * Creates a new effect with the given id
	 * @param id the id of this effect
	 */
	public Effect(String id){
		this.id = id;
	}
	
	/**
	 * Returns the id of this effect
	 * @return the id of this effect
	 */
	public String getId(){
		return id;
	}

	/**
	 * Sets the duration of this effect
	 * @param duration the duration of this effect
	 */
	public void setDuration(int duration) {
		this.duration = duration;		
	}
	
	/**
	 * Sets the target of this effect, block, ball or paddle
	 * @param effectTarget the target of this effect
	 */
	public void setEffectTarget(EffectTarget effectTarget){
		this.effectTarget = effectTarget;
	}
	
	/**
	 * Sets which attribute is modified by this effect
	 * @param effectedAttribute the modified attribute
	 */
	public void setModifiedAttribute(EffectAttribute affectedAttribute){
		this.affectedAttribute = affectedAttribute;
	}

	/**
	 * Checks if this effect is legal, if it is not
	 * then it is removed from play
	 * @param level The level
	 * @return If the effect is legal or not
	 */
	public abstract boolean isLegal(Level level);

}
