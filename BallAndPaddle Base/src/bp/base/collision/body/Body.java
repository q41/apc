package bp.base.collision.body;

public interface Body {

	/**
	 * Moves the body by x on the X axis and y on the Y axis
	 * @param x The distance to be moved on the X axis
	 * @param y The distance to be moved on the Y axis
	 */
	void moveBy(double x, double y);

	/**
	 * Undo the last move, returning the object to it's previous position
	 */
	void undoMove();

}
