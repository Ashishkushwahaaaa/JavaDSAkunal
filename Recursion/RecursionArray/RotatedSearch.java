package Recursion.RecursionArray;

public class RotatedSearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(Search(arr, 1, 0, arr.length-1));
    }
    static int Search(int[] arr, int target, int s, int e){
        //BASE CONDITION: If not found
        if (s>e) {
            return -1;
        }
        // If found
        int m = s + (e-s)/2;
        if (arr[m]==target) {
            return m;
        }
        // CASE 1: If the s<m then starting till mid is sorted and also if target is in b/w search in that space else search in rest
        if (arr[s]<=arr[m]) {
            if (target>= arr[s] && target<= arr[m]) {
                return Search(arr, target, s, m-1);
            }else{
                return Search(arr, target, m+1, e);
            }
        }
        //CASE 2: If above is false then mid till end will be sorted and if target lies in that space search in it else search in rest
        if (target>=arr[m] && target<=arr[e]) {
            return Search(arr, target, m+1, e);
        }else{
            return Search(arr, target, s, m-1);
        }
        
    }
}
