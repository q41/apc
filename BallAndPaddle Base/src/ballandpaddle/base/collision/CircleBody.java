package ballandpaddle.base.collision;

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

	public boolean intersects(Body other) {
		if(other instanceof Border)
			return intersects((Border)other);
		else if(other instanceof RectangleBody)
			return intersects((RectangleBody)other);
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

	@Override
	public int getNewDirection(int direction, Body other) {
		if(other instanceof Border)
			return getNewDirection(direction,(Border)other);
		else if(other instanceof RectangleBody)
			return getNewDirection(direction,(RectangleBody)other);
		return direction;		
	}
	
	public int getNewDirection(int direction, RectangleBody other){
		double topLeftX = other.getTopLeft().getX();
		double topLeftY = other.getTopLeft().getY();
		double bottomRightX = other.getBottomRight().getX();
		double bottomRightY = other.getBottomRight().getY();
		double length = bottomRightX-topLeftX;		
		if(direction<180)			
			return (int) (200+(center.getX() - topLeftX)/length*140);	
		else
			return (int) (20+(center.getX() - topLeftX)/length*140);
	}
	



	public boolean intersects(Border border){
		if(border.getStart().getX()==border.getEnd().getX())
			return border.getStart().getX()> center.getX()-r && border.getStart().getX()<center.getX()+r;
		else if(border.getStart().getY()==border.getEnd().getY())
			return border.getStart().getY()> center.getY()-r && border.getStart().getY()<center.getY()+r;
		else
			return false;		
	}

	@Override
	public void undoMove() {
		center = previousState.getCenter();	
	}


	
	
}
