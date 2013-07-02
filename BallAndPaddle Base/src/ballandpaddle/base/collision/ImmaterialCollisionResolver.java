package ballandpaddle.base.collision;

import ballandpaddle.base.Ball;
import ballandpaddle.base.Block;
import ballandpaddle.base.collision.body.CircleBody;
import ballandpaddle.base.collision.body.SquareBody;

public class ImmaterialCollisionResolver extends CollisionResolver {

	private static ImmaterialCollisionResolver INSTANCE;
	
	public static ImmaterialCollisionResolver getInstance() {
		if (INSTANCE == null)
			INSTANCE = new ImmaterialCollisionResolver();
		return INSTANCE;
	}
	
	@Override
	protected void resolveCollision(Ball ball, Block block){
		block.setDestroyed(true);
		//destroy the block, ball continues on course
	}
	
	
}
