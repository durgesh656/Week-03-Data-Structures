package StringBuffer.CompareStringBuilderAndStringBuffer;

public class UsingStringBuilder {
    public static long stringBuilderPerformance(String[] str) {
        //declare variables to store time
        long endTime, startTime;
        //create an object of StringBuilder
        StringBuilder sb = new StringBuilder();

        startTime = System.nanoTime();//store start time

        //add array elements to the string builder
        for (String e : str) {
            sb.append(e);
        }

        endTime = System.nanoTime();//store end time

        long time = endTime - startTime;//calculate total time taken by the string builder

        return time;
    }
}
