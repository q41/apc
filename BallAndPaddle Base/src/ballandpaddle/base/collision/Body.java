package ballandpaddle.base.collision;

public interface Body {

	void moveBy(double x, double y);

	boolean intersects(Body right);

	void undoMove();

	int getNewDirection(int direction, Body body);

}
