package bp.base.collision;

import bp.base.*;
import bp.base.collision.body.*;

public abstract class CollisionResolver {
	
	/**
	 * Resolves the collision between a Ball and block,
	 * The ball will bounce off the block after checking which side got hit.
	 * @param moved The ball that moved
	 * @param other The block that got hit
	 */
	public static void resolveCollision(Ball ball, Block block){
		if(ball.getImmaterial())
			block.setDestroyed(true);
		else{
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
			int orientation = ball.getOrientation();
			if(orientation<0)
				orientation+=360;
			orientation = orientation%360;	
			//hit right side?
			if(orientation>90 && orientation<270){
				boolean rightHit = ballXLeft<rightX && ballXLeft>leftX && ballXRight>rightX && ballXRight>leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
				if(rightHit)
					ball.oneEightyOrientation();		
			}
			//hit left side?
			if((orientation>270 && orientation<360) || (orientation<90 &&orientation>0)){
				boolean leftHit = ballXRight<rightX && ballXRight>leftX && ballXLeft<rightX && ballXLeft<leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
				if(leftHit)
					ball.oneEightyOrientation();
			}
			//hit bottom side?
		
			if(orientation>180 && orientation<360){
				boolean bottomHit = ballYTop>topY && ballYTop<bottomY && ballYBottom>topY && ballYBottom>bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
				if(bottomHit)
					ball.threeSixtyOrientation();
			}
			//hit top side?
			if(orientation>0 && orientation<180){
				boolean topHit = ballYBottom>topY && ballYBottom<bottomY && ballYTop<topY && ballYTop<bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
				if(topHit)
					ball.threeSixtyOrientation();			
			}		
				block.takeDamageFrom(ball);
				moved.undoMove();	
		}
	}
	
	/**
	 * Resolves a collision that happened between the ball and border,
	 * modifying the collision of the ball so it changes course
	 * @param ball the ball
	 * @param border the border
	 */
	public static void resolveCollision(Ball ball, bp.base.Border border){
		int orientation = ball.getOrientation();
		if(orientation<0)
			orientation+=360;
		orientation = orientation%360;	
		
		if(border.id.equals("left") && orientation>90 && orientation<270){
			ball.oneEightyOrientation();
		}
		else if(border.id.equals("right") && ((orientation>270 && orientation<=360) || (orientation<90 && orientation>=0))){
			ball.oneEightyOrientation();
		}
		else if(border.id.equals("top") && orientation>180 && orientation<360){
			ball.threeSixtyOrientation();
		}
		else if(border.id.equals("bottom") && orientation>0 && orientation<180){
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
	public static void resolveCollision(Ball ball, Paddle paddle){
		CircleBody moved = (CircleBody) ball.getBody();
		RectangleBody other = (RectangleBody) paddle.getBody();		
		double topLeftX = other.getTopLeft().getPointX();
		double bottomRightX = other.getBottomRight().getPointX();
		double length = bottomRightX-topLeftX;		
		
		int orientation = ball.getOrientation();
		if(orientation<0)
			orientation+=360;
		orientation = orientation%360;	
		if(orientation<180){
			int newOrient = (int) (200+(moved.getCenter().getPointX() - topLeftX)/length*140);	
			ball.adjustOrientation(newOrient-orientation);
		}	
		else{
			int newOrient = (int) (20+(moved.getCenter().getPointX() - topLeftX)/length*140);
			ball.adjustOrientation(newOrient-orientation);
		}
		
		//modify ball speed depending on orientation of ball and paddle
		double matchDir = 0.0;
		if(orientation>=180 && orientation <=270 && paddle.getDirection() >= 180 && paddle.getDirection() <= 270){
			matchDir = Math.abs(orientation-paddle.getDirection());
			if(matchDir<10){
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}					
		}
		else if(orientation>=270 && orientation <=359 && paddle.getDirection() >= 270 && paddle.getDirection() <= 359){
			matchDir = Math.abs(orientation-paddle.getDirection());
			if(matchDir<10){
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}
		}
		else if(orientation>=0 && orientation <=90 && paddle.getDirection() >= 0 && paddle.getDirection() <= 90){
			matchDir = Math.abs(orientation-paddle.getDirection());
			if(matchDir<10){
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}
		}
		else if(orientation>=90 && orientation <=180 && paddle.getDirection() >= 90 && paddle.getDirection() <= 180){
			matchDir = Math.abs(orientation-paddle.getDirection());
			if(matchDir<10){
				ball.multSpeed(1.1);
			}
			else if(matchDir<25){
				ball.multSpeed(1.05);
			}
		}
		if(Math.abs(orientation-270)<10)
			ball.multSpeed(0.80);
		else if(Math.abs(orientation-270)<20)
			ball.multSpeed(0.90);
		else if(Math.abs(orientation-270)<25)
			ball.multSpeed(0.95);
		else if(Math.abs(orientation-270)>65)
			ball.multSpeed(1.05);
		else if(Math.abs(orientation-270)>70)
			ball.multSpeed(1.10);
		else if(Math.abs(orientation-270)>80)
			ball.multSpeed(1.20);	
	}
	
	/**
	 * Resolves the collision between the paddle and border,
	 * by setting the paddle right next to the border
	 * @param paddle the paddle
	 * @param border the border
	 */
	public static void resolveCollision(Paddle paddle, bp.base.Border border){
		//can't move beyond the wall, so move the paddle back to before it collided
		if(paddle.getDirection()>0){
			double adjustX = ((bp.base.collision.body.Border)border.getBody()).getEnd().getPointX()-((RectangleBody)paddle.getBody()).getBottomRight().getPointX();
			((MovableBody)paddle.getBody()).moveBy(adjustX, 0);			
		}
		else if(paddle.getDirection()<0){
			double adjustX = ((bp.base.collision.body.Border)border.getBody()).getStart().getPointX()-((RectangleBody)paddle.getBody()).getTopLeft().getPointX();
			((MovableBody)paddle.getBody()).moveBy(adjustX, 0);	
		}		
	}
	
	/**
	 * Resolves the collision between the paddle and ball
	 * @param paddle the paddle
	 * @param ball the ball
	 */
	public static void resolveCollision(Paddle paddle, Ball ball){
		resolveCollision(ball, paddle);
	}
	
	/**
	 * Resolves the collision between the paddle and power
	 * @param power the power
	 * @param ball the ball
	 */
	public static void resolveCollision(Paddle paddle, SpawnedPower power){
		resolveCollision(power, paddle);
	}
	
	/**
	 * Resolves the collision between the power and border,
	 * by destroying the power
	 * @param power the power
	 * @param border the border
	 */
	public static void resolveCollision(SpawnedPower power, bp.base.Border border){
		power.setDestroyed(true);
	}
	
	/**
	 * Resolves the collision between the power and paddle,
	 * by setting the power as caught
	 * @param power the power
	 * @param paddle the paddle
	 */
	public static void resolveCollision(SpawnedPower power, Paddle paddle){
		power.setCaught(true);
	}
	

	
	
}
