import java.util.*;

class StockSpanner {
    public static class Pair {
        int price, span;
        Pair(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }

    private Stack<Pair> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while (!st.isEmpty() && st.peek().price <= price) {
            span += st.pop().span;
        }

        st.push(new Pair(price, span));
        return span;
    }
}

public class onlineStockSpan {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        for (int price : prices) {
            int span = stockSpanner.next(price);
            System.out.println("Price: " + price + " → Span: " + span);
        }
    }
}
