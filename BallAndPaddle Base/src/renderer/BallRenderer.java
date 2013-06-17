package renderer;

import ballandpaddle.base.Ball;

public class BallRenderer implements Renderer {

	private Ball ball;
	private double scale;
	private double downscaleHeightRatio;
	private double downscaleWidthRatio;
	private double offsetX;
	private double offsetY;
	
	public BallRenderer(Ball ball, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		this.ball = ball;
		this.scale = scale;
		this.downscaleHeightRatio = downscaleHeightRatio;
		this.downscaleWidthRatio = downscaleWidthRatio;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
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
