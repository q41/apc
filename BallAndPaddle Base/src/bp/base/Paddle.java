package bp.base;

import bp.base.collision.*;
import bp.base.collision.body.Body;
import bp.base.collision.body.CircleBody;
import bp.base.collision.body.Point;
import bp.base.collision.body.RectangleBody;

public class Paddle extends MovingBAPObject {

	/**
	 * The size of this paddle
	 */
	private double size;
	/**
	 * The direction that the paddle is moving in
	 * -1 for left, 1 for right, 0 for none
	 */
	private int direction;
	/**
	 * The speed and size bounds for this paddle
	 */
	private final double upperSpeedLimit = 10;
	private final double lowerSpeedLimit = 1;
	private final double upperSizeLimit = 10;
	private final double lowerSizeLimit = 1;
	/**
	 * The current speed of the paddle
	 */
	private double speed;
	/**
	 * The maximum distance this paddle may move in one action
	 */
	private final double increment = 0.25;
	/**
	 * The distance this paddle will move in it's next action
	 */
	private double movementVectorX;
	
	/**
	 * Creates a new paddle with the given id, coordinates and size
	 * @param id the identifier of the paddle
	 * @param x the x coordinate of the paddle
	 * @param y the y coordinate of the paddle
	 * @param size the size of the paddle
	 */
	public Paddle(String id, double x, double y, int size) {
		super(id, x, y);
		super.setBody(new RectangleBody(this));
		this.speed = 5;
		if(speed<lowerSpeedLimit)
			speed=lowerSpeedLimit;
		if(speed>upperSpeedLimit)
			speed=upperSpeedLimit;		
		this.size = size;
		if(this.size<lowerSizeLimit)
			this.size = lowerSizeLimit;
		else if(this.size>upperSizeLimit)
			this.size = upperSizeLimit;
	}
	
	/**
	 * Sets the direction that this paddle should move in
	 * @param direction the new direction for this paddle
	 */
	public void setDirection(int direction){
		this.direction = direction;
	}
	
	/**
	 * Returns the direction of this paddle
	 * @return direction the direction this paddle is moving in
	 */
	public int getDirection(){
		return direction;
	}
	
	@Override
	public void calculateMove(double factor, Level level){
		//calculate distance to travel this update
		double distance = Math.pow(getSpeed(), 0.65)*factor;
		if(distance>=increment)
			movementVectorX = increment*getDirection();			
		else
			movementVectorX = distance*getDirection();
	}
	
	@Override
	public int getNeededSteps(double factor){
		double distance = 0;
		if(getDirection()!=0)
			distance = Math.pow(getSpeed(), 0.65)*factor;
		return (int) Math.ceil((distance/increment));		
	}
	
	/**
	 * Returns the speed of the paddle
	 * @return the current speed of the paddle
	 */
	public double getSpeed(){
		return speed;
	}

	@Override
	public final void update() {
		body.moveBy(movementVectorX,0);			
	}

}
