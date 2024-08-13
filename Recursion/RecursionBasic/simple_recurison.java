package Recursion.RecursionBasic;

public class simple_recurison {
    public static void main(String[] args) {
        Print(1);
    }

    static void Print(int n) {
        // This is known as the base condition
        if (n == 5) {
            System.out.println(5);
            return;
        }

        System.out.println(n);

        // this is the tail recursion
        // This is the last function that is called;
        Print(n + 1); //Here, the function is calling itself,this is called recursion;
    }
}
