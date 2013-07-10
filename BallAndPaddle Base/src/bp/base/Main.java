package bp.base;

import bp.base.renderer.Game;

public class Main {


	public static void main(String[] args) {
		Level level = Level.getInstance();
		int height = 0;
		int width = 0;
		boolean fullscreen = false;
		if(args.length>=2)
			try{
			width = Integer.parseInt(args[0]);
			height = Integer.parseInt(args[1]);
			}catch(Exception e){
				System.out.println("Incorrect use of arguments, to set the resolution call the game using: [width] [height] [fullscreen]?");
				System.out.println("Where [width] and [height] are integers and [fullscreen] an optional boolean");
		}		
		if(args.length>=3)
			try{
				fullscreen = Boolean.parseBoolean(args[2]);
			}catch(Exception e){
				System.out.println("Incorrect use of arguments, to set the resolution call the game using: [width] [height] [fullscreen]?");
				System.out.println("Where [width] and [height] are integers and [fullscreen] an optional boolean");
		}
		if(height!= 0)
			new Game(level, width, height, 100.0, fullscreen);
		else	
			new Game(level, 100.0);
		level.run();
	}

}
