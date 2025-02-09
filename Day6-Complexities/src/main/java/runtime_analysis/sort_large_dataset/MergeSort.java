package runtime_analysis.sort_large_dataset;

import java.util.ArrayList;

public class MergeSort {
    // Merge Sort function
    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }
        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
}


