package com.capgemini.binary_search.find_the_peak_element_in_an_array;

public class FindPeakElement {
    public static int findPeak(int[] arr){
        //initialize a variable left as 0 and right as length of array
        int left = 0;
        int right = arr.length - 1;

        //initialize a variable mid to find the mid index of an array
        int mid;

        //traverse the array until left index is less than right index
        while(left < right){

            //find mid using the formula
            mid = left + (right - left)/2;

            //check if the element is on the left of mid
            if(arr[mid] > arr[mid+1]){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}
