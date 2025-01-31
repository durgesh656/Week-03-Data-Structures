package quicksort;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        //initialize the productPrices array to store the productPrices
        int[] productPrices = new int[n];
        System.out.print("Enter products prices: ");
        for(int i = 0; i < n ; i++){
            productPrices[i] = sc.nextInt();
        }


        Sort qs = new Sort();

        //call the quickSort method to sort the array
        qs.quickSort(productPrices, 0, productPrices.length-1);

        //print the sorted array
        System.out.print("Your Sorted productPrices are: [");
        for(int i : productPrices){
            System.out.print(i+" ");
        }
        System.out.print("]");
    }
}
