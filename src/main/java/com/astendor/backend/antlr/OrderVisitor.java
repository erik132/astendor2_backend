package com.astendor.backend.antlr;


import com.astendor.backend.parser.OrderLexer;
import com.astendor.backend.parser.OrderParser;
import com.astendor.backend.parser.OrderParserBaseVisitor;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class OrderVisitor extends OrderParserBaseVisitor<Object> {

    private List<WarlordOrder> orders;
    private CommonTokenStream originatingTokenstream;

    public OrderVisitor(CommonTokenStream originatingTokenstream) {
        this.originatingTokenstream = originatingTokenstream;
    }

    @Override
    public Object visitWarlord_order(OrderParser.Warlord_orderContext ctx) {
        orders = new ArrayList<>();
        return visitChildren(ctx);
    }

    @Override
    public Object visitMove_order(OrderParser.Move_orderContext ctx) {
        Integer directionX = 0;
        Integer directionY = 0;
        switch (ctx.direction.getType()) {
            case OrderLexer.EAST -> directionX = -1;
            case OrderLexer.WEST -> directionX = 1;
            case OrderLexer.NORTH -> directionY = -1;
            case OrderLexer.SOUTH -> directionY = 1;
        }
        orders.add(new MoveOrder(getProperOrderText(ctx), directionX, directionY));
        return null;
    }

    @Override
    public Object visitTake_order(OrderParser.Take_orderContext ctx) {
        if(ctx.unit_name() != null){
            orders.add(new TakeUnitOrder(getProperOrderText(ctx), Integer.parseInt(ctx.INTEGER().getText()), getProperOrderText(ctx.unit_name())));
        }else{
            orders.add(new TakeItemOrder(getProperOrderText(ctx), Integer.parseInt(ctx.INTEGER().getText()), getProperOrderText(ctx.item_name())));
        }
        return null;
    }

    public List<WarlordOrder> getOrders() {
        return orders;
    }

    private String getProperOrderText(ParserRuleContext ctx) {
        StringBuilder builder = new StringBuilder();
        List<String> textTokens = generateTextList(ctx);
        if (!textTokens.isEmpty()) {
            builder.append(textTokens.getFirst());
            int size = textTokens.size();
            for (int i = 1; i < size; i++) {
                builder.append(' ').append(textTokens.get(i));
            }
            return builder.toString();
        }
        throw new RuntimeException("context can not be empty");
    }

    private List<String> generateTextList(ParserRuleContext node) {
        List<String> result = new ArrayList<>();
        List<Token> tokens = originatingTokenstream.getTokens(node.start.getTokenIndex(), node.stop.getTokenIndex());
        for (Token token : tokens) {
            if (token.getChannel() != OrderLexer.HIDDEN) {
                result.add(token.getText());
            }

        }
        return result;
    }

}
