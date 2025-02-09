package runtime_analysis.compare_recursive_and_iterative_fibonacci;

public class FibonacciUsingRecursion {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
