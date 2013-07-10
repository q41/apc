package bp.base.collision.body;

import bp.base.Paddle;

public class RectangleBody implements Body {
	
	private double previousX;
	private double previousY;
	private Paddle paddle;
	
	public RectangleBody(Paddle paddle){
		this.paddle = paddle;
		previousX = paddle.getX();
		previousY = paddle.getY();
	}
	
	public Point getTopLeft(){
		return new Point(paddle.getX(), paddle.getY());
	}
	
	public Point getBottomRight(){
		return new Point(paddle.getX()+0.4+paddle.getSize()*0.1, paddle.getY()+0.26);
	}

	public void moveBy(double x, double y) {
		previousX = paddle.getX();
		previousY = paddle.getY();
		paddle.incX(x);
		paddle.incY(y);	
	}

	@Override
	public void undoMove() {
		paddle.setY(previousY);
		paddle.setX(previousX);
	}
	
}
