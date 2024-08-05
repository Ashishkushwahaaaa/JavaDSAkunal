package BitwiseOperator;

public class ith_bit {
    public static void main(String[] args) {
        int n = 64, findI=2, setI=4,ResetI=7;
        System.out.println(findI + "th bit of "+ n + FindIbit(n,findI));
        System.out.println("After Set:" + SetIbit(n,setI) );
        System.out.println("After Reset:" + ResetIbit(n,ResetI) );
        System.out.println("Right most set bit of "+ n +": "+ RightMost(n));
    }

    private static int FindIbit(int n,int bit){
        // In this we are supposed to find the ith bit of the binary no of given decimal number;
        // (1<<(bit-1)) is to create mask using left shift operator which will them be & by the number to get the required bit(&with 1 gives the same number)
        // int value= (n&(1<<(bit-1)));

        
        // int i = (int)(Math.log(n)/Math.log(2))+1;
        // while (i>0) {
        //     System.out.print((n&(1<<(bit-i))));   
        //     i--;         
        // }
        System.out.println();
        return (n&(1<<(bit-1)));

    }
    private static int SetIbit(int n,int setI){
        System.out.println("before set of "+setI+"th bit: " + n);
        return n|(1<<(setI-1));
    }   
    private static int ResetIbit(int n,int ResetI){
        System.out.println("Before reset of "+ResetI+"th bit: "+n);
        return (n&(~(1<<(ResetI-1)))); //Here we generally need to do is & n with 0 at required bit to reset that bit, but we can get the ith bits as 1 by masking so when we complement the masked number we get the 0 at the required bit, now we can and the new masked with the given no.
    }
    private static int RightMost(int n) {
        return n&(-n);
    }
    
}
