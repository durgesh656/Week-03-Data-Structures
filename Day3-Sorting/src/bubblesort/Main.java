package bubblesort;
import java.util.Scanner;
public class Main {
    //static method to sort array
    public static void bubbleSort(int marks[]){

        for (int i=0; i<marks.length-1; i++){
            boolean swap = false;

            for (int j=0; j<marks.length-1; j++){
                if (marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                    swap=true;
                }
            }
            //if there is no swapping break the loop
            if (!swap){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of student:" );
        int size =sc.nextInt();//user input for Array size

        int marks[]=new int[size];
        //inserting the marks of student
        System.out.println("Enter students marks:");
        for (int i=0; i<size; i++){
            marks[i]=sc.nextInt();
        }

        bubbleSort(marks);

        System.out.println("Sorted array is:");
        for(int e : marks){
            System.out.print(e+" ");
        }
    }
}
