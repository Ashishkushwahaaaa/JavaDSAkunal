package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,5,66,74,87,88,90};
        int target = 4;
        System.out.println(BS(arr, target, 0,7));
    }
    static int BS(int arr[], int target, int s, int e){        
        if (s>=e) {
            return -1;
        }

        int m = s + (e-s)/2;
        if (target==arr[m]) {
            return m;
        }
        if (target<arr[m]) {
            return BS(arr, target, s, m-1);
        }
        return BS(arr, target, m+1, e);
    }
}
