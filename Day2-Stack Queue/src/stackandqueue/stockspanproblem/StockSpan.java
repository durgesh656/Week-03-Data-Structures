package stackandqueue.stockspanproblem;


import java.util.Stack;

public class StockSpan {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize span for first day
        span[0] = 1;
        stack.push(0);

        // Calculate span for rest of the days
        for (int i = 1; i < n; i++) {
            // Pop elements from stack while stack is not empty and top of stack is less than or equal to current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, then price[i] is greater than all elements on left of it
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push this element to stack
            stack.push(i);
        }

        return span;
    }
}
