package Recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(Countzero(10230));
    }
    static int Countzero(int n){
        return helper(n, 0);
    }

    static int helper(int n, int count) {
        if (n%10==n) { //OR if(n==0){return count;}
            return count;
        }
        if (n%10==0) {
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }
}
