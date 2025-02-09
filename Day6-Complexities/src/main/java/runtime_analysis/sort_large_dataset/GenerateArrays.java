package runtime_analysis.sort_large_dataset;

import java.util.Random;

public class GenerateArrays {
    Random random = new Random();

    //create a method for generate an array of size 1000
    public int[] arraySize1000(){
        int[] arr=new int[1000];

        for(int i=0; i<1000; i++){
            arr[i]= random.nextInt();
        }

        return arr;
    }

    //create a method for generate an array of size 10000
    public  int[] arraySize10000(){
        int[] arr=new int[10000];

        for(int i=0; i<10000; i++){
            arr[i]= random.nextInt();
        }

        return arr;
    }

    //create a method for generate an array of size 1000000
    public int[] arraySize1000000(){
        int[] arr=new int[1000000];

        for(int i=0; i<1000000; i++){
            arr[i]= random.nextInt();
        }

        return arr;
    }


}
