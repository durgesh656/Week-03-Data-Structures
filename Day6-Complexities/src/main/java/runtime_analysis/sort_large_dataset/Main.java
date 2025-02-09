package runtime_analysis.sort_large_dataset;

public class Main {
    public static void main(String[] args) {
        GenerateArrays generateArrays=new GenerateArrays();

        int[]arr1=generateArrays.arraySize1000();
        int[]arr2=generateArrays.arraySize10000();
        int[]arr3=generateArrays.arraySize1000000();


        DisplayPerformance.display(arr1);
        DisplayPerformance.display(arr2);
        DisplayPerformance.display(arr3);




    }
}
