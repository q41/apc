package ballandpaddle.base;

public class Ball extends BAPObject {

	private int size;
	private int direction;
	private int speed;
	
	public Ball(String id, int x, int y, int size, int direction, int speed){
		this(id, x, y);
		this.size = size;
		this.direction = direction;
		this.speed = speed;
	}
	
	public Ball(String id, int x, int y) {
		super(id, x, y);
	}
	
	public int getSize(){
		return size;
	}
	
	public int getDirection(){
		return direction;
	}
	
	public int speed(){
		return speed;
	}
}
