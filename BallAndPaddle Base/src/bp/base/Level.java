package bp.base;
import java.util.*;
import java.util.Map.Entry;

import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import bp.base.collision.body.*;
import bp.base.exception.IllegalBodyException;
import bp.base.renderer.Game;


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
	 * Whether the game is in testing mode
	 */
	private boolean testing = false;
	/**
	 * Used in testing mode
	 */
	private int attachmentCount;
	
	/**
	 * A boolean that says if the sysTimer should be used or the custom timer Timer
	 */
	public static boolean sysTimer = true;
	
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
	 * Sets if the game should run normally or without relation to fps
	 */
	public void setSmooth(boolean smooth){
		sysTimer = smooth;
	}
	
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
	 * Sets the level to testing mode, printing extra data to the output.
	 */
	public void setTestingMode(boolean testing){
		this.testing=testing;
		for(Power power : powers){
			for(Effect effect : power.getEffects()) {
				//effect.setTesting(testing);
			}
		}
	}

	/**
	 * Creates the actual blocks for this level,
	 * from the imported grid importedBlocks and a list of block types.
	 * Also creates the four borders once the height and width of the level is known
	 * Requires that setImportedBlocks() has been used before generateBlocks() is called
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
			if(b.get(i).id.charAt(0) == cur){
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
	
	/**
	 * The height of this level
	 * @return the height
	 */
	public int getHeight(){
		return height;
	}
	
	/**
	 * The width of this level
	 * @return the width
	 */
	public int getWidth(){
		return width;
	}

	/**
	 * Moves all the moving objects for the given timeframe
	 * And notifies the observers
	 * @param delta the amount of ms that have passed since the last update
	 */
	public void update(int delta) {
		if(delta>0){
			SpawnPowers();			
			double factor = 1.0/1000*delta;
			Map<BPObject, Integer> stepsPerObject = calculateStepsPerObject(factor);
			int maxSteps = getMaxSteps(stepsPerObject);
			moveAllObjects(factor, stepsPerObject, maxSteps);	
			checkForEffectDeactivation();		
		}	
		List<BPObject> objects = new ArrayList<BPObject>();
		objects.addAll(spawnedPowers);
		objects.addAll(blocks);
		objects.addAll(balls);
		objects.addAll(paddles);
		this.setChanged();
		this.notifyObservers(objects);
	}
	
	/**
	 * Checks if any effects need to be deactivated,
	 * They are deactivated if this is the case
	 */
	private void checkForEffectDeactivation() {
		EffectDeployment.deactivateExpired();
	}

	/**
	 * Calculates the amount of steps each object needs to complete it's move
	 * Then puts those into a map
	 * @param factor the portion of a second that the total move occupies
	 * @return The mapping of BAPObjects to Integers for how many moves each needs
	 */
	private Map<BPObject, Integer> calculateStepsPerObject(double factor) {
		Map<BPObject, Integer> stepsPerObject = new HashMap<BPObject, Integer>();
		//calculate the maximum amount of steps required by the objects
		for(Paddle pad : paddles){
			int steps = pad.getNeededSteps(factor);
			stepsPerObject.put(pad, steps);
		}
		for(Ball ball : balls){
			int steps = ball.getNeededSteps(factor);
			stepsPerObject.put(ball, steps);
		}
		for(SpawnedPower power : spawnedPowers){
			int steps = power.getNeededSteps(factor);
			stepsPerObject.put(power, steps);
		}
		return stepsPerObject;
	}
	
	/**
	 * Calculates the maximum amount of moves needed by the objects to complete all moves
	 * @param stepsPerObject The moves each object needs to take
	 * @return The maximum amount of moves needed
	 */
	private int getMaxSteps(Map<BPObject, Integer> stepsPerObject) {
		int maxSteps = 0;
		Iterator<Entry<BPObject, Integer>> it = stepsPerObject.entrySet().iterator();
		while(it.hasNext()){
			int value = it.next().getValue();
			if(value>maxSteps)
				maxSteps = value;
		}
		return maxSteps;
	}
	
	/**
	 * Moves all the objects
	 * @param factor the portion of a second that the total move occupies
	 * @param stepsPerObject The amount of steps each object needs to take
	 * @param maxSteps the maximum amount of steps needed
	 */
	private void moveAllObjects(double factor,
			Map<BPObject, Integer> stepsPerObject, int maxSteps) {
		for(int i = 0; i<maxSteps; i++){
			movePaddles(factor, stepsPerObject, maxSteps);
			moveBalls(factor, stepsPerObject, maxSteps);
			movePowers(factor, stepsPerObject, maxSteps);			
		}		
	}
	
	/**
	 * Moves all the balls
	 * @param factor the portion of a second that the total move occupies
	 * @param stepsPerObject The amount of steps each object needs to take
	 * @param maxSteps the maximum amount of steps needed
	 */
	private void  moveBalls(double factor,
			Map<BPObject, Integer> stepsPerObject, int maxSteps){
		for(int j =0; j<balls.size(); j++){
			handleBPObjectUpdate(balls.get(j), factor, stepsPerObject, maxSteps);	
			if(balls.get(j).isDestroyed()){
				balls.remove(j);
				j--;
			}
			manageBlocks();
		}	
	}
	
	/**
	 * Moves all the paddles
	 * @param factor the portion of a second that the total move occupies
	 * @param stepsPerObject The amount of steps each object needs to take
	 * @param maxSteps the maximum amount of steps needed
	 */
	private void movePaddles(double factor,
			Map<BPObject, Integer> stepsPerObject, int maxSteps){
		for(Paddle pad : paddles){
			if(pad.getDirection()!=0){
				handleBPObjectUpdate(pad, factor, stepsPerObject, maxSteps);	
			}
		}
	}
	
	/**
	 * Moves all the powers
	 * @param factor the portion of a second that the total move occupies
	 * @param stepsPerObject The amount of steps each object needs to take
	 * @param maxSteps the maximum amount of steps needed
	 */
	private void  movePowers(double factor,
			Map<BPObject, Integer> stepsPerObject, int maxSteps){
		for(int j =0; j<spawnedPowers.size();j++){
			handleBPObjectUpdate(spawnedPowers.get(j), factor, stepsPerObject, maxSteps);					
			if(spawnedPowers.get(j).caught()||spawnedPowers.get(j).destroyed()){						
				spawnedPowers.remove(j);
				j--;
			}					
		}
	}

	/**
	 * Lets the object calculate the variables for it's next move and then executes that move
	 * @param object the object to be moved
	 * @param factor The amount of time that this move represents
	 * @param stepsPerObject The map containing the amount of steps the object needs to take to complete it's move
	 * @param maxSteps the maximum amount of steps needed for all objects to complete their moves
	 */
	private void handleBPObjectUpdate(MovingBPObject object, double factor, Map<BPObject, Integer> stepsPerObject ,int maxSteps){
		object.calculateMove(factor*stepsPerObject.get(object)/maxSteps, this);
		try {
			object.update();
		} catch (IllegalBodyException e) {
			e.printStackTrace();
		}
	}

	/**
	 * spawns the powers that are waiting to be spawned
	 */
	private void SpawnPowers() {
		if(toBeSpawnedPowers.size()>0){
			spawnedPowers.addAll(toBeSpawnedPowers);
			toBeSpawnedPowers.clear();
		}
	}
	
	/**
	 * Runs through all blocks to check if any were destroyed during the last move
	 * If so then they are removed. If they had a power then this power is spawned,
	 * otherwise a random roll is made to determine if one of the powers from this level
	 * should be spawned. If a power is to be spawned then it is added to the list of powers to be spawned.
	 */
	private void manageBlocks(){
		for(int i = 0; i<blocks.size(); i++){
			if(blocks.get(i).isDestroyed()){
				RectangleBody body = (RectangleBody)blocks.get(i).getBody();
				double x = body.getTopLeft().getPointX()+(body.getBottomRight().getPointX()-body.getTopLeft().getPointX())/2;
				double y = body.getTopLeft().getPointY()+(body.getBottomRight().getPointY()-body.getTopLeft().getPointY())/2;
				if(blocks.get(i).getPower()!=null){
					//spawn the power belonging to the block
					SpawnedPower power = new SpawnedPower(blocks.get(i).getPower(), x, y);
					toBeSpawnedPowers.add(power);
				}	
				else if(Math.random()<=powerSpawnChance && powers.size()>0){					
					SpawnRandomPower(x,y);					
				}
				blocks.remove(i);
				i--;
			}
		}
	}

	/**
	 * Randomly determines which power should be spawned,
	 * then adds it to the list of powers to be spawned
	 * @param x The x coordinate where the power should be spawned
	 * @param y The y coordinate where the power should be spawned
	 */
	private void SpawnRandomPower(double x, double y) {
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
		SpawnedPower power = new SpawnedPower(powers.get(index), x, y);
		toBeSpawnedPowers.add(power);		
	}

	/**
	 * Returns if the game has ended
	 * @return if all balls all blocks are gone
	 */
	public boolean gameOver() {
		return balls.isEmpty() || blocks.isEmpty();
	}

	/**
	 * Returns the borders of this level
	 * @return the borders
	 */
	public bp.base.Border[] getBorders() {
		return borders;
	}

	/**
	 * Updates the fps
	 */
	public void updateFPS() {
	    if (getTime() - lastFPS > 1000) {
	        Display.setTitle("FPS: " + fps);
		fps = 0;
		lastFPS += 1000;
	    }
	    fps++;
	}	
	
	/**
	 * Returns the current time
	 * @return the current time
	 */
	public static long getGameTime() {
		if(sysTimer)
			return (Sys.getTime() * 1000) / Sys.getTimerResolution();
		else
			return Timer.getCurrentTime();
	}
	
	public static long getTime() {
		return (Sys.getTime() * 1000) / Sys.getTimerResolution();
	}
	
	/**
	 * Returns the amount of time that has passed since the last update
	 * @return the delta time
	 */
	public int getDelta() {
	    long time = getTime();
	    int delta = (int) (time - lastFrame);
	    lastFrame = time;	 
	    return delta;
	}	
	
	/**
	 * Checks the keyboard for input, changing the orientation of the paddles accordingly.
	 */
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
		while (Keyboard.next()) {
		    if (Keyboard.getEventKeyState()) {
		        if (Keyboard.getEventKey() == Keyboard.KEY_F) {
		        	Game.setDisplayMode(800, 600, !Display.isFullscreen());
		        }
		        if (Keyboard.getEventKey() == Keyboard.KEY_ESCAPE) {
		        	System.exit(0);
		        }
		    }
		}
    }

	@Override
	public void run() {
		getDelta(); // call once before loop to initialize lastFrame
		lastFPS = getTime(); // call before loop to initialize the fps timer
		double init = 0.0;
		int maxFPS = 30;
		int initialFPS = maxFPS;
		int ticks = 0;
		if(testing)
			printStatus();
		while(!gameOver() && !Display.isCloseRequested()){
			pollInput();
			int delta = getDelta();		
			if(sysTimer){
				update((int) (initialFPS*1.1));				
				Timer.incrementTime(1000/initialFPS);	
			}
			else
				update((int) (delta*init));
			Display.sync(maxFPS);
			if(init<1.0)
				//let the game start slowly since alia4j turns the game into a mess otherwise
				init+=0.00125;
			//inc/reduce fps when necessary
			if(1000/delta<maxFPS-5)
				maxFPS-=1;
			if(ticks>=maxFPS && maxFPS < initialFPS){
				maxFPS+=1;
				ticks=0;
			}
			ticks++;	
			if(testing)
				checkForAttachmentChanges();
		}
		while(gameOver() && !Display.isCloseRequested()){
			//wait for player to close the game once the game has ended
			pollInput();
			int delta = getDelta();			
			update(0);
			Display.sync(10);
		}
	}
	
	private void checkForAttachmentChanges() {
		int currentCount = org.alia4j.fial.System.getInstance().deployedAttachments().length;
		if(currentCount!=attachmentCount){
			attachmentCount=currentCount;
			printStatus();
		}
		
	}
	
	public void printStatus(){
		for(Ball ball : balls)
			ball.print();
		for(Paddle paddle : paddles)
			paddle.print();
		for(Block block : blocks)
			block.print();		
	}
	
	public List<SpawnedPower> getSpawnedPowers() {
		return spawnedPowers;
	}
}
