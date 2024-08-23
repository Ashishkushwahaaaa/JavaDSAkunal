package Recursion.String;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        // msg("", "12");
        System.out.print(msgRet("", "12"));
    }
    static void msg(String p,String up){
        if (up.isEmpty()) {
            // System.out.print(p+" ");
            return ;
        }
        int n = up.charAt(0)-'0'; //this will convert '2' into 2;
        for (int i = (n-1)*3; i < n*3; i++) {
            char ch = (char)('a'+i);
            msg(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> msgRet(String p,String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int n = up.charAt(0)-'0'; //this will convert '2' into 2;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (n-1)*3; i < n*3; i++) {
            char ch = (char)('a'+i);
            ans.addAll( msgRet(p+ch, up.substring(1)));
        }
        return ans;
    }
}
