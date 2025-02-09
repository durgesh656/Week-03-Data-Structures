package runtime_analysis.search_target;

import java.util.Arrays;
import java.util.Random;

public class GenerateArrays {
    Random random = new Random();

    //create a method for generate an array of size 1000
    public int[] arraySize1000(){
        int[] arr=new int[1000];

        for(int i=0; i<1000; i++){
            arr[i]= random.nextInt(50);
        }

        return arr;
    }
    //create a method for generate an array of size 10000
     public  int[] arraySize10000(){
        int[] arr=new int[10000];

        for(int i=0; i<10000; i++){
            arr[i]= random.nextInt(50);
        }

        return arr;
    }

    //create a method for generate an array of size 1000000
    public int[] arraySize1000000(){
        int[] arr=new int[1000000];

        for(int i=0; i<1000000; i++){
            arr[i]= random.nextInt(50);
        }

        return arr;
    }

    //create a display method to display the performance of linear and binary search
    public long[] display(int[]arr,int target){

        long[] takenTime=new long[2];
        long startTimeLinear,endTimeLinear;
        long startTimeBinary,endTimeBinary;

        //calculate time of linear search
        startTimeLinear=System.nanoTime();
        LinearSearch.searchTarget(arr,target);
        endTimeLinear=System.nanoTime();
        System.out.println("Time taken by linear search: "+(endTimeLinear-startTimeLinear));
        takenTime[0]=endTimeLinear-startTimeLinear;

        //calculate time of binary search
        Arrays.sort(arr);
        startTimeBinary=System.nanoTime();
        BinarySearch.searchTarget(arr,target);
        endTimeBinary=System.nanoTime();
        System.out.println("Time taken by binary search: "+(endTimeBinary-startTimeBinary));
        takenTime[1]=endTimeBinary-startTimeBinary;

        return takenTime;
    }
}
