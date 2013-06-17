package renderer;

import org.lwjgl.opengl.GL11;

import ballandpaddle.base.Paddle;

public class PaddleRectangleRenderer  extends PaddleRenderer {

	private double paddleSize = 0.5;
	
	public PaddleRectangleRenderer(Paddle paddle, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		super(paddle, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY);
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderGL() {
		double topLeftX = offsetX+paddle.getX()*scale*downscaleWidthRatio;
		double topLeftY = offsetY+paddle.getY()*scale*downscaleHeightRatio;
		double bottomRightX = topLeftX+scale*downscaleWidthRatio*paddle.getSize()*paddleSize;
		double bottomRightY = topLeftY+scale*downscaleHeightRatio*0.2*paddleSize;
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