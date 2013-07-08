package bp.base.collision.body;

import bp.base.Paddle;

public class RectangleBody implements Body {

	private Point topLeft;
	private Point bottomRight;
	private RectangleBody previousState;
	private Paddle paddle;
	
	public RectangleBody(Point topLeft, Point bottomRight, Paddle paddle){
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
		this.paddle = paddle;
		previousState = this;
	}
	
	public Point getTopLeft(){
		return topLeft;
	}
	
	public Point getBottomRight(){
		return bottomRight;
	}
	
	public double getBottomRightX(){
		return bottomRight.getX()+0.4+paddle.getSize()*0.1;
	}
	
	public double getBottomRightY(){
		return bottomRight.getY();
	}
	
	public double getTopLeftX(){
		return topLeft.getX();
	}
	
	public double getTopLeftY(){
		return topLeft.getY();
	}

	public void moveBy(double x, double y) {
		previousState = new RectangleBody(new Point(topLeft.getX(), topLeft.getY()), new Point(bottomRight.getX(), bottomRight.getY()), paddle);
		topLeft.moveBy(x, y);
		bottomRight.moveBy(x, y);		
	}

	@Override
	public void undoMove() {
		topLeft = previousState.getTopLeft();
		bottomRight = previousState.getBottomRight();		
	}
	
}
