package ballandpaddle.base.collision.body;

import ballandpaddle.base.Ball;

public class CircleBody implements Body {

	private Point center;
	private CircleBody previousState;
	private Ball ball;
	
	public CircleBody(Point center, Ball ball){
		this.center = center;
		this.ball = ball;
		previousState = this;
	}
	
	public Point getCenter(){
		return center;
	}
	
	public double getR(){
		return 0.04+ball.getSize()*0.01;
	}

	@Override
	public void moveBy(double x, double y) {
		previousState = new CircleBody(new Point(center.getX(), center.getY()), ball);
		center.moveBy(x,y);		
	}
	
	@Override
	public void undoMove() {
		center = previousState.getCenter();	
	}	
}
