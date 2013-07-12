package bp.base.collision.body;

import bp.base.*;

public class RectangleBody extends MovableBody {
	
	/**
	 * Creates a new RectangleBody, containing the given object
	 * @param object The object contained in the body
	 */
	public RectangleBody(BPObject object){
		super(object);
	}
	
	/**
	 * Returns the top left corner point of this rectangle body
	 * @return the top left corner point
	 */
	public Point getTopLeft(){
		return new Point(getX(), getY());
	}
	
	/**
	 * Returns the bottom right corner point of this rectangle body
	 * @return the bottom right corner point
	 */
	public Point getBottomRight(){
		if(object instanceof Paddle)		
			return new Point(getX()+0.4+((Paddle)object).getSize()*0.1, getY()+0.26);
		else if(object instanceof Block)
			return new Point(((Block)object).getX()+((Block)object).getSize()/10, ((Block)object).getY()+((Block)object).getSize()/10);
		else
			return new Point(((SpawnedPower)object).getX()+((SpawnedPower)object).getSize(), ((SpawnedPower)object).getY()+((SpawnedPower)object).getSize());
	}
	
}
