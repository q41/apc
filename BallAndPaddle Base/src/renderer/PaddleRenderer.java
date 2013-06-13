package renderer;

import ballandpaddle.base.Paddle;

public abstract class PaddleRenderer implements Renderer {

	protected Paddle paddle;
	protected double scaleHeight;
	protected double scaleWidth;
	
	protected PaddleRenderer(Paddle paddle, double scaleHeight, double scaleWidth) {
		this.paddle = paddle;
		this.scaleHeight = scaleHeight;
		this.scaleWidth = scaleWidth;
	}
	
	protected Paddle getPaddle(){
		return paddle;
	}
	
	protected double getScaleHeight(){
		return scaleHeight;
	}
	
	protected double getScaleWidth(){
		return scaleWidth;
	}
}
