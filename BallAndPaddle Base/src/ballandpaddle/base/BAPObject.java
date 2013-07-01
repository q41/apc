package ballandpaddle.base;

import ballandpaddle.base.collision.body.Body;
import ballandpaddle.base.collision.body.SquareBody;

public abstract class BAPObject {

	private String id;
	protected double x;
	protected double y;
	protected Body body;
	
	public BAPObject(String id, double x, double y, Body body){
		this.id = id;
		this.x = x;
		this.y = y;
		this.body = body;
	}
	
	public String getId(){
		return this.id;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}		
	
	public Body getBody(){
		return body;
	}
	
}
