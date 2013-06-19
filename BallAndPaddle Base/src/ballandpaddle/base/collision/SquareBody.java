package ballandpaddle.base.collision;

public class SquareBody implements Body {

	private Point topLeft;
	private Point bottomRight;
	private SquareBody previousState;
	
	public SquareBody(Point topLeft, Point bottomRight){
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
		previousState = this;
	}
	
	public Point getTopLeft(){
		return topLeft;
	}
	
	public Point getBottomRight(){
		return bottomRight;
	}

	public void moveBy(double x, double y) {
		previousState = new SquareBody(new Point(topLeft.getX(), topLeft.getY()), new Point(bottomRight.getX(), bottomRight.getY()));
		topLeft.moveBy(x, y);
		bottomRight.moveBy(x, y);		
	}

	@Override
	public boolean intersects(int direction, Body other) {
		if(other instanceof CircleBody)
			return intersects(direction, (CircleBody)other);
		return false;
	}
	
	public boolean intersects(int direction, CircleBody ball){	
		//split up the square into 4 parts, bottom, left, right, top. 
		//top
		double topY = topLeft.getY();
		//bottom
		double bottomY = bottomRight.getY();
		//left
		double leftX = topLeft.getX();
		//right
		double rightX = bottomRight.getX();
		//ball
		double ballYBottom = ball.getCenter().getY()+ball.getR();
		double ballYTop = ball.getCenter().getY()-ball.getR();
		double ballXLeft = ball.getCenter().getX()-ball.getR();
		double ballXRight = ball.getCenter().getX()+ball.getR();
		//top hit?
		boolean topHit = ballYBottom>topY && ballYBottom<bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
		//bottom hit?
		boolean bottomHit = ballYTop>topY && ballYTop<bottomY && ((ballXLeft>leftX && ballXLeft<rightX)||(ballXRight>leftX && ballXRight<rightX));
		//right hit?
		boolean rightHit = ballXLeft<rightX && ballXLeft>leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
		//left hit?
		boolean leftHit = ballXRight<rightX && ballXRight>leftX &&  ((ballYBottom>topY && ballYBottom<bottomY)||(ballYTop>topY && ballYTop<bottomY));
				
		//check which the ball has collided with to determine the new direction of the ball
		if(direction>=0 && direction <=90){
			return topHit || leftHit;
		}
		else if(direction>=90 && direction <= 180){
			return topHit || rightHit;
		}
		else if(direction>=180 && direction <= 270){
			return bottomHit || leftHit;
		}
		else if(direction>=270 && direction <= 359){
			return bottomHit || rightHit;
		}
		return false;		
	}
	
	

	@Override
	public void undoMove() {
		topLeft = previousState.getTopLeft();
		bottomRight = previousState.getBottomRight();		
	}

	@Override
	public int getNewDirection(int direction, Body body) {
		// TODO Auto-generated method stub
		return 0;
	}

}
