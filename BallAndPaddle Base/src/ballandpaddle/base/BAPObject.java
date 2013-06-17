package ballandpaddle.base;

public abstract class BAPObject {

	private String id;
	protected double x;
	protected double y;
	
	public BAPObject(String id, double x, double y){
		this.id = id;
		this.x = x;
		this.y = y;
	}
	
	public String getId(){
		return this.id;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}	
	
	public enum Shape{
		circle,triangle,square,rectangle;
	}
	
}
