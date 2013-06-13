
public class Root {

	private static Root INSTANCE;
	
	private Level level;
	private Paddle[] paddles;
	private Ball[] balls;
	private Block[] blocks;
	private Effect[] effects;
	private Power[] powers;
	
	private Root() {
		if (INSTANCE != null)
			throw new IllegalStateException("A root already exists.");
		INSTANCE = this;
	}

	
}
