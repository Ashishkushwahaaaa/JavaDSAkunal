package BitwiseOperator;

public class EvenOdd_bitwise {
    public static void main(String[] args) {
        int n = 54;
        System.out.println(IsOdd(n));
    }

    static boolean IsOdd(int n) {
        return (n & 1) == 1;
    }
}
