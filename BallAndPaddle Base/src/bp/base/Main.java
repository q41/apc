package bp.base;

import bp.base.renderer.Game;

public class Main {


	public static void main(String[] args) {
		Level level = Level.getInstance();
		int height = 800;
		int width = 600;
		for(String arg : args){
			if(arg.toLowerCase().startsWith("-width:"))
				width = Integer.parseInt(arg.substring(7));
			else if(arg.toLowerCase().startsWith("-height:"))
				height = Integer.parseInt(arg.substring(8));
			else if(arg.toLowerCase().startsWith("-smooth"))
				level.setSmooth(true);
			else if(arg.toLowerCase().startsWith("-testing")){}
//				level.setTestingMode(true);
			else{
				System.err.println("Unknown argument detected, the following are supported:");
				System.err.println("-testing. -smooth. -width:Integer. -height:Integer (replace Integer with a proper number)");
			}			
		}
		new Game(level, width, height, 100.0);
		level.run();
	}

}
