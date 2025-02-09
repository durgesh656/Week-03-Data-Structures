package runtime_analysis.string_concatenation;

public class StringBufferPerformance {
    public static long calculateStringBufferTime(int iterations) {
        StringBuffer sb = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
