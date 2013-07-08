package bp.base;

import bp.base.collision.*;
import bp.base.collision.body.Body;
import bp.base.collision.body.CircleBody;
import bp.base.collision.body.Point;
import bp.base.collision.body.RectangleBody;

public class Paddle extends BAPObject {

	private int size;
	private int orientation;
	private int direction; //-1 for left, 1 for right, 0 for none
	private final double upperSpeedLimit = 10;
	private final double lowerSpeedLimit = 1;
	private final double upperSizeLimit = 10;
	private final double lowerSizeLimit = 1;
	private double speed;
	private final double increment = 0.25;
	private double movementVectorX;
	
	public Paddle(String id, double x, double y, int orientation, int size) {
		super(id, x, y, null);
		super.setBody(new RectangleBody(new Point(x,y), new Point(x, y+0.26), this));
		this.orientation = orientation;
		this.speed = 4;
		this.size = 3;
	}
	
	public int getOrientation(){
		return orientation;
	}
	
	public int getSize(){
		return size;
	}
	
	public void setDirection(int direction){
		this.direction = direction;
	}
	
	public int getDirection(){
		return direction;
	}
	
	public void calculateMove(double factor, Level level){
		//calculate distance to travel this update
		double distance = Math.pow(getSpeed(), 0.65)*factor;
		if(distance>=increment)
			movementVectorX = increment*getDirection();			
		else
			movementVectorX = distance*getDirection();
	}
	
	
	
	public int getNeededSteps(double factor){
		double distance = 0;
		if(getDirection()!=0)
			distance = Math.pow(getSpeed(), 0.65)*factor;
		return (int) Math.ceil((distance/increment));		
	}
	
	public double getSpeed(){
		return speed;
	}

	@Override
	public final void update() {
		body.moveBy(movementVectorX,0);			
	}

}
