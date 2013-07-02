package ballandpaddle.base;

import ballandpaddle.base.collision.*;
import ballandpaddle.base.collision.body.Body;
import ballandpaddle.base.collision.body.CircleBody;
import ballandpaddle.base.collision.body.Point;
import ballandpaddle.base.collision.body.RectangleBody;

public class Paddle extends BAPObject {

	private int size;
	private int orientation;
	private int direction; //-1 for left, 1 for right, 0 for none
	private double speed = 4;
	private final double increment = 0.25;
	private double movementVectorX;
	
	public Paddle(String id, double d, double e, int orientation, int size) {
		super(id, d, e, new RectangleBody(new Point(d,e), new Point(d+0.5*size, e+0.05)));
		this.orientation = orientation;
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
		double distance = speed*factor;
		if(distance>=increment)
			movementVectorX = increment*direction;			
		else
			movementVectorX = distance*direction;
	}
	
	
	
	public int getNeededSteps(double factor){
		double distance = 0;
		if(direction!=0)
			distance = speed*factor;
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
