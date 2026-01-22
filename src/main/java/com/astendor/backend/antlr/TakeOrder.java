package com.astendor.backend.antlr;

public abstract class TakeOrder extends WarlordOrder{

    private Integer amount;
    private String objectName;

    public TakeOrder(String originalText, Integer amount, String objectName) {
        super(originalText);
        this.amount = amount;
        this.objectName = objectName;
    }

    @Override
    public boolean isOrderFullTurn() {
        return false;
    }
}
