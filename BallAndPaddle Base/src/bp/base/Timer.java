package bp.base;

public class Timer {

	private static long time;
	
	public static long getCurrentTime(){
		return time;
	}
	
	public static void incrementTime(long step){
		time+=step;
	}
	
}
