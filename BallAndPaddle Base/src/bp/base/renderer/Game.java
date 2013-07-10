package bp.base.renderer;

import java.util.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import bp.base.*;

public class Game implements Observer {

	/**
	 * The width of the display
	 */
	private int width;
	/**
	 * The height of the display
	 */
	private int height;
	/**
	 * The scaling used while rendering
	 */
	private double scale;
	/**
	 * The distance between the edge of the display and the
	 * part where rendering happens
	 */
	private double offsetX;
	/**
	 * The distance between the edge of the display and the
	 * part where rendering happens
	 */
	private double offsetY;
	/**
	 * The scaling used on the y axis
	 */
	private double downscaleHeightRatio;
	/**
	 * The scaling used on the x axis
	 */
	private double downscaleWidthRatio;
	/**
	 * the height of the level
	 */
	private double levelHeight;
	/**
	 * The width of the level
	 */
	private double levelWidth;
	/**
	 * The renderers for rectangle shaped items
	 */
	private List<RectangleRenderer> rectangleRenderers;
	/**
	 * The renderers for circle shaped items
	 */
	private List<CircleRenderer> circleRenderers;
	/**
	 * If the display is being initialized
	 */
	private boolean initializing;
	
	/**
	 * Creates a new Game for the given level, using the given scale
	 * and using the given width and height for the screen
	 * @param level The level
	 * @param width The width for the screen
	 * @param height The height for the screen
	 * @param scale The scaling to be used
	 */
	public Game(Level level, int width, int height, double scale){
		//TODO. add check to make certain height and width do not exceed screen size
		this.width = width;
		this.height = height;
		this.scale = scale;
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
	
	/**
	 * Creates a new game for the given level, using the given scale
	 * The width and height will be 800x600
	 * @param level The level
	 * @param scale The scaling to be used
	 */
	public Game(Level level, double scale){
		//TODO. add check to make certain height and width do not exceed screen size
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
	
	/**
	 * Initiates the system,
	 * determines the scaling that should be used
	 * and determines the offset that should be used
	 */
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
		circleRenderers = new ArrayList<CircleRenderer>();
		rectangleRenderers = new ArrayList<RectangleRenderer>();
		initializing = false;
	}

	/**
	 * Draws a white background, then draws all the items
	 */
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
		for(RectangleRenderer rectangle : rectangleRenderers)
			rectangle.renderGL();
		for(CircleRenderer circle : circleRenderers)
			circle.renderGL();		
		Display.update();
	}
	
	@Override
	/**
	 * Processes changes to the items and refreshes the renderers
	 * Then draws the new screen
	 */
	public void update(Observable arg0, Object arg1) {		
			List<RectangleRenderer> newRectangles = new ArrayList<RectangleRenderer>();
			List<CircleRenderer> newCircles = new ArrayList<CircleRenderer>();
			List<?> items = (List<?>)arg1;
			for(int i = 0; i<items.size(); i++){
				if(items.get(i) instanceof Ball){
					Ball ball = (Ball) items.get(i);
					newCircles.add(new CircleRenderer(ball, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
				}
				else if(items.get(i) instanceof Block){
					Block block = (Block) items.get(i);
					newRectangles.add(new RectangleRenderer(block, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));				
				}
				else if(items.get(i) instanceof Paddle){
					Paddle paddle = (Paddle) items.get(i);
					newRectangles.add(new RectangleRenderer(paddle, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
				}
				else if(items.get(i) instanceof SpawnedPower){
					SpawnedPower power = (SpawnedPower) items.get(i);
					newRectangles.add(new RectangleRenderer(power, scale, downscaleHeightRatio, downscaleWidthRatio, offsetX, offsetY));
				}
			}
			circleRenderers = newCircles;
			rectangleRenderers = newRectangles;
			renderGL();
	}
	
	
	
	
	
	
}
