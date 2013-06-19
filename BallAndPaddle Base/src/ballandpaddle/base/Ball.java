package ballandpaddle.base;

import ballandpaddle.base.collision.*;

public class Ball extends BAPObject {

	private int size;
	private int direction; //0-360
	private double speed;
	private final double upperSpeedLimit = 50;
	private final double lowerSpeedLimit = 1;
	private CircleBody body;
	
	public Ball(String id, int x, int y, int size, int direction, int speed){
		this(id, x, y);
		this.size = size;
		this.direction = direction;
		this.speed = speed;
	}
	
	public Ball(String id, int x, int y) {
		super(id, 1, 3);
		this.size = 1;
		direction = 360-135;
		speed = 50;
		body = new CircleBody(new Point(1,3), size*0.05);
	}
	
	public int getSize(){
		return size;
	}
	
	public int getDirection(){
		return direction;
	}
	
	public void setDirection(int direction){
		this.direction = direction%360;
	}
	
	public double speed(){
		return speed;
	}

	public void move(double factor, Level level) {
		double distance = speed * factor;
		double radDir = direction*Math.PI/180;
		double movementVectorX = 0.0;
		double movementVectorY = 0.0;
		while(distance>0.05/speed){			
			movementVectorX = 0.05/speed*Math.cos(radDir);
			movementVectorY = 0.05/speed*Math.sin(radDir);
			body.moveBy(movementVectorX, movementVectorY);
			level.checkForCollision(this);
			distance-=0.05/speed;
		}
			
	}

	public Body getBody() {
		return body;
	}

	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double newSpeed){
		System.out.println("oldspeed "+speed);
		speed = Math.max(Math.min(newSpeed, upperSpeedLimit), lowerSpeedLimit);
		System.out.println("newSPeed "+speed);
		
	}
}
