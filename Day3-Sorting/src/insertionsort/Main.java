package insertionsort;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Employee: ");
        int numberOfEmployee = sc.nextInt();

        System.out.print("insert the employeeID of employees: ");
        int[] employeeID = new int[numberOfEmployee];
        //inserting array elements
        for (int i=0; i < numberOfEmployee; i++){
            employeeID[i] = sc.nextInt();
        }
        //call the insertionSort method to sort the array
        Sort.insertionSort(employeeID);
        //Printing the sorted array
        System.out.print("sorted Employee ID's Are: [");
         for (int e: employeeID){
             System.out.print(e+" ");
         }
        System.out.print("]");

    }
}
