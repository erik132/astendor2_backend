lexer grammar OrderLexer;


MOVE        : M O V E;
EAST        : E A S T;
WEST        : W E S T;
NORTH       : N O R T H;
SOUTH       : S O U T H;
TAKE        : T A K E;

//Types
ORE         : O R E;
INGOT       : I N G O T;

//Adjectives
WOODEN      : W O O D E N;
SHORT       : S H O R T;

//Resource Nouns
IRON        : I R O N;
COAL        : C O A L;
WOOD        : W O O D;
HORSE       : H O R S E;
SHEEP       : S H E E P;
COPPER      : C O P P E R;
TIN         : T I N;
STEEL       : S T E E L;
BRONZE      : B R O N Z E;
CAMEL       : C A M E L;
SHIELD      : S H I E L D;
BOW         : B O W;
SWORD       : S W O R D;
SPEAR       : S P E A R;


//Unit Nouns
GRUNT       : G R U N T;
ARCHER      : A R C H E R;
SPEARMAN    : S P E A R M A N;
HORSEMAN    : H O R S E M A N;

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
