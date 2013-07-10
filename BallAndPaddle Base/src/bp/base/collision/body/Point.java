package bp.base.collision.body;

public class Point implements Body {

	/**
	 * The x coordinate of this point
	 */
	private double x;
	/**
	 * The y coordinate of this point
	 */
	private double y;
	
	/**
	 * Creates a new point with the given x and y coordinates
	 * @param x the x coordinate for the new point
	 * @param y the y coordinate for the new point
	 */
	public Point(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	/**
	 * returns the x coordinate for this point
	 * @return the x coordinate
	 */
	public double getX(){
		return x;
	}
	
	/**
	 * returns the y coordinate for this point
	 * @return the y coordinate
	 */
	public double getY(){
		return y;
	}
		
}
