package bp.base.collision.body;

import bp.base.*;

public class RectangleBody extends MovableBody {
	
	/**
	 * Creates a new RectangleBody, containing the given object
	 * @param object The object contained in the body
	 */
	public RectangleBody(BAPObject object){
		super(object);
	}
	
	/**
	 * Returns the top left corner point of this rectangle body
	 * @return the top left corner point
	 */
	public Point getTopLeft(){
		return new Point(object.getX(), object.getY());
	}
	
	/**
	 * Returns the bottom right corner point of this rectangle body
	 * @return the bottom right corner point
	 */
	public Point getBottomRight(){
		if(object instanceof Paddle)		
			return new Point(object.getX()+0.4+object.getSize()*0.1, object.getY()+0.26);
		else
			return new Point(object.getX()+object.getSize(), object.getY()+object.getSize());
	}
	
}
