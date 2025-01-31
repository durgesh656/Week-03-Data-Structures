package selectionsort;

public class Sort {
    // create a method to sort the array
    public void selectionSort(int[] examScores){

        int n = examScores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (examScores[j] < examScores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the  minimum element with the first element
            int temp = examScores[minIndex];
            examScores[minIndex] = examScores[i];
            examScores[i] = temp;
        }
    }
}
