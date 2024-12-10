package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) {
        // Plan:
        // 1. loop through the array
        // 2. find the smallest in the unsorted part of the array
        // 3. swap it with the next element in the unsorted part
        // 4. repeat until the array is sorted

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            // find smallest in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            Util.exch(arr, i, minIndex);
        }
    }
}
