package bp.base;

import bp.base.collision.body.*;

public class Block extends BPObject {

	/**
	 * The amount of life of this block
	 */
	private int hardness;
	/**
	 * the resitance to damge of this block
	 */
	private int resistance;
	/**
	 * The power this block will drop when destroyed, if any
	 */
	private Power power;
	
	/**
	 * The size of this block
	 */
	private final double size = 1;
	/**
	 * Size bounds
	 */
	private final double upperSizeLimit = 1;
	private final double lowerSizeLimit = 1;
	
	/**
	 * Creates a new block with the given id, x and y coordinates
	 * A SquareBody is created for the block using these coordinates
	 * @param id the identifier of this block
	 * @param x the x coordinate of this block
	 * @param y the y coordinate of this block
	 */
	private Block(String id, double x, double y) {
		super(id, x, y);
		super.setBody(new RectangleBody(this));
	}
	
	/**
	 * Creates a new block from an x and y coordinate
	 * and another block
	 * @param x the x coordinate of this block
	 * @param y the y coordinate of this block
	 * @param b the other block that this block will inherit it's traits from
	 */
	public Block(double x, double y, Block b){
		this(b.id, x, y);
		this.hardness = b.getHardness();
		this.resistance = b.getResistance();
		this.power = b.getPower();
	}
	
	/**
	 * Creates a new block without a location,
	 * this is used to generate new blocks from
	 * @param id the id of this block
	 * @param hardness the health of this block
	 * @param resistance the resistance of this block
	 * @param power the power of this block, if any
	 */
	public Block(String id, int hardness, int resistance, Power power){
		this(id,-1,-1);
		this.hardness = hardness;
		this.resistance = resistance;
		this.power = power;
	}
	
	/**
	 * Returns the health of this block
	 * @return the hardness
	 */
	public int getHardness(){
		return hardness;
	}
	
	/**
	 * Returns the resistance of this block
	 * @return the resistance
	 */
	public int getResistance(){
		return resistance;
	}
	
	/**
	 * Returns the power of this block, or null if it has none
	 * @return the power
	 */
	public Power getPower(){
		return power;
	}

	/**
	 * The ball deals damage to the health of this block
	 * @param ball the ball dealing damage to the block
	 */
	public void takeDamageFrom(Ball ball) {
		hardness -= Math.max(0, ball.getDamage()-getResistance());
	}
	
	/**
	 * Returns if the block has been destroyed
	 * @return hardness<=0
	 */
	public boolean isDestroyed(){
		return getHardness()<=0;
	}

	/**
	 * Destroys a block if b is true
	 * @param b whether the block should be destroyed immediately
	 */
	public void setDestroyed(boolean b) {
		if(b)
			hardness = 0;		
	}

	/**
	 * Sets the power of this block
	 * @param power the new power
	 */
	public void setPower(Power power) {
		this.power = power;		
	}

	/**
	 * Returns the size of the block.
	 * @return the size of the block.
	 */
	public double getSize() {
		return size;
	}
	
	
	/**
	 * returns the x coordinate of this object when it was created
	 * @return x
	 */
	public double getX(){
		return x;
	}
	
	/**
	 * returns the y coordinate of this object when it was created
	 * @return y
	 */
	public double getY(){
		return y;
	}	
}
