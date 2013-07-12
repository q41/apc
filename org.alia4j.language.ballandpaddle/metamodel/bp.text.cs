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
	
	GeneralEffect ::= "effect" id[] "on" target ("(" filter ")")? "{" body ("duration""="duration[INTEGER])? "}";
	GeneralEffectBody ::= name[Size:"size",Orientation:"orientation",Speed:"speed", Immaterial:"immaterial", Hardness:"hardness",Resistance:"resistance",X:"x", Y:"y",Damage:"damage"] op[Inc:"+=", Set:"="] expression;
	
	CollisionEffect ::= "collision" "effect" id[] "between" leftTarget ("(" leftFilter ")")? "and" rightTarget ("(" rightFilter ")")? "{" body ("duration""="duration[INTEGER])? "}";
	CollisionEffectBody ::= target"."name[Size:"size",Orientation:"orientation",Speed:"speed", Immaterial:"immaterial", Hardness:"hardness",Resistance:"resistance",X:"x", Y:"y",Damage:"damage"] op[Inc:"+=", Set:"="] expression;
	
	ObjectTarget ::= object[];
	ClassTarget ::= classType[Block:"block",Paddle:"paddle",Ball:"ball"];
	
	@Operator(type="binary_left_associative", weight="1", superclass="Expression")
	OrExpression ::= left "|" right;
	
	@Operator(type="binary_left_associative", weight="1", superclass="Expression")
	AndExpression ::= left "&" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="Expression")
	EqExpression ::= left "=" right;

	@Operator(type="binary_left_associative", weight="2", superclass="Expression")
	SmthExpression ::= left "<" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="Expression")
	SeqExpression ::= left "<=" right;

	@Operator(type="binary_left_associative", weight="2", superclass="Expression")
	LthExpression ::= left ">" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="Expression")
	LeqExpression ::= left ">=" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="Expression")
	NeqExpression ::= left "!=" right;

	@Operator(type="binary_left_associative", weight="3", superclass="Expression")
	MultExpression ::= left "*" right;

	@Operator(type="binary_left_associative", weight="3", superclass="Expression")
	DivExpression ::= left "/" right;
	
	@Operator(type="binary_left_associative", weight="4", superclass="Expression")
	PlusExpression ::= left "+" right;

	@Operator(type="binary_left_associative", weight="4", superclass="Expression")
	MinusExpression ::= left "-" right;
	
	@Operator(type="unary_prefix", weight="5", superclass="Expression")
	NegExpression ::= "-" body;		
	
	@Operator(type="unary_prefix", weight="5", superclass="Expression")
	NotExpression ::= "!" body;	
		
	@Operator(type="primitive", weight="6", superclass="Expression")
	BracketExpression ::= "(" body ")";
	
	@Operator(type="primitive", weight="6", superclass="Expression")
	AttOperand ::= att[Size:"size",Orientation:"orientation",Speed:"speed",Hardness:"hardness",Resistance:"resistance", Immaterial:"immaterial",X:"x", Y:"y",Damage:"damage"];
	
	@Operator(type="primitive", weight="6", superclass="Expression")
	IntOperand ::= value[INTEGER];
	
	@Operator(type="primitive", weight="6", superclass="Expression")
	DoubleOperand ::= value[FLOAT];
	
	@Operator(type="primitive", weight="6", superclass="Expression")
	BooleanOperand ::= value[BOOLEAN];
	
	@Operator(type="binary_left_associative", weight="1", superclass="CollisionExpression")
	OrCollisionExpression ::= left "|" right;
	
	@Operator(type="binary_left_associative", weight="1", superclass="CollisionExpression")
	AndCollisionExpression ::= left "&" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="CollisionExpression")
	EqCollisionExpression ::= left "=" right;

	@Operator(type="binary_left_associative", weight="2", superclass="CollisionExpression")
	SmthCollisionExpression ::= left "<" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="CollisionExpression")
	SeqCollisionExpression ::= left "<=" right;

	@Operator(type="binary_left_associative", weight="2", superclass="CollisionExpression")
	LthCollisionExpression ::= left ">" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="CollisionExpression")
	LeqCollisionExpression ::= left ">=" right;
	
	@Operator(type="binary_left_associative", weight="2", superclass="CollisionExpression")
	NeqCollisionExpression ::= left "!=" right;

	@Operator(type="binary_left_associative", weight="3", superclass="CollisionExpression")
	MultCollisionExpression ::= left "*" right;

	@Operator(type="binary_left_associative", weight="3", superclass="CollisionExpression")
	DivCollisionExpression ::= left "/" right;
	
	@Operator(type="binary_left_associative", weight="4", superclass="CollisionExpression")
	PlusCollisionExpression ::= left "+" right;

	@Operator(type="binary_left_associative", weight="4", superclass="CollisionExpression")
	MinusCollisionExpression ::= left "-" right;
	
	@Operator(type="unary_prefix", weight="5", superclass="CollisionExpression")
	NegCollisionExpression ::= "-" body;
	
	@Operator(type="unary_prefix", weight="5", superclass="CollisionExpression")
	NotCollisionExpression ::= "!" body;
	
	@Operator(type="primitive", weight="6", superclass="CollisionExpression")
	BracketCollisionExpression ::= "(" body ")";

	@Operator(type="primitive", weight="6", superclass="CollisionExpression")
	IntCollisionOperand ::= value[INTEGER];
	
	@Operator(type="primitive", weight="6", superclass="CollisionExpression")
	DoubleCollisionOperand ::= value[FLOAT];
	
	@Operator(type="primitive", weight="6", superclass="CollisionExpression")
	BoolCollisionOperand ::= value[BOOLEAN];

	@Operator(type="primitive", weight="6", superclass="CollisionExpression")
	AttCollisionOperand ::= target"."att[Size:"size",Orientation:"orientation",Speed:"speed", Immaterial:"immaterial", Hardness:"hardness",Resistance:"resistance", X:"x", Y:"y",Damage:"damage"];
}