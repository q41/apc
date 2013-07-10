package bp.base.collision.body;

import bp.base.BAPObject;
import bp.base.Ball;

public class CircleBody implements Body {
	
	private double previousX;
	private double previousY;
	private Ball ball;
	
	public CircleBody(Ball ball){
		this.ball = ball;
	}
	
	public Point getCenter(){
		return new Point(ball.getX(), ball.getY());
	}
	
	public double getR(){
		return 0.04+ball.getSize()*0.01;
	}

	@Override
	public void moveBy(double x, double y) {
		previousX = ball.getX();
		previousY = ball.getY();
		ball.incX(x);
		ball.incY(y);	
	}
	
	@Override
	public void undoMove() {
		ball.setX(previousX);
		ball.setY(previousY);
	}
}
