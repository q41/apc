package bp.base.renderer;

import org.lwjgl.opengl.GL11;

import bp.base.SpawnedPower;
import bp.base.collision.body.SquareBody;

public class PowerRenderer implements Renderer {

	private SpawnedPower power;
	private double scale;
	private double downscaleHeightRatio;
	private double downscaleWidthRatio;
	private double offsetX;
	private double offsetY;
	
	public PowerRenderer(SpawnedPower power, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		this.power = power;
		this.scale = scale;
		this.downscaleHeightRatio = downscaleHeightRatio;
		this.downscaleWidthRatio = downscaleWidthRatio;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
	}
	
	@Override
	public void renderGL() {
		SquareBody body = (SquareBody)power.getBody();
		double topLeftX = offsetX+body.getTopLeft().getX()*scale*downscaleWidthRatio;
		double topLeftY = offsetY+body.getTopLeft().getY()*scale*downscaleHeightRatio;
		double bottomRightX = offsetX+body.getBottomRight().getX()*scale*downscaleWidthRatio;
		double bottomRightY = offsetY+body.getBottomRight().getY()*scale*downscaleHeightRatio;
		//TODO, outline around each block!
		GL11.glColor3f(0.93f, 0.5f, 1.0f);
		GL11.glPushMatrix();
			GL11.glBegin(GL11.GL_QUADS);
				GL11.glVertex2d(topLeftX, topLeftY);
				GL11.glVertex2d(bottomRightX, topLeftY);
				GL11.glVertex2d(bottomRightX, bottomRightY);
				GL11.glVertex2d(topLeftX, bottomRightY);
			GL11.glEnd();
		GL11.glPopMatrix();
	}

	public SpawnedPower getPower(){
		return power;
	}
	
}
