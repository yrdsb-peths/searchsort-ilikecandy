package searchsort;

public class InsertionSort {
    /**
     * Sort the array arr using insertion sort algorithm.
     */
    public static void sort(int[] arr) {
        // plan:
        // 1. loop through the array
        // 2. for each element, loop backwards
        // 3. if the current element is smaller, swap it
        // 4. repeat until the current element is greater than the previous element
        // 5. move on to the next element

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    Util.exch(arr, j, j - 1);
                }
            }
        }
    }
}
