package ballandpaddle.base;

import ballandpaddle.base.collision.*;

public class Ball extends BAPObject {

	private int size;
	private double direction; //0-360
	private double speed;
	private CircleBody body;
	
	public Ball(String id, int x, int y, int size, int direction, int speed){
		this(id, x, y);
		this.size = size;
		this.direction = direction;
		this.speed = speed;
	}
	
	public Ball(String id, int x, int y) {
		super(id, x, y);
		this.size = 1;
		direction = 225;
		speed = 2;
		body = new CircleBody(new Point(x,y), size*0.05);
	}
	
	public int getSize(){
		return size;
	}
	
	public double getDirection(){
		return direction;
	}
	
	public void setDirection(double direction){
		System.out.println(direction);
		this.direction = direction;
	}
	
	public double speed(){
		return speed;
	}

	public void move(double factor, Level level) {
		double distance = speed * factor;
		double radDir = direction*Math.PI/180;
		double movementVectorX = 0.0;
		double movementVectorY = 0.0;
		while(distance>0.001){			
			movementVectorX = 0.001*Math.cos(radDir);
			movementVectorY = 0.001*Math.sin(radDir);
			body.moveBy(movementVectorX, movementVectorY);
			level.checkForCollision(this);
			distance-=0.001;
		}
			
	}

	public Body getBody() {
		return body;
	}
}
