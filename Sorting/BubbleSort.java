
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,0,1,-3,4,6,3,1,7,5};
        // int[] arr = {1,2,3,4,5,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for(int i = 0; i < arr.length; i++){
            boolean swapped = false;
            for (int j = 1; j < arr.length-i; j++) { // arr.length-i because at each pass one element (largest) will be at it's right place;
                if(arr[j]<arr[j-1]){
                    //than swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }

            //if the array is already sorted than we need not to check for all the value of i
            //if for no one values of j during any pass, the swapping is not done that's mean now all the element are sorted i.e array is
            //sorted so need to check further for the other values of i. 
            if (!swapped) {
                break;
            }
        }
    }
}
