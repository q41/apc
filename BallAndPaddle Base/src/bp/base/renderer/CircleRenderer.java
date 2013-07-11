package bp.base.renderer;

import org.lwjgl.opengl.GL11;

import bp.base.*;
import bp.base.collision.body.CircleBody;

public class CircleRenderer extends Renderer {

	/**
	 * The radius of the circle
	 */
	private double radius;
	/**
	 * The x coordinate of the center
	 */
	private double x;
	/**
	 * The y coordinate of the center
	 */
	private double y;
	
	/**
	 * Creates a new CircleRenderer, setting the coordinates
	 * and setting the colors
	 * @param object The object to represent
	 * @param scale The scaling
	 * @param downscaleHeightRatio The height downscaling
	 * @param downscaleWidthRatio The width downscaling
	 * @param offsetX The offset from the border
	 * @param offsetY The offset from the border
	 */
	public CircleRenderer(BAPObject object, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		super(scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY);
		if(object instanceof Ball){
			radius = ((CircleBody)object.getBody()).getR();
			x = ((CircleBody)object.getBody()).getCenter().getPointX();
			y = ((CircleBody)object.getBody()).getCenter().getPointY();
			red = 0.0f;
			green = 0.0f;
			blue = 0.0f;
		}

	}

	@Override
	public void renderGL() {
		float r = (float) ((scale*downscaleHeightRatio+scale*downscaleWidthRatio)/2*radius);
		float cx = (float) (offsetX+x*scale*downscaleWidthRatio);
		float cy = (float) (offsetY+y*scale*downscaleHeightRatio);
		GL11.glColor3f(0.0f, 0.0f, 0.0f);
		GL11.glPushMatrix();
		drawCircle(cx, cy, r, 25);
		GL11.glPopMatrix();
	}
	
	/**
	 * Draws a circle given the coordinates, radius and number of segments
	 * @param cx the x coordinate for the center
	 * @param cy the y coordinate for the center
	 * @param radius The radius of the circle
	 * @param num_segments The amount of segments the circle should be build from
	 */
	private void drawCircle(float cx, float cy, float radius, int num_segments){ 
		float theta = (float) (2 * 3.1415926 / num_segments); 
		float tangetial_factor = (float) Math.tan(theta);//calculate the tangential factor 
		float radial_factor = (float) Math.cos(theta);//calculate the radial factor 		
		float x = radius;//we start at angle = 0 
		float y = 0; 	    
		GL11.glBegin(GL11.GL_TRIANGLE_FAN); 
		for(int i = 0; i < num_segments; i++) { 
			GL11.glVertex2f(x + cx, y + cy);//output vertex 	        
			//calculate the tangential vector 
			//the radial vector is (x, y) 
			//to get the tangential vector, flip those coordinates and negate one of them 
			float tx = -y; 
			float ty = x; 	        
			//add the tangential vector 
			x += tx * tangetial_factor; 
			y += ty * tangetial_factor; 
	        //correct using the radial factor 
			x *= radial_factor; 
			y *= radial_factor; 
		} 
		GL11.glEnd(); 
	}
}
