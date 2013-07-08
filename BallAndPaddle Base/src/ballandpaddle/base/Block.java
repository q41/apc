package ballandpaddle.base;

import ballandpaddle.base.collision.body.*;

public class Block extends BAPObject {

	private int hardness;
	private int resistance;
	private Power power;
	
	public Block(String id, double x, double y) {
		super(id, x, y,  new SquareBody(new Point(x,y), new Point(x+1, y+1)));
	}
	
	public Block(double x, double y, Block b){
		this(b.getId(), x, y);
		this.hardness = b.getHardness();
		this.resistance = b.getResistance();
		this.power = b.getPower();
	}
	
	public Block(String id, int hardness, int resistance, Power power){
		this(id,-1,-1);
		this.hardness = hardness;
		this.resistance = resistance;
		this.power = power;
	}
	
	public int getHardness(){
		return hardness;
	}
	
	public int getResistance(){
		return resistance;
	}
	
	public Power getPower(){
		return power;
	}

	public void takeDamageFrom(Ball ball) {
		hardness -= Math.max(0, ball.getNormalDamage()-resistance);
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

	public void setPower(Power power) {
		this.power = power;		
	}
}
