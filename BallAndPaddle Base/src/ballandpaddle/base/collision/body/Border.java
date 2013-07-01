package ballandpaddle.base.collision.body;

public class Border implements Body {
	
	private Point start;
	private Point end;
	
	public Border(Point start, Point end){
		this.start = start;
		this.end = end;
	}

	public void moveBy(double x, double y) {
		//can't move a border...		
	}
	
	public Point getStart(){
		return start;
	}
	
	public Point getEnd(){
		return end;
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