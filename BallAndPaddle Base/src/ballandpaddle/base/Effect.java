package ballandpaddle.base;

public class Effect {

	//if TargetType is This, then target is ""
	//if TargetType is Type then target is the class name of the target
	//if TargetType is Object then target is the id of the target
	private String target;
	private TargetType type;
	private String id;

	public enum TargetType{
		THIS, TYPE, OBJECT;
	}
	
	public Effect(String id, TargetType type, String target){
		this.id = id;
		this.type = type; 
		this.target = target;
	}
	
	public String getTarget(){
		return target;
	}
	
	public TargetType getType(){
		return type;
	}
	
	public String getId(){
		return id;
	}
	
	
}
