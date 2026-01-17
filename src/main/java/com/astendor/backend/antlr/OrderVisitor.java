package com.astendor.backend.antlr;


import com.astendor.backend.parser.OrderParser;
import com.astendor.backend.parser.OrderParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class OrderVisitor extends OrderParserBaseVisitor<Object> {

    private List<WarlordOrder> orders;

    @Override
    public Object visitWarlord_order(OrderParser.Warlord_orderContext ctx) {
        orders = new ArrayList<>();
        return visitChildren(ctx);
    }

    @Override
    public WarlordOrder visitMove_order(OrderParser.Move_orderContext ctx) {
        orders.add(new MoveOrder(ctx.getText()));
        return null;
    }

    public List<WarlordOrder> getOrders() {
        return orders;
    }

}
