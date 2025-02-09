package runtime_analysis.sort_large_dataset;
import java.util.concurrent.TimeUnit;
public class DisplayPerformance {

    public static long[] display(int[]arr){
        long[] takentime=new long[3];

        long startTimeBubble,endTimeBubble;
        long startTimeMerge,endTimeMerge;
        long startTimeQuick,endTimeQuick;


        startTimeMerge=System.nanoTime();
        MergeSort.mergeSort(arr,0,arr.length-1);
        endTimeMerge=System.nanoTime();
        System.out.println("Time taken by merge sort : "+(endTimeMerge-startTimeMerge));
        takentime[0]=endTimeMerge-startTimeMerge;


        startTimeQuick=System.nanoTime();
        QuickSort.quickSort(arr,0,arr.length-1);
        endTimeQuick=System.nanoTime();
        System.out.println("Time taken by Quick sort : "+(endTimeQuick-startTimeQuick));
        takentime[1]=endTimeQuick-startTimeQuick;

        startTimeBubble=System.nanoTime();
        BubbleSort.bubbleSort(arr);
        endTimeBubble=System.nanoTime();
        System.out.println("Time taken by bubble sort: "+(endTimeBubble-startTimeBubble));
        takentime[2]=endTimeBubble-startTimeBubble;

        System.out.println("-------------------------------------------------------------");

        return takentime;
    }
}
