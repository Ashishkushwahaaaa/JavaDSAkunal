package MathsOperator;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.printf("%.3f",sqrt(n,p));
    }
    private static double sqrt(int n, int p){
        int s = 0;
        int e = n;
        double root = 0.0;
        while (s<=e) {
            int mid = s + (e-s)/2;
            if (mid * mid == n) { //for perfect square root;
                return mid;
            }
            if (mid * mid > n) {
                e = mid-1;
            }else{
                s = mid + 1;
            }
            root = mid;
        }
        if (root*root>n) {
            root-=1;
        }
        
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root*root<n) {
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
