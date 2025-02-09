package runtime_analysis.compare_different_data_structures;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size for first Array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        Random rand = new Random();
        for(int i = 0; i < n; i++){
            int num = rand.nextInt();
            arr1[i] = num;
            hs.add(i);
            ts.add(i);
        }

        int target = rand.nextInt();

        // calculate  search time for HashSet
        long startTimeHashSet = System.nanoTime();
        boolean foundInHashSet = SearchInHashSet.searchInHashSet(hs,target);
        long endTimeHashSet = System.nanoTime();
        System.out.println("Time taken by HashSet : " + (endTimeHashSet - startTimeHashSet) );

        // calculate search time for TreeSet
        long startTimeTreeSet = System.nanoTime();
        boolean foundInTreeSet = SearchInTreeSet.searchInTreeSet(ts,target);
        long endTimeTreeSet = System.nanoTime();
        System.out.println("Time taken by TreeSet : " + (endTimeTreeSet - startTimeTreeSet) );

        //calculate search time for Array
        long startTimeArray = System.nanoTime();
        boolean foundInArray = SearchInArray.searchInArray(arr1,target);
        long endTimeArray = System.nanoTime();
        System.out.println("Time taken by Array   : " + (endTimeArray - startTimeArray) );


    }

}
