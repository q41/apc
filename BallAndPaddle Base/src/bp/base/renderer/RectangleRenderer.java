package bp.base.renderer;

import org.lwjgl.opengl.GL11;

import bp.base.*;
import bp.base.collision.body.*;

public class RectangleRenderer extends Renderer {
	
	/**
	 * The top x coordinate
	 */
	private double topX;
	/**
	 * The bottom x coordinate
	 */
	private double bottomX;
	/**
	 * The left y coordinate
	 */
	private double leftY;
	/**
	 * The right y coordinate
	 */
	private double rightY;
	/**
	 * Text that should be displayed
	 * Not yet supported!
	 */
	private String text;
	
	/**
	 * Creates a new RectangleRenderer with different colors, 
	 * depending on the type of item it should represent
	 * @param object The object to represent
	 * @param scale The scaling
	 * @param downscaleHeightRatio The height downscaling
	 * @param downscaleWidthRatio The width downscaling
	 * @param offsetX The offset from the border
	 * @param offsetY The offset from the border
	 */
	public RectangleRenderer(BAPObject object, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		super(scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY);
		RectangleBody body = (RectangleBody)object.getBody();
		topX = body.getTopLeft().getPointX();
		bottomX = body.getBottomRight().getPointX();
		leftY = body.getTopLeft().getPointY();
		rightY = body.getBottomRight().getPointY();		
		if(object instanceof Block ){
			red = 0.5f;
			green = 0.5f;
			blue = 1.0f;
		}
		else if(object instanceof Paddle){
			red = 0.5f;
			green = 0.5f;
			blue = 0.5f;
		}
		else if(object instanceof SpawnedPower){
			red = 0.93f;
			green = 0.5f;
			blue = 1.0f;
		}
		text = object.id;
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
