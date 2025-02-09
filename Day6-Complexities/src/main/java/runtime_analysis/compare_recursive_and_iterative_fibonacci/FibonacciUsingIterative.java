package runtime_analysis.compare_recursive_and_iterative_fibonacci;

public class FibonacciUsingIterative {
    public static int fibonacciIterative(int n) {
        int a = 0;
        int b = 1;
        int sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
