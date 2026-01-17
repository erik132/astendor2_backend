package com.astendor.backend.antlr;

public class MoveOrder extends WarlordOrder{

    public MoveOrder(String originalText) {
        super(originalText);
    }

    @Override
    public boolean carryOutOrder() {
        return false;
    }
}
