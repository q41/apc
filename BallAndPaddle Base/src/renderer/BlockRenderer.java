package renderer;

import org.lwjgl.opengl.GL11;

import ballandpaddle.base.Block;

public class BlockRenderer implements Renderer {

	private Block block;
	private double scale;
	private double downscaleHeightRatio;
	private double downscaleWidthRatio;
	private double offsetX;
	private double offsetY;
	
	public BlockRenderer(Block block, double scale, double downscaleHeightRatio, double downscaleWidthRatio, double offsetX, double offsetY) {
		this.block = block;
		this.scale = scale;
		this.downscaleHeightRatio = downscaleHeightRatio;
		this.downscaleWidthRatio = downscaleWidthRatio;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
	}

	@Override
	public void update(int delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderGL() {
		double topLeftX = offsetX+block.getX()*scale*downscaleWidthRatio;
		double topLeftY = offsetY+block.getY()*scale*downscaleHeightRatio;
//		
//		GL11.glPushMatrix();
//		GL11.glBegin(GL11.GL_QUADS);
//			GL11.glVertex2d(offsetX, offsetY);
//			GL11.glVertex2d(offsetX+scale*level.getWidth()*downscaleWidthRatio, offsetY);
//			GL11.glVertex2d(offsetX+scale*level.getWidth()*downscaleWidthRatio, (offsetY+scale*level.getHeight())*downscaleHeightRatio);
//			GL11.glVertex2d(offsetX, offsetY+scale*level.getHeight()*downscaleHeightRatio);
//		GL11.glEnd();
//	GL11.glPopMatrix();
//		
	}

}
