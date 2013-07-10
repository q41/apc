package bp.base.renderer;

import org.lwjgl.opengl.GL11;

import bp.base.*;
import bp.base.collision.body.*;

public class RectangleRenderer extends Renderer {
	
	private double topX;
	private double bottomX;
	private double leftY;
	private double rightY;
	private String text;
	
	public RectangleRenderer(BAPObject object, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		super(scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY);
		if(object instanceof Block ){
			square(object);
			red = 0.5f;
			green = 0.5f;
			blue = 1.0f;
		}
		else if(object instanceof Paddle){
			rectangle(object);
			red = 0.5f;
			green = 0.5f;
			blue = 0.5f;
		}
		else if(object instanceof SpawnedPower){
			square(object);
			red = 0.93f;
			green = 0.5f;
			blue = 1.0f;
		}
		text = object.getId();
	}
	
	private void square(BAPObject object){
		SquareBody body = (SquareBody)object.getBody();
		topX = body.getTopLeft().getX();
		bottomX = body.getBottomRight().getX();
		leftY = body.getTopLeft().getY();
		rightY = body.getBottomRight().getY();
	}
	
	private void rectangle(BAPObject object){
		RectangleBody body = (RectangleBody)object.getBody();
		topX = body.getTopLeft().getX();
		bottomX = body.getBottomRight().getX();
		leftY = body.getTopLeft().getY();
		rightY = body.getBottomRight().getY();
	}

	@Override
	public void renderGL() {
		double topLeftX = offsetX+topX*scale*downscaleWidthRatio;
		double topLeftY = offsetY+leftY*scale*downscaleHeightRatio;
		double bottomRightX = offsetX+bottomX*scale*downscaleWidthRatio;
		double bottomRightY = offsetY+rightY*scale*downscaleHeightRatio;
		//TODO, outline around each block!
		GL11.glColor3f(red, green, blue);
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
