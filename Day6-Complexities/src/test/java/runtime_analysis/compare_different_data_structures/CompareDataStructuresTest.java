package runtime_analysis.compare_different_data_structures;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompareDataStructuresTest {
    @Test

    void test1(){
        int n = 100000; // Number of elements
        Random rand = new Random();

        // Generate random data
        int[] arr1 = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        // Add random data in the data structures
        for (int i = 0; i < n; i++) {
            int num = rand.nextInt();
            arr1[i] = num;
            hs.add(num);
            ts.add(num);
        }

        // Pick a random element to search
        int target = rand.nextInt();


        long startTimeArray = System.nanoTime();
        boolean foundInArray = SearchInArray.searchInArray(arr1, target);
        long endTimeArray = System.nanoTime();

        // Measure search time in HashSet (O(1))
        long startTimeHashSet = System.nanoTime();
        boolean foundInHashSet = SearchInHashSet.searchInHashSet(hs, target);
        long endTimeHashSet = System.nanoTime();

        // Measure search time in TreeSet (O(log N))
        long startTimeTreeSet = System.nanoTime();
        boolean foundInTreeSet = SearchInTreeSet.searchInTreeSet(ts, target);
        long endTimeTreeSet = System.nanoTime();

        assertTrue((endTimeArray - startTimeArray) >= (endTimeHashSet - startTimeHashSet) && (endTimeHashSet - startTimeHashSet) >= (endTimeTreeSet - startTimeTreeSet));
    }


}
