package BitwiseOperator;

public class PowerOf_Two {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(ans(num));
    }
    private static boolean ans(int num){
        // Since 0 is not the power of 2 hence we need to fix it.
        if (num<=0) { //All the negative no. are also not the power of 2;
            return false;
        }
        return (num&(num-1))==0; // In binary if any number is power of two then only the last bit of that will be 1 and others are 0 and then n-1 will make all the 0s as 1s (for ex: 8 in binary == 1000 and (8-1) = 7 in binary == 0111). Now 1000 & 0111 == 0;
    }
}
