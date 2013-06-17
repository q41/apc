package ballandpaddle.base.collision;

public class TriangleBody implements Body {

	private Point top;
	private Point left;
	private Point right;
	private TriangleBody previousState;
	
	public TriangleBody(Point top, Point left, Point right){
		this.top = top;
		this.left = left;
		this.right = right;
		previousState = this;
	}
	
	public Point getTop(){
		return top;
	}
	
	public Point getLeft(){
		return left;
	}
	
	public Point getRight(){
		return right;
	}

	@Override
	public void moveBy(double x, double y) {
		previousState = new TriangleBody(new Point(top.getX(), top.getY()), new Point(left.getX(), left.getY()), new Point(right.getX(), right.getY()));
		top.moveBy(x, y);
		left.moveBy(x, y);
		right.moveBy(x, y);		
	}

	public boolean intersects(Body other) {
		if(other instanceof Border)
			return intersects((Border)other);
		return false;
	}
	
	public boolean intersects(Border border){
		double sX = getSmallestX(); 
		double lX = getLargestX();
		double sY = getSmallestY();
		double lY = getLargestY();		
		if(border.getStart().getX()==border.getEnd().getX())
			return border.getStart().getX()>sX && border.getStart().getX() < lX;
		else if(border.getStart().getY()==border.getEnd().getY())
			return border.getStart().getY()>sY && border.getStart().getY() < lY;
		else
			return false;		
	}

	private double getLargestX() {
		double x = top.getX();
		if(left.getX()>x)
			x = left.getX();
		if(right.getX()>x)
			x = right.getX();
		return x;
	}

	private double getLargestY() {
		double y = top.getY();
		if(left.getY()>y)
			y = left.getY();
		if(right.getY()>y)
			y = right.getY();
		return y;
	}

	private double getSmallestY() {
		double y = top.getY();
		if(left.getY()<y)
			y = left.getY();
		if(right.getY()<y)
			y = right.getY();
		return y;
	}

	private double getSmallestX() {
		double x = top.getX();
		if(left.getX()<x)
			x = left.getX();
		if(right.getX()<x)
			x = right.getX();
		return x;
	}

	@Override
	public void undoMove() {
		top = previousState.getTop();
		left = previousState.getLeft();
		right = previousState.getRight();
	}
	
	
}
