package bp.base.collision;

import java.util.*;

import bp.base.*;
import bp.base.collision.body.*;

public class Collision {

	/**
	 * This is a naive collision detection implementation, A ball is checked
	 * against all borders, paddles and blocks to see if it has collided, even
	 * if some of them are nowhere near it's trajectory
	 */

	/**
	 * A mapping ob BAPObjects to BAPObjects, representing which BAPObject the
	 * key last collided with
	 */
	private static Map<BPObject, BPObject> lastCollision;

	/**
	 * Checks if the SpawnedPower collided with any paddles, or the bottom
	 * border
	 * 
	 * @param power
	 *            The power that moved
	 * @param level
	 *            The level
	 */
	public static void checkForCollision(SpawnedPower power, Level level) {
		if (lastCollision == null)
			lastCollision = new HashMap<BPObject, BPObject>();
		boolean collision = hasCollided(power, level.getBorders()[3]);
		if(collision){
			haveCollided(power, level.getBorders()[3]);
			return;
		}
		for (Paddle paddle : level.getPaddles()) {
			collision = hasCollided(power, paddle);
			if(collision){
				haveCollided(power, paddle);
				return;
			}
		}
	}

	/**
	 * Checks if the ball collided with a border, paddle or block
	 * 
	 * @param ball
	 *            The ball that moved
	 * @param level
	 *            The level
	 */
	public static void checkForCollision(Ball ball, Level level) {
		if (lastCollision == null)
			lastCollision = new HashMap<BPObject, BPObject>();
		boolean collision = false;
		for (bp.base.Border border : level.getBorders()) {
			collision = false;
			if(!(lastCollision.containsKey(ball) && lastCollision.get(ball).equals(border)))			
				collision = hasCollided(ball, border);
			if(collision){
				lastCollision.put(ball, border);
				haveCollided(ball, border);
			}
		}
		for (Paddle paddle : level.getPaddles()) {
			collision = false;
			if(!(lastCollision.containsKey(ball) && lastCollision.get(ball).equals(paddle)))			
				collision = hasCollided(ball, paddle);
			if(collision){
				lastCollision.put(ball, paddle);
				haveCollided(ball, paddle);
			}
		}
		for (Block block : level.getBlocks()) {
			collision = false;
			if(!(lastCollision.containsKey(ball) && lastCollision.get(ball).equals(block)))			
				collision = hasCollided(ball, block);
			if(collision){
				lastCollision.put(ball, block);
				haveCollided(ball, block);
			}
		}
	}

	/**
	 * Checks if the paddle collided with a border
	 * 
	 * @param paddle
	 *            The paddle that moved
	 * @param level
	 *            The level
	 */
	public static void checkForCollision(Paddle paddle, Level level) {
		if (lastCollision == null)
			lastCollision = new HashMap<BPObject, BPObject>();
		boolean collision = false;
		int borderIndex = 0;
		if (paddle.getOrientation() > 0 && !(lastCollision.containsKey(paddle) && lastCollision.get(paddle).equals(level.getBorders()[2]))){
			collision = hasCollided(paddle, level.getBorders()[2]);
			if(collision)
				borderIndex=2;
		}
		else if (paddle.getOrientation() < 0 && !(lastCollision.containsKey(paddle) && lastCollision.get(paddle).equals(level.getBorders()[1]))){
			collision = hasCollided(paddle, level.getBorders()[1]);
			if(collision)
				borderIndex=1;
		}
		if(collision){
			lastCollision.put(paddle, level.getBorders()[borderIndex]);
			haveCollided(paddle, level.getBorders()[borderIndex]);
		}
		//didn't hit border, but maybe it hit a ball or power
		//revert position of the two in order to reuse code
		for (Ball ball : level.getBalls()) {
			collision = false;
			if(!(lastCollision.containsKey(ball) && lastCollision.get(ball).equals(paddle)))			
				collision = hasCollided(ball, paddle);
			if(collision){
				lastCollision.put(ball, paddle);
				haveCollided(ball, paddle);
			}
		}
		for (SpawnedPower power : level.getSpawnedPowers()){
			collision = false;
			if(!(lastCollision.containsKey(power) && lastCollision.get(power).equals(paddle)))			
				collision = hasCollided(power, paddle);
			if(collision){
				lastCollision.put(power, paddle);
				haveCollided(power, paddle);
			}
		}
	}
	
