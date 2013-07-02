package ballandpaddle.base.renderer;

import org.lwjgl.opengl.GL11;

import ballandpaddle.base.Block;
import ballandpaddle.base.collision.body.SquareBody;

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
		SquareBody body = (SquareBody)block.getBody();
		double topLeftX = offsetX+body.getTopLeft().getX()*scale*downscaleWidthRatio;
		double topLeftY = offsetY+body.getTopLeft().getY()*scale*downscaleHeightRatio;
		double bottomRightX = offsetX+body.getBottomRight().getX()*scale*downscaleWidthRatio;
		double bottomRightY = offsetY+body.getBottomRight().getY()*scale*downscaleHeightRatio;
		//TODO, outline around each block!
		GL11.glColor3f(0.5f, 0.5f, 1.0f);
		GL11.glPushMatrix();
			GL11.glBegin(GL11.GL_QUADS);
				GL11.glVertex2d(topLeftX, topLeftY);
				GL11.glVertex2d(bottomRightX, topLeftY);
				GL11.glVertex2d(bottomRightX, bottomRightY);
				GL11.glVertex2d(topLeftX, bottomRightY);
			GL11.glEnd();
		GL11.glPopMatrix();
	}

	public Block getBlock() {
		return block;
	}

}
