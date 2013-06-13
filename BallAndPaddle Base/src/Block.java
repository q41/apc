
public class Block extends BAPObject {

	private int hardness;
	private int normalRes;
	private int fireRes;
	private int coldRes;
	private int shockRes;
	private Power power;
	private int x;
	private int y;
	
	public Block(int x, int y, Block b){
		super(b.getId());
		this.hardness = b.getHardness();
		this.normalRes = b.getNormalRes();
		this.fireRes = b.getFireRes();
		this.coldRes = b.getColdRes();
		this.shockRes = b.getShockRes();
		this.power = b.getPower();
		this.x = x;
		this.y = y;
	}
	
	public int getHardness(){
		return hardness;
	}
	
	public int getNormalRes(){
		return normalRes;
	}
	
	public int getFireRes(){
		return fireRes;
	}
	
	public int getColdRes(){
		return coldRes;
	}
	
	public int getShockRes(){
		return shockRes;
	}
	
	public Power getPower(){
		return power;
	}
}
