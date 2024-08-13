package Recursion.RecursionBasic;

public class PalindromeReverse {
    public static void main(String[] args) {
        int n = 121;
        // System.out.println(Rev(n));
        System.out.println(Palindrome(n));
    }

    private static boolean Palindrome(int n){
        return (n==Rev(n));
    }

    private static int Rev(int n){
        int digit = (int)Math.log10(n)+1;
        return helper(n, digit);
    }
    private static int helper(int n, int digit){
        if (n%10==n) {
            return n;
        }
        return n%10*(int)Math.pow(10, digit-1)+helper(n/10, digit-1);
    }
}
