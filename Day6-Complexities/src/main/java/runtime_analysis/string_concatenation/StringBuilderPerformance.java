package runtime_analysis.string_concatenation;

public class StringBuilderPerformance {
    public static long calculateStringBuilderTime(int iterations) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
