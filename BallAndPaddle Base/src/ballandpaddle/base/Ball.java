package ballandpaddle.base;

public class Ball extends BAPObject {

	private int x;
	private int y;
	private int size;
	private int direction;
	private int speed;
	

	
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
