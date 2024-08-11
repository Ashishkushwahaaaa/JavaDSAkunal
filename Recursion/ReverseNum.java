package Recursion;

public class ReverseNum {

    static int sum = 0;
    public static void main(String[] args) {
        Rev1(12345);        
        System.out.println(sum);
        System.out.println(Rev2(12345));
    }
    private static void Rev1(int num){
        if (num==0) {
            return;
        }
        int rem = num%10;
        sum=sum*10+rem;
        Rev1(num/10);
    }
    private static int Rev2(int n){
        // When we don't want to use an extra variable(like above we made static variable sum), then we can create an helper function 
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }
    private static int helper(int n, int digits) {
        if (n%10==n) {
            return n;
        }
        return n%10*(int)Math.pow(10,digits-1)+helper(n/10, digits-1);
    }
}
