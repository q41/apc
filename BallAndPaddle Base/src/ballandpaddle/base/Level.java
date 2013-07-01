package ballandpaddle.base;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import ballandpaddle.base.collision.*;
import ballandpaddle.base.collision.body.Body;
import ballandpaddle.base.collision.body.Border;
import ballandpaddle.base.collision.body.Point;


public class Level extends Observable {

	private static Level INSTANCE;
	private String id;
	private float powerSpawnChance;
	private List<String> importedBlocks;
	
	private List<Paddle> paddles;
	private List<Ball> balls;
	private List<Block> blocks;
	private ballandpaddle.base.Border[] borders;
	private int height;
	private int width;
	
	private Body top;
	private Body left;
	private Body right;
	private Body bottom;
	
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
		System.out.println("adding paddles "+paddles);
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
		borders[3] = new ballandpaddle.base.Border("bottom", new ballandpaddle.base.collision.body.Border(new Point(0,width), new Point(width,height)));
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
		return "level: "+id+". Contains paddles: "+paddles+". Contains blocks: "+blocks+". Contains balls: "+balls;
	}

	public void moveAll(int delta) {
		if(delta>0){
			double factor = 1.0/1000*delta;
			for(Paddle pad : paddles){
				pad.move(factor, this);
			}
			for(Ball ball : balls){
				ball.move(factor, this);
			}
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
				blocks.remove(i);
				i--;
			}
		}
	}

	public void checkForCollision(Paddle paddle) {
		Collision.collision(paddle, borders[0], CollisionResolver.getInstance());
		Collision.collision(paddle, borders[1], CollisionResolver.getInstance());
		Collision.collision(paddle, borders[2], CollisionResolver.getInstance());
		Collision.collision(paddle, borders[3], CollisionResolver.getInstance());		
	}
	
	
}
