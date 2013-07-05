package ballandpaddle.base.collision.body;

import ballandpaddle.base.Paddle;

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
		System.out.println(paddle.getSize());
		System.out.println("leftx "+topLeft.getX());
		System.out.println("rightx "+bottomRight.getX()+paddle.getSize()*0.5);
		System.out.println(topLeft.getX()-(bottomRight.getX()+paddle.getSize()*0.5));
		return bottomRight.getX()+paddle.getSize()*0.5;
	}
	
	public double getBottomRightY(){
		return bottomRight.getY();
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
