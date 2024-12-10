package searchsort;

/**
 * Main class for manually testing your code.
 */
public class Main {
    public static void main(String[] args) {
        // // Test Util.exch
        // int[] arr1 = { 1, 2, 3, 4, 5 };
        // Util.exch(arr1, 0, 1);
        // for (int i = 0; i < arr1.length; i++) {
        //     System.out.print(arr1[i] + " ");
        // }

        // // Test Util.shuffle
        // int[] arr = { 1, 2, 3, 4, 5 };
        // Util.shuffle(arr, 12345L); // 12345L converts the number to a long
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i] + " ");
        // }

        // Test LinearSearch.find
        int[] arr2 = { 1, 2, 3, 4, 5 };
        System.out.println(LinearSearch.find(arr2, 3));

        // Test BinarySearch.find
        int[] arr3 = { 1, 2, 3, 4, 5 };
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.find(arr3, 3));

        // Test BinarySearch.recursiveFind
        int[] arr4 = { 1, 2, 3, 4, 5 };
        System.out.println(bs.recursiveFind(arr4, 3));

        // Test InsertionSort.sort
        int[] arr5 = { 2, 1, 5, 4, 3 };
        InsertionSort.sort(arr5);
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }

    }
}
