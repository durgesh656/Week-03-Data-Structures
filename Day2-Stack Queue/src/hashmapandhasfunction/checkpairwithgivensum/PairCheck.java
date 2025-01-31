package hashmapandhasfunction.checkpairwithgivensum;


import java.util.HashMap;

public class PairCheck {
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashMap<Integer, Boolean> visitedNumbers = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;
            if (visitedNumbers.containsKey(complement)) {
                return true;
            }
            visitedNumbers.put(num, true);
        }

        return false;
    }
}
