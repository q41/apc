package renderer;

import org.lwjgl.opengl.GL11;

import ballandpaddle.base.Paddle;
import ballandpaddle.base.collision.*;;

public class PaddleCircleRenderer extends PaddleRenderer {
	
	public PaddleCircleRenderer(Paddle paddle, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		super(paddle, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY);
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderGL() {
		float r = (float) ((scale*downscaleHeightRatio+scale*downscaleWidthRatio)/2*((CircleBody)paddle.getBody()).getR());
		float cx = (float) (offsetX+((CircleBody)paddle.getBody()).getCenter().getX()*scale*downscaleWidthRatio);
		float cy = (float) (offsetY+((CircleBody)paddle.getBody()).getCenter().getY()*scale*downscaleHeightRatio);
		GL11.glColor3f(0.5f, 0.5f, 0.5f);
		GL11.glPushMatrix();
		CircleRenderer.DrawCircle(cx, cy, r, 10);
		GL11.glPopMatrix();
	}

}