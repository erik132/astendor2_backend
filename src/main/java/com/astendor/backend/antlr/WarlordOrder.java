package com.astendor.backend.antlr;

import com.astendor.backend.repository.WarlordRepository;

public abstract class WarlordOrder {

    private String originalText;

    public WarlordOrder(String originalText){
        this.originalText = originalText;
    }

    abstract public boolean carryOutOrder(WarlordRepository repository, Integer warlordId);

    public String getOriginalText() {
        return originalText;
    }

    /**
     * @return true if the order takes an entire turn and we should not parse any further orders.
     * False if order is instant and more orders can be performed this turn.
     */
    abstract public boolean isOrderFullTurn();

    @Override
    public String toString() {
        return originalText;
    }
}
