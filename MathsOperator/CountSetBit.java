package MathsOperator;

public class CountSetBit {

    public static void main(String[] args) {
        int n = 54;
        System.out.println(Integer.toBinaryString(n));
        System.out.println("Total number of set bit is: " + Setbit(n));
    }

    private static int Setbit(int n){
        int count = 0;

        //Time Complexity: O(logn)
        // The max no. of times the loop may runs (equals to total no of digits in binary representation) and it is log(n) if all the bits are set, the loop will run the number of set bits are there;

        // while (n>0) {
        //     count++;
        //     n-=(n&(-n));
        // }

        while (n>0) {
            count++;
            n= n&(n-1);
        }
        return count;
    }
}
