package ballandpaddle.base;

import ballandpaddle.base.collision.body.Point;
import ballandpaddle.base.collision.body.SquareBody;

public class SpawnedPower extends MovingBAPObject {

	/**
	 * The direction of this spawned power, straight down
	 */
	private final int direction = 90;
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
	 * If the power is still alive or not
	 */
	private boolean alive;
	/**
	 * If the player has caught the power with his paddle
	 */
	private boolean caught;

	/**
	 * Creates a new SpawnedPower, a container on the field which contains a power
	 * @param power the power contained within
	 * @param x the x coordinate
	 * @param y the y coordinate
	 */
	public SpawnedPower(Power power, double x, double y){
		super(power.getId(), x, y, new SquareBody(new Point(x,y), new Point(x+0.15, y+0.15)));
		alive = true;
		caught = false;
	}

	@Override
	public void calculateMove(double factor, Level level){
		//calculate distance to travel this update
		double distance = speed*factor;
		if(distance>=increment)
			movementVectorY = increment*direction;			
		else
			movementVectorY = distance*direction;
	}
	
	@Override
	public int getNeededSteps(double factor){
		double distance = 0;
		if(direction!=0)
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
	public final void update() {
		body.moveBy(0,movementVectorY);			
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
}
