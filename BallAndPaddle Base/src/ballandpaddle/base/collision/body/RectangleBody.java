package ballandpaddle.base.collision.body;

public class RectangleBody implements Body {

	private Point topLeft;
	private Point bottomRight;
	private RectangleBody previousState;
	
	public RectangleBody(Point topLeft, Point bottomRight){
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
		previousState = new RectangleBody(new Point(topLeft.getX(), topLeft.getY()), new Point(bottomRight.getX(), bottomRight.getY()));
		topLeft.moveBy(x, y);
		bottomRight.moveBy(x, y);		
	}

	
	public boolean intersects(int direction, Body other) {
		if(other instanceof Border)
			return intersects((Border)other);
		return false;
	}
	
	public boolean intersects(Border border){
		if(border.getStart().getX()==border.getEnd().getX())
			return (border.getStart().getX()>topLeft.getX() && border.getEnd().getX()<bottomRight.getX()) ||
					(border.getEnd().getX()>topLeft.getX() && border.getStart().getX()<bottomRight.getX());
		else if(border.getStart().getY()==border.getEnd().getY())
			return (border.getStart().getY()>topLeft.getY() && border.getEnd().getY()<bottomRight.getY()) ||
					(border.getEnd().getY()>topLeft.getY() && border.getStart().getY()<bottomRight.getY());
		else
			return false;		
	}

	@Override
	public void undoMove() {
		topLeft = previousState.getTopLeft();
		bottomRight = previousState.getBottomRight();		
	}

	@Override
	public int getNewDirection(int direction, Body body) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
