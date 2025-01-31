package hashmapandhasfunction.checkpairwithgivensum;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        if (PairCheck.hasPairWithSum(arr, target)) {
            System.out.println("Pair with given sum found.");
        } else {
            System.out.println("No pair with given sum found.");
        }
    }
}