	/**
	 * Called when a collision has been detected. This method forms a joinpoint
	 * for the collision handling aspect
	 * 
	 * @param moved
	 *            The moved object
	 * @param other
	 *            The other object
	 */
	private static void haveCollided(BPObject moved, BPObject other) {
	}

	/**
	 * Checks if there was a collision between the ball and border
	 * 
	 * @param ball
	 *            The ball that moved
	 * @param border
	 *            The border
	 * @return if the two objects collided
	 */
	private static boolean hasCollided(Ball ball, bp.base.Border border) {
		bp.base.collision.body.Border borderBody = (bp.base.collision.body.Border) border
				.getBody();
		CircleBody ballBody = (CircleBody) ball.getBody();
		if (borderBody.getStart().getPointX() == borderBody.getEnd()
				.getPointX()) {
			if (ball.getOrientation() > 90 && ball.getOrientation() < 270) {
				// check if the ball has collided with the left border
				return ballBody.getCenter().getPointX() - ballBody.getR() <= borderBody
						.getStart().getPointX()
						&& borderBody.getStart().getPointX() == 0;
			} else {
				// check if the ball has collided with the right border, make
				// sure it isn't the left border
				return ballBody.getCenter().getPointX() + ballBody.getR() >= borderBody
						.getStart().getPointX()
						&& borderBody.getStart().getPointX() != 0;
			}
		} else if (borderBody.getStart().getPointY() == borderBody.getEnd()
				.getPointY()) {
			if (ball.getOrientation() > 180 && ball.getOrientation() < 360) {
				// check if ball has collided with the top border
				return ballBody.getCenter().getPointY() - ballBody.getR() <= borderBody
						.getStart().getPointY()
						&& borderBody.getStart().getPointY() == 0;
			} else {
				// check if ball has collided with the bottom border
				return ballBody.getCenter().getPointY() + ballBody.getR() >= borderBody
						.getStart().getPointY()
						&& borderBody.getStart().getPointY() != 0;
			}
		} else
			return false;
	}

	/**
	 * Checks if there was a collision between the ball and paddle
	 * 
	 * @param ball
	 *            The ball that moved
	 * @param paddle
	 *            The paddle
	 * @return if the two objects collided
	 */
	private static boolean hasCollided(Ball ball, Paddle paddle) {
		CircleBody ballBody = (CircleBody) ball.getBody();
		RectangleBody paddleBody = (RectangleBody) paddle.getBody();
		return intersectsTop(ballBody, paddleBody)
				|| intersectsLeft(ballBody, paddleBody)
				|| intersectsBottom(ballBody, paddleBody)
				|| intersectsRight(ballBody, paddleBody);
	}

