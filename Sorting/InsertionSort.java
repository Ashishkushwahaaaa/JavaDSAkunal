package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5, 7, 6, -4, -7, 0 };
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    // In insertion sort we sort from starting. for i=0, we sort till index 1; for
    // i=1, we sort till index 2; and continue;
    // In the inner loop, j is decremented to insert the 'i'th element to it's
    // correct position in the already sorted array(already sorted meand if any,if
    // some steps are done and if not then the position means the first position)
    // j will continue checking till it is larger than its left element, and breaks
    // if left element is found to be smaller than the jth element because no need
    // to check as the left is already sorted with each pass;

    static void Insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
