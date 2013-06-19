package ballandpaddle.base;

import ballandpaddle.base.collision.Point;
import ballandpaddle.base.collision.RectangleBody;
import ballandpaddle.base.collision.SquareBody;

public class Block extends BAPObject {

	private int hardness;
	private int normalRes;
	private int fireRes;
	private int coldRes;
	private int shockRes;
	private Power power;
	private SquareBody body;
	
	public Block(String id, int x, int y) {
		super(id, x, y);
		body = new SquareBody(new Point(x,y), new Point(x+1, y+1));
	}
	
	public Block(int x, int y, Block b){
		this(b.getId(), x, y);
		this.hardness = b.getHardness();
		this.normalRes = b.getNormalRes();
		this.fireRes = b.getFireRes();
		this.coldRes = b.getColdRes();
		this.shockRes = b.getShockRes();
		this.power = b.getPower();
	}
	
	public Block(String id, int hardness, int normalRes, int fireRes, int coldRes, int shockRes, Power power){
		this(id,-1,-1);
		this.hardness = hardness;
		this.normalRes = normalRes;
		this.fireRes = fireRes;
		this.coldRes = coldRes;
		this.shockRes = shockRes;
		this.power = power;
	}
	
	public int getHardness(){
		return hardness;
	}
	
	public int getNormalRes(){
		return normalRes;
	}
	
	public int getFireRes(){
		return fireRes;
	}
	
	public int getColdRes(){
		return coldRes;
	}
	
	public int getShockRes(){
		return shockRes;
	}
	
	public Power getPower(){
		return power;
	}
	
	public SquareBody getBody(){
		return body;
	}

	public void takeDamageFrom(Ball ball) {
		hardness -= Math.max(0, ball.getNormalDamage()-normalRes);
		hardness -= Math.max(0, ball.getFireDamage()-fireRes);
		hardness -= Math.max(0, ball.getColdDamage()-coldRes);
		hardness -= Math.max(0, ball.getShockDamage()-shockRes);	
	}
	
	public boolean isDestroyed(){
		return hardness<=0;
	}
}
