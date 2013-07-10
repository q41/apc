package bp.base.collision.body;

public class Border implements Body {
	
	/**
	 * The start of this border
	 */
	private Point start;
	/**
	 * The end of this border
	 */
	private Point end;
	
	/**
	 * Creates a border, a line that is located at the edge of the level,
	 * used for collision purposes
	 * @param start The starting point of this border
	 * @param end The end point of this border
	 */
	public Border(Point start, Point end){
		this.start = start;
		this.end = end;
	}

	/**
	 * Returns the start of this border
	 * @return the starting Point of this border
	 */
	public Point getStart(){
		return start;
	}
	
	/**
	 * Returns the end of this border
	 * @return the ending Point of this border
	 */
	public Point getEnd(){
		return end;
	}

}
