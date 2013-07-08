package ballandpaddle.base.renderer;

import java.util.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import ballandpaddle.base.*;

public class Game implements Observer {

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
	private List<PowerRenderer> powerRenderers;
	private boolean initializing;
	
	
	public Game(Level level, int width, int height, double scale){
		this.level = level;
		this.width = width;
		this.height = height;
		this.scale = scale;
		level.addObserver(this);
		//TODO. add check to make certain height and width do not exceed screen size
	}
	
	public Game(Level level, double scale){
		this.level = level;
		this.scale = scale;
		width = 800;
		height = 600;
		level.addObserver(this);
		initializing = true;
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
		double init = 0.0;
		int maxFPS = 30;
		int initialFPS = maxFPS;
		int ticks = 0;
		while (!Display.isCloseRequested() && !level.gameOver()) {		
			int delta = getDelta();					
			
			update((int) (delta*init));
			renderGL();
 
			Display.update();
			Display.sync(maxFPS); // cap fps to 30fps
			if(init<1.0)
				init+=0.00125;
			if(1000/delta<maxFPS-5)
				maxFPS-=1;
			if(ticks>=maxFPS && maxFPS < initialFPS){
				maxFPS+=1;
				ticks=0;
			}
			ticks++;			
//			System.out.println("fps "+maxFPS);
		}
		if(level.gameOver()){
			while(!Display.isCloseRequested()){
				maxFPS = 10;
				renderGL();			 
				Display.update();
				Display.sync(maxFPS); // cap fps to 10fps
			}
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
		powerRenderers = new ArrayList<PowerRenderer>();
		
		for(Block block : level.getBlocks()){
			blockRenderers.add(new BlockRenderer(block, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
		}		
		for(Ball ball : level.getBalls()){
			ballRenderers.add(new BallRenderer(ball, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
		}		
		for(Paddle paddle : level.getPaddles()){			
           paddleRenderers.add(new PaddleRenderer(paddle, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
        }
	}

	private void update(int delta) {
		//TODO, steps in following order
		
		//Check for keyboard input for moving the paddle and set the direction accordingly.
		pollInput();
		//Move all items that are currently moving, collisions, new items to be rendered, etc etc.
		level.update(delta);
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

		for(BlockRenderer block : blockRenderers)
			block.renderGL();
		for(BallRenderer ball : ballRenderers)
			ball.renderGL();		
		for(PaddleRenderer paddle : paddleRenderers)
			paddle.renderGL();		
		for(PowerRenderer power : powerRenderers)
			power.renderGL();
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
		if (Keyboard.isKeyDown(205) && !Keyboard.isKeyDown(203)) {
			for(Paddle pad : level.getPaddles())
				pad.setDirection(1);
		}
		else if (Keyboard.isKeyDown(203) && !Keyboard.isKeyDown(205)) {
			for(Paddle pad : level.getPaddles())
				pad.setDirection(-1);
		}
		else{
			for(Paddle pad : level.getPaddles())			
				pad.setDirection(0);
		}
    }

	@Override
	public void update(Observable arg0, Object arg1) {
		if(arg1 instanceof Block){
			Block b = (Block)arg1;
			boolean found = false;
			for(int i = 0; i<blockRenderers.size() && !found; i++){
				found = blockRenderers.get(i).getBlock().equals(b);
				if(found)
					blockRenderers.remove(i);					
			}
		}
		else if(arg1 instanceof Ball){
			Ball b = (Ball)arg1;
			boolean found = false;
			for(int i = 0; i<ballRenderers.size() && !found; i++){
				found = ballRenderers.get(i).getBall().equals(b);
				if(found)
					ballRenderers.remove(i);					
			}
		}
		else if(arg1 instanceof SpawnedPower){
			SpawnedPower p = (SpawnedPower) arg1;
			boolean found = false;
			for(int i = 0; i<powerRenderers.size() && !found; i++){
				found = powerRenderers.get(i).getPower().equals(p);
				if(found)
					powerRenderers.remove(i);					
			}
		}
		else if(arg1 instanceof List<?>){
			//create renderers for these powers, but first clear the list
			List<SpawnedPower> powers = (List<SpawnedPower>)arg1;
			powerRenderers.clear();
			for(SpawnedPower power : powers){
				powerRenderers.add(new PowerRenderer(power, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
			}
		}
	}
	
	
	
	
	
	
}
