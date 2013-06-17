package renderer;

import ballandpaddle.base.Paddle;

public abstract class PaddleRenderer implements Renderer {

	protected Paddle paddle;
	private double scale;
	private double downscaleHeightRatio;
	private double downscaleWidthRatio;
	private double offsetX;
	private double offsetY;
	
	protected PaddleRenderer(Paddle paddle, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		this.paddle = paddle;
		this.scale = scale;
		this.downscaleHeightRatio = downscaleHeightRatio;
		this.downscaleWidthRatio = downscaleWidthRatio;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
	}
	
	protected Paddle getPaddle(){
		return paddle;
	}
	
	protected double getdownscaleHeightRatio(){
		return downscaleHeightRatio;
	}
	
	protected double getdownscaleWidthRatio(){
		return downscaleWidthRatio;
	}
	
	protected double getScale(){
		return scale;
	}
	
	protected double getOffsetX(){
		return offsetX;
	}
	
	protected double getOffsetY(){
		return offsetY;
	}
	
	
}
