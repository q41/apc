package ballandpaddle.base;

import java.util.*;

public class Power {

	private String id;
	private List<Effect> effects;
	private int duration;
	private float powerSpawnChance;
	private List<BAPObject> targets;
	
	public Power(String id, List<Effect> effects, int duration, float powerSpawnChance, List<BAPObject> targets){
		this(id, effects, duration, targets);
		this.powerSpawnChance = powerSpawnChance;
	}
	
	public Power(String id, List<Effect> effects, int duration, List<BAPObject> targets){
		this.id = id;
		this.effects = effects;
		this.duration = duration;
		this.targets = targets;
	}	
	
	public float getPowerSpawnChance() {
		return powerSpawnChance;
	}

	public List<BAPObject> getTargets() {
		return targets;
	}

	public int getDuration() {
		return duration;
	}

	public List<Effect> getEffects() {
		return effects;
	}

	public String getId() {
		return id;
	}
	
}
