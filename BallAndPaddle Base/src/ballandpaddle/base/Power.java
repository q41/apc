package ballandpaddle.base;

import java.util.*;

public class Power {

	private String id;
	private List<Effect> effects;
	private double powerSpawnChance;
	
	public Power(String id, List<Effect> effects, double powerSpawnChance){
		this(id, effects);
		this.powerSpawnChance = powerSpawnChance;
	}
	
	public Power(String id, List<Effect> effects){
		this.id = id;
		this.effects = effects;
		this.powerSpawnChance=1.0;
	}	
	
	public double getPowerSpawnChance() {
		return powerSpawnChance;
	}

	public List<Effect> getEffects() {
		return effects;
	}

	public String getId() {
		return id;
	}
	
	public List<Effect> generateNewEffects(){
		return null;
	}
	
}
