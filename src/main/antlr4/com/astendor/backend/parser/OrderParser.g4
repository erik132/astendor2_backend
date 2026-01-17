parser grammar OrderParser;

options { tokenVocab=OrderLexer; }

warlord_order
    : move_order+;

move_order
    : MOVE direction=(EAST | WEST | NORTH | SOUTH);
