package bp.base;

import java.util.*;
import java.util.Map.Entry;

import org.alia4j.liam.Attachment;
import org.lwjgl.Sys;

public class Effect {

	private Attachment attachment;
	private int duration;
	private Map<Attachment, Long> activeAttachments;
	
	public Effect(int duration, Attachment attachment){
		this.duration = duration;
		this.attachment = attachment;
		activeAttachments = new HashMap<Attachment, Long>();
	}
	
	public void activate(){
		Attachment att;
		if(activeAttachments.size()>0)
			att = new Attachment(attachment.getSpecializations(), attachment.getAction(), attachment.getScheduleInfo());		
		else
			att = attachment;
		activeAttachments.put(att, getEndTime());
		org.alia4j.fial.System.deploy(att);
		
	}
	
	public void checkForDeactivation(){
		List<Attachment> toUndeploy = new ArrayList<Attachment>();
		Iterator<Entry<Attachment, Long>> it = activeAttachments.entrySet().iterator();
		while(it.hasNext()){
			Entry<Attachment, Long> pairs = it.next();
			if(getTime()>=pairs.getValue())
				toUndeploy.add(pairs.getKey());
		}
		Attachment[] toUnDeploy = new Attachment[toUndeploy.size()];
		org.alia4j.fial.System.undeploy(toUndeploy.toArray(toUnDeploy));
		for(Attachment att : toUndeploy){
			activeAttachments.remove(att);
			System.out.println("removed "+att);
		}
	}
	
	private long getEndTime(){
		if(duration==0)
			return Long.MAX_VALUE;
		return ((Sys.getTime()+duration*1000) * 1000) / Sys.getTimerResolution();
	}
	
	private long getTime(){
		 return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}
	
}
	