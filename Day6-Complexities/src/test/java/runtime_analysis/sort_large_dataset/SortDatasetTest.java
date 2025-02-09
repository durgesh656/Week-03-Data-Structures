package runtime_analysis.sort_large_dataset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortDatasetTest {
    GenerateArrays generateArrays=new GenerateArrays();
    DisplayPerformance display=new DisplayPerformance();




    @Test
    void test1(){
        int[]arr=generateArrays.arraySize1000();
        long[] takenTime = DisplayPerformance.display(arr);
        assertTrue(takenTime[1]<=takenTime[0] && takenTime[2]>=takenTime[0],"quickSort<=mergeSort<bubbleSort");

    }
    @Test
    void test2(){
        int[]arr=generateArrays.arraySize10000();
        long[] takenTime1 = DisplayPerformance.display(arr);
        assertTrue(takenTime1[1]<=takenTime1[0] && takenTime1[2]>=takenTime1[0],"quickSort<=mergeSort<bubbleSort");
    }

    @Test
    void test3(){
        int[]arr=generateArrays.arraySize1000000();
        long[] takenTime = DisplayPerformance.display(arr);
        assertTrue(takenTime[1]<=takenTime[0] && takenTime[2]>=takenTime[0],"quickSort<=mergeSort<bubbleSort");
    }
}
