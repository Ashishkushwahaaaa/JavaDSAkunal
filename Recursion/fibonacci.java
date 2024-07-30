package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    static int fibo(int n){
        if (n<2) {
            return n;
        }

        // this is not the tail recursion as in this statement not a function call is the last statement but the addition and returning is the additional step in this statement;
        // Here, firstly the fibo(n-1) is called and it will further call its derivative before the fibo(n-2) of this statement is called.It will be only called after fibo(n-1) has finished its execution.
        return fibo(n-1)+fibo(n-2);
    }
}
