package ballandpaddle.base;

import ballandpaddle.base.collision.body.*;

public class Block extends BAPObject {

	private int hardness;
	private int normalRes;
	private int fireRes;
	private int coldRes;
	private int shockRes;
	private Power power;
	
	public Block(String id, double x, double y) {
		super(id, x, y,  new SquareBody(new Point(x,y), new Point(x+1, y+1)));
	}
	
	public Block(double x, double y, Block b){
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

	public void takeDamageFrom(Ball ball) {
		hardness -= Math.max(0, ball.getNormalDamage()-normalRes);
		hardness -= Math.max(0, ball.getFireDamage()-fireRes);
		hardness -= Math.max(0, ball.getColdDamage()-coldRes);
		hardness -= Math.max(0, ball.getShockDamage()-shockRes);	
	}
	
	public boolean isDestroyed(){
		return hardness<=0;
	}

	@Override
	public final void update() {
		//TODO, do something if destroyed?
		
	}

	public void setDestroyed(boolean b) {
		if(b)
			hardness = 0;		
	}

	@Override
	public void calculateMove(double d, Level level) {
		// TODO Auto-generated method stub
		
	}
}
