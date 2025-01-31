package heapsort;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of applicants: ");
        int numOfApplicants=sc.nextInt();

        //Array to store expected salaries of applicants
        int salaries[]=new int[numOfApplicants];

        //loop to take input from user
        System.out.print("Enter Salary: ");
        for(int i=0;i<salaries.length;i++){
            salaries[i]=sc.nextInt();
        }
        System.out.print("Original salary demands: " );
        HeapSort.printArray(salaries);

        HeapSort.heapSort(salaries);

        System.out.print("Sorted salary demands: " );
        HeapSort.printArray(salaries);
    }
}
