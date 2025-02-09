package runtime_analysis.compare_different_data_structures;

public class SearchInArray {
    public static boolean searchInArray(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
