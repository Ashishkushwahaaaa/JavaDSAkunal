package MathsOperator;

public class Prime {
    public static void main(String[] args) {
        int n = 340;
        for (int i = 2; i < n; i++) {
            System.out.println(i +" "+ Isprime(i));
        }
        // But to check all the number for prime or not till n the above method has larger time complexity n(n^1/2) as the above loop runs n time and to check that no loop of method Isprime runs for root n times.
    }
    private static boolean Isprime(int n){
        if (n<=1) {
            return false;
        }

        int c =2;
        while (c*c<=n) {
            if (n%c==0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
