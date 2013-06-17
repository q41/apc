package renderer;

import org.lwjgl.opengl.GL11;

import ballandpaddle.base.Paddle;

public class PaddleTriangleRenderer extends PaddleRenderer {

	private double paddleSize = 0.5;
	
	public PaddleTriangleRenderer(Paddle paddle, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		super(paddle, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY);
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderGL() {
		double topX = offsetX+paddle.getX()*scale*downscaleWidthRatio;
		double topY = offsetY+paddle.getY()*scale*downscaleHeightRatio;		
		double bottomLeftX = topX-0.5*(scale*downscaleWidthRatio*paddle.getSize()*paddleSize);
		double bottomRightX = topX+0.5*(scale*downscaleWidthRatio*paddle.getSize()*paddleSize);
		double bottomY = topY+scale*downscaleHeightRatio*paddle.getSize()*paddleSize;
		
		GL11.glColor3f(0.5f, 0.5f, 0.5f);
		GL11.glPushMatrix();
			GL11.glBegin(GL11.GL_TRIANGLES);
				GL11.glVertex2d(topX, topY);
				GL11.glVertex2d(bottomRightX, bottomY);
				GL11.glVertex2d(bottomLeftX, bottomY);
			GL11.glEnd();
		GL11.glPopMatrix();
	}

}
