package ballandpaddle.base.collision;
import java.util.*;

import ballandpaddle.base.BAPObject;
import ballandpaddle.base.Ball;
import ballandpaddle.base.Block;
import ballandpaddle.base.Level;
import ballandpaddle.base.Paddle;
import ballandpaddle.base.SpawnedPower;
import ballandpaddle.base.collision.body.*;

public class Collision {

	private static Map<BAPObject, BAPObject> lastCollision;
	
	public static void checkForCollision(BAPObject object, Level level) {
		if(object instanceof Ball)
			checkForCollision((Ball)object, level);
		else if(object instanceof SpawnedPower)
			checkForCollision((SpawnedPower)object, level);
		else if(object instanceof Paddle)
			checkForCollision((Paddle)object, level);		
	}
	
	public static void checkForCollision(SpawnedPower power, Level level) {
		collision(power, level.getBorders()[3]);
		for(Paddle paddle : level.getPaddles()){
			collision(power, paddle);
		}	
	}

	public static void checkForCollision(Ball ball, Level level) {
		for(ballandpaddle.base.Border border : level.getBorders()){
			collision(ball, border);
		}
		for(Paddle paddle : level.getPaddles()){
			collision(ball, paddle);
		}				
		for(Block block : level.getBlocks()){
			collision(ball, block);
		}
	}
	
	public static void checkForCollision(Paddle paddle, Level level) {
		if(paddle.getDirection()>0)
			collision(paddle, level.getBorders()[2]);
		else if(paddle.getDirection()<0)
				collision(paddle, level.getBorders()[1]);
	}	
	
//	public static void collision(BAPObject moved, BAPObject other, CollisionResolver resolver){
//		if(lastCollision == null)
//			lastCollision = new HashMap<BAPObject, BAPObject>();
//		Body first = moved.getBody();
//		Body second = other.getBody();
//		if(hasCollided(first, second)){			
//			resolver.resolveCollision(moved, other);
//			lastCollision.put(moved, other);			
//		}
//	}
	
	public static boolean collision(BAPObject moved, BAPObject other){
		if(lastCollision == null)
			lastCollision = new HashMap<BAPObject, BAPObject>();
		if(hasCollided(moved, other)){
//			StandardCollisionResolver.resolveCollision(moved, other);
			lastCollision.put(moved, other);			
			return true;
		}
		return false;
	}
	
	private static boolean hasCollided(BAPObject moved, BAPObject other){
		boolean collision;
		if(moved instanceof Ball)
			//check if the last collision of moved was with other, if so then it can't have collided with it again right away
			//and thus there is no need to check if they collided
			if(!lastCollision.containsKey(moved) || (lastCollision.containsKey(moved) && !lastCollision.get(moved).equals(other)))
				collision = hasCollided((Ball)moved, other);				
			else
				collision = false;
		else if(moved instanceof Paddle)
			collision = hasCollided((Paddle)moved, other);
		else if(moved instanceof SpawnedPower)
			collision = hasCollided((SpawnedPower)moved, other);
		else
			collision = false;
		if(collision)
			haveCollided(moved, other);
		return collision;
	}
	
	private static void haveCollided(BAPObject moved, BAPObject other){}
	
	private static boolean hasCollided(Ball ball, BAPObject other){
		if(other instanceof ballandpaddle.base.Border)
			return hasCollided(ball, (ballandpaddle.base.Border)other);
		else if(other instanceof Paddle)
			return hasCollided(ball, (Paddle)other);
		else if(other instanceof Block)
			return hasCollided(ball, (Block)other);
		return false;
	}
	
	private static boolean hasCollided(Paddle paddle, BAPObject other){
		if(other instanceof ballandpaddle.base.Border)
			return hasCollided(paddle, (ballandpaddle.base.Border)other);
		else if(other instanceof Ball)
			return hasCollided(paddle, (Ball)other);
		else if(other instanceof SpawnedPower)
			return hasCollided((SpawnedPower)other, paddle);
		return false;
	}	
	
	private static boolean hasCollided(SpawnedPower power, BAPObject other){
		if(other instanceof ballandpaddle.base.Border)
			return hasCollided(power, (ballandpaddle.base.Border)other);
		else if(other instanceof Paddle)
			return hasCollided(power, (Paddle)other);
		return false;
	}
	
	private static boolean hasCollided(Ball ball, ballandpaddle.base.Border border){
		Border borderBody = (Border) border.getBody();
		CircleBody ballBody = (CircleBody) ball.getBody();
		if(borderBody.getStart().getX()==borderBody.getEnd().getX())
			return borderBody.getStart().getX()> ballBody.getCenter().getX()-ballBody.getR() && borderBody.getStart().getX()<ballBody.getCenter().getX()+ballBody.getR();
		else if(borderBody.getStart().getY()==borderBody.getEnd().getY()){
			return borderBody.getStart().getY()> ballBody.getCenter().getY()-ballBody.getR() && borderBody.getStart().getY()<ballBody.getCenter().getY()+ballBody.getR();
		}
		else
			return false;		
	}
	
