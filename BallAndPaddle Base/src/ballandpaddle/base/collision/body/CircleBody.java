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
	
	@Override
	public void undoMove() {
		center = previousState.getCenter();	
	}	
}
