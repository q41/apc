package ballandpaddle.base.collision;

import ballandpaddle.base.BAPObject;
import ballandpaddle.base.Ball;
import ballandpaddle.base.Block;
import ballandpaddle.base.Paddle;
import ballandpaddle.base.SpawnedPower;

public class ImmaterialCollisionResolver extends CollisionResolver {

	public static void resolveCollision(BAPObject moved, BAPObject other) {
		if(moved instanceof Ball)
			resolveCollision((Ball) moved, other);
		else if(moved instanceof Paddle)
			resolveCollision((Paddle) moved, other);
		else if(moved instanceof SpawnedPower){
			resolveCollision((SpawnedPower)moved, other);
		}
	}
	
	protected static void resolveCollision(Ball moved, BAPObject other){
		if(other instanceof ballandpaddle.base.Border)
			resolveCollision(moved, (ballandpaddle.base.Border)other);
		else if(other instanceof Paddle)
			resolveCollision(moved, (Paddle)other);
		else if(other instanceof Block)
			resolveCollision(moved, (Block)other);
	}
	
	protected static void resolveCollision(Paddle moved, BAPObject other){
		if(other instanceof ballandpaddle.base.Border)
			resolveCollision(moved, (ballandpaddle.base.Border)other);
		else if(other instanceof Ball)
			resolveCollision((Ball)other, moved);
		else if(other instanceof SpawnedPower)
			resolveCollision((SpawnedPower)other, moved);
	}	
	
	protected static void resolveCollision(SpawnedPower moved, BAPObject other){
		if(other instanceof ballandpaddle.base.Border)
			resolveCollision(moved, (ballandpaddle.base.Border)other);
		else if(other instanceof Paddle)
			resolveCollision(moved,(Paddle)other);
	}
	
	protected static void resolveCollision(Ball ball, Block block){
		block.setDestroyed(true);
		//destroy the block, ball continues on course
	}
	
	
}
