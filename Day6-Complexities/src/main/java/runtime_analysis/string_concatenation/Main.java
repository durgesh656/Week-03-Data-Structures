package runtime_analysis.string_concatenation;

public class Main {

    static void displayTime(int iteration){
        long timeTakenByString = StringPerformance.calculateStringTime(iteration);
        long timeTakenByStringBuilder = StringBuilderPerformance.calculateStringBuilderTime(iteration);
        long timeTakenByStringBuffer = StringBufferPerformance.calculateStringBufferTime(iteration);
        System.out.println("-----------------");
        System.out.println("Time taken by String Builder : " + timeTakenByStringBuilder);
        System.out.println("Time taken by String Buffer  : " + timeTakenByStringBuffer);
        System.out.println("Time taken by String         : " + timeTakenByString);
    }

    public static void main(String[] args) {
        displayTime(1000);
        displayTime(10000);
        displayTime(1000000);

    }
}
