package renderer;

import java.util.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import ballandpaddle.base.*;
import ballandpaddle.base.BAPObject.Shape;

public class Game {

	private long lastFrame;
	private long lastFPS;
	private int fps;
	private Level level;
	private int width;
	private int height;
	private List<BlockRenderer> blockRenderers;
	private List<BallRenderer> ballRenderers;
	private List<PaddleRenderer> paddleRenderers;
	
	
	public Game(Level level, int width, int height){
		this.level = level;
		this.width = width;
		this.height = height;
		//TODO. add check to make certain height and width do not exceed screen size
	}
	
	public Game(Level level){
		this.level = level;
		width = 800;
		height = 600;
	}
	
	public void start() {
		try {
		Display.setDisplayMode(new DisplayMode(width, height));
		Display.create();
		} catch (LWJGLException e) {
		e.printStackTrace();
		System.exit(0);
		}

		initGL(); // init OpenGL
		getDelta(); // call once before loop to initialise lastFrame
		lastFPS = getTime(); // call before loop to initialise fps timer
		while (!Display.isCloseRequested()) {
			int delta = getDelta();
 
			update(delta);
			renderGL();
 
			Display.update();
			Display.sync(60); // cap fps to 60fps
		}
 
		Display.destroy();
	}
	
	private void initGL() {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, width, 0, height, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		//scale, amount of pixels per "tile" in game.
		double scaleHeight = height/level.getHeight();
		double scaleWidth = width/level.getWidth(); 
		for(Block block : level.getBlocks()){
			blockRenderers.add(new BlockRenderer(block, scaleHeight, scaleWidth));
		}		
		for(Ball ball : level.getBalls()){
			ballRenderers.add(new BallRenderer(ball, scaleHeight, scaleWidth));
		}		
		for(Paddle paddle : level.getPaddles()){
			switch (paddle.getShape()) {
            case triangle: 	paddleRenderers.add(new PaddleTriangleRenderer(paddle, scaleHeight, scaleWidth));
            				break;
            case square: 	paddleRenderers.add(new PaddleSquareRenderer(paddle, scaleHeight, scaleWidth));
							break;
            case rectangle: paddleRenderers.add(new PaddleRectangleRenderer(paddle,  scaleHeight, scaleWidth));
							break;
            case circle: 	paddleRenderers.add(new PaddleCircleRenderer(paddle,  scaleHeight, scaleWidth));
							break;
			}
		}
	}

	private void update(int delta) {
		//TODO, steps in following order
		
		//Check for keyboard input for moving the paddle and set the direction accordingly.
		
		//Move all items that are currently moving, collisions, new items to be rendered, etc etc.
		
		//Check if all items that have renderers still exist, if not remove the renderer.
		
		
		
	}

	private void renderGL() {
		//TODO white background?
		//TODO render blocks
		for(BlockRenderer block : blockRenderers){
			block.renderGL();
		}
		//TODO render balls
		for(BallRenderer ball : ballRenderers){
			ball.renderGL();
		}
		//TODO render paddles
		for(PaddleRenderer paddle : paddleRenderers){
			paddle.renderGL();
		}		
	}

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
