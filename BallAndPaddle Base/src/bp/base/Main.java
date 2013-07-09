package bp.base;

import bp.base.renderer.Game;

public class Main {


	public static void main(String[] args) {
		Level level = Level.getInstance();
		new Game(level, 100.0);
		level.run();
	}

}
