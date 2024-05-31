package Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = {2,0,1,-3,4,6,3,1,7,5};
        int[] arr = {1,2,3,4,5,6};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for(int i = 0; i < arr.length; i++){
            boolean swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    //than swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
