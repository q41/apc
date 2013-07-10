package bp.base;

import java.util.*;

import org.alia4j.liam.Attachment;

public class Power {

	/**
	 * The id of the power
	 */
	private String id;
	/**
	 * The effects that this power has, mappend by their id
	 */
	private Map<String, Attachment> effects;
	/**
	 * The chance that this power will be spawned, from 0.0 to 1.0
	 */
	private double powerSpawnChance;
	
	/**
	 * Creates a new power with the given id, effects and spawnchance
	 * @param id the id of this power
	 * @param effects the effects that this power has
	 * @param powerSpawnChance the chance that this power will be spawned
	 */
	public Power(String id, Map<String, Attachment> effects, double powerSpawnChance){
		this(id, effects);
		this.powerSpawnChance = powerSpawnChance;
	}
	
	/**
	 * Creates a new power with the given id, effects and spawnchance of 1.0
	 * @param id the id of this power
	 * @param effects the effects that this power has
	 */
	public Power(String id, Map<String, Attachment> effects){
		this.id = id;
		this.effects = effects;
		this.powerSpawnChance=1.0;
	}	
	
	/**
	 * Returns the chance that this power will be spawned
	 * @return the chance that this power will be spawned
	 */
	public double getPowerSpawnChance() {
		return powerSpawnChance;
	}

	/**
	 * Returns the effects that this power has
	 * @return the effects of this power
	 */
	public Map<String, Attachment> getEffects() {
		return effects;
	}

	/**
	 * Returns the id of this power
	 * @return the id of this power
	 */
	public String getId() {
		return id;
	}
	
}
