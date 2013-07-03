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
	
	public static void checkForCollision(BAPObject object) {
		if(object instanceof Ball)
			checkForCollision((Ball)object);
		else if(object instanceof SpawnedPower)
			checkForCollision((SpawnedPower)object);
		else if(object instanceof Paddle)
			checkForCollision((Paddle)object);		
	}
	
	public static void checkForCollision(SpawnedPower power) {
		Level level = Level.getInstance();
		collision(power, level.getBorders()[3], CollisionResolver.getInstance());
		for(Paddle paddle : level.getPaddles()){
			collision(power, paddle, CollisionResolver.getInstance());
		}	
	}

	public static void checkForCollision(Ball ball) {
		Level level = Level.getInstance();
		for(ballandpaddle.base.Border border : level.getBorders()){
			collision(ball, border, CollisionResolver.getInstance());
		}
		for(Paddle paddle : level.getPaddles()){
			collision(ball, paddle, CollisionResolver.getInstance());
		}				
		for(Block block : level.getBlocks()){
			collision(ball, block, CollisionResolver.getInstance());
		}
	}
	
	public static void checkForCollision(Paddle paddle) {
		Level level = Level.getInstance();
		if(paddle.getDirection()>0)
			collision(paddle, level.getBorders()[2], CollisionResolver.getInstance());
		else if(paddle.getDirection()<0)
				collision(paddle, level.getBorders()[1], CollisionResolver.getInstance());
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
	
	public static boolean collision(BAPObject moved, BAPObject other, CollisionResolver resolver){
		if(lastCollision == null)
			lastCollision = new HashMap<BAPObject, BAPObject>();
		Body first = moved.getBody();
		Body second = other.getBody();
		if(hasCollided(first, second)){
			resolver.resolveCollision(moved, other);
			lastCollision.put(moved, other);			
			return true;
		}
		return false;
	}
	
	private static boolean hasCollided(Body moved, Body other){
		if(moved instanceof CircleBody)
			//check if the last collision of moved was with other, if so then it can't have collided with it again right away
			//and thus there is no need to check if they collided
			if(!lastCollision.containsKey(moved) || (lastCollision.containsKey(moved) && !lastCollision.get(moved).equals(other)))
				return hasCollided((CircleBody)moved, other);				
			else
				return false;
		else if(moved instanceof RectangleBody)
			return hasCollided((RectangleBody)moved, other);
		else if(moved instanceof SquareBody)
			return hasCollided((SquareBody)moved, other);
		return false;
	}
	
	private static boolean hasCollided(CircleBody ball, Body other){
		if(other instanceof Border)
			return hasCollided(ball, (Border)other);
		else if(other instanceof RectangleBody)
			return hasCollided(ball, (RectangleBody)other);
		else if(other instanceof SquareBody)
			return hasCollided(ball, (SquareBody)other);
		return false;
	}
	
	private static boolean hasCollided(RectangleBody paddle, Body other){
		if(other instanceof Border)
			return hasCollided(paddle, (Border)other);
		else if(other instanceof CircleBody)
			return hasCollided(paddle, (CircleBody)other);
		else if(other instanceof SquareBody)
			return hasCollided((SquareBody)other, paddle);
		return false;
	}	
	
	private static boolean hasCollided(SquareBody power, Body other){
		if(other instanceof Border)
			return hasCollided(power, (Border)other);
		else if(other instanceof RectangleBody)
			return hasCollided(power, (RectangleBody)other);
		return false;
	}
	
	private static boolean hasCollided(CircleBody ball, Border border){
		if(border.getStart().getX()==border.getEnd().getX())
			return border.getStart().getX()> ball.getCenter().getX()-ball.getR() && border.getStart().getX()<ball.getCenter().getX()+ball.getR();
		else if(border.getStart().getY()==border.getEnd().getY()){
			return border.getStart().getY()> ball.getCenter().getY()-ball.getR() && border.getStart().getY()<ball.getCenter().getY()+ball.getR();
		}
		else
			return false;		
	}
	
	private static boolean hasCollided(CircleBody ball, RectangleBody paddle){
		return intersectsTop(ball, paddle) || intersectsLeft(ball, paddle) || intersectsBottom(ball, paddle) || intersectsRight(ball, paddle);
	}
	
	private static boolean hasCollided(CircleBody ball, SquareBody block){
		//split up the square into 4 parts, bottom, left, right, top. 
		//top
		double topY = block.getTopLeft().getY();
		//bottom
		double bottomY = block.getBottomRight().getY();
		//left
		double leftX = block.getTopLeft().getX();
		//right
		double rightX = block.getBottomRight().getX();
		//ball
		double ballYBottom = ball.getCenter().getY()+ball.getR();
		double ballYTop = ball.getCenter().getY()-ball.getR();
		double ballXLeft = ball.getCenter().getX()-ball.getR();
		double ballXRight = ball.getCenter().getX()+ball.getR();
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
	
	private static boolean hasCollided(RectangleBody paddle, Border border){
		if(border.getStart().getX()==border.getEnd().getX())
			return (border.getStart().getX()>paddle.getTopLeft().getX() && border.getEnd().getX()<paddle.getBottomRight().getX()) ||
					(border.getEnd().getX()>paddle.getTopLeft().getX() && border.getStart().getX()<paddle.getBottomRight().getX());
		else if(border.getStart().getY()==border.getEnd().getY())
			return (border.getStart().getY()>paddle.getTopLeft().getY() && border.getEnd().getY()<paddle.getBottomRight().getY()) ||
					(border.getEnd().getY()>paddle.getTopLeft().getY() && border.getStart().getY()<paddle.getBottomRight().getY());
		else
			return false;	
	}
	
	private static boolean hasCollided(RectangleBody paddle, CircleBody ball){
		return hasCollided(ball, paddle);
	}
	
	private static boolean hasCollided(SquareBody power, Border border){
		return (border.getStart().getY()>power.getTopLeft().getY() && border.getEnd().getY()<power.getBottomRight().getY()) ||
				(border.getEnd().getY()>power.getTopLeft().getY() && border.getStart().getY()<power.getBottomRight().getY());
	}
	
	private static boolean hasCollided(SquareBody power, RectangleBody paddle){
		return intersectsTop(power, paddle) || intersectsLeft(power, paddle) || intersectsRight(power, paddle);
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
		double bottomRightX = paddle.getBottomRight().getX();
		double bottomRightY = paddle.getBottomRight().getY();
		boolean centerHitTop = ball.getCenter().getX()>topLeftX && ball.getCenter().getX()<bottomRightX;
		boolean leftHitTop = ball.getCenter().getX()-ball.getR()>topLeftX && ball.getCenter().getX()-ball.getR()<bottomRightX;
		boolean rightHitTop = ball.getCenter().getX()+ball.getR()>topLeftX && ball.getCenter().getX()+ball.getR()<bottomRightX;
		return (centerHitTop || leftHitTop || rightHitTop) && ball.getCenter().getY()+ball.getR()>topLeftY && ball.getCenter().getY()+ball.getR()<bottomRightY;
	}
	
	private static boolean intersectsLeft(CircleBody ball, RectangleBody paddle) {
		double topLeftX = paddle.getTopLeft().getX();
		double topLeftY = paddle.getTopLeft().getY();
		double bottomRightX = paddle.getBottomRight().getX();
		double bottomRightY = paddle.getBottomRight().getY();
		boolean centerHitLeft = ball.getCenter().getY()>topLeftY && ball.getCenter().getY()<bottomRightY;
		boolean leftHitLeft = ball.getCenter().getY()-ball.getR()>topLeftY && ball.getCenter().getY()-ball.getR()<bottomRightY;
		boolean rightHitLeft = ball.getCenter().getY()+ball.getR()>topLeftY && ball.getCenter().getY()+ball.getR()<bottomRightY;
		return (centerHitLeft || leftHitLeft || rightHitLeft) && ball.getCenter().getX()-ball.getR()<bottomRightX && ball.getCenter().getX()-ball.getR()>topLeftX;
	}

	private static boolean intersectsBottom(CircleBody ball, RectangleBody paddle) {
		double topLeftX = paddle.getTopLeft().getX();
		double topLeftY = paddle.getTopLeft().getY();
		double bottomRightX = paddle.getBottomRight().getX();
		double bottomRightY = paddle.getBottomRight().getY();
		boolean centerHitBottom = ball.getCenter().getX()>topLeftX && ball.getCenter().getX()<bottomRightX;
		boolean leftHitBottom = ball.getCenter().getX()-ball.getR()>topLeftX && ball.getCenter().getX()-ball.getR()<bottomRightX;
		boolean rightHitBottom = ball.getCenter().getX()+ball.getR()>topLeftX && ball.getCenter().getX()+ball.getR()<bottomRightX;
		return (centerHitBottom || leftHitBottom || rightHitBottom) && ball.getCenter().getY()-ball.getR()<bottomRightY && ball.getCenter().getY()-ball.getR()>topLeftY;
	}

	private static boolean intersectsRight(CircleBody ball, RectangleBody paddle) {
		double topLeftX = paddle.getTopLeft().getX();
		double topLeftY = paddle.getTopLeft().getY();
		double bottomRightX = paddle.getBottomRight().getX();
		double bottomRightY = paddle.getBottomRight().getY();
		boolean centerHitRight = ball.getCenter().getY()>topLeftY && ball.getCenter().getY()<bottomRightY;
		boolean leftHitRight = ball.getCenter().getY()-ball.getR()>topLeftY && ball.getCenter().getY()-ball.getR()<bottomRightY;
		boolean rightHitRight = ball.getCenter().getY()+ball.getR()>topLeftY && ball.getCenter().getY()+ball.getR()<bottomRightY;
		return (centerHitRight || leftHitRight || rightHitRight) && ball.getCenter().getX()+ball.getR()<bottomRightX && ball.getCenter().getX()+ball.getR()>topLeftX;
	}
	
	
	
	
}
