package ballandpaddle.base;
import java.util.ArrayList;
import java.util.List;

import ballandpaddle.base.collision.*;


public class Level {

	private static Level INSTANCE;
	private String id;
	private float powerSpawnChance;
	private List<String> importedBlocks;
	
	private List<Paddle> paddles;
	private List<Ball> balls;
	private List<Block> blocks;
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
		top = new Border(new Point(0,0), new Point(width,0));
		left = new Border(new Point(0,0), new Point(0,height));
		right = new Border(new Point(width,0), new Point(width, height));
		bottom = new Border(new Point(0,width), new Point(width,height));
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

	public void print() {
		System.out.println("level: "+id+". Contains paddles: "+paddles+". Contains blocks: "+blocks+". Contains balls: "+balls);
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
		if(ball.getBody().intersects(left)){
		}
		else if(ball.getBody().intersects(right)){
			ball.setDirection(360-ball.getDirection());
		}
		else if(ball.getBody().intersects(top)){
		}
		else if(ball.getBody().intersects(bottom)){
			//TODO destroy the ball. gameover if no balls left!
		}
	}

	public void checkForCollision(Paddle paddle) {
		if(paddle.getBody().intersects(left)){
			paddle.getBody().undoMove();			
		}
		if(paddle.getBody().intersects(right)){
			paddle.getBody().undoMove();
		}
	}
	
	
}
