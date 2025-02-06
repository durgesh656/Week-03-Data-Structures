package com.capgemini.binary_search.find_the_rotation_point;

public class FindRotationPoint {
    public static int findIndexOfSmallestElement(int[] arr){

        //initialize a variable left as 0 and right as length of array
        int left = 0;
        int right = arr.length - 1;

        //initialize a variable mid to find the mid index of an array
        int mid;

        //traverse the array until left index is less than right index
        while(left <= right){

            //find mid using the formula
            mid = left + (right - left)/2;

            //if we found our left and right index at same element than it's the only element remaining
            if(left == right) return left;

            //check if the element is in left of right of mid and update the variables
            else if(arr[mid] > arr[right]) left = mid + 1;
            else if (arr[mid] < arr[right]) right = mid;
        }

        //return -1 if element is not found
        return -1;
    }
}
