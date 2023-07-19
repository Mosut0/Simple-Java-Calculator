grammar g;

// Parser Rules
expression   : term ( ( '+' | '-' ) term )*
             ;

term         : factor ( ( ( '*' | '/' ) factor ) )*
             ;

factor       : unary | power
             ;

unary        : ( '+' | '-' ) unary
             | primary
             ;

power        : primary ( '^' primary )*
             ;

primary      : primaryExpression ( ( '+' | '-' | '*' | '/' ) primaryExpression )*
             ;

primaryExpression : number
                  | functionCall
                  | '(' expression ')'
                  | '-' primaryExpression
                  ;

functionCall  : 'square' '(' expression ')'
             | 'sqrt' '(' expression ')'
             | '1' '/' expression
             | 'cos' '(' expression ')'
             | 'sin' '(' expression ')'
             | 'tan' '(' expression ')'
             | 'log' '(' expression ')'
             | 'rate' '(' expression ')'
             | 'abs' '(' expression ')'
             | 'ln' '(' expression ')'
             ;

number       : '-'? DIGIT+ ('.' DIGIT+)?
             ;

// Lexer Rules
DIGIT        : [0-9]
             ;

ID           : [a-zA-Z]+;
FUNCTION     : 'square' | 'sqrt' | 'cos' | 'sin' | 'tan' | 'log' | 'rate' | 'abs' | 'ln';
LPAREN       : '(';
RPAREN       : ')';
PLUS         : '+';
MINUS        : '-';
MULTIPLY     : '*';
DIVIDE       : '/';
POWER        : '^';
WS           : [ \t\r\n]+ -> skip;
