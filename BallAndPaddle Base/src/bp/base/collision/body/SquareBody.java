package bp.base.collision.body;

public class SquareBody implements Body {

	private Point topLeft;
	private Point bottomRight;
	private SquareBody previousState;
	
	public SquareBody(Point topLeft, Point bottomRight){
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
		previousState = this;
	}
	
	public Point getTopLeft(){
		return topLeft;
	}
	
	public Point getBottomRight(){
		return bottomRight;
	}

	public void moveBy(double x, double y) {
		previousState = new SquareBody(new Point(topLeft.getX(), topLeft.getY()), new Point(bottomRight.getX(), bottomRight.getY()));
		topLeft.moveBy(x, y);
		bottomRight.moveBy(x, y);		
	}

	@Override
	public void undoMove() {
		topLeft = previousState.getTopLeft();
		bottomRight = previousState.getBottomRight();		
	}
}
