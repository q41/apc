package renderer;

import org.lwjgl.opengl.GL11;

import ballandpaddle.base.Ball;

public class BallRenderer implements Renderer {

	private Ball ball;
	private double scale;
	private double downscaleHeightRatio;
	private double downscaleWidthRatio;
	private double offsetX;
	private double offsetY;
	private double ballSize = 0.05;
	
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
		float r = (float) ((scale*downscaleHeightRatio+scale*downscaleWidthRatio)/2*ball.getSize()*ballSize);
		float cx = (float) (offsetX+ball.getX()*scale*downscaleWidthRatio);
		float cy = (float) (offsetY+ball.getY()*scale*downscaleHeightRatio);
		GL11.glColor3f(0.0f, 0.0f, 0.0f);
		GL11.glPushMatrix();
		CircleRenderer.DrawCircle(cx, cy, r, 10);
		GL11.glPopMatrix();
	}
}
