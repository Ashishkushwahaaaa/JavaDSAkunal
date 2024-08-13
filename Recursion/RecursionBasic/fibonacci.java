package Recursion.RecursionBasic;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    static int fibo(int n){
        // The condition required to terminate the recursion is known as base condition
        if (n<2) {
            return n;
        }

        // this is not the tail recursion as in this statement not a function call is the last statement but the addition and returning is the additional step in this statement;
        // Here, firstly the fibo(n-1) is called and it will further call its derivative before the fibo(n-2) of this statement is called.It will be only called after fibo(n-1) has finished its execution.
        return fibo(n-1)+fibo(n-2); //This relation is known as the recurrence relation.(it's Linear recurrence relation)
        // Two types of recurrence relation: Linear Relation and conquer and divide 
    }
}
