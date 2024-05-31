package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 6, 2, 4 };
        Cycle(arr);
        System.out.println(Arrays.toString(arr));

    }
    // This sorting is used when it's given that the array contains all the element
    // 1 to n;
    // Putting the element at it's correct index value; 1 at index 0, 2 at index 1,
    // ...

    static void Cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            // The above is showing the correct index of an element which is currently at i.
            if (arr[i] != arr[correct]) {
                // Here, we have converted index into value(element) to compare.
                swap(arr, i, correct);
            }
            // Here, we have converted value(element) into index to compare.
            // if (i! = correct){
            // swap(arr, i, correct);}
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
