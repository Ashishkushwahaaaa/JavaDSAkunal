package BitwiseOperator;

public class TotalBits {
    public static void main(String[] args) {
        int n = 6; //This is the no in decimal representation
        int b = 2; //The base in which we have to find the no. of digits(bits for binary) for the given decimal number.
        // ex : if n = 16 and b = 10(base 10) then simply there will be 2 digits(first is 1 and second is 6 of 16).

        int ans = (int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
        // The above gives the answer of 6 in decimal does have total no of bits in binary system representation.
        // This gives the answer of the program MagicNo.java that how many times the loop will run(how to find the no of digits).
    }
}
