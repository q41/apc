package renderer;

import org.lwjgl.opengl.GL11;

import ballandpaddle.base.Paddle;
import ballandpaddle.base.collision.*;

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
		double topX = offsetX+((TriangleBody)paddle.getBody()).getTop().getX()*scale*downscaleWidthRatio;
		double topY = offsetY+((TriangleBody)paddle.getBody()).getTop().getY()*scale*downscaleHeightRatio;			
		double bottomLeftX = offsetX+((TriangleBody)paddle.getBody()).getLeft().getX()*scale*downscaleWidthRatio;
		double bottomLeftY = offsetY+((TriangleBody)paddle.getBody()).getLeft().getY()*scale*downscaleWidthRatio;
		double bottomRightX = offsetX+((TriangleBody)paddle.getBody()).getRight().getX()*scale*downscaleWidthRatio;
		double bottomRightY = offsetY+((TriangleBody)paddle.getBody()).getRight().getY()*scale*downscaleWidthRatio;
		
		GL11.glColor3f(0.5f, 0.5f, 0.5f);
		GL11.glPushMatrix();
			GL11.glBegin(GL11.GL_TRIANGLES);
				GL11.glVertex2d(topX, topY);
				GL11.glVertex2d(bottomRightX, bottomRightY);
				GL11.glVertex2d(bottomLeftX, bottomLeftY);
			GL11.glEnd();
		GL11.glPopMatrix();
	}

}
