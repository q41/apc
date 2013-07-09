package ballandpaddle.base.collision;

import ballandpaddle.base.*;
import ballandpaddle.base.collision.body.Border;
import ballandpaddle.base.collision.body.CircleBody;
import ballandpaddle.base.collision.body.RectangleBody;
import ballandpaddle.base.collision.body.SquareBody;

public abstract class CollisionResolver {
	
	protected static void resolveCollision(Ball ball, ballandpaddle.base.Border border){
		if(border.getId().equals("left") && ball.getDirection()>=90 && ball.getDirection()<=270){
			ball.OneEightyDirection();
			ball.getBody().undoMove();
		}
		else if(border.getId().equals("right") && ((ball.getDirection()>270 && ball.getDirection()<=360) || (ball.getDirection()<90 && ball.getDirection()>=0))){
			ball.OneEightyDirection();
			ball.getBody().undoMove();
		}
		else if(border.getId().equals("top") && ball.getDirection()>180 && ball.getDirection()<360){
			ball.threeSixtyDirection();
			ball.getBody().undoMove();
		}
		else if(border.getId().equals("bottom") && ball.getDirection()>0 && ball.getDirection()<180){
			ball.threeSixtyDirection();
			ball.getBody().undoMove();
			ball.setDestroyed(true);
		}		
		
	}
	
	protected static void resolveCollision(Ball ball, Paddle paddle){
		CircleBody moved = (CircleBody) ball.getBody();
		RectangleBody other = (RectangleBody) paddle.getBody();		
		double topLeftX = other.getTopLeftX();
		double bottomRightX = other.getBottomRightX();
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
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}					
		}
		else if(ball.getDirection()>=270 && ball.getDirection() <=359 && paddle.getDirection() >= 270 && paddle.getDirection() <= 359){
			matchDir = Math.abs(ball.getDirection()-paddle.getDirection());
			if(matchDir<10){
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}
		}
		else if(ball.getDirection()>=0 && ball.getDirection() <=90 && paddle.getDirection() >= 0 && paddle.getDirection() <= 90){
			matchDir = Math.abs(ball.getDirection()-paddle.getDirection());
			if(matchDir<10){
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}
		}
		else if(ball.getDirection()>=90 && ball.getDirection() <=180 && paddle.getDirection() >= 90 && paddle.getDirection() <= 180){
			matchDir = Math.abs(ball.getDirection()-paddle.getDirection());
			if(matchDir<10){
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}
		}
		if(Math.abs(ball.getDirection()-270)<10)
			ball.multSpeed(0.80);
		else if(Math.abs(ball.getDirection()-270)<20)
			ball.multSpeed(0.90);
		else if(Math.abs(ball.getDirection()-270)<25)
			ball.multSpeed(0.95);
		else if(Math.abs(ball.getDirection()-270)>65)
			ball.multSpeed(1.05);
		else if(Math.abs(ball.getDirection()-270)>70)
			ball.multSpeed(1.10);
		else if(Math.abs(ball.getDirection()-270)>80)
			ball.multSpeed(1.20);	
	}
	
	protected static void resolveCollision(Paddle paddle, ballandpaddle.base.Border border){
		//can't move beyond the wall, so move the paddle back to before it collided
		if(paddle.getDirection()>0){
			double adjustX = ((Border)border.getBody()).getEnd().getX()-((RectangleBody)paddle.getBody()).getBottomRightX();
			paddle.getBody().moveBy(adjustX, 0);			
		}
		else{
			double adjustX = ((Border)border.getBody()).getStart().getX()-((RectangleBody)paddle.getBody()).getTopLeftX();
			paddle.getBody().moveBy(adjustX, 0);	
		}		
	}
	
	protected static void resolveCollision(SpawnedPower power, ballandpaddle.base.Border border){
		power.setDestroyed(true);
	}
	
	protected static void resolveCollision(SpawnedPower power, Paddle paddle){
		power.setCaught(true);
	}
	

	
	
}
