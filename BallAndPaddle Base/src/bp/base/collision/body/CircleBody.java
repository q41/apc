package bp.base.collision.body;

import bp.base.BAPObject;

public class CircleBody extends MovableBody {
	
	/**
	 * Creates a new CircleBody with the given object
	 * @param object The BAPObject contained in this body
	 */
	public CircleBody(BAPObject object){
		super(object);
	}
	
	/**
	 * Returns the center location of this body
	 * @return The point at the center of this body
	 */
	public Point getCenter(){
		return new Point(object.getX(), object.getY());
	}
	
	/**
	 * Returns the radius of this circle body
	 * @return the radius
	 */
	public double getR(){
		return 0.04+object.getSize()*0.01;
	}

}
