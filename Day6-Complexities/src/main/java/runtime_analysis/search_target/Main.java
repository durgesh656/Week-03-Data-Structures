package runtime_analysis.search_target;


public class Main {

    public static void main(String[] args) {
        //create an object of GenerateArrays class
        GenerateArrays generateArray=new GenerateArrays();

        //call the arraySize1000 method of GenerateArrays class and store the result
        int[]arr1=generateArray.arraySize1000();

        //call the arraySize10000 method of GenerateArrays class and store the result
        int[]arr2=generateArray.arraySize10000();

        //call the arraySize1000000 method of GenerateArrays class and store the result
        int[]arr3=generateArray.arraySize1000000();

        //call the display method of GenerateArrays class
        generateArray.display(arr1,187);
        generateArray.display(arr2,154);
        generateArray.display(arr3,19);


    }
}
