package ballandpaddle.base;

public class Paddle extends BAPObject {

	private int x;
	private int y;
	private Shape shape;
	private int size;
	private int orientation;
	
	public Paddle(String id, int x, int y, int orientation, int size, Shape shape) {
		super(id, x, y);
		this.orientation = orientation;
		this.size = size;
		this.shape = shape;
	}
	
	public Shape getShape(){
		return shape;
	}
	
	public int getOrientation(){
		return orientation;
	}
	
	public int getSize(){
		return size;
	}

}
