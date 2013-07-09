package bp.base.renderer;

import java.util.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import bp.base.*;

public class Game implements Observer {

	private long lastFrame;
	private long lastFPS;
	private int fps;
	private int width;
	private int height;
	private double scale;
	private double offsetX;
	private double offsetY;
	private double downscaleHeightRatio;
	private double downscaleWidthRatio;
	private double levelHeight;
	private double levelWidth;
	private List<BlockRenderer> blockRenderers;
	private List<BallRenderer> ballRenderers;
	private List<PaddleRenderer> paddleRenderers;
	private List<PowerRenderer> powerRenderers;
	private boolean initializing;
	
	
	public Game(Level level, int width, int height, double scale){
		this.width = width;
		this.height = height;
		this.scale = scale;
		level.addObserver(this);
		//TODO. add check to make certain height and width do not exceed screen size
	}
	
	public Game(Level level, double scale){
		this.scale = scale;
		this.levelHeight = level.getHeight();
		this.levelWidth = level.getWidth();
		width = 800;
		height = 600;
		level.addObserver(this);
		initializing = true;
		try {
			Display.setDisplayMode(new DisplayMode(width, height));
			Display.create();
			System.out.println(Display.isVisible());
			} catch (LWJGLException e) {
			e.printStackTrace();
			System.exit(0);
			}

		initGL();
	}
	
//	public void run() {
//		System.out.println("starting");
//		try {
//		Display.setDisplayMode(new DisplayMode(width, height));
//		Display.create();
//		System.out.println(Display.isVisible());
//		} catch (LWJGLException e) {
//		e.printStackTrace();
//		System.exit(0);
//		}
//
//		initGL(); // init OpenGL
//		getDelta(); // call once before loop to initialise lastFrame
//		lastFPS = getTime(); // call before loop to initialise fps timer
//		double init = 0.0;
//		int maxFPS = 10;
//		int initialFPS = maxFPS;
//		int ticks = 0;
//		while (!Display.isCloseRequested()) {		
//			int delta = getDelta();					
//			
//			update((int) (delta*init));
//			renderGL();
// 
//			Display.update();
//			Display.sync(maxFPS); // cap fps to 30fps
//			if(init<1.0)
//				init+=0.00125;
//			if(1000/delta<maxFPS-5)
//				maxFPS-=1;
//			if(ticks>=maxFPS && maxFPS < initialFPS){
//				maxFPS+=1;
//				ticks=0;
//			}
//			ticks++;		
//			System.out.println("display fps= "+maxFPS);
//		} 
//		Display.destroy();
//	}
	
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
		if(scale*levelHeight>height)		
			downscaleHeightRatio = height/(levelHeight*scale);
		else
			offsetY = (height-scale*levelHeight)/2;
		if(scale*levelWidth>width)
			downscaleWidthRatio = width/(levelWidth*scale); 
		else
			offsetX = (width-scale*levelWidth)/2;		
		blockRenderers = new ArrayList<BlockRenderer>();
		ballRenderers = new ArrayList<BallRenderer>();
		paddleRenderers = new ArrayList<PaddleRenderer>();
		powerRenderers = new ArrayList<PowerRenderer>();
		initializing = false;
	}

	private void update(int delta) {
	}

	private void renderGL() {
		// Clear The Screen And The Depth Buffer
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		 
		// R,G,B,A Set The Color To White for the background
		GL11.glColor3f(1.0f, 1.0f, 1.0f);
		
		// draw background quad
		GL11.glPushMatrix();
			GL11.glBegin(GL11.GL_QUADS);
				GL11.glVertex2d(offsetX, offsetY);
				GL11.glVertex2d(offsetX+scale*levelWidth*downscaleWidthRatio, offsetY);
				GL11.glVertex2d(offsetX+scale*levelWidth*downscaleWidthRatio, (offsetY+scale*levelHeight)*downscaleHeightRatio);
				GL11.glVertex2d(offsetX, offsetY+scale*levelHeight*downscaleHeightRatio);
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
		Display.update();
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

	@Override
	public void update(Observable arg0, Object arg1) {		
		if(initializing){
			try {
				Display.setDisplayMode(new DisplayMode(width, height));
				Display.create();
				System.out.println(Display.isVisible());
				} catch (LWJGLException e) {
				e.printStackTrace();
				System.exit(0);
				}

			initGL();
			
		}
			List<PowerRenderer> newPower = new ArrayList<PowerRenderer>();
			List<BlockRenderer> newBlock = new ArrayList<BlockRenderer>();
			List<BallRenderer> newBall = new ArrayList<BallRenderer>();
			List<PaddleRenderer> newPaddle = new ArrayList<PaddleRenderer>();
			List<?> items = (List<?>)arg1;
			for(int i = 0; i<items.size(); i++){
				if(items.get(i) instanceof Ball){
					Ball ball = (Ball) items.get(i);
					newBall.add(new BallRenderer(ball, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
				}
				else if(items.get(i) instanceof Block){
					Block block = (Block) items.get(i);
					newBlock.add(new BlockRenderer(block, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));				
				}
				else if(items.get(i) instanceof Paddle){
					Paddle paddle = (Paddle) items.get(i);
					newPaddle.add(new PaddleRenderer(paddle, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
				}
				else if(items.get(i) instanceof SpawnedPower){
					SpawnedPower power = (SpawnedPower) items.get(i);
					newPower.add(new PowerRenderer(power, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
				}
			}
			powerRenderers = newPower;
			blockRenderers = newBlock;
			ballRenderers = newBall;
			paddleRenderers = newPaddle;
			renderGL();
	}
	
	
	
	
	
	
}