	/**
	 * Checks if there was a collision between the ball and block
	 * 
	 * @param ball
	 *            The ball that moved
	 * @param block
	 *            The block
	 * @return if the two objects collided
	 */
	private static boolean hasCollided(Ball ball, Block block) {
		CircleBody ballBody = (CircleBody) ball.getBody();
		RectangleBody blockBody = (RectangleBody) block.getBody();
		// split up the square into 4 parts, bottom, left, right, top.
		// top
		double topY = blockBody.getTopLeft().getPointY();
		// bottom
		double bottomY = blockBody.getBottomRight().getPointY();
		// left
		double leftX = blockBody.getTopLeft().getPointX();
		// right
		double rightX = blockBody.getBottomRight().getPointX();
		// ball
		double ballYBottom = ballBody.getCenter().getPointY() + ballBody.getR();
		double ballYTop = ballBody.getCenter().getPointY() - ballBody.getR();
		double ballXLeft = ballBody.getCenter().getPointX() - ballBody.getR();
		double ballXRight = ballBody.getCenter().getPointX() + ballBody.getR();
		// top hit?
		boolean topHit = ballYBottom > topY
				&& ballYBottom < bottomY
				&& ballYTop < topY
				&& ballYTop < bottomY
				&& ((ballXLeft > leftX && ballXLeft < rightX) || (ballXRight > leftX && ballXRight < rightX));
		// bottom hit?
		boolean bottomHit = ballYTop > topY
				&& ballYTop < bottomY
				&& ballYBottom > topY
				&& ballYBottom > bottomY
				&& ((ballXLeft > leftX && ballXLeft < rightX) || (ballXRight > leftX && ballXRight < rightX));
		// right hit?
		boolean rightHit = ballXLeft < rightX
				&& ballXLeft > leftX
				&& ballXRight > rightX
				&& ballXRight > leftX
				&& ((ballYBottom > topY && ballYBottom < bottomY) || (ballYTop > topY && ballYTop < bottomY));
		// left hit?
		boolean leftHit = ballXRight < rightX
				&& ballXRight > leftX
				&& ballXLeft < rightX
				&& ballXLeft < leftX
				&& ((ballYBottom > topY && ballYBottom < bottomY) || (ballYTop > topY && ballYTop < bottomY));
		// check which the ball has collided with, if any
		return topHit || bottomHit || rightHit || leftHit;
	}

	/**
	 * Checks if there was a collision between the paddle and border
	 * 
	 * @param paddle
	 *            The paddle that moved
	 * @param border
	 *            The border
	 * @return if the two objects collided
	 */
	private static boolean hasCollided(Paddle paddle, bp.base.Border border) {
		RectangleBody paddleBody = (RectangleBody) paddle.getBody();
		bp.base.collision.body.Border borderBody = (bp.base.collision.body.Border) border
				.getBody();
		if (borderBody.getStart().getPointX() == borderBody.getEnd()
				.getPointX())
			return (borderBody.getStart().getPointX() > paddleBody.getTopLeft()
					.getPointX() && borderBody.getStart().getPointX() < paddleBody
					.getBottomRight().getPointX());
		else if (borderBody.getStart().getPointY() == borderBody.getEnd()
				.getPointY())
			return (borderBody.getStart().getPointY() >= paddleBody
					.getTopLeft().getPointY() && borderBody.getStart()
					.getPointY() < paddleBody.getBottomRight().getPointY());
		else
			return false;
	}

	/**
	 * Checks if the power collided with the border
	 * 
	 * @param power
	 *            The spawned power that moved
	 * @param border
	 *            the border
	 * @return if the two objects collided
	 */
	private static boolean hasCollided(SpawnedPower power, bp.base.Border border) {
		bp.base.collision.body.Border borderBody = (bp.base.collision.body.Border) border
				.getBody();
		RectangleBody powerBody = (RectangleBody) power.getBody();
		return (borderBody.getStart().getPointY() > powerBody.getTopLeft()
				.getPointY() && borderBody.getEnd().getPointY() < powerBody
				.getBottomRight().getPointY())
				|| (borderBody.getEnd().getPointY() > powerBody.getTopLeft()
						.getPointY() && borderBody.getStart().getPointY() < powerBody
						.getBottomRight().getPointY());
	}

	/**
	 * Checks if the power collided with the paddle
	 * 
	 * @param power
	 *            The spawned power that moved
	 * @param paddle
	 *            the paddle
	 * @return if the two objects collided
	 */
	private static boolean hasCollided(SpawnedPower power, Paddle paddle) {
		RectangleBody powerBody = (RectangleBody) power.getBody();
		RectangleBody paddleBody = (RectangleBody) paddle.getBody();
		return intersectsTop(powerBody, paddleBody)
				|| intersectsLeft(powerBody, paddleBody)
				|| intersectsRight(powerBody, paddleBody);
	}

