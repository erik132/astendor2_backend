package com.astendor.backend.antlr;

import com.astendor.backend.parser.OrderLexer;
import com.astendor.backend.parser.OrderParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class WarlordOrderParser {

    public static String ordersBackToString(List<WarlordOrder> orders) {
        if (orders == null || orders.isEmpty()) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        builder.append(orders.getFirst().getOriginalText());
        int size = orders.size();
        for (int i = 1; i < size; i++) {
            builder.append(' ').append(orders.get(i).getOriginalText());
        }
        return builder.toString();
    }

    public List<WarlordOrder> parserOrders(String orders) {
        System.out.println("Starting to parse orders");
        if (orders == null || orders.isEmpty()) {
            return null;
        }
        System.out.println("Confirmed we have orders.");
        OrderLexer lexer = new OrderLexer(CharStreams.fromString(orders));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        OrderParser parser = new OrderParser(tokenStream);
        OrderParser.Warlord_orderContext tree = parser.warlord_order();
        OrderVisitor visitor = new OrderVisitor(tokenStream);
        visitor.visit(tree);


        return visitor.getOrders();
    }
}
