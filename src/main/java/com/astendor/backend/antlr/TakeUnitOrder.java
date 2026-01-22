package com.astendor.backend.antlr;

import com.astendor.backend.repository.WarlordRepository;

public class TakeUnitOrder extends TakeOrder{

    public TakeUnitOrder(String originalText, Integer amount, String objectName) {
        super(originalText, amount, objectName);
    }

    @Override
    public boolean carryOutOrder(WarlordRepository repository, Integer warlordId) {
        return false;
    }
}
