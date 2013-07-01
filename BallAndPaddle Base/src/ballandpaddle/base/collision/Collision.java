package ballandpaddle.base.collision;
import ballandpaddle.base.BAPObject;
import ballandpaddle.base.collision.body.*;

public class Collision {

	public static void collision(BAPObject moved, BAPObject other, CollisionResolver resolver){
		Body first = moved.getBody();
		Body second = other.getBody();
		if(hasCollided(first, second))
			resolver.resolveCollision(moved, other);		
	}
	
	private static boolean hasCollided(Body moved, Body other){
		if(moved instanceof CircleBody)
			return hasCollided((CircleBody)moved, other);
		else if(moved instanceof RectangleBody)
			return hasCollided((RectangleBody)moved, other);
		return false;
	}
	
	private static boolean hasCollided(CircleBody moved, Body other){
		if(other instanceof Border)
			return hasCollided(moved, (Border)other);
		else if(other instanceof RectangleBody)
			return hasCollided(moved, (RectangleBody)other);
		else if(other instanceof SquareBody)
			return hasCollided(moved, (SquareBody)other);
		return false;
	}
	
	private static boolean hasCollided(RectangleBody moved, Body other){
		if(other instanceof Border)
			return hasCollided(moved, (Border)other);
		else if(other instanceof CircleBody)
			return hasCollided(moved, (CircleBody)other);
		return false;
	}	
	
	private static boolean hasCollided(CircleBody ball, Border border){
		if(border.getStart().getX()==border.getEnd().getX())
			return border.getStart().getX()> ball.getCenter().getX()-ball.getR() && border.getStart().getX()<ball.getCenter().getX()+ball.getR();
		else if(border.getStart().getY()==border.getEnd().getY())
			return border.getStart().getY()> ball.getCenter().getY()-ball.getR() && border.getStart().getY()<ball.getCenter().getY()+ball.getR();
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
