package runtime_analysis.string_concatenation;

public class StringPerformance {
    public static long calculateStringTime(int iteration){
        String s = "";
        long startTime = System.nanoTime();
        for (int i = 0; i < iteration; i++) {
            s += "a";
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
