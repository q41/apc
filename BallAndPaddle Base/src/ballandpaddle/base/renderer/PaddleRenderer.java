package ballandpaddle.base.renderer;

import org.lwjgl.opengl.GL11;

import ballandpaddle.base.Paddle;
import ballandpaddle.base.collision.body.RectangleBody;

public class PaddleRenderer implements Renderer {

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
	
	@Override
	public void renderGL() {
		double topLeftX = offsetX+((RectangleBody)paddle.getBody()).getTopLeft().getX()*scale*downscaleWidthRatio;
		double topLeftY = offsetY+((RectangleBody)paddle.getBody()).getTopLeft().getY()*scale*downscaleHeightRatio;
		double bottomRightX = offsetX+((RectangleBody)paddle.getBody()).getBottomRight().getX()*scale*downscaleWidthRatio;
		double bottomRightY = offsetY+((RectangleBody)paddle.getBody()).getBottomRight().getY()*scale*downscaleHeightRatio;
		GL11.glColor3f(0.5f, 0.5f, 0.5f);
		GL11.glPushMatrix();
			GL11.glBegin(GL11.GL_QUADS);
				GL11.glVertex2d(topLeftX, topLeftY);
				GL11.glVertex2d(bottomRightX, topLeftY);
				GL11.glVertex2d(bottomRightX, bottomRightY);
				GL11.glVertex2d(topLeftX, bottomRightY);
			GL11.glEnd();
		GL11.glPopMatrix();		
	}
	
}
