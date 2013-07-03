package ballandpaddle.base.collision;

import ballandpaddle.base.BAPObject;
import ballandpaddle.base.Ball;
import ballandpaddle.base.Block;
import ballandpaddle.base.Paddle;
import ballandpaddle.base.SpawnedPower;
import ballandpaddle.base.collision.body.CircleBody;
import ballandpaddle.base.collision.body.SquareBody;

public class StandardCollisionResolver extends CollisionResolver{

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
	
	private static void resolveCollision(Ball ball, Block block){
		CircleBody moved = (CircleBody) ball.getBody();
		SquareBody other = (SquareBody) block.getBody();
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
		int newDirection = ball.getDirection();
		if(ball.getDirection()>90 && ball.getDirection()<270){
			boolean rightHit = ballXLeft<rightX && ballXLeft>leftX && ballXRight>rightX && ballXRight>leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
			if(rightHit)
				newDirection = 180-newDirection;			
		}
		//hit left side?
		if((ball.getDirection()>270 && ball.getDirection()<360) || (ball.getDirection()<90 && ball.getDirection()>0)){
			boolean leftHit = ballXRight<rightX && ballXRight>leftX && ballXLeft<rightX && ballXLeft<leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
			if(leftHit)
				newDirection = 180-newDirection;
		}
		//hit bottom side?
		
		if(ball.getDirection()>180 && ball.getDirection()<360){
			boolean bottomHit = ballYTop>topY && ballYTop<bottomY && ballYBottom>topY && ballYBottom>bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
			if(bottomHit)
				newDirection = 360-newDirection;			
		}
		//hit top side?
		if(ball.getDirection()>0 && ball.getDirection()<180){
			boolean topHit = ballYBottom>topY && ballYBottom<bottomY && ballYTop<topY && ballYTop<bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
			if(topHit)
				newDirection = 360-newDirection;				
		}		
			ball.setDirection(newDirection);
			block.takeDamageFrom(ball);
			moved.undoMove();		
	}
	
}
