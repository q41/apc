package bp.base;

import bp.base.exception.IllegalBodyException;

public abstract class MovingBPObject extends BPObject {

	/**
	 * Creates a new MovingBAPObject
	 * @param id the id of the object
	 * @param x the x coordinate of the object
	 * @param y the y coordinate of the object
	 * @param body the body of the object
	 */
	public MovingBPObject(String id, double x, double y) {
		super(id, x, y);
	}
	
	/**
	 * Updates the object
	 * @throws IllegalBodyException if body is  not a MovableBody
	 */
	public abstract void update() throws IllegalBodyException;

	/**
	 * calculates the next move for this object
	 * @param factor The fraction of a second that we need to move
	 * @param level The level
	 */
	public abstract void calculateMove(double d, Level level);

	/**
	 * Calculates the amount of needed steps that this object needs to take,
	 * in order to complete it's move in the specified time frame
	 * @param factor the time frame for the next move
	 * @return the amount of steps needed
	 */
	public abstract int getNeededSteps(double factor);
	

}
