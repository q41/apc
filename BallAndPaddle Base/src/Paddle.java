
public class Paddle extends BAPObject {

	private int x;
	private int y;
	private Shape shape;
	private int size;
	private int orientation;
	
	public Paddle(String id) {
		super(id);
	}
	
	public enum Shape{
		circle,triangle,square,rectangle;
	}	

}
