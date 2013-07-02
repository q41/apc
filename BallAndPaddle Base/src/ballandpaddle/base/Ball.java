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
	private final double increment = 0.25;
	
	public Ball(String id, double d, double e, int size, int direction, int speed){
		this(id, d, e, size);
		this.direction = direction;
		if(this.direction>=0 && this.direction<=180)
			this.direction=270;
		this.speed = speed;
		if(speed<1)
			this.speed = 1;
		else if(speed>2)
			this.speed = 2;
	}
	
	public Ball(String id, double x, double y){
		this(id, x, y, 1);
	}
	
	public Ball(String id, double x, double y, int size) {
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
	
	@Override
	public final void update(){
		body.moveBy(movementVectorX, movementVectorY);
	}

	public void calculateMove(double factor, Level level) {
		double distance = speed * factor;
		double radDir = direction*Math.PI/180;
		if(distance>=increment){			
			movementVectorX = increment*Math.cos(radDir);
			movementVectorY = increment*Math.sin(radDir);
		}
		else{
			movementVectorX = distance*Math.cos(radDir);
			movementVectorY = distance*Math.sin(radDir);
		}
	}

	public double getSpeed() {
		return speed;
	}
	
	public int getNeededSteps(double factor){
		double distance = speed*factor;
		return (int) Math.ceil((distance/increment));		
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
	
	public boolean isDestroyed(){
		return !alive;
	}
}
