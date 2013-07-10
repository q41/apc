package bp.base.renderer;

public abstract class Renderer {

	protected double scale;
	protected double downscaleHeightRatio;
	protected double downscaleWidthRatio;
	protected double offsetX;
	protected double offsetY;
	
	/**
	 * The amount of red in the color
	 */
	protected float red;
	/**
	 * The amount of green in the color
	 */
	protected float green;
	/**
	 * The amount of blue in the color
	 */
	protected float blue;
	/**
	 * For displaying text on the item
	 */
	
	public Renderer(double scale, double downscaleHeightRatio,
			double downscaleWidthRatio, double offsetX, double offsetY) {
		this.scale = scale;
		this.downscaleHeightRatio = downscaleHeightRatio;
		this.downscaleWidthRatio = downscaleWidthRatio;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
	}

	/**
	 * Renders the item
	 */
	public abstract void renderGL();
	
}
