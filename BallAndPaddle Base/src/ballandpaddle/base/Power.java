package ballandpaddle.base;

import java.util.*;

public class Power {

	private String id;
	private List<Effect> effects;
	private int duration;
	private double powerSpawnChance;
	
	public Power(String id, List<Effect> effects, int duration, double powerSpawnChance){
		this(id, effects, duration);
		this.powerSpawnChance = powerSpawnChance;
	}
	
	public Power(String id, List<Effect> effects, int duration){
		this.id = id;
		this.effects = effects;
		this.duration = duration;
		this.powerSpawnChance=1.0;
	}	
	
	public double getPowerSpawnChance() {
		return powerSpawnChance;
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
