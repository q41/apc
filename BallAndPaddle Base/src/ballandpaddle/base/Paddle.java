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
	private Body body;
	private double effectiveSpeed;
	
	public Paddle(String id, int x, int y, int orientation, int size) {
		super(id, x, y, new RectangleBody(new Point(x,y), new Point(x+0.5*size, y+0.05)));
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
	
	public void move(double adjustment, Level level){
		double distance = speed*adjustment;
		effectiveSpeed = speed*0.001*direction;
		while(distance>0.001 && effectiveSpeed != 0){	
			update();
			level.checkForCollision(this);
			distance-=effectiveSpeed;
		}
	}
	
	public double getSpeed(){
		return speed;
	}

	@Override
	protected void update() {
		body.moveBy(effectiveSpeed,0);			
	}

}
