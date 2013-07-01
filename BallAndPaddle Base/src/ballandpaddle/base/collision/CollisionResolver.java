package ballandpaddle.base.collision;

import ballandpaddle.base.*;
import ballandpaddle.base.collision.body.Body;
import ballandpaddle.base.collision.body.Border;
import ballandpaddle.base.collision.body.CircleBody;
import ballandpaddle.base.collision.body.RectangleBody;
import ballandpaddle.base.collision.body.SquareBody;

public class CollisionResolver {

	private static CollisionResolver INSTANCE;
	
	public static CollisionResolver getInstance() {
		if (INSTANCE == null)
			INSTANCE = new CollisionResolver();
		return INSTANCE;
	}
	
	public void resolveCollision(BAPObject moved, BAPObject other) {
		if(moved instanceof Ball)
			resolveBallCollision((Ball) moved, other);
		else if(moved instanceof Paddle)
			resolvePaddleCollision((Paddle) moved, other);
	}
	
	private void resolveBallCollision(Ball moved, BAPObject other){
		if(other instanceof ballandpaddle.base.Border)
			resolveCollision(moved, (ballandpaddle.base.Border)other);
		else if(other instanceof Paddle)
			resolveCollision(moved, (Paddle)other);
		else if(other instanceof Block)
			resolveCollision(moved, (Block)other);
	}
	
	private void resolvePaddleCollision(Paddle moved, BAPObject other){
		if(other instanceof ballandpaddle.base.Border)
			resolveCollision(moved, (ballandpaddle.base.Border)other);
		else if(other instanceof Ball)
			resolveCollision((Ball)other, moved);
	}	
	
	protected void resolveCollision(Ball ball, ballandpaddle.base.Border border){
		int newDirection = 0;
		if(border.getId().equals("left")){
			newDirection = 180-ball.getDirection();
			ball.setDirection(newDirection);
			ball.getBody().undoMove();
		}
		else if(border.getId().equals("right")){
			newDirection = 180-ball.getDirection();
			ball.setDirection(newDirection);
			ball.getBody().undoMove();
		}
		else if(border.getId().equals("top")){
			newDirection = 360-ball.getDirection();		
			ball.setDirection(newDirection);
			ball.getBody().undoMove();
		}
		else if(border.getId().equals("bottom")){
			newDirection = 360-ball.getDirection();			
			ball.setDirection(newDirection);
			ball.getBody().undoMove();
			ball.setDestroyed(true);
			//TODO, destroy the ball?
		}		
	}
	
	protected void resolveCollision(Ball ball, Paddle paddle){
		CircleBody moved = (CircleBody) ball.getBody();
		RectangleBody other = (RectangleBody) paddle.getBody();		
		double topLeftX = other.getTopLeft().getX();
		double bottomRightX = other.getBottomRight().getX();
		double length = bottomRightX-topLeftX;		
		if(ball.getDirection()<180)			
			ball.setDirection((int) (200+(moved.getCenter().getX() - topLeftX)/length*140));	
		else
			ball.setDirection((int) (20+(moved.getCenter().getX() - topLeftX)/length*140));
		
		//modify ball speed depending on direction of ball and paddle
		double matchDir = 0.0;
		if(ball.getDirection()>=180 && ball.getDirection() <=270 && paddle.getDirection() >= 180 && paddle.getDirection() <= 270){
			matchDir = Math.abs(ball.getDirection()-paddle.getDirection());
			if(matchDir<10){
				ball.setSpeed(ball.getSpeed()*1.1);
			}
			else if(matchDir<25){
				ball.setSpeed(ball.getSpeed()*1.05);
			}					
		}
		else if(ball.getDirection()>=270 && ball.getDirection() <=359 && paddle.getDirection() >= 270 && paddle.getDirection() <= 359){
			matchDir = Math.abs(ball.getDirection()-paddle.getDirection());
			if(matchDir<10){
				ball.setSpeed(ball.getSpeed()*1.1);
			}
			else if(matchDir<25){
				ball.setSpeed(ball.getSpeed()*1.05);
			}
		}
		else if(ball.getDirection()>=0 && ball.getDirection() <=90 && paddle.getDirection() >= 0 && paddle.getDirection() <= 90){
			matchDir = Math.abs(ball.getDirection()-paddle.getDirection());
			if(matchDir<10){
				ball.setSpeed(ball.getSpeed()*1.1);
			}
			else if(matchDir<25){
				ball.setSpeed(ball.getSpeed()*1.05);
			}
		}
		else if(ball.getDirection()>=90 && ball.getDirection() <=180 && paddle.getDirection() >= 90 && paddle.getDirection() <= 180){
			matchDir = Math.abs(ball.getDirection()-paddle.getDirection());
			if(matchDir<10){
				ball.setSpeed(ball.getSpeed()*1.1);
			}
			else if(matchDir<25){
				ball.setSpeed(ball.getSpeed()*1.05);
			}
		}
		if(Math.abs(ball.getDirection()-270)<10)
			ball.setSpeed(ball.getSpeed()*0.80);
		else if(Math.abs(ball.getDirection()-270)<20)
			ball.setSpeed(ball.getSpeed()*0.90);
		else if(Math.abs(ball.getDirection()-270)<25)
			ball.setSpeed(ball.getSpeed()*0.95);
		else if(Math.abs(ball.getDirection()-270)>65)
			ball.setSpeed(ball.getSpeed()*1.05);
		else if(Math.abs(ball.getDirection()-270)>70)
			ball.setSpeed(ball.getSpeed()*1.10);
		else if(Math.abs(ball.getDirection()-270)>80)
			ball.setSpeed(ball.getSpeed()*1.20);		
		
		ball.getBody().undoMove();
	}
	
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

	protected void resolveCollision(Paddle paddle, Border border){
		//can't move beyond the wall, so move the paddle back to before it collided
		paddle.getBody().undoMove();
	}
	
	
}
