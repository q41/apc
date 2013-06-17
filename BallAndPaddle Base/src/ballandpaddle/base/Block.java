package ballandpaddle.base;

public class Block extends BAPObject {

	private int hardness;
	private int normalRes;
	private int fireRes;
	private int coldRes;
	private int shockRes;
	private Power power;
	
	public Block(String id, int x, int y) {
		super(id, x, y);
	}
	
	public Block(int x, int y, Block b){
		super(b.getId(), x, y);
		this.hardness = b.getHardness();
		this.normalRes = b.getNormalRes();
		this.fireRes = b.getFireRes();
		this.coldRes = b.getColdRes();
		this.shockRes = b.getShockRes();
		this.power = b.getPower();
	}
	
	public Block(String id, int hardness, int normalRes, int fireRes, int coldRes, int shockRes, Power power){
		super(id,-1,-1);
		this.hardness = hardness;
		this.normalRes = normalRes;
		this.fireRes = fireRes;
		this.coldRes = coldRes;
		this.shockRes = shockRes;
		this.power = power;
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
