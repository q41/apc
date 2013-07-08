SYNTAXDEF ballandpaddle
FOR <http://www.alia4j.org/language/ballandpaddle>
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
	//DEFINE SINGLE $($ + CHAR + $|$ + DIGIT + $)$ ;
	DEFINE CHAR $('A'..'Z')$;
	DEFINE LEVELLINE $(('A'..'Z')|('.'))+$;
	//DEFINE ANDOR $('|')|('&')$;
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
	
	GeneralEffect ::= "effect" id[] "on" target "{" body "}";
	CollisionEffect ::= "collision" "effect" id[] "between" leftTarget "and" rightTarget "{" body "}";
	
	AttributeAdjustment ::= effectedAttribute adjustmentOperator[Inc:"+=", Dec:"-=", Set:"="] expression ("duration" "=" duration[INTEGER])?;
	
	EffectedBallAttribute ::= "ball." type[Size:"size",Orientation:"orientation",Speed:"speed", Immaterial:"immaterial"];
	
	EffectedPaddleAttribute ::= "paddle." type[Size:"size",Speed:"speed"];
	
	EffectedBlockAttribute ::= "block."type[NormalRes:"resistance", Hardness:"hardness"];
	
	ObjectTarget ::= item[CHAR] | item[];
	TypeTarget ::= type[Block:"block",Paddle:"paddle",Ball:"ball"] ("(" params ")")?;
	
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
	AttBallOperand ::= "ball."att[Size:"size",Orientation:"orientation",Speed:"speed", Immaterial:"immaterial"];

	@Operator(type="primitive", weight="4", superclass="Expression")
	AttBlockOperand ::= "block."att[Hardness:"hardness",NormalRes:"resistance"];

	@Operator(type="primitive", weight="4", superclass="Expression")
	AttPaddleOperand ::= "paddle."att[Size:"size",Speed:"speed"];
	
	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	EqParameter ::= left "=" right;

	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	SmthParameter ::= left "<" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	SeqParameter ::= left "<=" right;

	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	LthParameter ::= left ">" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	LeqParameter ::= left ">=" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="BooleanExpression")
	NeqParameter ::= left "!=" right;

	@Operator(type="binary_left_associative", weight="1", superclass="BooleanExpression")
	OrParameter ::= left "|" right;
	
	@Operator(type="binary_left_associative", weight="1", superclass="BooleanExpression")
	AndParameter ::= left "&" right;
	
	@Operator(type="unary_prefix", weight="3", superclass="BooleanExpression")
	NegParameter ::= "!"body;	
		
	@Operator(type="primitive", weight="4", superclass="BooleanExpression")
	BracketParameter ::= "(" body ")";
	
	@Operator(type="primitive", weight="4", superclass="BooleanExpression")
	AttParameter ::= att[Size:"size",Orientation:"orientation",Speed:"speed",Hardness:"hardness",NormalRes:"resistance", Immaterial:"immaterial"];
	
	@Operator(type="primitive", weight="4", superclass="BooleanExpression")
	IntValueParameter ::= value[INTEGER];
	
	@Operator(type="primitive", weight="4", superclass="BooleanExpression")
	DoubleValueParameter ::= value[FLOAT];
	
}