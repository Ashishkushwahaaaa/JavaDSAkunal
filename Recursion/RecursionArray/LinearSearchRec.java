package Recursion.RecursionArray;

import java.util.ArrayList;

public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr = {1,5,4,7,2,8,4,3,9};
        int target = 4;
        // System.out.println(Search(arr, 0,target));
        // System.out.println(SearchIndex(arr, 0,target));
        // System.out.println(SearchFromLastInd(arr, arr.length-1,target));
        // System.out.println(SearchAllIndex(arr, 0,target));
        // ArrayList<Integer> ans = SearchAllIndex2(arr, 0, target, new ArrayList<>());
        // System.out.println(ans);
        System.out.println(SearchAllIndex3(arr, 0, target));
    }

    static boolean Search(int[] arr, int index,int target){
        if (index == arr.length) {
            return false;
        }
        return arr[index]==target||Search(arr, index+1, target);
    }

    static int SearchIndex(int[] arr, int index,int target){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index]==target) {
            return index;
        }
        return SearchIndex(arr, index+1, target);
    }
    static int SearchFromLastInd(int[] arr, int index,int target){
        if (index == -1) {
            return -1;
        }
        if (arr[index]==target) {
            return index;
        }
        return SearchFromLastInd(arr, index-1, target);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> SearchAllIndex(int[] arr, int index,int target){
        if (index == arr.length) {
            return list;
        }
        if (arr[index]==target) {
            list.add(index);
        }
        return SearchAllIndex(arr, index+1, target);
    }

    static ArrayList<Integer> SearchAllIndex2(int[] arr, int index,int target, ArrayList<Integer> list){
        if (index == arr.length) {
            return list;
        }
        if (arr[index]==target) {
            list.add(index);
        }
        return SearchAllIndex2(arr, index+1, target,list);
    }

    //What if we don't have to pass the list in the argument, therfore we need to create list in the body and hence in each call the new list object will be created and hence each list will have only index value if item found of that function call only. Therefore we will further create a new list and add all the item of the above function calls while returning the value.

    static ArrayList<Integer> SearchAllIndex3(int[] arr, int index,int target){
        ArrayList<Integer> list = new ArrayList<>(); 
        if (index == arr.length) {
            return list;
        }
        if (arr[index]==target) {
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls =  SearchAllIndex3(arr, index+1, target);
        list.addAll(ansfromBelowCalls);
        return list;
    }

}
