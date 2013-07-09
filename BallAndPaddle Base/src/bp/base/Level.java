package bp.base;
import java.util.*;

import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import bp.base.collision.*;
import bp.base.collision.body.Body;
import bp.base.collision.body.Border;
import bp.base.collision.body.Point;
import bp.base.collision.body.SquareBody;


public class Level extends Observable implements Runnable {

	/**
	 * The instance of this singleton
	 */
	private static Level INSTANCE;
	/**
	 * The id of this level
	 */
	private String id;
	/**
	 * The chance a power will be spawned when a block without a power is destroyed
	 */
	private float powerSpawnChance;
	/**
	 * The imported grid for this level
	 */
	private List<String> importedBlocks;
	
	/**
	 * The paddles of this game
	 */
	private List<Paddle> paddles;
	/**
	 * The balls of this game
	 */
	private List<Ball> balls;
	/**
	 * The blocks of this game
	 */
	private List<Block> blocks;
	/**
	 * All currently spawned powers
	 */
	private List<SpawnedPower> spawnedPowers;
	/**
	 * All powers that are waiting to be spawned
	 */
	private List<SpawnedPower> toBeSpawnedPowers;
	/**
	 * All powers of this game
	 */
	private List<Power> powers;
	/**
	 * The four borders of the level
	 */
	private bp.base.Border[] borders;
	/**
	 * The  height of the level
	 */
	private int height;
	/**
	 * The width of the level
	 */
	private int width;
	
	/**
	 * Frame information for keeping the amount of updates well divided over the second
	 */
	private long lastFrame;
	private long lastFPS;
	private int fps;
	
