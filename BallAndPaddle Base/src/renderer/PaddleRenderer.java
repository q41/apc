package renderer;

import ballandpaddle.base.Paddle;

public abstract class PaddleRenderer implements Renderer {

	protected Paddle paddle;
	protected double scale;
	protected double downscaleHeightRatio;
	protected double downscaleWidthRatio;
	protected double offsetX;
	protected double offsetY;
	
	protected PaddleRenderer(Paddle paddle, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		this.paddle = paddle;
		this.scale = scale;
		this.downscaleHeightRatio = downscaleHeightRatio;
		this.downscaleWidthRatio = downscaleWidthRatio;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
	}	
	
}
