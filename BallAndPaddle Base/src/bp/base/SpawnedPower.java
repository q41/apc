package bp.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.alia4j.liam.Attachment;

import bp.base.collision.body.*;
import bp.base.exception.IllegalBodyException;

public class SpawnedPower extends MovingBAPObject {

	/**
	 * The orientation of this spawned power, straight down
	 */
	private final int orientation = 90;
	/**
	 * The distance to be moved in the next action
	 */
	private double movementVectorY;
	/**
	 * The maximum distance that may be moved per step
	 */
	private final double increment = 0.25;
	/**
	 * The speed at which the power drops
	 */
	private final double speed = 0.02;	
	/**
	 * Speed bounds
	 */
	private final double upperSpeedLimit = 0.1;
	private final double lowerSpeedLimit = 0.01;
	/**
	 * If the power is still alive or not
	 */
	private boolean alive;
	/**
	 * If the player has caught the power with his paddle
	 */
	private boolean caught;	
	/**
	 * The size of this spawnedPower
	 */
	private final double size = 0.25;
	/**
	 * Size bounds
	 */
	private final double upperSizeLimit = 0.25;
	private final double lowerSizeLimit = 0.25;
	/**
	 * The type of power of this spawned power
	 */
	private Power power;
	
	/**
	 * Creates a new SpawnedPower, a container on the field which contains a power
	 * @param power the power contained within
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public SpawnedPower(Power power, double x, double y){
		super(power.getId(), x, y);
		this.power = power;
		super.setBody(new RectangleBody(this));
		alive = true;
		caught = false;
	}

	@Override
	public void calculateMove(double factor, Level level){
		//calculate distance to travel this update
		double distance = speed*factor;
		if(distance>=increment)
			movementVectorY = increment*orientation;			
		else
			movementVectorY = distance*orientation;
	}
	
	@Override
	public int getNeededSteps(double factor){
		double distance = 0;
		if(orientation!=0)
			distance = speed*factor;
		return (int) Math.ceil((distance/increment));		
	}
	
	/**
	 * Returns the speed of this spawned power
	 * @return the speed
	 */
	public double getSpeed(){
		return speed;
	}

	@Override
	public final void update() throws IllegalBodyException {
		try{
			((MovableBody)body).moveBy(0, movementVectorY);		
		}catch(Exception e){
			throw new IllegalBodyException("Error 412.7");
		}	
	}

	/**
	 * Sets if this spawned power has been destroyed
	 * @param destroyed if the power has been destroyed
	 */
	public void setDestroyed(boolean destroyed) {
		alive = !destroyed;		
	}

	/**
	 * Sets if this spawned power has been caught
	 * @param caught if this power has been caught
	 */
	public void setCaught(boolean caught) {
		this.caught = caught;
		for(Effect effect : power.getEffects())
			effect.activate();
	}
	
	/**
	 * Returns if the power has been caught
	 * @return if the power has been caught
	 */
	public boolean caught(){
		return caught;
	}
	
	/**
	 * Returns if the power has been destroyed
	 * @return if the power is no longer alive
	 */
	public boolean destroyed(){
		return !alive;
	}

	public double getSize() {
		return size;
	}	
	
	
	/**
	 * returns the x coordinate of this object when it was created
	 * @return x
	 */
	public double getX(){
		return x;
	}
	
	/**
	 * returns the y coordinate of this object when it was created
	 * @return y
	 */
	public double getY(){
		return y;
	}	
}
