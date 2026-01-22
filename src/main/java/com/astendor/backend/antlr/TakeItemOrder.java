package com.astendor.backend.antlr;

import com.astendor.backend.repository.WarlordRepository;

public class TakeItemOrder extends TakeOrder{


    public TakeItemOrder(String originalText, Integer amount, String objectName) {
        super(originalText, amount, objectName);
    }

    @Override
    public boolean carryOutOrder(WarlordRepository repository, Integer warlordId) {
        return false;
    }
}
