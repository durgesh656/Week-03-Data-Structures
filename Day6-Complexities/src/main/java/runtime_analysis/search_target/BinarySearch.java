package runtime_analysis.search_target;

public class BinarySearch {
    //create a method to search the target element using Binary Search
    public static int searchTarget(int[]arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid= left+(right-left)/2;

            if (arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
        }

       return -1;
    }
}