	private static boolean hasCollided(Ball ball, Paddle paddle){
		CircleBody ballBody = (CircleBody) ball.getBody();
		RectangleBody paddleBody = (RectangleBody) paddle.getBody();
		return intersectsTop(ballBody, paddleBody) || intersectsLeft(ballBody, paddleBody) || intersectsBottom(ballBody, paddleBody) || intersectsRight(ballBody, paddleBody);
	}
	
	private static boolean hasCollided(Ball ball, Block block){
		CircleBody ballBody = (CircleBody) ball.getBody();
		SquareBody blockBody = (SquareBody) block.getBody();
		//split up the square into 4 parts, bottom, left, right, top. 
		//top
		double topY = blockBody.getTopLeft().getY();
		//bottom
		double bottomY = blockBody.getBottomRight().getY();
		//left
		double leftX = blockBody.getTopLeft().getX();
		//right
		double rightX = blockBody.getBottomRight().getX();
		//ball
		double ballYBottom = ballBody.getCenter().getY()+ballBody.getR();
		double ballYTop = ballBody.getCenter().getY()-ballBody.getR();
		double ballXLeft = ballBody.getCenter().getX()-ballBody.getR();
		double ballXRight = ballBody.getCenter().getX()+ballBody.getR();
		//top hit?
		boolean topHit = ballYBottom>topY && ballYBottom<bottomY && ballYTop<topY && ballYTop<bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
		//bottom hit?
		boolean bottomHit = ballYTop>topY && ballYTop<bottomY && ballYBottom>topY && ballYBottom>bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
		//right hit?
		boolean rightHit = ballXLeft<rightX && ballXLeft>leftX && ballXRight>rightX && ballXRight>leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
		//left hit?
		boolean leftHit = ballXRight<rightX && ballXRight>leftX && ballXLeft<rightX && ballXLeft<leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
						
		//check which the ball has collided with, if any	
		return topHit||bottomHit||rightHit||leftHit;	
	}
	
	private static boolean hasCollided(Paddle paddle, ballandpaddle.base.Border border){
		RectangleBody paddleBody = (RectangleBody) paddle.getBody();
		Border borderBody = (Border) border.getBody();
		if(borderBody.getStart().getX()==borderBody.getEnd().getX())
			return (borderBody.getStart().getX()>paddleBody.getTopLeft().getX() && borderBody.getEnd().getX()<paddleBody.getBottomRight().getX()) ||
					(borderBody.getEnd().getX()>paddleBody.getTopLeft().getX() && borderBody.getStart().getX()<paddleBody.getBottomRight().getX());
		else if(borderBody.getStart().getY()==borderBody.getEnd().getY())
			return (borderBody.getStart().getY()>paddleBody.getTopLeft().getY() && borderBody.getEnd().getY()<paddleBody.getBottomRight().getY()) ||
					(borderBody.getEnd().getY()>paddleBody.getTopLeft().getY() && borderBody.getStart().getY()<paddleBody.getBottomRight().getY());
		else
			return false;	
	}
	
	private static boolean hasCollided(Paddle paddle, Ball ball){
		return hasCollided(ball, paddle);
	}
	
	private static boolean hasCollided(SpawnedPower power, ballandpaddle.base.Border border){
		Border borderBody = (Border) border.getBody();
		SquareBody powerBody = (SquareBody) power.getBody();
		return (borderBody.getStart().getY()>powerBody.getTopLeft().getY() && borderBody.getEnd().getY()<powerBody.getBottomRight().getY()) ||
				(borderBody.getEnd().getY()>powerBody.getTopLeft().getY() && borderBody.getStart().getY()<powerBody.getBottomRight().getY());
	}
	
	private static boolean hasCollided(SpawnedPower power, Paddle paddle){
		SquareBody powerBody = (SquareBody) power.getBody();
		RectangleBody paddleBody = (RectangleBody) paddle.getBody();
		return intersectsTop(powerBody, paddleBody) || intersectsLeft(powerBody, paddleBody) || intersectsRight(powerBody, paddleBody);
	}
	
	private static boolean intersectsTop(SquareBody power, RectangleBody paddle){
		//power
		double powerLX = power.getTopLeft().getX();
		double powerRX = power.getBottomRight().getX();
		double powerY = power.getBottomRight().getY();
		
		//paddle
		double paddleLX = paddle.getTopLeft().getX();
		double paddleRX = paddle.getBottomRight().getX();
		double paddleTY = paddle.getTopLeft().getY();
		double paddleBY = paddle.getBottomRight().getY();
		
		return ((powerLX>=paddleLX && powerLX<=paddleRX) || (powerRX>=paddleLX && powerRX<=paddleRX)) &&
				powerY>=paddleTY && powerY<=paddleBY;
	}
	
