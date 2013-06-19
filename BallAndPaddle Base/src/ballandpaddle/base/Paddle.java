package ballandpaddle.base;

import renderer.PaddleCircleRenderer;
import renderer.PaddleRectangleRenderer;
import renderer.PaddleTriangleRenderer;
import ballandpaddle.base.collision.Body;
import ballandpaddle.base.collision.*;

public class Paddle extends BAPObject {

	private Shape shape;
	private int size;
	private int orientation;
	private int direction; //-1 for left, 1 for right, 0 for none
	private double speed = 4;
	private Body body;
	
	public Paddle(String id, int x, int y, int orientation, int size, Shape shape) {
		super(id, x, y);
		this.orientation = orientation;
		this.size = 3;
		this.shape = shape;
		setBody();
	}
	
	private void setBody() {
		switch (shape) {
        case triangle: 	body = new TriangleBody(new Point(x,y-0.125), new Point(x-0.25*size,y+0.125), new Point(x+0.25*size,y+0.125));
        				break;
        case square: 	body = new RectangleBody(new Point(x,y), new Point(x+0.5*size,y+0.5*size));
						break;
        case rectangle: body = new RectangleBody(new Point(x,y), new Point(x+0.5*size, y+0.05));
						break;
        case circle: 	body = new CircleBody(new Point(x,y), size*0.15);
						break;
		}		
	}
	
	public Body getBody(){
		return body;
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
	
	public void setDirection(int direction){
		this.direction = direction;
	}
	
	public int getDirection(){
		return direction;
	}
	
	public void move(double adjustment, Level level){
		double distance = speed*adjustment;
		
		while(distance>0.001 && direction != 0){	
	        body.moveBy(0.001*direction,0);	        			
			x+= 0.001*direction;
			level.checkForCollision(this);
			distance-=0.001;
		}
	}
	
	public double getSpeed(){
		return speed;
	}

}
