package bp.base;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

import org.alia4j.liam.Attachment;
import org.alia4j.liam.PrecedenceRule;
import org.lwjgl.Sys;

public class EffectDeployment {

	private Attachment uniqueAttachment;
	private PrecedenceRule precedence;
	private long expirationTime;
	
	public EffectDeployment(Attachment uniqueAttachment, int duration) {
		//create attachment
		this.uniqueAttachment = uniqueAttachment;
		
		//create precedence rule
		Attachment[] deployed = org.alia4j.fial.System.getInstance().deployedAttachments();
		precedence = new PrecedenceRule(new HashSet<Attachment>(Arrays.asList(deployed)), Collections.singleton(uniqueAttachment));
		
		//set expiration time
		setExpirationTime(duration);
		
		System.out.println(Level.getTime() + " deploying: " + uniqueAttachment);
		org.alia4j.fial.System.deploy(uniqueAttachment);
		org.alia4j.fial.System.deploy(precedence);
		effectDeployments.add(this);
	}

	public long getExpirationTime() {
		return expirationTime;
	}
	
	/**
	 * Returns the time at which the attachment should be undeployed
	 * @return The time at which undeploying of the attachment should happen
	 */
	private void setExpirationTime(int duration){
		if(duration==0)
			expirationTime = Long.MAX_VALUE;
		else if(Level.sysTimer)
			expirationTime = ((Sys.getTime()+duration*1000) * 1000) / Sys.getTimerResolution();
		else
			expirationTime = Timer.getCurrentTime()+duration*1000;
	}
	
	//Compares two EffectDeployments by expiration time
	private static Comparator<EffectDeployment> sortByExpiraton = new Comparator<EffectDeployment>() {

		@Override
		public int compare(EffectDeployment ed1, EffectDeployment ed2) {
			return (int)(ed1.getExpirationTime() - ed2.getExpirationTime());
		}
	};
	
	//Contains all EffectDeployments
	private static SortedSet<EffectDeployment> effectDeployments = new TreeSet<EffectDeployment>(sortByExpiraton);
	
	//Undeploys any expired effects and their precedencerules
	public static void deactivateExpired() {
		while(effectDeployments.first().getExpirationTime() <= Level.getTime()) {
			effectDeployments.first().destroy();
		}
	}

	//Ends this effect deployments existence
	private void destroy() {
		System.out.println(Level.getTime() + " undeploying: " + uniqueAttachment);
		org.alia4j.fial.System.undeploy(this.uniqueAttachment);
		org.alia4j.fial.System.undeploy(this.precedence);
		effectDeployments.remove(this);
	}
}
