package largeString_Numbers.LargeNumber;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BD();
    }

    // EXPLORE DOCUMENTATION FOR DIFFERENT METHODS: 
    static void BD(){
        // double x = 0.04;
        // double y = 0.03;
        // double res = x-y;
        // System.out.println(res); //The answer should be 0.01 but giving 0.010000000000000002 because float and double are floating no. i.e. they are the binary representation of fraction and decimal hence give some error(about 10^-19); but BigDecimal gives exact answer;

        // BigDecimal X = new BigDecimal("0.04");
        // BigDecimal Y = new BigDecimal("0.03");
        // BigDecimal ans = X.subtract(Y);
        // System.out.println(ans);

        BigDecimal a = new BigDecimal("456576345675.4546376");
        BigDecimal b = new BigDecimal("547634565.986785764");

        //Operations
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(b.pow(2));
        System.out.println(b.negate());
        System.out.println(a.divideToIntegralValue(b));
        System.out.println();

        // constant
        BigDecimal constant = BigDecimal.ONE;
        System.out.println(constant);
    }

    static void BI(){
        BigInteger A = BigInteger.valueOf(24232); // converts int/long to bigInteger
        BigInteger B = BigInteger.valueOf(3748383);
        int c = B.intValue(); //Converts BI to int;

        // Constants
        BigInteger C = BigInteger.TEN;
        System.out.println(C);
        BigInteger D = new BigInteger("12345678654313454652435465"); //here we need to pass the string value as this big number can't be represented by int or long;
        BigInteger X = new BigInteger("32928328338476732494");

        // addition
        BigInteger s = D.add(X);
        // System.out.println(s);

        // multiply
        BigInteger m = D.multiply(X);
        // System.out.println(m);

        // subtract
        BigInteger sub = D.subtract(X);
        // System.out.println(sub);

        // divide
        BigInteger d = D.divide(X);
        // System.out.println(d);

        // remainder
        BigInteger r = D.remainder(X);
        // System.out.println(r);

        // Comparing BigInteger
        // if (D.compareTo(X)>0) {
        //     System.out.println("True");
        // }

        System.out.println(factorial.fact(234)); // Storing such a large no was not possible for the int/long

    }
}
