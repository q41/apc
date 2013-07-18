package bp.base;

import org.alia4j.liam.Attachment;

public class CollisionEffect extends Effect {

	Attachment effectAttachment;
	
	public CollisionEffect(Attachment collisionHook, int duration, Attachment effectAttachment) {
		super(collisionHook, duration);
		this.effectAttachment = effectAttachment;
	}
	
	@Override
	public void activate() {
		//TODO
		//new Attachment(original.getSpecializations(), original.getAction(), original.getScheduleInfo())
	}
	
}
