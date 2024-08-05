package BitwiseOperator;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5; // The row of which,sum is to be find.
        System.out.println(1<<(n-1)); // sum of each row of a pascals triangle is 2^n if the row is counted from as 0(else the sum of nth row ==2^(n-1) and the values in each row are (nC0+nC1+nC2+...+nCn==2^n)

        //THE PASCAL'S TRIANGLE LOOKS LIKE: AND THE SUM OF EACH ROW == 2^N
            //      1         -->   0C0                   ==  2^0   =1
            //     1 1        -->   1C0+1C1               ==  2^1   =2
            //    1 2 1       -->   2C0+2C1+2C2           ==  2^2   =4
            //   1 3 3 1      -->   3C0+3C1+3C2+3C3       ==  2^3   =8
            //  1 4 6 4 1     -->   4C0+4C1+4C2+4C3+4C4   ==  2^4   =16

    }
}
