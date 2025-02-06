package com.capgemini.binary_search.find_the_first_and_last_occurrence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.print("Enter the size of array: ");
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];
            System.out.println("Enter array elements: ");
            try {
                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(br.readLine());
                }
            }catch (NumberFormatException e){
                System.out.println("Exception occurred NumberFormatException "+e.getMessage());
            }

            System.out.println("Enter element whose first and last occurrence you want to find: ");
            int element = Integer.parseInt(br.readLine());
            int[] result = FirstAndLastOccurrenceOfElement.findFirstAndLastOccurrence(arr, element);
            if(result[0] == -1 && result[1] == 1){
                System.out.println("-1");
            }
            else{
                System.out.println("First occurrence of "+ element +" is at index "+result[0]+" and last occurrence is at index "+result[1]);
            }
        } catch (IOException e) {
            System.out.println("Exception occurred IOException "+ e.getMessage());
        }
    }
}
