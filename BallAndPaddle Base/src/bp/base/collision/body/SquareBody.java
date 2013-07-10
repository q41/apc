package bp.base.collision.body;

import bp.base.BAPObject;

public class SquareBody implements Body {

	private BAPObject object;
	private double previousX;
	private double previousY;
	
	public SquareBody(BAPObject object){
		previousX = object.getX();
		previousY = object.getY();
		this.object = object;
	}
	
	public Point getTopLeft(){
		return new Point(object.getX(), object.getY());
	}
	
	public Point getBottomRight(){
		return new Point(object.getX()+object.getSize(), object.getY()+object.getSize());
	}

	public void moveBy(double x, double y) {
		previousX = object.getX();
		previousY = object.getY();
		object.incX(x);
		object.incY(y);
	}

	@Override
	public void undoMove() {
		object.setX(previousX);
		object.setY(previousY);
	}
}
