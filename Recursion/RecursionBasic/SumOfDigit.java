package Recursion.RecursionBasic;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 324424;
        System.out.println(digitSum(n));
    }
    static int digitSum(int n){
        if (n==0) {
            return 0;
        }
        return n%10+digitSum(n/10);
    }
}
