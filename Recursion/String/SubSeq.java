package Recursion.String;

import java.util.ArrayList;
// import java.util.Arrays;

public class SubSeq {
    public static void main(String[] args) {
        // subSeq("", "abc");
        System.out.println(subSeqRet("", "abc"));
    }

    static void subSeq(String p , String s){
        if (s.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = s.charAt(0);
        subSeq(p+ch, s.substring(1));
        subSeq(p, s.substring(1));
    }
    
    static ArrayList<String> subSeqRet(String p , String s){
        if (s.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = s.charAt(0);
        ArrayList<String> left = subSeqRet(p+ch, s.substring(1));
        ArrayList<String> right = subSeqRet(p, s.substring(1));
        left.addAll(right);
        return left;

    }
}
