package bp.base;

import bp.base.collision.body.Body;

public class Border extends BAPObject{

	/**
	 * Creates a border that the ball cannot pass
	 * @param id the id of this border
	 * @param body the body belonging to this border
	 */
	public Border(String id, Body body) {
		super(id, 0, 0, body);
	}
	
}
