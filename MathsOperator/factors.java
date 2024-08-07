package MathsOperator;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        int n = 36;
        factor1(n);
        System.out.println();
        factor2(n);
        System.out.println();
        factor3(n);
        
    }
    //O(n)
    private static void factor1(int n){
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                System.out.print(i + " ");
            }
        }
    }
    //O(sqrt(n))
    //Not in order;
    private static void factor2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (i==n/i) {  // To be safe from the repetetive factor we print one time and skip to save in the list.(eg: 36 has 6*6)
                System.out.print(i+" ");
            }
            else if(n%i==0) {
                System.out.print(i + " " + n/i + " ");
            }
        }   
    }
    // To make it in order
    //Both time and space complexity will be O(sqrt(n))
    private static void factor3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (i==n/i) {  // To be safe from the repetetive factor we print one time and skip to save in the list.(eg: 36 has 6*6)
                System.out.print(i+" ");
            }
            else if (n%i==0) {
                System.out.print(i + " ");
                list.add(n/i);
            }
        }
        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}