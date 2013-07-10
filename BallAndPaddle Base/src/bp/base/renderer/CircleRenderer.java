package bp.base.renderer;

import org.lwjgl.opengl.GL11;

import bp.base.BAPObject;
import bp.base.Ball;
import bp.base.collision.body.CircleBody;

public class CircleRenderer extends Renderer {

	private double radius;
	private double x;
	private double y;
	private double scale;
	private double downscaleHeightRatio;
	private double downscaleWidthRatio;
	private double offsetX;
	private double offsetY;
	
	public CircleRenderer(BAPObject object, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		super(scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY);
		if(object instanceof Ball){
			radius = ((CircleBody)object.getBody()).getR();
			x = ((CircleBody)object.getBody()).getCenter().getX();
			y = ((CircleBody)object.getBody()).getCenter().getY();
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
		drawCircle(cx, cy, r, 10);
		GL11.glPopMatrix();
	}
	
	private void drawCircle(float cx, float cy, float r, int num_segments){ 
		float theta = (float) (2 * 3.1415926 / num_segments); 
		float tangetial_factor = (float) Math.tan(theta);//calculate the tangential factor 
		float radial_factor = (float) Math.cos(theta);//calculate the radial factor 		
		float x = r;//we start at angle = 0 
		float y = 0; 	    
		GL11.glBegin(GL11.GL_TRIANGLE_FAN); 
		for(int ii = 0; ii < num_segments; ii++) { 
			GL11.glVertex2f(x + cx, y + cy);//output vertex 	        
			//calculate the tangential vector 
			//remember, the radial vector is (x, y) 
			//to get the tangential vector we flip those coordinates and negate one of them 
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
