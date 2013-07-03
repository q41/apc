package ballandpaddle.base;
import java.util.*;

import ballandpaddle.base.collision.*;
import ballandpaddle.base.collision.body.Body;
import ballandpaddle.base.collision.body.Border;
import ballandpaddle.base.collision.body.Point;
import ballandpaddle.base.collision.body.SquareBody;


public class Level extends Observable {

	private static Level INSTANCE;
	private String id;
	private float powerSpawnChance;
	private List<String> importedBlocks;
	
	private List<Paddle> paddles;
	private List<Ball> balls;
	private List<Block> blocks;
	private List<SpawnedPower> spawnedPowers;
	private List<SpawnedPower> toBeSpawnedPowers;
	private List<Power> powers;
	private ballandpaddle.base.Border[] borders;
	private int height;
	private int width;
	
	public static Level getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Level();
		return INSTANCE;
	}
	
	public Level(){}
	
	public void setID(String id){
		this.id = id;
	}
	
	public void setPaddles(List<Paddle> paddles){
		this.paddles = paddles;
	}
	
	public void setBalls(List<Ball> balls){
		this.balls = balls;
	}
	
	public void setImportedBlocks(List<String> impBlocks){
		importedBlocks = impBlocks;
	}
	
	public void setPowerSpawnChance(float pSC){
		powerSpawnChance = pSC;
	}
	
	public float getPowerSpawnChance(){
		return powerSpawnChance;
	}
	
	public void setDeclaredPowers(List<Power> powers){
		this.powers = powers;
		spawnedPowers = new ArrayList<SpawnedPower>();
		toBeSpawnedPowers = new ArrayList<SpawnedPower>();
	}
	
	public Level(String id, List<Paddle> paddles, List<Ball> balls, List<String> impBlocks, float pSC){
		this(id, paddles, balls, impBlocks);
		powerSpawnChance = pSC;
	}
	
	public Level(String id, List<Paddle> paddles, List<Ball> balls, List<String> impBlocks){
		this.id = id;
		this.paddles = paddles;
		this.balls = balls;
		importedBlocks = impBlocks;
	}
	
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
		borders = new ballandpaddle.base.Border[4];
		borders[0] = new ballandpaddle.base.Border("top", new ballandpaddle.base.collision.body.Border(new Point(0,0), new Point(width,0)));
		borders[1] = new ballandpaddle.base.Border("left", new ballandpaddle.base.collision.body.Border(new Point(0,0), new Point(0,height)));
		borders[2] = new ballandpaddle.base.Border("right", new ballandpaddle.base.collision.body.Border(new Point(width,0), new Point(width, height)));
		borders[3] = new ballandpaddle.base.Border("bottom", new ballandpaddle.base.collision.body.Border(new Point(0,height), new Point(width,height)));
	}
	
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
	
	public List<Block> getBlocks(){
		return blocks;
	}
	
	public List<Paddle> getPaddles(){
		return paddles;
	}
	
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
						this.setChanged();
						this.notifyObservers(balls.get(j));
						balls.remove(j);
						j--;
					}
				}	
				for(int j =0; j<spawnedPowers.size();j++){
					handleBAPObjectUpdate(spawnedPowers.get(j), factor, stepsPerObject, maxSteps);					
					if(spawnedPowers.get(j).caught()||spawnedPowers.get(j).destroyed()){
						this.setChanged();
						this.notifyObservers(spawnedPowers.get(j));
						spawnedPowers.remove(j);
						j--;
					}					
				}
			}
		}		
	}
	
	private void handleBAPObjectUpdate(BAPObject object, double factor, Map<BAPObject, Integer> stepsPerObject ,int maxSteps){
		object.calculateMove(factor*stepsPerObject.get(object)/maxSteps, this);
		object.update();
		checkForCollision(object);
	}

	private void SpawnPowers() {
		if(toBeSpawnedPowers.size()>0){
			spawnedPowers.addAll(toBeSpawnedPowers);
			toBeSpawnedPowers.clear();
			this.setChanged();
			this.notifyObservers(spawnedPowers);
		}
	}
	
	private void checkForCollision(BAPObject object) {
		if(object instanceof Ball)
			checkForCollision((Ball)object);
		else if(object instanceof SpawnedPower)
			checkForCollision((SpawnedPower)object);
		else if(object instanceof Paddle)
			checkForCollision((Paddle)object);		
	}

	private void checkForCollision(SpawnedPower power) {
		Collision.collision(power, borders[3], CollisionResolver.getInstance());
		for(Paddle paddle : paddles){
			Collision.collision(power, paddle, CollisionResolver.getInstance());
		}	
	}

	public void checkForCollision(Ball ball) {
		for(ballandpaddle.base.Border border : borders){
			Collision.collision(ball, border, CollisionResolver.getInstance());
		}
		for(Paddle paddle : paddles){
			Collision.collision(ball, paddle, CollisionResolver.getInstance());
		}				
		for(int i = 0; i<blocks.size(); i++){
			Collision.collision(ball, blocks.get(i), CollisionResolver.getInstance());
			if(blocks.get(i).isDestroyed()){
				this.setChanged();
				this.notifyObservers(blocks.get(i));
				if(blocks.get(i).getPower()!=null){
					//spawn the power belonging to the block
					SquareBody body = (SquareBody)blocks.get(i).getBody();
					double x = body.getTopLeft().getX()+(body.getBottomRight().getX()-body.getTopLeft().getX())/2;
					double y = body.getTopLeft().getY()+(body.getBottomRight().getY()-body.getTopLeft().getY())/2;
					SpawnedPower power = new SpawnedPower(blocks.get(i).getPower(), x, y);
					this.toBeSpawnedPowers.add(power);
				}
//				else if(Math.random()<=powerSpawnChance){
				else if(true){
					//spawn a random power
					int index = (int) (Math.random()*(powers.size()-1));
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

	public void checkForCollision(Paddle paddle) {
		if(paddle.getDirection()>0)
			Collision.collision(paddle, borders[2], CollisionResolver.getInstance());
		else if(paddle.getDirection()<0)
				Collision.collision(paddle, borders[1], CollisionResolver.getInstance());
	}

	public boolean gameOver() {
		return balls.isEmpty() || blocks.isEmpty();
	}
	
	
}
