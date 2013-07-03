package ballandpaddle.base;

import ballandpaddle.base.collision.body.Point;
import ballandpaddle.base.collision.body.SquareBody;

public class SpawnedPower extends BAPObject {

	private final int direction = 90;
	private double movementVectorY;
	private final double increment = 0.25;
	private final double speed = 0.02;
	private boolean alive;
	private boolean caught;

	public SpawnedPower(Power power, double x, double y){
		super(power.getId(), x, y, new SquareBody(new Point(x,y), new Point(x+0.15, y+0.15)));
		alive = true;
		caught = false;
	}

	public void calculateMove(double factor, Level level){
		//calculate distance to travel this update
		double distance = speed*factor;
		if(distance>=increment)
			movementVectorY = increment*direction;			
		else
			movementVectorY = distance*direction;
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
		body.moveBy(0,movementVectorY);			
	}

	public void setDestroyed(boolean destroyed) {
		alive = !destroyed;		
	}

	public void setCaught(boolean caught) {
		this.caught = caught;		
	}
	
	public boolean caught(){
		return caught;
	}
	
	public boolean destroyed(){
		return !alive;
	}	
}