	private static boolean intersectsLeft(SquareBody power, RectangleBody paddle){
		//power
		double powerRX = power.getBottomRight().getX();
		double powerTY = power.getTopLeft().getY();
		double powerBY = power.getBottomRight().getY();
		
		//paddle
		double paddleLX = paddle.getTopLeft().getX();
		double paddleRX = paddle.getBottomRight().getX();
		double paddleTY = paddle.getTopLeft().getY();
		double paddleBY = paddle.getBottomRight().getY();
		
		return ((powerTY>=paddleTY && powerTY<=paddleBY) || (powerBY>=paddleTY && powerBY<=paddleBY)) 
				&& powerRX>=paddleLX && powerRX<=paddleRX;
	}
	
	private static boolean intersectsRight(SquareBody power, RectangleBody paddle){
		//power
		double powerLX = power.getTopLeft().getX();
		double powerTY = power.getTopLeft().getY();
		double powerBY = power.getBottomRight().getY();
		
		//paddle
		double paddleLX = paddle.getTopLeft().getX();
		double paddleRX = paddle.getBottomRight().getX();
		double paddleTY = paddle.getTopLeft().getY();
		double paddleBY = paddle.getBottomRight().getY();
		
		return ((powerTY>=paddleTY && powerTY<=paddleBY) || (powerBY>=paddleTY && powerBY<=paddleBY)) 
				&& powerLX>=paddleLX && powerLX<=paddleRX;
	}
	
	
	private static boolean intersectsTop(CircleBody ball, RectangleBody paddle) {
		double topLeftX = paddle.getTopLeft().getX();
		double topLeftY = paddle.getTopLeft().getY();
		double bottomRightX = paddle.getBottomRightX();
		double bottomRightY = paddle.getBottomRightY();
		boolean centerHitTop = ball.getCenter().getX()>topLeftX && ball.getCenter().getX()<bottomRightX;
		boolean leftHitTop = ball.getCenter().getX()-ball.getR()>topLeftX && ball.getCenter().getX()-ball.getR()<bottomRightX;
		boolean rightHitTop = ball.getCenter().getX()+ball.getR()>topLeftX && ball.getCenter().getX()+ball.getR()<bottomRightX;
		return (centerHitTop || leftHitTop || rightHitTop) && ball.getCenter().getY()+ball.getR()>topLeftY && ball.getCenter().getY()+ball.getR()<bottomRightY;
	}
	
	private static boolean intersectsLeft(CircleBody ball, RectangleBody paddle) {
		double topLeftX = paddle.getTopLeft().getX();
		double topLeftY = paddle.getTopLeft().getY();
		double bottomRightX = paddle.getBottomRightX();
		double bottomRightY = paddle.getBottomRightY();
		boolean centerHitLeft = ball.getCenter().getY()>topLeftY && ball.getCenter().getY()<bottomRightY;
		boolean leftHitLeft = ball.getCenter().getY()-ball.getR()>topLeftY && ball.getCenter().getY()-ball.getR()<bottomRightY;
		boolean rightHitLeft = ball.getCenter().getY()+ball.getR()>topLeftY && ball.getCenter().getY()+ball.getR()<bottomRightY;
		return (centerHitLeft || leftHitLeft || rightHitLeft) && ball.getCenter().getX()-ball.getR()<bottomRightX && ball.getCenter().getX()-ball.getR()>topLeftX;
	}

	private static boolean intersectsBottom(CircleBody ball, RectangleBody paddle) {
		double topLeftX = paddle.getTopLeft().getX();
		double topLeftY = paddle.getTopLeft().getY();
		double bottomRightX = paddle.getBottomRightX();
		double bottomRightY = paddle.getBottomRightY();
		boolean centerHitBottom = ball.getCenter().getX()>topLeftX && ball.getCenter().getX()<bottomRightX;
		boolean leftHitBottom = ball.getCenter().getX()-ball.getR()>topLeftX && ball.getCenter().getX()-ball.getR()<bottomRightX;
		boolean rightHitBottom = ball.getCenter().getX()+ball.getR()>topLeftX && ball.getCenter().getX()+ball.getR()<bottomRightX;
		return (centerHitBottom || leftHitBottom || rightHitBottom) && ball.getCenter().getY()-ball.getR()<bottomRightY && ball.getCenter().getY()-ball.getR()>topLeftY;
	}

	private static boolean intersectsRight(CircleBody ball, RectangleBody paddle) {
		double topLeftX = paddle.getTopLeft().getX();
		double topLeftY = paddle.getTopLeft().getY();
		double bottomRightX = paddle.getBottomRightX();
		double bottomRightY = paddle.getBottomRightY();
		boolean centerHitRight = ball.getCenter().getY()>topLeftY && ball.getCenter().getY()<bottomRightY;
		boolean leftHitRight = ball.getCenter().getY()-ball.getR()>topLeftY && ball.getCenter().getY()-ball.getR()<bottomRightY;
		boolean rightHitRight = ball.getCenter().getY()+ball.getR()>topLeftY && ball.getCenter().getY()+ball.getR()<bottomRightY;
		return (centerHitRight || leftHitRight || rightHitRight) && ball.getCenter().getX()+ball.getR()<bottomRightX && ball.getCenter().getX()+ball.getR()>topLeftX;
	}
	
	
	
	
}
