lexer grammar Scanner;

COMMENT
	: ('//' ~('\r'|'\n')*
	| '/''*'.*'*''/') -> skip
  	;

INTLITERAL
  	:  DIGIT+
  	;

CHARLITERAL
	: '\''LETTER'\''
	| '\'''\\'.'\''
	| '\''DIGIT'\''
	;

STRINGLITERAL
	: '"' ~('"')* '"'
	;
	
BOOLEANLITERAL
	: 'true'
	| 'false'
	;
	
IDENTIFIER 
  	:'boolean'
	|'callout'
	|'class'
	|'else'
	|'if'
	|'int'
	|'return'
	|'for'
	|'break'
	|'continue'
  	;

fragment LETTER : ('a'..'z' | 'A'..'Z');
fragment DIGIT  : ('0'..'9');

WS
  	:  (' ' | '\t' | '\n' | '\r' | '\f')+ -> skip
  	; 