	/**
	 * Checks if the power hit the top of the paddle
	 * 
	 * @param power
	 *            the spawned power
	 * @param paddle
	 *            the paddle
	 * @return if the two objects collided
	 */
	private static boolean intersectsTop(RectangleBody power,
			RectangleBody paddle) {
		// power
		double powerLX = power.getTopLeft().getPointX();
		double powerRX = power.getBottomRight().getPointX();
		double powerY = power.getBottomRight().getPointY();

		// paddle
		double paddleLX = paddle.getTopLeft().getPointX();
		double paddleRX = paddle.getBottomRight().getPointX();
		double paddleTY = paddle.getTopLeft().getPointY();
		double paddleBY = paddle.getBottomRight().getPointY();

		return ((powerLX >= paddleLX && powerLX <= paddleRX) || (powerRX >= paddleLX && powerRX <= paddleRX))
				&& powerY >= paddleTY && powerY <= paddleBY;
	}

	/**
	 * Checks if the power hit the left side of the paddle
	 * 
	 * @param power
	 *            the spawned power
	 * @param paddle
	 *            the paddle
	 * @return if the two objects collided
	 */
	private static boolean intersectsLeft(RectangleBody power,
			RectangleBody paddle) {
		// power
		double powerRX = power.getBottomRight().getPointX();
		double powerTY = power.getTopLeft().getPointY();
		double powerBY = power.getBottomRight().getPointY();

		// paddle
		double paddleLX = paddle.getTopLeft().getPointX();
		double paddleRX = paddle.getBottomRight().getPointX();
		double paddleTY = paddle.getTopLeft().getPointY();
		double paddleBY = paddle.getBottomRight().getPointY();

		return ((powerTY >= paddleTY && powerTY <= paddleBY) || (powerBY >= paddleTY && powerBY <= paddleBY))
				&& powerRX >= paddleLX && powerRX <= paddleRX;
	}

	/**
	 * Checks if the power hit the right side of the paddle
	 * 
	 * @param power
	 *            the spawned power
	 * @param paddle
	 *            the paddle
	 * @return if the two objects collided
	 */
	private static boolean intersectsRight(RectangleBody power,
			RectangleBody paddle) {
		// power
		double powerLX = power.getTopLeft().getPointX();
		double powerTY = power.getTopLeft().getPointY();
		double powerBY = power.getBottomRight().getPointY();

		// paddle
		double paddleLX = paddle.getTopLeft().getPointX();
		double paddleRX = paddle.getBottomRight().getPointX();
		double paddleTY = paddle.getTopLeft().getPointY();
		double paddleBY = paddle.getBottomRight().getPointY();

		return ((powerTY >= paddleTY && powerTY <= paddleBY) || (powerBY >= paddleTY && powerBY <= paddleBY))
				&& powerLX >= paddleLX && powerLX <= paddleRX;
	}

	/**
	 * Checks if the ball hit the top of the paddle
	 * 
	 * @param ball
	 *            the ball
	 * @param paddle
	 *            the paddle
	 * @return if the two objects collided
	 */
	private static boolean intersectsTop(CircleBody ball, RectangleBody paddle) {
		double topLeftX = paddle.getTopLeft().getPointX();
		double topLeftY = paddle.getTopLeft().getPointY();
		double bottomRightX = paddle.getBottomRight().getPointX();
		double bottomRightY = paddle.getBottomRight().getPointY();
		boolean centerHitTop = ball.getCenter().getPointX() > topLeftX
				&& ball.getCenter().getPointX() < bottomRightX;
		boolean leftHitTop = ball.getCenter().getPointX() - ball.getR() > topLeftX
				&& ball.getCenter().getPointX() - ball.getR() < bottomRightX;
		boolean rightHitTop = ball.getCenter().getPointX() + ball.getR() > topLeftX
				&& ball.getCenter().getPointX() + ball.getR() < bottomRightX;
		return (centerHitTop || leftHitTop || rightHitTop)
				&& ball.getCenter().getPointY() + ball.getR() > topLeftY
				&& ball.getCenter().getPointY() + ball.getR() < bottomRightY;
	}

