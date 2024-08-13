package Recursion.MergeAndQuick_sort;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {5,3,6,3,7,9,1,2,4};
        arr = mergeSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSorting(int[] arr){
        if (arr.length==1) {
            return arr;
        }
        
        int m = arr.length/2;

        int[] left = mergeSorting(Arrays.copyOfRange(arr, 0, m));
        int[] right = mergeSorting(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] first, int[] second){
        int i=0;
        int j=0;
        int k=0;
        int[] mix = new int[first.length + second.length];
        while (i<first.length && j<second.length) {
            if (first[i]<second[j]) {
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i<first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j<second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
