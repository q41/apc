package textadventure.base;

import java.util.HashMap;
import java.util.Map;

public class World {
	
	private static World INSTANCE;
	
	private int width, height;

	private Tile[][] tiles;
	
	private Map<Tile, Coordinate> tile2coordinate = new HashMap<Tile, Coordinate>();

	public static World getInstance() {
		if (INSTANCE == null)
			INSTANCE = new World();
		return INSTANCE;
	}
	
	private World() {
		if (INSTANCE != null)
			throw new IllegalStateException("A world already exists.");
		INSTANCE = this;
	}
	
	public void setDimension(int width, int height) {
		tiles = new Tile[width][height];
	}
	public void setTile(Tile tile, int x, int y) {
		tiles[x][y] = tile;
		tile2coordinate.put(tile, new Coordinate(x, y));
	}
		
	public Coordinate getCoordinate(Tile tile) {
		return tile2coordinate.get(tile);
	}
	
	public Tile getTile(int x, int y) {
		return tiles[x][y];
	}

}
