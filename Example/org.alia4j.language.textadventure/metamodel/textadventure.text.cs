SYNTAXDEF textadventure
FOR <http://www.alia4j.org/alia4j-language-textadventure>
START World

OPTIONS {
	overrideBuilder = "false";
}

TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}


TOKENSTYLES {
	"tile" COLOR #7F0055, BOLD;
	"item" COLOR #7F0055, BOLD;
	"while" COLOR #7F0055, BOLD;
	"remove" COLOR #7F0055, BOLD;
	"person" COLOR #7F0055, BOLD;
	"used" COLOR #7F0055, BOLD;
	"Persons" COLOR #7F0055, BOLD;
	"Items" COLOR #7F0055, BOLD;
	"ignore" COLOR #7F0055, BOLD;
	"Tile" COLOR #7F0055, BOLD;
	"x" COLOR #7F0055, BOLD;
	"y" COLOR #7F0055, BOLD;
	"description" COLOR #7F0055, BOLD;
	"from" COLOR #7F0055, BOLD;
}


RULES {
	World ::= tiles* items* persons*;
	Tile ::= "tile" id[] "{" "x" "=" x[INTEGER] "y" "=" y[INTEGER] "description" "=" description['"','"'] "}";
	Item ::= "item" name[] ("@" location[])? "{" (effects)* "}";
	Binding ::= participant[ON:"on"] id[];
	WhileEffect ::= "while" condition[USED:"used"] binding "{" action "}";
	RemoveAction ::= "remove" what[] "from" from;
	List ::= position[RESULT:"result"] target[TILE:"Tile"] property[PERSONS:"Persons", ITEMS:"Items"];
	Person ::= "person" name[] "@" location[] "{" abilities* "}";
	IgnoreItemAbility ::= "ignore" ignoredItem[];
}