package ballandpaddle.base.collision;

public class Point implements Body {

	private double x;
	private double y;
	
	public Point(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public void setPoint(double x, double y){
		this.x=x;
		this.y=y;
	}

	public void moveBy(double x, double y) {
		this.x += x;
		this.y += y;
		
	}

	@Override
	public boolean intersects(int direction, Body other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void undoMove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNewDirection(int direction, Body other) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
