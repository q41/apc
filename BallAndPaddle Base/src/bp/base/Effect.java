package bp.base;

import java.util.*;
import java.util.Map.Entry;

import org.alia4j.liam.Attachment;
import org.alia4j.liam.PrecedenceRule;
import org.lwjgl.Sys;

public class Effect {

	/**
	 * The attachment belonging to this effect
	 */
	private Attachment attachment;
	/**
	 * The duration that the attachment should be deployed for in seconds
	 */
	private int duration;
	/**
	 * A mapping of active attachments to the time at which they should be deactivated
	 */
	private Map<Attachment, Long> activeAttachments;
	/**
	 * A mapping of precedence rules for the active attachments
	 */
	private Map<Attachment, PrecedenceRule> precedenceRules;
	
	/**
	 * A boolean that says if the sysTimer should be used or the custom timer Timer
	 */
	private boolean sysTimer;
	
	/**
	 * Creates a new effect with the given duration and attachment
	 * @param duration The duration of this effect
	 * @param attachment The attachment of this effect
	 */
	public Effect(int duration, Attachment attachment){
		this.duration = duration;
		this.attachment = attachment;
		activeAttachments = new HashMap<Attachment, Long>();
		precedenceRules = new HashMap<Attachment, PrecedenceRule>();
		sysTimer = true;
	}
	
	/**
	 * Actives the effect by deploying the attachment, or a copy of it if it's already deployed
	 * This attachment is then added to the activeAttachments map with it's ending time as the value
	 * A PrecedenceRule is also deployed to make certain that this effect takes place before others,
	 * so that Bound Assurance attachments always take place last
	 */
	public void activate(){
		Attachment att;
		Set<Attachment> attSet = new HashSet<Attachment>();
		PrecedenceRule precedence;
		if(activeAttachments.size()>0){
			att = new Attachment(attachment.getSpecializations(), attachment.getAction(), attachment.getScheduleInfo());			
		}
		else
			att = attachment;			
		attSet.add(att);
		Set<Attachment> existingAtt = new HashSet<Attachment>();
		Attachment[] deployed = org.alia4j.fial.System.getInstance().deployedAttachments();
		for(Attachment attachment : deployed)
			existingAtt.add(attachment);			
		precedence = new PrecedenceRule(existingAtt,attSet);
		precedenceRules.put(att, precedence);
		activeAttachments.put(att, getEndTime());
		System.out.println(getTime()+" deployed: "+attachment);
		org.alia4j.fial.System.deploy(att);
		org.alia4j.fial.System.deploy(precedence);		
	}
	
	/**
	 * Checks if any of the active attachments should be deactivated,
	 * if so then they are undeployed and their precedenceRule is also undeployed
	 */
	public void checkForDeactivation(){
		List<Attachment> toUndeployAtt = new ArrayList<Attachment>();
		Iterator<Entry<Attachment, Long>> it = activeAttachments.entrySet().iterator();
		while(it.hasNext()){
			Entry<Attachment, Long> pairs = it.next();
			if(getTime()>=pairs.getValue())
				toUndeployAtt.add(pairs.getKey());
		}
		Attachment[] toUndeploy = new Attachment[toUndeployAtt.size()];
		org.alia4j.fial.System.undeploy(toUndeployAtt.toArray(toUndeploy));
		
		List<PrecedenceRule> toUndeployPre = new ArrayList<PrecedenceRule>();
		for(Attachment att : toUndeployAtt)
			toUndeployPre.add(precedenceRules.remove(att));

		PrecedenceRule[] toUndeployPreArray = new PrecedenceRule[toUndeployPre.size()];
		org.alia4j.fial.System.undeploy(toUndeployPre.toArray(toUndeployPreArray));
		
		for(Attachment att : toUndeploy){
			activeAttachments.remove(att);
			System.out.println(getTime()+" undeployed: "+attachment);
		}
	}
	
	/**
	 * Returns the time at which the attachment should be undeployed
	 * @return The time at which undeploying of the attachment should happen
	 */
	private long getEndTime(){
		if(duration==0)
			return Long.MAX_VALUE;
		else if(sysTimer)
			return ((Sys.getTime()+duration*1000) * 1000) / Sys.getTimerResolution();
		else
			return Timer.getCurrentTime()+duration*1000;
	}
	
	/**
	 * Returns the current time
	 * @return the current time
	 */
	private long getTime(){
		if(sysTimer)
			return (Sys.getTime() * 1000) / Sys.getTimerResolution();
		else
			return Timer.getCurrentTime();
	}

	/**
	 * Sets if the sysTimer should be used
	 * @param sysTimer The boolean that says if the sysTimer should be used
	 */
	public void sysTimer(boolean sysTimer) {
		this.sysTimer=sysTimer;		
	}

}
	