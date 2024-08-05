package MathsOperator;

public class NewtonSQRT {
    public static void main(String[] args) {
        // double n = 40;
        System.out.println(sqrt(40));
    }
    static double sqrt(double n){
       double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n/x));
            if (Math.abs(root-x)<0.5) { //Here <0.5 is a precision and can be taken accordingly to reduce the error, as much the precision is small the steps to calculate increase but the ans will be closer to the actual value
                break;
            }
            x = root;
        }
        return root;
    }
}
