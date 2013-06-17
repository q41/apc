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

	@Override
	public void undoMove() {
		center = previousState.getCenter();	
	}
	
	
}
