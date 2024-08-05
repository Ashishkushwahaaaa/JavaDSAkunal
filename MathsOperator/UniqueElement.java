package MathsOperator;

public class UniqueElement {
    public static void main(String[] args) {
        int arr[] = {2,4,1,2,3,6,4,1,3};
        System.out.println(ans(arr));
        // System.out.println(oddans(arr));
    }
    //This method works when repetition other elements is 2 times;
    private static int ans(int arr[]){
        int Unique =0;
        // The concept is this XOR of a number by itself is zero. and hence all the repeated(even times, here twice) no. will become zero and hence single element will be returned.
        // Also it will work even the array is not sorted as bit operator are associative and hence does not matter.(2^4^1^2^3^6^4^1^3)
        for (int n : arr) {
            Unique ^=n;
        }
        return Unique;
    }
}
