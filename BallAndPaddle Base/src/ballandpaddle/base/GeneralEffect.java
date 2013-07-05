package ballandpaddle.base;

import ballandpaddle.base.Effect.TargetType;

public class GeneralEffect extends Effect {

	//if TargetType is This, then target is ""
	//if TargetType is Type then target is the class name of the target
	//if TargetType is Object then target is the id of the target
	private String target;
	private TargetType type;
	

	public GeneralEffect(String id, TargetType type, String target) {
		super(id);
		this.target=target;
		this.type=type;
		System.out.println("target "+target+". type "+type);
	}
}
