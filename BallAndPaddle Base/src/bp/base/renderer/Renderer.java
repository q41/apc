package bp.base.renderer;

public abstract class Renderer {

	/**
	 * The scaling that should be used
	 */
	protected double scale;
	/**
	 * The downscaling required for the height
	 */
	protected double downscaleHeightRatio;
	/**
	 * the downscaling required for the width
	 */
	protected double downscaleWidthRatio;
	/**
	 * The offset from the border of the screen
	 */
	protected double offsetX;
	/**
	 * The offset from the border of the screen
	 */
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
	 * Creates a new renderer with the given variables
	 * @param scale The scaling
	 * @param downscaleHeightRatio The height downscaling
	 * @param downscaleWidthRatio The width downscaling
	 * @param offsetX The offset from the border
	 * @param offsetY The offset from the border
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
