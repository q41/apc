SYNTAXDEF bp
FOR <http://www.emftext.org/language/ballandpaddle>
START Root

OPTIONS {
	overrideBuilder = "false";
}

TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE FRAGMENT DIGIT $('1'..'9')$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	DEFINE BOOLEAN $('t''r''u''e')|('f''a''l''s''e')$;
	DEFINE CHAR $('A'..'Z')$;
	DEFINE LEVELLINE $(('A'..'Z')|('.'))+$;
	DEFINE THIS $'t''h''i''s'$;
	//regex: ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+
}

TOKENSTYLES {
	"game" COLOR #7F0055, BOLD;
	"level" COLOR #7F0055, BOLD;
	"paddles" COLOR #7F0055, BOLD;
	"balls" COLOR #7F0055, BOLD;
	"blocks" COLOR #7F0055, BOLD;
	"effects" COLOR #7F0055, BOLD;
	"powers" COLOR #7F0055, BOLD;
	"Level" COLOR #7F0055, BOLD;
	"BAPObject" COLOR #7F0055, BOLD;
	"Paddle" COLOR #7F0055, BOLD;
	"Ball" COLOR #7F0055, BOLD;
	"Block" COLOR #7F0055, BOLD;
	"power" COLOR #7F0055, BOLD;
	"Power" COLOR #7F0055, BOLD;
	"NonDamageEffect" COLOR #7F0055, BOLD;
	"DamageEffect" COLOR #7F0055, BOLD;
	"with" COLOR #7F0055, BOLD;
	"true" COLOR #7F0055, BOLD;
	"false" COLOR #7F0055, BOLD;
}

