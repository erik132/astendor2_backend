package com.astendor.backend.antlr;

public class TakeUnitOrder extends TakeOrder{

    public TakeUnitOrder(String originalText, Integer amount, String objectName) {
        super(originalText, amount, objectName);
    }

    @Override
    boolean carryOutOrder() {
        return false;
    }
}
