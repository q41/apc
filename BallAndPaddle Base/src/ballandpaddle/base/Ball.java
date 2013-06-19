package ballandpaddle.base;

import ballandpaddle.base.collision.*;

public class Ball extends BAPObject {

	private int size;
	private int direction; //0-360
	private double speed;
	private final double upperSpeedLimit = 10;
	private final double lowerSpeedLimit = 1;
	private CircleBody body;
	private int normalDamage;
	private int fireDamage;
	private int coldDamage;
	private int shockDamage;
	
	public Ball(String id, int x, int y, int size, int direction, int speed){
		this(id, x, y);
		this.size = size;
		this.direction = direction;
		this.speed = speed;
		if(speed==0)
			this.speed= 0.001;
	}
	
	public Ball(String id, int x, int y) {
		super(id, x, y);
		this.size = 1;
		direction = 360-135;
		speed = 1;
		body = new CircleBody(new Point(x,y), size*0.05);
		normalDamage = 1;
		fireDamage = 0;
		coldDamage = 0;
		shockDamage = 0;
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
		while(distance>0.25/speed){			
			movementVectorX = 0.25/speed*Math.cos(radDir);
			movementVectorY = 0.25/speed*Math.sin(radDir);
			body.moveBy(movementVectorX, movementVectorY);
			level.checkForCollision(this);
			distance-=0.25/speed;
		}
		movementVectorX = distance/speed*Math.cos(radDir);
		movementVectorY = distance/speed*Math.sin(radDir);
		body.moveBy(movementVectorX, movementVectorY);
		level.checkForCollision(this);
			
	}

	public Body getBody() {
		return body;
	}

	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double newSpeed){
		speed = Math.max(Math.min(newSpeed, upperSpeedLimit), lowerSpeedLimit);		
	}
	
	public int getNormalDamage(){
		return normalDamage;
	}
	
	public int getFireDamage(){
		return fireDamage;
	}
	
	public int getColdDamage(){
		return coldDamage;
	}
	
	public int getShockDamage(){
		return shockDamage;
	}
}
