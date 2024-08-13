package Recursion.RecursionPattern;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,6,2,6,8,0,3,7,10};
        selectionSort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int r, int c, int max){
        if (r==0) {
            return;
        }
        if (c<=r) {
            if (arr[c]>arr[max]) {
                selectionSort(arr, r, c+1, c);
            }else{
                selectionSort(arr, r, c+1, max);
            }
        }
        else {
            int temp = arr[r];
            arr[r] = arr[max];
            arr[max] = temp;
            selectionSort(arr, r-1, 0, 0);
        }        
    }
}
