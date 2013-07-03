package ballandpaddle.base;

import java.util.*;

public class Power {

	private String id;
	private List<Effect> effects;
	private int duration;
	private double powerSpawnChance;
	private List<BAPObject> targets;
	
	public Power(String id, List<Effect> effects, int duration, double powerSpawnChance, List<BAPObject> targets){
		this(id, effects, duration, targets);
		this.powerSpawnChance = powerSpawnChance;
	}
	
	public Power(String id, List<Effect> effects, int duration, List<BAPObject> targets){
		this.id = id;
		this.effects = effects;
		this.duration = duration;
		this.targets = targets;
		this.powerSpawnChance=1.0;
	}	
	
	public double getPowerSpawnChance() {
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
