package renderer;

import ballandpaddle.base.Block;

public class BlockRenderer implements Renderer {

	private Block block;
	private double scaleHeight;
	private double scaleWidth;
	
	public BlockRenderer(Block block, double scaleHeight, double scaleWidth) {
		this.block = block;
		this.scaleHeight = scaleHeight;
		this.scaleWidth = scaleWidth;
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderGL() {
		double topLeftX = block.getX();
		double topLeftY = block.getY();
		
		// TODO Auto-generated method stub
		
	}

}
