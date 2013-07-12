package bp.base;

import bp.base.collision.body.*;
import bp.base.exception.IllegalBodyException;

public class Ball extends MovingBPObject {

	private double size;
	//orientation in degrees, from 0 till 360
	private int orientation = -1;
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
	 * if the ball is immaterial or not
	 */
	private boolean immaterial;
	
	/**
	 * Creates a new ball
	 * @param id the id of the ball
	 * @param x the x coordinate of the ball
	 * @param y the y coordinate of the ball
	 * @param size the size of the ball
	 * @param orientation the orientation of the ball
	 * @param speed the speed of the ball
	 */
	public Ball(String id, double x, double y, double size, int orientation, int speed){
		this(id, x, y, size);
		this.orientation = orientation;
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
		if(orientation == -1)
			orientation = 270;
		damage = 1;
		alive = true;
		immaterial = false;
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
	 * Returns if the ball is immaterial
	 * @return If the ball is immaterial
	 */
	public boolean getImmaterial(){
		return immaterial;
	}
	
	/**
	 * Sets if the ball is immaterial or not
	 * @param immaterial If the ball is immaterial or not
	 */
	public void setImmaterial(boolean immaterial){
		this.immaterial = immaterial;
	}
	
	/**
	 * Retuns the current heading of the ball
	 * @return the orientation of the ball in degrees
	 */
	public int getOrientation(){
		return orientation;
	}
	
	/**
	 * sets the direction of the ball, keeping it between 0 and 360
	 * @param orientation the new direction of the ball
	 */
	public void setOrientation(int orientation){
		if(orientation<0)
			orientation+=360;
		this.orientation = orientation%360;
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
		double radDir = getOrientation()*Math.PI/180;
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
	 * Adjusts the orientation of the ball,
	 * by subtracting it's current orientation from 360
	 */
	public void threeSixtyOrientation() {
		setOrientation(360-orientation);		
	}
	
	/**
	 * Adjusts the orientation of the ball,
	 * by subtracting it's current orientation from 360
	 */
	public void oneEightyOrientation() {
		setOrientation(180-orientation);	
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