RULES {
	Root ::= level paddles+ balls+ blocks* powers* effects*;	
	Level ::= "level" id[] "{" blocks[LEVELLINE]* ("powerSpawnChance" "=" powerSpawnChance[FLOAT])?"}";	
	Paddle ::= "paddle" id[] "{" "x" "=" x[FLOAT] "y" "=" y[FLOAT] "size" "=" size[INTEGER]  "orientation" "=" orientation[INTEGER] "}";
	Ball ::= "ball" id[] "{" "x" "=" x[FLOAT] "y" "=" y[FLOAT] ("size" "=" size[INTEGER])? ("damage" "=" damage[INTEGER])? ("direction" "=" direction[INTEGER])? ("speed" "=" speed[INTEGER])? "}";
	Block ::= "block" id[CHAR] "{" "hardness" "=" hardness[INTEGER] ("resistance" "=" resistance[INTEGER])? ("power" "=" power[])? "}";	
	Power ::= "power" id[] "{" "effects" "=" effects[] ("," effects[])* ("powerSpawnChance" "=" powerSpawnChance[FLOAT])?"}";
	
	GeneralEffect ::= "effect" id[] "on" target "{" body ("duration""="duration[INTEGER])? "}";
	GeneralEffectBody ::= name[Size:"size",Orientation:"orientation",Speed:"speed", Immaterial:"immaterial", Hardness:"hardness",Resistance:"resistance",X:"x", Y:"y"] op[Inc:"+=", Set:"="] expression;
	
	CollisionEffect ::= "collision" "effect" id[] "between" leftTarget "and" rightTarget "{" body ("duration""="duration[INTEGER])? "}";
	CollisionEffectBody ::= classType[Block:"block",Ball:"ball",Paddle:"paddle"]"."name[Size:"size",Orientation:"orientation",Speed:"speed", Immaterial:"immaterial", Hardness:"hardness",Resistance:"resistance",X:"x", Y:"y"] op[Inc:"+=", Set:"="] expression;
	
	ObjectTarget ::= item[] ("(" filter ")")?;
	TypeTarget ::= type[Block:"block",Paddle:"paddle",Ball:"ball"] ("(" filter ")")?;
	
	@Operator(type="binary_left_associative", weight="1", superclass="Expression")
	MultExpression ::= left "*" right;

	@Operator(type="binary_left_associative", weight="1", superclass="Expression")
	DivExpression ::= left "/" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="Expression")
	PlusExpression ::= left "+" right;

	@Operator(type="binary_left_associative", weight="2", superclass="Expression")
	MinusExpression ::= left "-" right;
	
	@Operator(type="unary_prefix", weight="3", superclass="Expression")
	NegExpression ::= "-"body;
	
	@Operator(type="primitive", weight="4", superclass="Expression")
	BracketExpression ::= "(" body ")";

	@Operator(type="primitive", weight="4", superclass="Expression")
	IntOperand ::= value[INTEGER];
	
	@Operator(type="primitive", weight="4", superclass="Expression")
	DoubleOperand ::= value[FLOAT];
	
	@Operator(type="primitive", weight="4", superclass="Expression")
	BoolOperand ::= value[BOOLEAN];

	@Operator(type="primitive", weight="4", superclass="Expression")
	AttOperand ::= att[Size:"size",Orientation:"orientation",Speed:"speed", Immaterial:"immaterial", Hardness:"hardness",Resistance:"resistance",X:"x", Y:"y"];
	
	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	EqExpression ::= left "=" right;

	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	SmthExpression ::= left "<" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	SeqExpression ::= left "<=" right;

	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	LthExpression ::= left ">" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	LeqExpression ::= left ">=" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	NeqExpression ::= left "!=" right;

	@Operator(type="binary_left_associative", weight="1", superclass="BooleanExpression")
	OrExpression ::= left "|" right;
	
	@Operator(type="binary_left_associative", weight="1", superclass="BooleanExpression")
	AndExpression ::= left "&" right;
	
	@Operator(type="binary_left_associative", weight="3", superclass="BooleanExpression")
	MultBoolExpression ::= left "*" right;

	@Operator(type="binary_left_associative", weight="3", superclass="BooleanExpression")
	DivBoolExpression ::= left "/" right;
	
	@Operator(type="binary_left_associative", weight="4", superclass="BooleanExpression")
	PlusBoolExpression ::= left "+" right;

	@Operator(type="binary_left_associative", weight="4", superclass="BooleanExpression")
	MinusBoolExpression ::= left "-" right;
	
	@Operator(type="unary_prefix", weight="5", superclass="BooleanExpression")
	NegBoolExpression ::= ("!"|"-") body;		
		
	@Operator(type="primitive", weight="6", superclass="BooleanExpression")
	BracketBoolExpression ::= "(" body ")";
	
	@Operator(type="primitive", weight="6", superclass="BooleanExpression")
	AttBoolOperand ::= att[Size:"size",Orientation:"orientation",Speed:"speed",Hardness:"hardness",Resistance:"resistance", Immaterial:"immaterial",X:"x", Y:"y"];
	
	@Operator(type="primitive", weight="6", superclass="BooleanExpression")
	IntBoolOperand ::= value[INTEGER];
	
	@Operator(type="primitive", weight="6", superclass="BooleanExpression")
	DoubleBoolOperand ::= value[FLOAT];
	
	@Operator(type="primitive", weight="6", superclass="BooleanExpression")
	BooleanBoolOperand ::= value[BOOLEAN];
	
	@Operator(type="binary_left_associative", weight="1", superclass="CollisionExpression")
	MultCollisionExpression ::= left "*" right;

	@Operator(type="binary_left_associative", weight="1", superclass="CollisionExpression")
	DivCollisionExpression ::= left "/" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="CollisionExpression")
	PlusCollisionExpression ::= left "+" right;

	@Operator(type="binary_left_associative", weight="2", superclass="CollisionExpression")
	MinusCollisionExpression ::= left "-" right;
	
	@Operator(type="unary_prefix", weight="3", superclass="CollisionExpression")
	NegCollisionExpression ::= "-"body;
	
	@Operator(type="primitive", weight="4", superclass="CollisionExpression")
	BracketCollisionExpression ::= "(" body ")";

	@Operator(type="primitive", weight="4", superclass="CollisionExpression")
	IntCollisionOperand ::= value[INTEGER];
	
	@Operator(type="primitive", weight="4", superclass="CollisionExpression")
	DoubleCollisionOperand ::= value[FLOAT];
	
	@Operator(type="primitive", weight="4", superclass="CollisionExpression")
	BoolCollisionOperand ::= value[BOOLEAN];

	@Operator(type="primitive", weight="4", superclass="CollisionExpression")
	AttCollisionOperand ::= classType[Block:"block",Ball:"ball",Paddle:"paddle"]"."att[Size:"size",Orientation:"orientation",Speed:"speed", Immaterial:"immaterial", Hardness:"hardness",Resistance:"resistance", X:"x", Y:"y"];
	
	
}