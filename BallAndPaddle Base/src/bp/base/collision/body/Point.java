package bp.base.collision.body;

public class Point {

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
		
}
