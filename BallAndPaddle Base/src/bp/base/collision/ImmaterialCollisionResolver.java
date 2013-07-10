package bp.base.collision;

import bp.base.*;

public class ImmaterialCollisionResolver extends CollisionResolver {

	/**
	 * Resolves the collision between two BAPObjects
	 * @param moved The object that moved
	 * @param other The object that got hit
	 */
	public static void resolveCollision(BAPObject moved, BAPObject other) {
		if(moved instanceof Ball)
			resolveCollision((Ball) moved, other);
		else if(moved instanceof Paddle)
			resolveCollision((Paddle) moved, other);
		else if(moved instanceof SpawnedPower){
			resolveCollision((SpawnedPower)moved, other);
		}
	}
	
	/**
	 * Resolves the collision between a Ball and another BAPObject
	 * @param moved The ball that moved
	 * @param other The object that got hit
	 */
	protected static void resolveCollision(Ball moved, BAPObject other){
		if(other instanceof bp.base.Border)
			resolveCollision(moved, (bp.base.Border)other);
		else if(other instanceof Paddle)
			resolveCollision(moved, (Paddle)other);
		else if(other instanceof Block)
			resolveCollision(moved, (Block)other);
	}
	
	/**
	 * Resolves the collision between a Paddle and another BAPObject
	 * @param moved The paddle that moved
	 * @param other The object that got hit
	 */
	protected static void resolveCollision(Paddle moved, BAPObject other){
		if(other instanceof bp.base.Border)
			resolveCollision(moved, (bp.base.Border)other);
		else if(other instanceof Ball)
			resolveCollision((Ball)other, moved);
		else if(other instanceof SpawnedPower)
			resolveCollision((SpawnedPower)other, moved);
	}	
	
	/**
	 * Resolves the collision between a power and another BAPObject
	 * @param moved The power that moved
	 * @param other The object that got hit
	 */
	protected static void resolveCollision(SpawnedPower moved, BAPObject other){
		if(other instanceof bp.base.Border)
			resolveCollision(moved, (bp.base.Border)other);
		else if(other instanceof Paddle)
			resolveCollision(moved,(Paddle)other);
	}
	
	/**
	 * Resolves the collision between a Ball and block,
	 * resulting in the destruction of the block.
	 * The ball is not changed in any way and will continue as if nothing happened.
	 * @param moved The ball that moved
	 * @param other The block that got hit
	 */
	protected static void resolveCollision(Ball ball, Block block){
		block.setDestroyed(true);
		//destroy the block, ball continues on course
	}
	
	
}
