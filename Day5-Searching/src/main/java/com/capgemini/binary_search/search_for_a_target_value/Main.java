package com.capgemini.binary_search.search_for_a_target_value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            //get user input for the size of array
            System.out.print("Enter the size of array: ");
            int size = Integer.parseInt(br.readLine());

            int[][] arr = new int[size][size];
            System.out.println("Enter array elements: ");
            try {
                for(int i = 0; i < size; i++){
                    for (int j = 0; j < size; j++) {
                        arr[i][j] = Integer.parseInt(br.readLine());
                    }
                }
            }
            catch(NumberFormatException e){
                System.out.println("Exception occurred NumberFormatException found"+ e.getMessage());
            }

            System.out.print("Enter your target Value: ");
            int target = Integer.parseInt(br.readLine());

            System.out.println(SearchTargetValue.searchForTargetValue(arr,target));;
        }
        catch (IOException e){
            System.out.println("Exception occurred IO Exception found"+ e.getMessage());
        }
    }
}
