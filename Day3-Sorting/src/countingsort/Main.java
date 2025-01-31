package countingsort;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the total Scores
        System.out.print("Enter the size of ages array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the ages between 10 to 18: ");
        // Taking the user Input of student ages
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        Sort sort = new Sort();
        // sort the array
        try{
            sort.countingSort(arr);
            System.out.print("Ages after sorting:");
            System.out.print(Arrays.toString(arr));

        }catch (Exception e){
            System.out.println("Error caught invalid input please check and re-enter");
        }
    }
}
