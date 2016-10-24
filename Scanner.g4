lexer grammar Scanner;

COMMENT
	: ('//' .*? '\n' 
	| '/*' .*? '*/')  -> skip
  	;
 
INTLITERAL
  	:  DIGIT+
  	| '0x'HEX+
  	;
fragment HEX: (DIGIT | 'a'..'f' | 'A'..'F') ;

CHARLITERAL
	: '\''LETTER'\''
	| '\'''\\'('t'|'n'|'\\'|'"')'\''
	| '\''DIGIT'\''
	;

STRINGLITERAL
	: '"' (ESC|.)*? '"'
	;
	
BOOLEANLITERAL
	: 'true'
	| 'false'
	;

KEYWORD
	: 'boolean'
	| 'callout'
	| 'class'
	| 'else'
	| 'if'
	| 'break'
	| 'for'
	| 'int'
	| 'return'
	| 'void'
	| 'continue'
	;	
	
IDENTIFIER 
  	: LETTER+
  	| '_' LETTER+
  	| LETTER+ '_'
  	| LETTER+ '_' LETTER+
  	| LETTER+ DIGIT+
  	| LETTER+ DIGIT+ LETTER+
  	| LETTER+ IDENTIFIER
  	;
OPERATION
	: '('
	| ')'
	| '['
	| ']'
	| ','
	| ';'
	| '='
	| '=='
	| '-'
	| '+'
	| '-'
	| '*'
	| '/'
	| '%'
	| '<'
	| '<='
	| '>'
	| '>='
	| '!='
	| '&&'
	| '||'
	| '{'
	| '}'
	;
	
FLOAT
	: (DIGIT+ ',' DIGIT*
	| 		 '.' DIGIT+) -> skip
	;
	
NOTIDENTIFIER 
  	: (LETTER+ '.') -> skip
  	;

fragment LETTER : ('a'..'z' | 'A'..'Z');
fragment DIGIT  : ('0'..'9');
fragment ESC : '\\"' | '\\\\' ;

WS
  	:  (' ' | '\t' | '\n' | '\r' | '\f')+ -> skip
  	; 