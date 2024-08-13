package Recursion.RecursionBasic;

public class DigitProduct {
    public static void main(String[] args) {
        int n = 3043; //If contains zero then the answer will be zero.
        System.out.println(product(n));
    }
    static int product(int n){
        if (n%10 == n) { // This to get the last digit and then return the last value rather than to wait n to be zero and then return likewise in digitSum which will lead to result = 0 always
            return n;
        }
        return n%10 * product(n/10);
    }
}
