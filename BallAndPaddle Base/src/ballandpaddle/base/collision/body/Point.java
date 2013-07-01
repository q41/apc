package ballandpaddle.base.collision.body;

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
	public void undoMove() {
		// TODO Auto-generated method stub
		
	}
		
}
