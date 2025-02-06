package com.capgemini.binary_search.find_the_first_and_last_occurrence;

public class FirstAndLastOccurrenceOfElement {
    public static int[] findFirstAndLastOccurrence(int[] arr, int element){

        int first = -1, last = -1, left = 0,  right = arr.length - 1;

        while(left <= right){
            int mid = left + (right -left)/2;

            if(arr[mid] == element){
                first = mid;
                right = mid-1;
            }
            else if(arr[mid] < element){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

         left = 0;
         right = arr.length - 1;
         while (left <= right ){

             int mid = left + (right - left)/2;

             if(arr[mid] == element){
                 last = mid;
                 left = mid + 1;
             } else if (arr[mid] < element) {
                 left = mid + 1;
             } else {
                 right = mid - 1;
             }
         }
        return new int[]{first,last};
    }
}
