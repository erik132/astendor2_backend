package com.astendor.backend.antlr;

public class TakeItemOrder extends TakeOrder{


    public TakeItemOrder(String originalText, Integer amount, String objectName) {
        super(originalText, amount, objectName);
    }

    @Override
    boolean carryOutOrder() {
        return false;
    }
}
