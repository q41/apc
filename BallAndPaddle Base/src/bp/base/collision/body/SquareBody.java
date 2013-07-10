package bp.base.collision.body;

import bp.base.BAPObject;

public class SquareBody extends MovableBody {
	
	/**
	 * Creates a new SquareBody, containing the given object
	 * @param object The object contained in the body
	 */
	public SquareBody(BAPObject object){
		super(object);
	}
	
	/**
	 * Returns the top left corner point of this square body
	 * @return the top left corner point
	 */
	public Point getTopLeft(){
		return new Point(object.getX(), object.getY());
	}
	
	/**
	 * Returns the bottom right corner point of this square body
	 * @return the bottom right corner point
	 */
	public Point getBottomRight(){
		return new Point(object.getX()+object.getSize(), object.getY()+object.getSize());
	}

}