	/**
	 * Checks if the ball hit the left side of the paddle
	 * 
	 * @param ball
	 *            the ball
	 * @param paddle
	 *            the paddle
	 * @return if the two objects collided
	 */
	private static boolean intersectsLeft(CircleBody ball, RectangleBody paddle) {
		double topLeftX = paddle.getTopLeft().getPointX();
		double topLeftY = paddle.getTopLeft().getPointY();
		double bottomRightX = paddle.getBottomRight().getPointX();
		double bottomRightY = paddle.getBottomRight().getPointY();
		boolean centerHitLeft = ball.getCenter().getPointY() > topLeftY
				&& ball.getCenter().getPointY() < bottomRightY;
		boolean leftHitLeft = ball.getCenter().getPointY() - ball.getR() > topLeftY
				&& ball.getCenter().getPointY() - ball.getR() < bottomRightY;
		boolean rightHitLeft = ball.getCenter().getPointY() + ball.getR() > topLeftY
				&& ball.getCenter().getPointY() + ball.getR() < bottomRightY;
		return (centerHitLeft || leftHitLeft || rightHitLeft)
				&& ball.getCenter().getPointX() - ball.getR() < bottomRightX
				&& ball.getCenter().getPointX() - ball.getR() > topLeftX;
	}

	/**
	 * Checks if the ball hit the bottom side of the paddle
	 * 
	 * @param ball
	 *            the ball
	 * @param paddle
	 *            the paddle
	 * @return if the two objects collided
	 */
	private static boolean intersectsBottom(CircleBody ball,
			RectangleBody paddle) {
		double topLeftX = paddle.getTopLeft().getPointX();
		double topLeftY = paddle.getTopLeft().getPointY();
		double bottomRightX = paddle.getBottomRight().getPointX();
		double bottomRightY = paddle.getBottomRight().getPointY();
		boolean centerHitBottom = ball.getCenter().getPointX() > topLeftX
				&& ball.getCenter().getPointX() < bottomRightX;
		boolean leftHitBottom = ball.getCenter().getPointX() - ball.getR() > topLeftX
				&& ball.getCenter().getPointX() - ball.getR() < bottomRightX;
		boolean rightHitBottom = ball.getCenter().getPointX() + ball.getR() > topLeftX
				&& ball.getCenter().getPointX() + ball.getR() < bottomRightX;
		return (centerHitBottom || leftHitBottom || rightHitBottom)
				&& ball.getCenter().getPointY() - ball.getR() < bottomRightY
				&& ball.getCenter().getPointY() - ball.getR() > topLeftY;
	}

	/**
	 * Checks if the ball hit the right side of the paddle
	 * 
	 * @param ball
	 *            the ball
	 * @param paddle
	 *            the paddle
	 * @return if the two objects collided
	 */
	private static boolean intersectsRight(CircleBody ball, RectangleBody paddle) {
		double topLeftX = paddle.getTopLeft().getPointX();
		double topLeftY = paddle.getTopLeft().getPointY();
		double bottomRightX = paddle.getBottomRight().getPointX();
		double bottomRightY = paddle.getBottomRight().getPointY();
		boolean centerHitRight = ball.getCenter().getPointY() > topLeftY
				&& ball.getCenter().getPointY() < bottomRightY;
		boolean leftHitRight = ball.getCenter().getPointY() - ball.getR() > topLeftY
				&& ball.getCenter().getPointY() - ball.getR() < bottomRightY;
		boolean rightHitRight = ball.getCenter().getPointY() + ball.getR() > topLeftY
				&& ball.getCenter().getPointY() + ball.getR() < bottomRightY;
		return (centerHitRight || leftHitRight || rightHitRight)
				&& ball.getCenter().getPointX() + ball.getR() < bottomRightX
				&& ball.getCenter().getPointX() + ball.getR() > topLeftX;
	}

}
