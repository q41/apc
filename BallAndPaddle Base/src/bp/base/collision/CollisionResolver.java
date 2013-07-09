package bp.base.collision;

import bp.base.*;
import bp.base.collision.body.Border;
import bp.base.collision.body.CircleBody;
import bp.base.collision.body.RectangleBody;

public abstract class CollisionResolver {
	
	/**
	 * Resolves a collision that happened between the ball and border,
	 * modifying the collision of the ball so it changes course
	 * @param ball the ball
	 * @param border the border
	 */
	protected static void resolveCollision(Ball ball, bp.base.Border border){
		if(border.getId().equals("left") && ball.getDirection()>90 && ball.getDirection()<270){
			ball.OneEightyDirection();
		}
		else if(border.getId().equals("right") && ((ball.getDirection()>270 && ball.getDirection()<=360) || (ball.getDirection()<90 && ball.getDirection()>=0))){
			ball.OneEightyDirection();
		}
		else if(border.getId().equals("top") && ball.getDirection()>180 && ball.getDirection()<360){
			ball.threeSixtyDirection();
		}
		else if(border.getId().equals("bottom") && ball.getDirection()>0 && ball.getDirection()<180){
			ball.threeSixtyDirection();
			ball.setDestroyed(true);
		}		
		ball.getBody().undoMove();
		
	}
	
	/**
	 * Resolves the collision that happened between the ball and paddle.
	 * The closer the ball hit the paddle in the center the more straight it is launched upwards and slowed.
	 * Collisions near the side of the paddle result in a steeper launch at a faster speed.
	 * @param ball the ball
	 * @param paddle the paddle
	 */
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
	
	/**
	 * Resolves the collision between the paddle and border,
	 * by setting the paddle right next to the border
	 * @param paddle the paddle
	 * @param border the border
	 */
	protected static void resolveCollision(Paddle paddle, bp.base.Border border){
		//can't move beyond the wall, so move the paddle back to before it collided
		if(paddle.getDirection()>0){
			double adjustX = ((Border)border.getBody()).getEnd().getX()-((RectangleBody)paddle.getBody()).getBottomRightX();
			paddle.getBody().moveBy(adjustX, 0);			
		}
		else if(paddle.getDirection()<0){
			double adjustX = ((Border)border.getBody()).getStart().getX()-((RectangleBody)paddle.getBody()).getTopLeftX();
			paddle.getBody().moveBy(adjustX, 0);	
		}		
	}
	
	/**
	 * Resolves the collision between the power and border,
	 * by destroying the power
	 * @param power the power
	 * @param border the border
	 */
	protected static void resolveCollision(SpawnedPower power, bp.base.Border border){
		power.setDestroyed(true);
	}
	
	/**
	 * Resolves the collision between the power and paddle,
	 * by setting the power as caught
	 * @param power the power
	 * @param paddle the paddle
	 */
	protected static void resolveCollision(SpawnedPower power, Paddle paddle){
		power.setCaught(true);
	}
	

	
	
}
