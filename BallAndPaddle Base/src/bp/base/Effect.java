package bp.base;

import org.alia4j.liam.Attachment;

public class Effect {

	/**
	 * The attachment representing this effect
	 */
	private Attachment original;
	/**
	 * The duration that the attachment should be deployed for in seconds
	 */
	private int duration;
	
	private boolean testing;
	
	/**
	 * Creates a new effect with the given duration and attachment
	 * @param attachment The attachment of this effect
	 * @param duration The duration of this effect
	 */
	public Effect(Attachment attachment, int duration){
		this.duration = duration;
		this.original = attachment;
		testing = false;
	}
	
	//this effect becomes active
	public void activate(){
		Attachment newAttachment = new Attachment(original.getSpecializations(), original.getAction(), original.getScheduleInfo());
		new EffectDeployment(newAttachment, duration, testing);	
	}
	
	public void setTesting(boolean testing){
		this.testing = testing;
	}
}
	