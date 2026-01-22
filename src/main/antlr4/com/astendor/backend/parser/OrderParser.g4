parser grammar OrderParser;

options { tokenVocab=OrderLexer; }

warlord_order
    : (move_order | take_order)+;

move_order
    : MOVE direction=(EAST | WEST | NORTH | SOUTH);

take_order
    : TAKE INTEGER (unit_name | item_name);

unit_name
    : GRUNT
    | ARCHER
    | SPEARMAN
    | HORSEMAN
    ;

item_name
    : IRON
    | COAL
    | WOOD
    | HORSE
    | SHEEP
    | COPPER ORE
    | TIN ORE
    | STEEL INGOT
    | BRONZE INGOT
    | CAMEL
    | WOODEN SHIELD
    | SHORT BOW
    | IRON SWORD
    | SPEAR
    ;