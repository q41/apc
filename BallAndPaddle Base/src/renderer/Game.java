package renderer;

import java.util.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
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
	private double scale;
	private double offsetX;
	private double offsetY;
	private double downscaleHeightRatio;
	private double downscaleWidthRatio;
	private List<BlockRenderer> blockRenderers;
	private List<BallRenderer> ballRenderers;
	private List<PaddleRenderer> paddleRenderers;
	
	
	public Game(Level level, int width, int height, double scale){
		this.level = level;
		this.width = width;
		this.height = height;
		this.scale = scale;
		//TODO. add check to make certain height and width do not exceed screen size
	}
	
	public Game(Level level, double scale){
		this.level = level;
		this.scale = scale;
		width = 800;
		height = 600;
	}
	
	public void start() {
		System.out.println("starting");
		try {
		Display.setDisplayMode(new DisplayMode(width, height));
		Display.create();
		System.out.println(Display.isVisible());
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
		GL11.glOrtho(0, width, height, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		//scale, amount of pixels per "tile" in game.
		downscaleHeightRatio = 1;
		downscaleWidthRatio = 1;
		offsetX = 0;
		offsetY = 0;
		if(scale*level.getHeight()>height)		
			downscaleHeightRatio = height/(level.getHeight()*scale);
		else
			offsetY = (height-scale*level.getHeight())/2;
		if(scale*level.getWidth()>width)
			downscaleWidthRatio = width/(level.getWidth()*scale); 
		else
			offsetX = (width-scale*level.getWidth())/2;
		
		blockRenderers = new ArrayList<BlockRenderer>();
		ballRenderers = new ArrayList<BallRenderer>();
		paddleRenderers = new ArrayList<PaddleRenderer>();
		
		for(Block block : level.getBlocks()){
			blockRenderers.add(new BlockRenderer(block, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
		}		
		for(Ball ball : level.getBalls()){
			ballRenderers.add(new BallRenderer(ball, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
		}		
		for(Paddle paddle : level.getPaddles()){
			switch (paddle.getShape()) {
            case triangle: 	paddleRenderers.add(new PaddleTriangleRenderer(paddle, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
            				break;
            case square: 	paddleRenderers.add(new PaddleSquareRenderer(paddle, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
							break;
            case rectangle: paddleRenderers.add(new PaddleRectangleRenderer(paddle, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
							break;
            case circle: 	paddleRenderers.add(new PaddleCircleRenderer(paddle, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
							break;
			}
		}
	}

	private void update(int delta) {
		//TODO, steps in following order
		
		//Check for keyboard input for moving the paddle and set the direction accordingly.
		pollInput();
		//Move all items that are currently moving, collisions, new items to be rendered, etc etc.
		
		//Check if all items that have renderers still exist, if not remove the renderer.
		
		
		
	}

	private void renderGL() {
		// Clear The Screen And The Depth Buffer
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		 
		// R,G,B,A Set The Color To White for the background
		GL11.glColor3f(1.0f, 1.0f, 1.0f); // TODO, white!
		
		// draw background quad
		GL11.glPushMatrix();
			GL11.glBegin(GL11.GL_QUADS);
				GL11.glVertex2d(offsetX, offsetY);
				GL11.glVertex2d(offsetX+scale*level.getWidth()*downscaleWidthRatio, offsetY);
				GL11.glVertex2d(offsetX+scale*level.getWidth()*downscaleWidthRatio, (offsetY+scale*level.getHeight())*downscaleHeightRatio);
				GL11.glVertex2d(offsetX, offsetY+scale*level.getHeight()*downscaleHeightRatio);
			GL11.glEnd();
		GL11.glPopMatrix();

		
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
	
	public void pollInput() {        
 
	if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
	    System.out.println("SPACE KEY IS DOWN");
	}
 
	while (Keyboard.next()) {
	    if (Keyboard.getEventKeyState()) {
	        if (Keyboard.getEventKey() == 205) {
	        	System.out.println("rightarrow");
	        }
	        if (Keyboard.getEventKey() == 203) {
	        	System.out.println("leftarrow");
	        }
	        if (Keyboard.getEventKey() == 200) {
	        	System.out.println("uparrow");
	        }
	        if (Keyboard.getEventKey() == 208) {
	        	System.out.println("downarrow");
	        }
	    }
	}
    }
	
	
	
	
	
	
}
