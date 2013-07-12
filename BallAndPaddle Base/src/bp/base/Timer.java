package bp.base;

public class Timer {

	/**
	 * The amount of time that has passed since the start
	 */
	private static long time;
	
	/**
	 * Returns the current time
	 * @return time
	 */
	public static long getCurrentTime(){
		return time;
	}
	
	/**
	 * moves the time one step forward
	 * @param step the step that time moves forward
	 */
	public static void incrementTime(long step){
		time+=step;
	}
	
}
