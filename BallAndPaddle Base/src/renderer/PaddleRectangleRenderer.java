package renderer;

import org.lwjgl.opengl.GL11;

import ballandpaddle.base.Paddle;
import ballandpaddle.base.collision.*;

public class PaddleRectangleRenderer  extends PaddleRenderer {
	
	public PaddleRectangleRenderer(Paddle paddle, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		super(paddle, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY);
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
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