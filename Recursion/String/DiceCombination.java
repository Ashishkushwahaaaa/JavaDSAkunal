package Recursion.String;

import java.util.ArrayList;

public class DiceCombination {
    public static void main(String[] args) {
        // diceCombination("", 4);
        
        System.out.println(diceCombinationRet("", 4));
    }
    static void diceCombination(String combination, int target){
        if (target == 0) {
            System.out.print(combination+" ");
            return;
        }
        for (int i = 1; i <=6 && i <= target; i++) {
            diceCombination(combination+i, target-i);
        }
    }
    static ArrayList<String> diceCombinationRet(String combination, int target){
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(combination);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=6 && i <= target; i++) {
            ans.addAll(diceCombinationRet(combination+i, target-i));
        }
        return ans;
    }
}
