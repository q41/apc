package ballandpaddle.base.collision.body;

public interface Body {

	void moveBy(double x, double y);

	boolean intersects(int direction, Body other);

	void undoMove();

	int getNewDirection(int direction, Body other);

}
