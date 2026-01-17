package com.astendor.backend.antlr;

public abstract class WarlordOrder {

    String originalText;

    public WarlordOrder(String originalText){
        this.originalText = originalText;
    }

    abstract boolean carryOutOrder();

    public String getOriginalText() {
        return originalText;
    }
}
