package ballandpaddle.base.renderer;

import org.lwjgl.opengl.GL11;

public class CircleRenderer {

	public static void DrawCircle(float cx, float cy, float r, int num_segments) 
	{ 
		float theta = (float) (2 * 3.1415926 / num_segments); 
		float tangetial_factor = (float) Math.tan(theta);//calculate the tangential factor 

		float radial_factor = (float) Math.cos(theta);//calculate the radial factor 
		
		float x = r;//we start at angle = 0 

		float y = 0; 
	    
		GL11.glBegin(GL11.GL_TRIANGLE_FAN); 
		for(int ii = 0; ii < num_segments; ii++) 
		{ 
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