	/**
	 * Returns the level, creates one if it doesn't yet exist
	 * @return the level
	 */
	public static Level getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Level();
		return INSTANCE;
	}
	
	/**
	 * Creates a new level
	 */
	public Level(){}
	
	/**
	 * Sets the id of this level	
	 * @param id the id of the level
	 */
	public void setID(String id){
		this.id = id;
	}
	
	/**
	 * Sets the paddles of the level
	 * @param paddles the paddles of this level
	 */
	public void setPaddles(List<Paddle> paddles){
		this.paddles = paddles;
	}
	
	/**
	 * Sets the balls of the level
	 * @param balls the balls of the level
	 */
	public void setBalls(List<Ball> balls){
		this.balls = balls;
	}
	
	/**
	 * Sets the imported grid for this level,
	 * used later to generate all the blocks that are in the level itself
	 * @param impBlocks the imported grid of blocks
	 */
	public void setImportedBlocks(List<String> impBlocks){
		importedBlocks = impBlocks;
	}
	
	/**
	 * Sets the chance for a power to spawn
	 * @param pSC the power spawn chance
	 */
	public void setPowerSpawnChance(float pSC){
		powerSpawnChance = pSC;
	}

	/**
	 * Sets the powers that can be spawned
	 * @param powers the powers that can be spawned
	 */
	public void setDeclaredPowers(List<Power> powers){
		this.powers = powers;
		spawnedPowers = new ArrayList<SpawnedPower>();
		toBeSpawnedPowers = new ArrayList<SpawnedPower>();
	}

	/**
	 * Creates the actual blocks for this level,
	 * from the imported grid importedBlocks and a list of block types.
	 * Also creates the four borders once the height and width of the level is known
	 * @param b the list of block types
	 */
	public void generateBlocks(List<Block> b){
		blocks = new ArrayList<Block>();
		height = importedBlocks.size();
		width = importedBlocks.get(0).length();
		int x = 0;
		int y = 0;
		char cur;
		for(String s : importedBlocks){
			x=0;
			for(int i = 0; i<width; i++){
				cur = s.charAt(i);
				if(cur!='.'){
					blocks.add(generateBlock(b,cur,x,y));
				}
				x++;					
			}
			y++;
		}
		borders = new bp.base.Border[4];
		borders[0] = new bp.base.Border("top", new bp.base.collision.body.Border(new Point(0,0), new Point(width,0)));
		borders[1] = new bp.base.Border("left", new bp.base.collision.body.Border(new Point(0,0), new Point(0,height)));
		borders[2] = new bp.base.Border("right", new bp.base.collision.body.Border(new Point(width,0), new Point(width, height)));
		borders[3] = new bp.base.Border("bottom", new bp.base.collision.body.Border(new Point(0,height), new Point(width,height)));
	}
	
	/**
	 * Creates a new block by looking for a block with matching id in the list of block types.
	 * @param b The list of block types
	 * @param cur The id we are looking for
	 * @param x the x coordinate for the block
	 * @param y the y coordinate for the block
	 * @return the new block, or null if none was found (with horrible crashes later down the line)
	 */
	private Block generateBlock(List<Block> b, char cur, int x, int y){
		Block kind = null;
		int i = 0;
		while(kind==null && i<b.size()){
			if(b.get(i).getId().charAt(0) == cur){
				kind = b.get(i);
			}
			i++;
		}		
		return new Block(x,y,kind);
	}
	
	/**
	 * The blocks of this level
	 * @return the blocks
	 */
	public List<Block> getBlocks(){
		return blocks;
	}
	
	/**
	 * The paddles of this level
	 * @return the paddles
	 */
	public List<Paddle> getPaddles(){
		return paddles;
	}
	
	/**
	 * The balls of this level
	 * @return the balls
	 */
	public List<Ball> getBalls(){
		return balls;
	}
	
	public int getHeight(){
		return height;
	}
	
	public int getWidth(){
		return width;
	}

	public String toString() {
		return "level: "+id+". Contains paddles: "+paddles+". Contains blocks: "+blocks+". Contains balls: "+balls+". Contains powers: "+powers;
	}

	public void update(int delta) {
		if(delta>0){
			SpawnPowers();			
			double factor = 1.0/1000*delta;
			System.out.println(delta+" "+factor);
			int maxSteps = 0;
			Map<BAPObject, Integer> stepsPerObject = new HashMap<BAPObject, Integer>();
			//get steps needed
			for(Paddle pad : paddles){
				int steps = pad.getNeededSteps(factor);
				stepsPerObject.put(pad, steps);
				if(steps>maxSteps)
					maxSteps = steps;
			}
			for(Ball ball : balls){
				int steps = ball.getNeededSteps(factor);
				stepsPerObject.put(ball, steps);
				if(steps>maxSteps)
					maxSteps = steps;
			}
			for(SpawnedPower power : spawnedPowers){
				int steps = power.getNeededSteps(factor);
				stepsPerObject.put(power, steps);
				if(steps>maxSteps)
					maxSteps = steps;
			}
			for(int i = 0; i<maxSteps; i++){
				for(Paddle pad : paddles){
					if(pad.getDirection()!=0){
						handleBAPObjectUpdate(pad, factor, stepsPerObject, maxSteps);	
					}
				}
				for(int j =0; j<balls.size(); j++){
					handleBAPObjectUpdate(balls.get(j), factor, stepsPerObject, maxSteps);	
					if(balls.get(j).isDestroyed()){
						balls.remove(j);
						j--;
					}
					manageBlocks();
				}	
				for(int j =0; j<spawnedPowers.size();j++){
					handleBAPObjectUpdate(spawnedPowers.get(j), factor, stepsPerObject, maxSteps);					
					if(spawnedPowers.get(j).caught()||spawnedPowers.get(j).destroyed()){						
						spawnedPowers.remove(j);
						j--;
					}					
				}
			}
		}	
		List<BAPObject> objects = new ArrayList<BAPObject>();
		objects.addAll(spawnedPowers);
		objects.addAll(blocks);
		objects.addAll(balls);
		objects.addAll(paddles);
		this.setChanged();
		this.notifyObservers(objects);
	}
	
	private void handleBAPObjectUpdate(MovingBAPObject object, double factor, Map<BAPObject, Integer> stepsPerObject ,int maxSteps){
		object.calculateMove(factor*stepsPerObject.get(object)/maxSteps, this);
		object.update();
	}

	private void SpawnPowers() {
		if(toBeSpawnedPowers.size()>0){
			spawnedPowers.addAll(toBeSpawnedPowers);
			toBeSpawnedPowers.clear();
		}
	}
	
	private void manageBlocks(){
		for(int i = 0; i<blocks.size(); i++){
			if(blocks.get(i).isDestroyed()){
				if(blocks.get(i).getPower()!=null){
					//spawn the power belonging to the block
					SquareBody body = (SquareBody)blocks.get(i).getBody();
					double x = body.getTopLeft().getX()+(body.getBottomRight().getX()-body.getTopLeft().getX())/2;
					double y = body.getTopLeft().getY()+(body.getBottomRight().getY()-body.getTopLeft().getY())/2;
					SpawnedPower power = new SpawnedPower(blocks.get(i).getPower(), x, y);
					this.toBeSpawnedPowers.add(power);
				}	
				else if(Math.random()<=powerSpawnChance && powers.size()>0){
					//spawn a random power
					//sum up spawn chance of all powers
					double sumChance = 0.0;
					for(Power power : powers)
						sumChance += power.getPowerSpawnChance();					
					double result = (Math.random()*sumChance);
					//find which power matches the result.
					int index = 0;
					for(int j =0; j<powers.size(); j++){
						result -= powers.get(j).getPowerSpawnChance();
						if(result<=0){
							index = j;
							j = powers.size();
						}
					}					
					SquareBody body = (SquareBody)blocks.get(i).getBody();
					double x = body.getTopLeft().getX()+(body.getBottomRight().getX()-body.getTopLeft().getX())/2;
					double y = body.getTopLeft().getY()+(body.getBottomRight().getY()-body.getTopLeft().getY())/2;
					SpawnedPower power = new SpawnedPower(powers.get(index), x, y);
					this.toBeSpawnedPowers.add(power);
				}
				blocks.remove(i);
				i--;
			}
		}
	}

	public boolean gameOver() {
		return balls.isEmpty() || blocks.isEmpty();
	}

	public bp.base.Border[] getBorders() {
		return borders;
	}

	public void removeIllegalEffects() {
		//create list of all effects	
		List<Effect> effects = new ArrayList<Effect>();
		for(Power power : powers)
			for(Effect effect : power.getEffects())
				if(!effects.contains(effect))
					effects.add(effect);
		List<Power> illegalPowers = new ArrayList<Power>();
		//create a list of all powers containing illegal effects
		for(Effect effect : effects)
			if(!effect.isLegal(this))
				for(Power power : powers)
					if(power.getEffects().contains(effect))
						illegalPowers.add(power);
		//remove illegal powers from the blocks that have them
		for(Block block : blocks)
			if(illegalPowers.contains(block.getPower()))
				block.setPower(null);
		//remove the illegal powers from the list of powers
		blocks.removeAll(illegalPowers);		
		System.out.println("illegal powers removed: "+illegalPowers);
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
		if (Keyboard.isKeyDown(205) && !Keyboard.isKeyDown(203)) {
			for(Paddle pad : getPaddles())
				pad.setDirection(1);
		}
		else if (Keyboard.isKeyDown(203) && !Keyboard.isKeyDown(205)) {
			for(Paddle pad : getPaddles())
				pad.setDirection(-1);
		}
		else{
			for(Paddle pad : getPaddles())			
				pad.setDirection(0);
		}
    }

	@Override
	public void run() {
		getDelta(); // call once before loop to initialise lastFrame
		lastFPS = getTime(); // call before loop to initialise fps timer
		double init = 0.0;
		int maxFPS = 30;
		int initialFPS = maxFPS;
		int ticks = 0;
		while(!gameOver() && !Display.isCloseRequested()){
			pollInput();
			int delta = getDelta();			
			update((int) (delta*init));
			Display.sync(maxFPS);
			if(init<1.0)
				init+=0.00125;
			if(1000/delta<maxFPS-5)
				maxFPS-=1;
			if(ticks>=maxFPS && maxFPS < initialFPS){
				maxFPS+=1;
				ticks=0;
			}
			ticks++;	
			System.out.println(maxFPS);
		}
		while(gameOver() && !Display.isCloseRequested()){
			//wait for player to close the game
			int delta = getDelta();			
			update((int) (delta*init));
			Display.sync(10);
		}
	}
	
}
