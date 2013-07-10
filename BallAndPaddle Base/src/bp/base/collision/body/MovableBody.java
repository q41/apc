package bp.base.collision.body;

import bp.base.BAPObject;

public abstract class MovableBody implements Body {

	/**
	 * The x location before the last move
	 */
	protected double previousX;
	/**
	 * The y location before the last move
	 */
	protected double previousY;
	/**
	 * The object that this body contains
	 */
	protected BAPObject object;
	
	/**
	 * Creates a new MovableBody with the given BAPObject
	 * @param object The BAPObject that this body contains
	 */
	public MovableBody(BAPObject object){
		this.object=object;
		previousX = object.getX();
		previousY = object.getY();
	}
	
	/**
	 * Moves the body by x on the X axis and y on the Y axis
	 * @param x The distance to be moved on the X axis
	 * @param y The distance to be moved on the Y axis
	 */
	public void moveBy(double x, double y){
		previousX = x;
		previousY = y;
		object.incX(x);
		object.incY(y);
	}

	/**
	 * Undo the last move, returning the object to it's previous position
	 */
	public void undoMove() {
		object.setX(previousX);
		object.setY(previousY);
	}
	
}
