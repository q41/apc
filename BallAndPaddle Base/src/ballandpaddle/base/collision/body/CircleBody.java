package ballandpaddle.base.collision.body;

public class CircleBody implements Body {

	private Point center;
	private double r;
	private CircleBody previousState;
	
	public CircleBody(Point center, double r){
		this.center = center;
		this.r = r;
		previousState = this;
	}
	
	public Point getCenter(){
		return center;
	}
	
	public double getR(){
		return r;
	}
	
	public void setR(double r){
		this.r = r;
	}

	@Override
	public void moveBy(double x, double y) {
		previousState = new CircleBody(new Point(center.getX(), center.getY()), r);
		center.moveBy(x,y);		
	}

	public boolean intersects(int direction, Body other) {
		if(other instanceof Border)
			return intersects((Border)other);
		else if(other instanceof RectangleBody)
			return intersects((RectangleBody)other);
		else if(other instanceof SquareBody)
			return intersects(direction, (SquareBody)other);
		return false;
	}
	
	public boolean intersects(Border border){
		if(border.getStart().getX()==border.getEnd().getX())
			return border.getStart().getX()> center.getX()-r && border.getStart().getX()<center.getX()+r;
		else if(border.getStart().getY()==border.getEnd().getY())
			return border.getStart().getY()> center.getY()-r && border.getStart().getY()<center.getY()+r;
		else
			return false;		
	}
	
	private boolean intersects(RectangleBody other) {
		return intersectsTop(other) || intersectsLeft(other) || intersectsBottom(other) || intersectsRight(other);
	}
	
	private boolean intersectsTop(RectangleBody other) {
		double topLeftX = other.getTopLeft().getX();
		double topLeftY = other.getTopLeft().getY();
		double bottomRightX = other.getBottomRight().getX();
		double bottomRightY = other.getBottomRight().getY();
		boolean centerHitTop = center.getX()>topLeftX && center.getX()<bottomRightX;
		boolean leftHitTop = center.getX()-r>topLeftX && center.getX()-r<bottomRightX;
		boolean rightHitTop = center.getX()+r>topLeftX && center.getX()+r<bottomRightX;
		return (centerHitTop || leftHitTop || rightHitTop) && center.getY()+r>topLeftY && center.getY()+r<bottomRightY;
	}
	
	private boolean intersectsLeft(RectangleBody other) {
		double topLeftX = other.getTopLeft().getX();
		double topLeftY = other.getTopLeft().getY();
		double bottomRightX = other.getBottomRight().getX();
		double bottomRightY = other.getBottomRight().getY();
		boolean centerHitLeft = center.getY()>topLeftY && center.getY()<bottomRightY;
		boolean leftHitLeft = center.getY()-r>topLeftY && center.getY()-r<bottomRightY;
		boolean rightHitLeft = center.getY()+r>topLeftY && center.getY()+r<bottomRightY;
		return (centerHitLeft || leftHitLeft || rightHitLeft) && center.getX()-r<bottomRightX && center.getX()-r>topLeftX;
	}

	private boolean intersectsBottom(RectangleBody other) {
		double topLeftX = other.getTopLeft().getX();
		double topLeftY = other.getTopLeft().getY();
		double bottomRightX = other.getBottomRight().getX();
		double bottomRightY = other.getBottomRight().getY();
		boolean centerHitBottom = center.getX()>topLeftX && center.getX()<bottomRightX;
		boolean leftHitBottom = center.getX()-r>topLeftX && center.getX()-r<bottomRightX;
		boolean rightHitBottom = center.getX()+r>topLeftX && center.getX()+r<bottomRightX;
		return (centerHitBottom || leftHitBottom || rightHitBottom) && center.getY()-r<bottomRightY && center.getY()-r>topLeftY;
	}

	private boolean intersectsRight(RectangleBody other) {
		double topLeftX = other.getTopLeft().getX();
		double topLeftY = other.getTopLeft().getY();
		double bottomRightX = other.getBottomRight().getX();
		double bottomRightY = other.getBottomRight().getY();
		boolean centerHitRight = center.getY()>topLeftY && center.getY()<bottomRightY;
		boolean leftHitRight = center.getY()-r>topLeftY && center.getY()-r<bottomRightY;
		boolean rightHitRight = center.getY()+r>topLeftY && center.getY()+r<bottomRightY;
		return (centerHitRight || leftHitRight || rightHitRight) && center.getX()+r<bottomRightX && center.getX()+r>topLeftX;
	}
	
	public boolean intersects(int direction, SquareBody block){	
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
		double ballYBottom = center.getY()+r;
		double ballYTop = center.getY()-r;
		double ballXLeft = center.getX()-r;
		double ballXRight = center.getX()+r;
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
	
	@Override
	public int getNewDirection(int direction, Body other) {
		if(other instanceof RectangleBody)
			return getNewDirection(direction,(RectangleBody)other);
		else if(other instanceof SquareBody)
			return getNewDirection(direction,(SquareBody)other);
		return direction;		
	}
	
	public int getNewDirection(int direction, RectangleBody other){
		double topLeftX = other.getTopLeft().getX();
		double bottomRightX = other.getBottomRight().getX();
		double length = bottomRightX-topLeftX;		
		if(direction<180)			
			return (int) (200+(center.getX() - topLeftX)/length*140);	
		else
			return (int) (20+(center.getX() - topLeftX)/length*140);
	}
	
	public int getNewDirection(int direction, SquareBody block){
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
		double ballYBottom = center.getY()+r;
		double ballYTop = center.getY()-r;
		double ballXLeft = center.getX()-r;
		double ballXRight = center.getX()+r;
		//top hit?
		boolean topHit = ballYBottom>topY && ballYBottom<bottomY && ballYTop<topY && ballYTop<bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
		//bottom hit?
		boolean bottomHit = ballYTop>topY && ballYTop<bottomY && ballYBottom>topY && ballYBottom>bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
		//right hit?
		boolean rightHit = ballXLeft<rightX && ballXLeft>leftX && ballXRight>rightX && ballXRight>leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
		//left hit?
		boolean leftHit = ballXRight<rightX && ballXRight>leftX && ballXLeft<rightX && ballXLeft<leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
								
		//check which the ball has collided with to determine the new direction of the ball	
		int newDirection = direction;
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
		return newDirection;
	}

	@Override
	public void undoMove() {
		center = previousState.getCenter();	
	}	
}
