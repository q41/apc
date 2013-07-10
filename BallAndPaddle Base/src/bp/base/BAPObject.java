package bp.base;

import bp.base.collision.body.Body;
import bp.base.collision.body.CircleBody;
import bp.base.collision.body.SquareBody;

public abstract class BAPObject {

	/**
	 * The id of this BAPObject
	 */
	private String id;
	/**
	 * The location of this object
	 */
	protected double x;
	/**
	 * the location of this object
	 */
	protected double y;
	/**
	 * The body of this object, used for collision detection and handling
	 */
	protected Body body;
	
	/**
	 * Creates a new BAPObject with the given id, coordinates and body
	 * @param id the id of this object
	 * @param x the x coordinate of this object
	 * @param y the y coordinate of this object
	 * @param body the body of this object
	 */
	public BAPObject(String id, double x, double y){
		this.id = id;
		this.x = x;
		this.y = y;
	}
	
	/**
	 * returns the identifier of this object
	 * @return id
	 */
	public String getId(){
		return this.id;
	}
	
	/**
	 * returns the x coordinate of this object when it was created
	 * @return x
	 */
	public double getX(){
		return x;
	}
	
	/**
	 * returns the y coordinate of this object when it was created
	 * @return y
	 */
	public double getY(){
		return y;
	}		
	
	/**
	 * returns the collision body of this object
	 * @return
	 */
	public Body getBody(){
		return body;
	}
	
	/**
	 * Sets the body of this object
	 * @param body the new body of this object
	 */
	public void setBody(Body body) {
		this.body = body;		
	}

	/**
	 * Sets x to the given value
	 * @param x The new value of x
	 */
	public void setX(double x) {
		this.x=x;		
	}
	
	/**
	 * Sets y to the given value
	 * @param y The new value of y
	 */
	public void setY(double y) {
		this.y=y;		
	}
	
	/**
	 * Increases the value of x by the given amount
	 * @param x The amount to increase x by
	 */
	public void incX(double x){
		this.x+=x;
	}
	
	/**
	 * Increases the value of y by the given amount
	 * @param y The amount to increase y by
	 */
	public void incY(double y){
		this.y+=y;
	}

	public abstract double getSize();
	
	
}
