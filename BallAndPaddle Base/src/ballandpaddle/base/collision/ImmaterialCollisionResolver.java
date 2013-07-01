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
		//top hit?
		boolean topHit = ballYBottom>topY && ballYBottom<bottomY && ballYTop<topY && ballYTop<bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
		//bottom hit?
		boolean bottomHit = ballYTop>topY && ballYTop<bottomY && ballYBottom>topY && ballYBottom>bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
		//right hit?
		boolean rightHit = ballXLeft<rightX && ballXLeft>leftX && ballXRight>rightX && ballXRight>leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
		//left hit?
		boolean leftHit = ballXRight<rightX && ballXRight>leftX && ballXLeft<rightX && ballXLeft<leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
								
		//check which the ball has collided with to determine the new direction of the ball	
		int newDirection = ball.getDirection();
		if(topHit && rightHit){
			newDirection = newDirection - 180;
		}
		else if(topHit && leftHit){
			newDirection = newDirection - 180;
		}
		else if(topHit){
			newDirection = 360-newDirection;	
		}
		else if(bottomHit && rightHit){
			newDirection = newDirection + 180;
		}
		else if(bottomHit && leftHit){
			newDirection = newDirection + 180;
		}
		else if(bottomHit){
			newDirection = 360-newDirection;
		}
		else if(rightHit){
			newDirection = 180-newDirection;
		}
		else{
			newDirection = 180-newDirection;
		}
		ball.setDirection(newDirection);
		block.takeDamageFrom(ball);
		moved.undoMove();
	}
	
	
}
