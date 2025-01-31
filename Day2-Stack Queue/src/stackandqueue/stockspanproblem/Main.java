package stackandqueue.stockspanproblem;

public class Main {

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = StockSpan.calculateSpan(prices);

        // Print the span array
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
