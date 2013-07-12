package bp.base.collision;

import bp.base.*;
import bp.base.collision.body.*;

public class StandardCollisionResolver extends CollisionResolver{

	/**
	 * Resolves the collision between two BAPObjects
	 * @param moved The object that moved
	 * @param other The object that got hit
	 */
	public static void resolveCollision(BPObject moved, BPObject other) {
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
	protected static void resolveCollision(Ball moved, BPObject other){
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
	protected static void resolveCollision(Paddle moved, BPObject other){
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
	protected static void resolveCollision(SpawnedPower moved, BPObject other){
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
		double topY = other.getTopLeft().getPointY();
		//bottom
		double bottomY = other.getBottomRight().getPointY();
		//left
		double leftX = other.getTopLeft().getPointX();
		//right
		double rightX = other.getBottomRight().getPointX();
		//ball
		double ballYBottom = moved.getCenter().getPointY()+moved.getR();
		double ballYTop = moved.getCenter().getPointY()-moved.getR();
		double ballXLeft = moved.getCenter().getPointX()-moved.getR();
		double ballXRight = moved.getCenter().getPointX()+moved.getR();
		
		//hit right side?
		if(ball.getOrientation()>90 && ball.getOrientation()<270){
			boolean rightHit = ballXLeft<rightX && ballXLeft>leftX && ballXRight>rightX && ballXRight>leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
			if(rightHit)
				ball.oneEightyOrientation();		
		}
		//hit left side?
		if((ball.getOrientation()>270 && ball.getOrientation()<360) || (ball.getOrientation()<90 && ball.getOrientation()>0)){
			boolean leftHit = ballXRight<rightX && ballXRight>leftX && ballXLeft<rightX && ballXLeft<leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
			if(leftHit)
				ball.oneEightyOrientation();
		}
		//hit bottom side?
		
		if(ball.getOrientation()>180 && ball.getOrientation()<360){
			boolean bottomHit = ballYTop>topY && ballYTop<bottomY && ballYBottom>topY && ballYBottom>bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
			if(bottomHit)
				ball.threeSixtyOrientation();
		}
		//hit top side?
		if(ball.getOrientation()>0 && ball.getOrientation()<180){
			boolean topHit = ballYBottom>topY && ballYBottom<bottomY && ballYTop<topY && ballYTop<bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
			if(topHit)
				ball.threeSixtyOrientation();			
		}		
			block.takeDamageFrom(ball);
			moved.undoMove();		
	}
	
}
