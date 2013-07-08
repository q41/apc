package ballandpaddle.base;

import ballandpaddle.base.collision.*;
import ballandpaddle.base.collision.body.Body;
import ballandpaddle.base.collision.body.CircleBody;
import ballandpaddle.base.collision.body.Point;

public class Ball extends BAPObject {

	private double size;
	private int direction; //0-360
	private double speed;
	private final double upperSpeedLimit = 10;
	private final double lowerSpeedLimit = 1;
	private final double upperSizeLimit = 10;
	private final double lowerSizeLimit = 1;
	private int damage;
	private boolean alive;
	private double movementVectorX;
	private double movementVectorY;
	private final double increment = 0.250;
	
	public Ball(String id, double x, double y, double size, int direction, int speed){
		this(id, x, y, size);
		this.direction = direction;
		if(this.direction>=0 && this.direction<=180)
			this.direction=270;
		this.speed = speed;
		if(speed<lowerSpeedLimit)
			this.speed = lowerSpeedLimit;
		else if(speed>upperSpeedLimit)
			this.speed = upperSpeedLimit;
		if(damage==0)
			damage = 1;
	}
	
	public Ball(String id, double x, double y){
		this(id, x, y, 1);
	}
	
	public Ball(String id, double x, double y, double size) {
		super(id, x, y, null);
		super.setBody(new CircleBody(new Point(x,y), this));
		this.size = size;
		if(size>upperSizeLimit)
			this.size = upperSizeLimit;		
		if(size<lowerSizeLimit)
			this.size = lowerSizeLimit;	
		direction = 360-125;
		alive = true;
	}
	
	public double getSize(){
		return size;
	}
	
	public void setSize(int size){
		this.size = Math.max(lowerSizeLimit, Math.min(upperSizeLimit, size));
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
	
	public void multSpeed(double mult){
		speed = Math.max(Math.min(speed*mult, upperSpeedLimit), lowerSpeedLimit);
	}
	
	@Override
	public final void update(){
		body.moveBy(movementVectorX, movementVectorY);
		multSpeed(1.025);
	}

	public void calculateMove(double factor, Level level) {
		double distance = Math.pow(getSpeed(), 0.65) * factor;
		double radDir = getDirection()*Math.PI/180;
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
		double distance = Math.pow(getSpeed(), 0.65)*factor;
		return (int) Math.ceil((distance/increment));		
	}
	
	public void setSpeed(double newSpeed){
		speed = Math.max(Math.min(newSpeed, upperSpeedLimit), lowerSpeedLimit);		
	}
	
	public int getNormalDamage(){
		return damage;
	}
	
	public void setDestroyed(boolean destroyed){
		alive = !destroyed;
	}
	
	public boolean isDestroyed(){
		return !alive;
	}

	public void threeSixtyDirection() {
		setDirection(360-direction);		
	}
	
	public void OneEightyDirection() {
		setDirection(180-direction);		
	}
}
