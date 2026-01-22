package com.astendor.backend.antlr;

import com.astendor.backend.repository.WarlordRepository;

public class MoveOrder extends WarlordOrder{

    private Integer directionX;
    private Integer directionY;

    public MoveOrder(String originalText, Integer directionX, Integer directionY) {
        super(originalText);
        this.directionX = directionX;
        this.directionY = directionY;
    }

    @Override
    public boolean carryOutOrder(WarlordRepository repository, Integer warlordId) {
        repository.moveWarlord(warlordId, directionX, directionY);
        return true;
    }

    @Override
    public boolean isOrderFullTurn() {
        return true;
    }
}
