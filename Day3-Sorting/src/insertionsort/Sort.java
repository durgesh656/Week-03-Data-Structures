package insertionsort;

public class Sort {
    //create a static method to sort an array
    public static void insertionSort(int[] employeeID){
        //iterating employeeID through for loop
        for(int i=1; i<employeeID.length; i++) {
            int temp = employeeID[i];

            int j = i - 1;

            while (j >= 0 && employeeID[j] > temp) {
                employeeID[j + 1] = employeeID[j];
                j--;
            }
            employeeID[j + 1] = temp;
        }
    }

}
