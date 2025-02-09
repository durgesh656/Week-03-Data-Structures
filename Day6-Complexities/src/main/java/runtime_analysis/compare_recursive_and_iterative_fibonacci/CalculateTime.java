package runtime_analysis.compare_recursive_and_iterative_fibonacci;

public class CalculateTime {
    public static boolean displayTime(int n){
        long startTimeIterative = System.nanoTime();
        int iterativeResult = FibonacciUsingIterative.fibonacciIterative(n);
        long endTimeIterative = System.nanoTime();

        long timeByIterative = endTimeIterative-startTimeIterative;

        System.out.println("Time taken by the iterative method : "+ (timeByIterative));

        long startTimeRecursion = System.nanoTime();
        int recursionResult = FibonacciUsingRecursion.fibonacciRecursive(n);
        long endTimeRecursion = System.nanoTime();

        long timeByRecursion = endTimeRecursion-startTimeRecursion;

        System.out.println("Time taken by the recursive method : "+ (timeByRecursion));


        return timeByRecursion >= timeByIterative;
    }

}
