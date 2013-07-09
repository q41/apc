package bp.base.renderer;

import org.lwjgl.opengl.GL11;

import bp.base.Ball;
import bp.base.collision.body.CircleBody;

public class BallRenderer implements Renderer {

	private Ball ball;
	private double scale;
	private double downscaleHeightRatio;
	private double downscaleWidthRatio;
	private double offsetX;
	private double offsetY;
	
	public BallRenderer(Ball ball, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		this.ball = ball;
		this.scale = scale;
		this.downscaleHeightRatio = downscaleHeightRatio;
		this.downscaleWidthRatio = downscaleWidthRatio;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
	}

	@Override
	public void renderGL() {
		float r = (float) ((scale*downscaleHeightRatio+scale*downscaleWidthRatio)/2*((CircleBody)ball.getBody()).getR());
		float cx = (float) (offsetX+((CircleBody)ball.getBody()).getCenter().getX()*scale*downscaleWidthRatio);
		float cy = (float) (offsetY+((CircleBody)ball.getBody()).getCenter().getY()*scale*downscaleHeightRatio);
		GL11.glColor3f(0.0f, 0.0f, 0.0f);
		GL11.glPushMatrix();
		CircleRenderer.DrawCircle(cx, cy, r, 10);
		GL11.glPopMatrix();
	}
	
	public Ball getBall(){
		return ball;
	}
}