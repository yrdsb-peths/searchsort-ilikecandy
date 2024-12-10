package searchsort;

/**
 * The median is the middle value in an ordered integer list.
 * If the size of thelist is even,the median is the mean of the two
 * middle values.
 */
public class Median {
    /**
     * Find the median of the array arr using QuickSort algorithm.
     */
    public double findQuick(int[] arr) {
        // check empty
        if (arr.length == 0) {
            return 0;
        }

        // sort
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);

        // find median
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        } else {
            return arr[arr.length / 2];
        }
    }

    /**
     * Find the median of the array arr using MergeSort algorithm.
     */
    public double findMerge(int[] arr) {
        // check empty
        if (arr.length == 0) {
            return 0;
        }

        // sort
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);

        // find median
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        } else {
            return arr[arr.length / 2];
        }
    }

    /**
     * Find the median of the array arr using InsertionSort algorithm.
     */
    public double findInsertion(int[] arr) {
        // check empty
        if (arr.length == 0) {
            return 0;
        }

        // sort
        InsertionSort.sort(arr);

        // find median
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        } else {
            return arr[arr.length / 2];
        }
    }

}
