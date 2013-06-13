package renderer;

import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;

public class Game {

	private long lastFrame;
	private long lastFPS;
	private int fps;
	
	public void start() {
	    lastFPS = getTime();
	}
	
	/**
	 * Calculate the FPS and set it in the title bar
	 */
	public void updateFPS() {
	    if (getTime() - lastFPS > 1000) {
	        Display.setTitle("FPS: " + fps);
		fps = 0;
		lastFPS += 1000;
	    }
	    fps++;
	}
	
	
	public long getTime() {
	    return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}
	
	public int getDelta() {
	    long time = getTime();
	    int delta = (int) (time - lastFrame);
	    lastFrame = time;	 
	    return delta;
	}
	
	
	
	
	
	
}
