package runtime_analysis.search_target;

import org.junit.jupiter.api.Test;
import runtime_analysis.search_target.GenerateArrays;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTargetTest {
    GenerateArrays generateArray =new GenerateArrays();
    @Test
    void test1(){

        int[]arr1=generateArray.arraySize1000();
//        Arrays.sort(arr1);

        long[] takenTime=generateArray.display(arr1,arr1[500]);
        assertTrue(takenTime[0]>takenTime[1]);

    }
    @Test

    void test2(){
        int[]arr2=generateArray.arraySize10000();
//        Arrays.sort(arr2);

        long[] takenTime=generateArray.display(arr2,494756387);
        assertTrue(takenTime[0]>takenTime[1]);

    }

    @Test
    void test3(){
        int[]arr3=generateArray.arraySize1000000();
        Arrays.sort(arr3);

        long[] takenTime=generateArray.display(arr3,arr3[500000]);
        assertTrue(takenTime[0]>takenTime[1]);
    }


}
