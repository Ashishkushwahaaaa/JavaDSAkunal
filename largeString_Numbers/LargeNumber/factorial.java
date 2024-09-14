package largeString_Numbers.LargeNumber;

import java.math.BigInteger;

public class factorial {
    static BigInteger fact(int nums){
        BigInteger ans = new BigInteger("1");
        for (int i = 2; i <= nums; i++) {
         ans = ans.multiply(BigInteger.valueOf(i));   
        }
        return ans;
    }
}
