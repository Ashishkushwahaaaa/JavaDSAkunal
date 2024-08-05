package BitwiseOperator;

public class MagicNO {
    public static void main(String[] args) {
        // Here n means the nth magic no
        // What is magic no: nth magic no is the n in binary and then the sum of the product of all ith bit with 5^i
        // ex: First magic no:  1 in binary==001=>(0*5^3+0*5^2+1*5^1)=5
        // ex: Second magic no: 2 in binary==010=>(0*5^3+1*5^2+0*5^1)=25
        // ex: Third magic no:  3 in binary==011=>(0*5^3+1*5^2+1*5^1)=30
        // ex: Fourth magic no: 4 in binary==001=>(1*5^3+0*5^2+0*5^1)=125
        // ex: Fiveth magic no: 5 in binary==001=>(1*5^3+0*5^2+1*5^1)=130

        int n = 6; // In simple, Nth magic no +=(ith bit of n * 5^i);
        int base = 5;
        int ans = 0;
        // This loop will run logn times i.e. the no. of bits in n--How??
        /*
          since, log n base b = x
               => n = b^x; i.e. x times b gives n;
               => here, int(x)+1 gives the no of digit(bits for base 2) if written in base b form
          you think how this loop works then the answer is this that left shift and right shift operator works on binary number.
          when ever there will be these operation(binary) then it is shifted as the binary no means 6 does not have one digit but works as it has 3 bits.
         */
        
        while (n>0) {
            int last = (n&1);
            n=(n>>1);
            ans +=(last*base);
            base = base*5;
        }
        System.out.println(ans);
        // Hence, the complexity of this program is log n; 
    }
}
