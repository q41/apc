import java.util.List;


public class Level {

	private String id;
	private float powerSpawnChance;
	private String[] importedBlocks;
	
	private List<Paddle> paddles;
	private List<Ball> balls;
	private List<Block> blocks;
	private int height;
	private int width;
	
	
	public void generateBlocks(Block[] b){
		height = importedBlocks.length;
		width = importedBlocks[0].length();
		int x = 0;
		int y = 0;
		char cur;
		for(String s : importedBlocks){
			x=0;
			for(int i = 0; i<width; i++){
				cur = s.charAt(i);
				if(cur!='.'){
					blocks.add(generateBlock(b,cur,x,y));
				}
				x++;					
			}
			y++;
		}
	}
	
	private Block generateBlock(Block[] b, char cur, int x, int y){
		Block kind = null;
		int i = 0;
		while(kind==null && i<b.length){
			if(b[i].getId().equals(cur)){
				
			}
		}
		
		return null;
	}
	
	public List<Block> getBlocks(){
		return blocks;
	}
	
	public List<Paddle> getPaddles(){
		return paddles;
	}
	
	public List<Ball> getBalls(){
		return balls;
	}
}
