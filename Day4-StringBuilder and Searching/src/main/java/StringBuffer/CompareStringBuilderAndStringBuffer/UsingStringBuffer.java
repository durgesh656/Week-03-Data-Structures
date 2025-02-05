package StringBuffer.CompareStringBuilderAndStringBuffer;

public class UsingStringBuffer {
    public static long stringBufferPerformance(String[]str){
        // create variables to store time
        long endTime,startTime;

        //create object of StringBuffer
        StringBuffer sb = new StringBuffer();
        startTime=System.nanoTime();//store the start time
        //Adding Array elements to the string buffer
        for (String e:str){
            sb.append(e);
        }
        endTime=System.nanoTime();//store end time

        long time=endTime-startTime;//calculate total time taken by the StringBuffer

        return time;
    }
}
