package bp.base;

import bp.base.collision.body.*;
import bp.base.exception.IllegalBodyException;

public class Ball extends MovingBAPObject {

	private double size;
	//direction in degrees, from 0 till 360
	private int direction = -1;
	private double speed;
	//the upper and lower limits for speed and size
	private final double upperSpeedLimit = 10;
	private final double lowerSpeedLimit = 1;
	private final double upperSizeLimit = 10;
	private final double lowerSizeLimit = 1;
	//the default damage the ball does to blocks
	private int damage;
	//if the block still exists or if it fell through the bottom
	private boolean alive;
	//the movement vectors for the next move action
	private double movementVectorX;
	private double movementVectorY;
	//the maximum distance the ball may move in one action
	private final double increment = 0.250;
	
	/**
	 * Creates a new ball
	 * @param id the id of the ball
	 * @param x the x coordinate of the ball
	 * @param y the y coordinate of the ball
	 * @param size the size of the ball
	 * @param direction the direction of the ball
	 * @param speed the speed of the ball
	 */
	public Ball(String id, double x, double y, double size, int direction, int speed){
		this(id, x, y, size);
		this.direction = direction;
		this.speed = speed;
		if(speed<lowerSpeedLimit)
			this.speed = lowerSpeedLimit;
		else if(speed>upperSpeedLimit)
			this.speed = upperSpeedLimit;
	}
	
	/**
	 * Creates a new ball
	 * @param id the id of the ball
	 * @param x the x coordinate of the ball
	 * @param y the y coordinate of the ball
	 * @param size the size of the ball
	 */
	private Ball(String id, double x, double y, double size) {
		super(id, x, y);
		super.setBody(new CircleBody(this));
		this.size = size;
		if(size>upperSizeLimit)
			this.size = upperSizeLimit;		
		if(size<lowerSizeLimit)
			this.size = lowerSizeLimit;	
		if(direction == -1)
			direction = 270;
		damage = 1;
		alive = true;
	}
	
	/**
	 * returns the size of the ball
	 * @return the size of the ball
	 */
	public double getSize(){
		return size;
	}
	
	/**
	 * Sets the size of the ball, adjusting it if necessary to make sure it remains in bounds
	 * @param size the new size of the ball
	 */
	public void setSize(int size){
		this.size = Math.max(lowerSizeLimit, Math.min(upperSizeLimit, size));
	}
	
	/**
	 * Retuns the current heading of the ball
	 * @return the direction of the ball in degrees
	 */
	public int getDirection(){
		return direction;
	}
	
	/**
	 * sets the direction of the ball, keeping it between 0 and 360
	 * @param direction the new direction of the ball
	 */
	public void setDirection(int direction){
		if(direction<0)
			direction+=360;
		this.direction = direction%360;
	}
	
	/**
	 * Multiplies the speed of the ball by the given amount
	 * @param mult the amount the speed should be multiplied with
	 */
	public void multSpeed(double mult){
		speed = Math.max(Math.min(speed*mult, upperSpeedLimit), lowerSpeedLimit);
	}
	
	/**
	 * Increases the speed of the ball by the given amount
	 * @param inc the amount the speed should be increased by
	 */
	public void incSpeed(double inc){
		speed = Math.max(Math.min(speed+inc, upperSpeedLimit), lowerSpeedLimit);
	}
	
	@Override
	public final void update() throws IllegalBodyException{
		try{
			((MovableBody)body).moveBy(movementVectorX,movementVectorY);		
		}catch(Exception e){
			throw new IllegalBodyException("Error 412.8");
		}
	}
	
	@Override
	public void calculateMove(double factor, Level level) {
		double distance = Math.pow(getSpeed(), 0.65) * factor;
		double radDir = getDirection()*Math.PI/180;
		if(distance>=increment){			
			movementVectorX = increment*Math.cos(radDir);
			movementVectorY = increment*Math.sin(radDir);
		}
		else{
			movementVectorX = distance*Math.cos(radDir);
			movementVectorY = distance*Math.sin(radDir);
		}
	}

	/**
	 * Returns the speed of the ball
	 * @return the speed of the ball
	 */
	public double getSpeed() {
		return speed;
	}
	
	/**
	 * Returns the amount of steps this ball will need to move it's full distance this frame
	 * @param factor the portion of the second that this move will take place in
	 * @return the amount of steps needed to move the ball
	 */
	public int getNeededSteps(double factor){
		double distance = Math.pow(getSpeed(), 0.65)*factor;
		return (int) Math.ceil((distance/increment));		
	}
	
	/**
	 * Sets the speed of the ball, adjusting it to keep it within bounds if necessary
	 * @param newSpeed the new speed of the ball
	 */
	public void setSpeed(double newSpeed){
		speed = Math.max(Math.min(newSpeed, upperSpeedLimit), lowerSpeedLimit);		
	}
	
	/**
	 * Returns the damage of this ball
	 * @return the damage
	 */
	public int getDamage(){
		return damage;
	}
	
	/**
	 * Sets if the ball has been destroyed,
	 * if it has been destroyed then it is no longer alive
	 * @param destroyed if the ball has been destroyed
	 */
	public void setDestroyed(boolean destroyed){
		alive = !destroyed;
	}
	
	/**
	 * Returns if the ball has been destroyed
	 * @return if the ball is no longer alive
	 */
	public boolean isDestroyed(){
		return !alive;
	}

	/**
	 * Adjusts the direction of the ball,
	 * by subtracting it's current direction from 360
	 */
	public void threeSixtyDirection() {
		setDirection(360-direction);		
	}
	
	/**
	 * Adjusts the direction of the ball,
	 * by subtracting it's current direction from 360
	 */
	public void oneEightyDirection() {
		setDirection(180-direction);	
	}




}
