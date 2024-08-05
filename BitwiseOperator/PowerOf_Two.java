package BitwiseOperator;

public class PowerOf_Two {
    public static void main(String[] args) {
        int num = 256;
        System.out.println(ans(num));
    }
    private static boolean ans(int num){
        // Since 0 is not the power of 2 hence we need to fix it.
        if (num==0) {
            return false;
        }
        return (num&(num-1))==0; // This need to understand, I still couldn't get it;
    }
}
