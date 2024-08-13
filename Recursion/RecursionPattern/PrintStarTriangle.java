package Recursion.RecursionPattern;

public class PrintStarTriangle {
    public static void main(String[] args) {
        // Pattern1(4, 0);
        Pattern2(4, 0);
    }
    //This is the same concept used for bubble sort as here at each pass one star is decreased and in bubble sort the largest element is sorted and we don't consider it in next step. Row is considered as the last index and column is considered as the first element to be compared by its next element to check whether it is larger or smaller than its next if larger than swap. This is shown in the bubblesort.java
    static void Pattern1(int r,int c){
        if (r==0) {
            return;
        }
        if (c<r) {
         System.out.print("* ");
         Pattern1(r, c+1);
        }
        else {
            System.out.println();
            Pattern1(r-1, 0);
        }
    }
    // static void Pattern1(int r,int c){
    //     if (r==0) {
    //         return;
    //     }
    //     if (c>0) {
    //      System.out.print("* ");
    //      Pattern1(r, c-1);
    //     }
    //     if (c==0) {
    //         System.out.println();
    //         Pattern1(r-1, r-1);
    //     }
    // }

    static void Pattern2(int r,int c){
        if (r==0) {
            return;
        }
        if (c<r) {
            Pattern2(r, c+1);
            System.out.print("* ");
        }
        else {
            Pattern2(r-1, 0);
            System.out.println();
        }
    }

    //This is to print normal triangle but this is not required as just in above code of pattern1 just print the stars at the time of removal from the stack and that is shown in above code.

    // static void Pattern2(int r,int c){
    //     if (c==0) {
    //         return;
    //     }
    //     if (c>=r) {
    //      System.out.print("* ");
    //      Pattern2(r, c-1);
    //     }
    //     else {
    //         System.out.println();
    //         Pattern2(r-1, 4);
    //     }
    // }

}
