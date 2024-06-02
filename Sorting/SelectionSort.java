

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // int[] arr = { 2, 4, 1, 6, 3, 7, 5 };
        int[] arr = { 2, 4};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = findMaxIndex(arr, 0, last);
            swap(arr,max,last);
        }
    }
    static int findMaxIndex(int[] arr, int start, int end){
        int max =start;
        for (int i = start; i <=end; i++) {
            if (arr[max]<arr[i]) {
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
