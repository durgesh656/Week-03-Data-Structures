package com.capgemini.binary_search.find_the_peak_element_in_an_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input for the size of array
            System.out.println("Enter the size of array: ");
            int size = Integer.parseInt(br.readLine());

            int[] arr = new int[size];
            System.out.println("Enter array elements: ");
            try {
                for(int i = 0; i < size; i++){
                    arr[i] = Integer.parseInt(br.readLine());
                }
            }
            catch(NumberFormatException e){
                System.out.println("Exception occurred NumberFormatException found"+ e.getMessage());
            }

            System.out.println("Index of Peak Element is: "+FindPeakElement.findPeak(arr));;
        }
        catch (IOException e){
            System.out.println("Exception occurred IO Exception found"+ e.getMessage());
        }
    }
}
