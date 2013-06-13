package renderer;

import ballandpaddle.base.Ball;

public class BallRenderer implements Renderer {

	private Ball ball;
	private double scaleHeight;
	private double scaleWidth;
	
	public BallRenderer(Ball ball, double scaleHeight, double scaleWidth) {
		this.ball = ball;
		this.scaleHeight = scaleHeight;
		this.scaleWidth = scaleWidth;
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderGL() {
		// TODO Auto-generated method stub		
	}
}
