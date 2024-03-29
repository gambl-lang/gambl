grammar ourLang;

//PARSER

topLevel
    : importing* functiondeclaration* statement* EOF
    ;

statement
    : assignment ';'
    | declaration ';'
    | functioncall ';'
    | controlblock
    | loop
    ;

importing
    : IMPORT '<' LIBRARY '>'
    ; 

controlblock
    : IF '(' conditionalExpression ')' ifBlock=block (ELSE IF '(' conditionalExpression ')' elseIfBlock=block)* (ELSE elseBlock=block)?
    ;

loop
    : WHILE '(' conditionalExpression ')' whileBlock=block      #whileLoop
    | FOR '(' (declaration | assignment) ';' conditionalExpression ';' update ')' forBlock=block     #forLoop  
    ;
 
update
    : assignment
    | ID postUnaryOperator
    ;

block
    : '{' statement* '}'
    ;
    
conditionalExpression
    : conditionalExpression '&&' conditionalExpression                  #multiAndCondExpr
    | conditionalExpression '||' conditionalExpression                  #multiOrCondExpr
    | expression conditionalOperator expression                         #singleCondExpr
    | conditionalExpression  ( '==' | '!=' ) conditionalExpression      #multiConExpr
    | '(' conditionalExpression ')'                                     #parenConExpr
    | BOOLVAL                                                           #BoolValConExpr
    ;

functiondeclaration
    : functiondatatype ID '(' parameterlist ')' functionbody
    ; 
    
functionbody
    : '{' ( statement )* functionreturn? '}'
    ;

functionreturn
    : 'return' expression ';'
    ;


parameterlist
    : (parameter( ',' parameter )*)?
    | 
    ;

parameter
    : (valueType | complexdatatype ) ID
    ;

functioncall
    : ID '(' argumentlist ')'               #customFunc
    | PRINT '(' argumentlist ')'            #printFunc
    | COMPLEXTOFILE '(' argumentlist ')'    #complexToFileFunc
    | FILETOCOMPLEX  '(' argumentlist ')'   #fileToComplexFunc
    ;

argumentlist
    : (expression | STRING) ( ',' (expression | STRING) ) *
    | 
    ;

expression
    : expression '^' expression                         #powerExpr
    | expression ( '*' | '/' | '%' | '#' ) expression   #mulExpr
    | expression ( '+' | '-' ) expression               #addExpr
    | '(' expression ')'                                #parenExpr
    | value                                             #valueExpr
    | ID postUnaryOperator                              #postIDExpr
    ;

assignment
    : valassignment
	| collectionassignment
    ;

valassignment
	: ID assignmentOperator ( expression | BOOLVAL | conditionalExpression ) #stdAssignment
    | ID postUnaryOperator                                                   #postUnaryAssignment
	;

collectionassignment
	: ID '=' expression                                 #entireCollectionAssignment
	| collectionEntrance assignmentOperator expression  #collectionEntranceAssignment
	;
	
declaration
    : valueType ID '=' (expression | conditionalExpression) #primitiveDecl
    | complexdatatype ID '=' expression                     #complexDecl
    | complexdatatype '[' entranceCoordinate ']' ID         #specialComplexDecl
    ; 
    
valueType
    : INT                               #integer
    | FLOAT                             #floatingpoint
    | BOOL                              #boolean
    ;

complexdatatype
    : collectiontype '<' valueType '>'
    ;

functiondatatype
    : valueType
    | complexdatatype
    | VOID
    ;

value
    : ID                                     #valID
    | constant                               #valConstant
    | '[' valueList ( ';' valueList )* ']'   #valList
    | functioncall                           #valFuncCall
    | collectionEntrance                     #valCollectionEntrance
    | BOOLVAL                                #valBool
    ;

collectionEntrance
    : ID '[' entranceCoordinate ']'
    ;

valueList
    : value ( ',' value)*
    ;

constantList
    : constant ( ',' constant )*
    ;

entranceCoordinate
    : value ( ',' value )?
    ;

collectiontype
    : MATRIX    #collectionMatrix
    | VECTOR    #collectionVector
    ;

postUnaryOperator 
    : '++' | '--' | '^T' ;

assignmentOperator
    : '=' | '+=' | '-=' | '*=' | '/=' ;

conditionalOperator
    : '==' | '!=' | '<=' | '>=' | '<' | '>' ;

constant
    : INTNUM  
    | FLOATNUM 
    ;

//LEXER 
IMPORT: 'include' | 'import' ;  
  
IF: 'if' ;
ELSE: 'else' ;

WHILE: 'while' ;
FOR: 'for' ;

MATRIX: 'matrix' ;
VECTOR: 'vector' ;


INT: 'int' | 'int16' | 'int32' | 'int64' ;
INTNUM: '0' | SIGN? [1-9][0-9]* ;

FLOAT: 'float' | 'float16' | 'float32' | 'float64' ;  
FLOATNUM: SIGN? ([1-9][0-9]* | '0') '.' ([0-9]* [1-9] | '0') ;

BOOL: 'bool' ;
BOOLVAL: 'true' | 'false' ;

VOID: 'void' ;

STRING: '"' .*? '"' ;

SIGN: '-' ;   

PRINT: 'print' ;
COMPLEXTOFILE: 'matrixToFile' ;
FILETOCOMPLEX: 'fileToMatrix' ;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;    

LIBRARY: [a-zA-Z0-9_\/'.']+;

//Whitespace and comments

WS: [ \t ]+ -> skip;

NL: [ \r \n | \n ] -> skip;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;
