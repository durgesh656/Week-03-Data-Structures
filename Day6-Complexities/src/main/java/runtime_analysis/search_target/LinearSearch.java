package runtime_analysis.search_target;

public class LinearSearch {
    //create a method to search for the target element using linear search
    public static int searchTarget(int[] arr,int target){
        int i=0;
        for(int e : arr){
            if (e==target){
                return i;
            }
            i++;
        }
        return -1;
    }
}
