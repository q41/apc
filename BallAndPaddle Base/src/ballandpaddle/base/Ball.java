package ballandpaddle.base;

import ballandpaddle.base.collision.*;
import ballandpaddle.base.collision.body.Body;
import ballandpaddle.base.collision.body.CircleBody;
import ballandpaddle.base.collision.body.Point;

public class Ball extends BAPObject {

	private int size;
	private int direction; //0-360
	private double speed;
	private final double upperSpeedLimit = 10;
	private final double lowerSpeedLimit = 1;
	private int normalDamage;
	private int fireDamage;
	private int coldDamage;
	private int shockDamage;
	private boolean alive;
	private double movementVectorX;
	private double movementVectorY;
	
	public Ball(String id, int x, int y, int size, int direction, int speed){
		this(id, x, y, size);
		this.direction = direction;
		this.speed = speed;
		if(speed==0)
			this.speed= 0.001;
	}
	
	public Ball(String id, int x, int y){
		this(id, x, y, 1);
	}
	
	public Ball(String id, int x, int y, int size) {
		super(id, x, y, new CircleBody(new Point(x,y), 1*0.05));
		this.size = size;
		direction = 360-125;
		speed = 1;
		normalDamage = 1;
		fireDamage = 0;
		coldDamage = 0;
		shockDamage = 0;
		alive = true;
	}
	
	public int getSize(){
		return size;
	}
	
	public int getDirection(){
		return direction;
	}
	
	public void setDirection(int direction){
		if(direction<0)
			direction+=360;
		this.direction = direction%360;
		
		
	}
	
	public double speed(){
		return speed;
	}
	
	protected void update(){
		body.moveBy(movementVectorX, movementVectorY);
	}

	public void move(double factor, Level level) {
		speed = 5;
		double distance = speed * factor;
		double radDir = direction*Math.PI/180;
		while(distance>0.25/speed){			
			movementVectorX = 0.25/speed*Math.cos(radDir);
			movementVectorY = 0.25/speed*Math.sin(radDir);
			update();
			level.checkForCollision(this);
			distance-=0.25/speed;
		}
		movementVectorX = distance/speed*Math.cos(radDir);
		movementVectorY = distance/speed*Math.sin(radDir);
		update();
		level.checkForCollision(this);
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
	
	public void setDestroyed(boolean destroyed){
		alive = !destroyed;
	}
}
