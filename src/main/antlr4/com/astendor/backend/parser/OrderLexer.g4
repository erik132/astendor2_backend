lexer grammar OrderLexer;


MOVE        : M O V E;
EAST        : E A S T;
WEST        : W E S T;
NORTH       : N O R T H;
SOUTH       : S O U T H;


// Token definitions
WORD : LETTER+;
INTEGER : DIGIT+;

fragment LETTER
    : [A-Za-z]
    ;

fragment A : [aA] ;
fragment B : [bB] ;
fragment C : [cC] ;
fragment D : [dD] ;
fragment E : [eE] ;
fragment F : [fF] ;
fragment G : [gG] ;
fragment H : [hH] ;
fragment I : [iI] ;
fragment J : [jJ] ;
fragment K : [kK] ;
fragment L : [lL] ;
fragment M : [mM] ;
fragment N : [nN] ;
fragment O : [oO] ;
fragment P : [pP] ;
fragment Q : [qQ] ;
fragment R : [rR] ;
fragment S : [sS] ;
fragment T : [tT] ;
fragment U : [uU] ;
fragment V : [vV] ;
fragment W : [wW] ;
fragment X : [xX] ;
fragment Y : [yY] ;
fragment Z : [zZ] ;
fragment DIGIT
    : [0-9] ;

// Skip whitespace
WS      : [ \t\r\n]+ -> channel(HIDDEN);
