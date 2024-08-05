package BitwiseOperator;

public class RangeXOR {
    public static void main(String[] args) {
        
        int a = 3;
        int b = 9;
        //This gives the xor in range of a to b;
        int ans = xor(b) ^ xor(a-1); //The concept is we can find the xor till b which will contains the extra xor of till (a-1) and can be removed by again xor with those extra no.
        System.out.println("Method1 : "+ans);

        // Can also be find as follows but its time complexity will be larger and give Time Limit Exceed for larger numbers:
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^=i;
        }
        System.out.println("Method2 : " + ans2);
    }

    //This will give the XOR from 0 to a;
    private static int xor(int a){
        if (a%4==0) {
            return a;
        }
        if (a%4==1) {
            return 1;
        }
        if (a%4==2) {
            return a+1;
        }
        return 0;
    }
}
