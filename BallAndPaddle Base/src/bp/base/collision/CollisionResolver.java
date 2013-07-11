package bp.base.collision;

import bp.base.*;
import bp.base.collision.body.*;

public abstract class CollisionResolver {
	
	/**
	 * Resolves a collision that happened between the ball and border,
	 * modifying the collision of the ball so it changes course
	 * @param ball the ball
	 * @param border the border
	 */
	protected static void resolveCollision(Ball ball, bp.base.Border border){
		if(border.id.equals("left") && ball.getOrientation()>90 && ball.getOrientation()<270){
			ball.oneEightyOrientation();
		}
		else if(border.id.equals("right") && ((ball.getOrientation()>270 && ball.getOrientation()<=360) || (ball.getOrientation()<90 && ball.getOrientation()>=0))){
			ball.oneEightyOrientation();
		}
		else if(border.id.equals("top") && ball.getOrientation()>180 && ball.getOrientation()<360){
			ball.threeSixtyOrientation();
		}
		else if(border.id.equals("bottom") && ball.getOrientation()>0 && ball.getOrientation()<180){
			ball.threeSixtyOrientation();
			ball.setDestroyed(true);
		}		
		((MovableBody)ball.getBody()).undoMove();
		
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
		double topLeftX = other.getTopLeft().getPointX();
		double bottomRightX = other.getBottomRight().getPointX();
		double length = bottomRightX-topLeftX;		
		if(ball.getOrientation()<180)			
			ball.setOrientation((int) (200+(moved.getCenter().getPointX() - topLeftX)/length*140));	
		else
			ball.setOrientation((int) (20+(moved.getCenter().getPointX() - topLeftX)/length*140));
		
		//modify ball speed depending on orientation of ball and paddle
		double matchDir = 0.0;
		if(ball.getOrientation()>=180 && ball.getOrientation() <=270 && paddle.getOrientation() >= 180 && paddle.getOrientation() <= 270){
			matchDir = Math.abs(ball.getOrientation()-paddle.getOrientation());
			if(matchDir<10){
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}					
		}
		else if(ball.getOrientation()>=270 && ball.getOrientation() <=359 && paddle.getOrientation() >= 270 && paddle.getOrientation() <= 359){
			matchDir = Math.abs(ball.getOrientation()-paddle.getOrientation());
			if(matchDir<10){
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}
		}
		else if(ball.getOrientation()>=0 && ball.getOrientation() <=90 && paddle.getOrientation() >= 0 && paddle.getOrientation() <= 90){
			matchDir = Math.abs(ball.getOrientation()-paddle.getOrientation());
			if(matchDir<10){
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}
		}
		else if(ball.getOrientation()>=90 && ball.getOrientation() <=180 && paddle.getOrientation() >= 90 && paddle.getOrientation() <= 180){
			matchDir = Math.abs(ball.getOrientation()-paddle.getOrientation());
			if(matchDir<10){
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}
		}
		if(Math.abs(ball.getOrientation()-270)<10)
			ball.multSpeed(0.80);
		else if(Math.abs(ball.getOrientation()-270)<20)
			ball.multSpeed(0.90);
		else if(Math.abs(ball.getOrientation()-270)<25)
			ball.multSpeed(0.95);
		else if(Math.abs(ball.getOrientation()-270)>65)
			ball.multSpeed(1.05);
		else if(Math.abs(ball.getOrientation()-270)>70)
			ball.multSpeed(1.10);
		else if(Math.abs(ball.getOrientation()-270)>80)
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
		if(paddle.getOrientation()>0){
			double adjustX = ((bp.base.collision.body.Border)border.getBody()).getEnd().getPointX()-((RectangleBody)paddle.getBody()).getBottomRight().getPointX();
			((MovableBody)paddle.getBody()).moveBy(adjustX, 0);			
		}
		else if(paddle.getOrientation()<0){
			double adjustX = ((bp.base.collision.body.Border)border.getBody()).getStart().getPointX()-((RectangleBody)paddle.getBody()).getTopLeft().getPointX();
			((MovableBody)paddle.getBody()).moveBy(adjustX, 0);	
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
