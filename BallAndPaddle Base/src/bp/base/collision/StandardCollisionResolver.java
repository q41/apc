package bp.base.collision;

import bp.base.*;
import bp.base.collision.body.*;

public class StandardCollisionResolver extends CollisionResolver{

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
	 * The ball will bounce off the block after checking which side got hit.
	 * @param moved The ball that moved
	 * @param other The block that got hit
	 */
	private static void resolveCollision(Ball ball, Block block){
		CircleBody moved = (CircleBody) ball.getBody();
		RectangleBody other = (RectangleBody) block.getBody();
		//split up the square into 4 parts, bottom, left, right, top. 
		//top
		double topY = other.getTopLeft().getY();
		//bottom
		double bottomY = other.getBottomRight().getY();
		//left
		double leftX = other.getTopLeft().getX();
		//right
		double rightX = other.getBottomRight().getX();
		//ball
		double ballYBottom = moved.getCenter().getY()+moved.getR();
		double ballYTop = moved.getCenter().getY()-moved.getR();
		double ballXLeft = moved.getCenter().getX()-moved.getR();
		double ballXRight = moved.getCenter().getX()+moved.getR();
		
		//hit right side?
		if(ball.getDirection()>90 && ball.getDirection()<270){
			boolean rightHit = ballXLeft<rightX && ballXLeft>leftX && ballXRight>rightX && ballXRight>leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
			if(rightHit)
				ball.oneEightyDirection();		
		}
		//hit left side?
		if((ball.getDirection()>270 && ball.getDirection()<360) || (ball.getDirection()<90 && ball.getDirection()>0)){
			boolean leftHit = ballXRight<rightX && ballXRight>leftX && ballXLeft<rightX && ballXLeft<leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
			if(leftHit)
				ball.oneEightyDirection();
		}
		//hit bottom side?
		
		if(ball.getDirection()>180 && ball.getDirection()<360){
			boolean bottomHit = ballYTop>topY && ballYTop<bottomY && ballYBottom>topY && ballYBottom>bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
			if(bottomHit)
				ball.threeSixtyDirection();
		}
		//hit top side?
		if(ball.getDirection()>0 && ball.getDirection()<180){
			boolean topHit = ballYBottom>topY && ballYBottom<bottomY && ballYTop<topY && ballYTop<bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
			if(topHit)
				ball.threeSixtyDirection();			
		}		
			block.takeDamageFrom(ball);
			moved.undoMove();		
	}
	
}
