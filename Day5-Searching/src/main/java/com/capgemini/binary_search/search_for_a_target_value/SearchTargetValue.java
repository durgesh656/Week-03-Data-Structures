package com.capgemini.binary_search.search_for_a_target_value;

public class SearchTargetValue {
    public static boolean searchForTargetValue(int[][] arr, int target){
        int row = arr.length;
        int col = arr[0].length;

        int left = 0;
        int right = row-1;
        int mid;

        while(left <= right){

            mid = left + (right - left)/2;

            if(arr[mid][0] == target) return true;

            else if(arr[mid][0] > target) right = mid - 1;
            left = mid + 1;
        }

        if(right < 0) return false;

        left = 0;
        row = right;
        right = col -1;
        while(left <= right){
            mid = left + (right - left)/2;
            if(arr[row][mid] == target) return true;
            else if(arr[row][mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}
