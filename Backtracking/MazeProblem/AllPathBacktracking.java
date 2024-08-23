package Backtracking.MazeProblem;

import java.util.Arrays;

public class AllPathBacktracking {
    public static void main(String[] args) {
         boolean[][] board = {
                                {true, true, true},
                                {true, true, true},
                                {true, true, true}
         };
         
         int[][] path = new int[board.length][board[0].length];
         pathBacktracking("", board, 0, 0, path, 1);
         System.out.println("Total possible ways : "+ count);
    }
    static int count = 0;
    static void pathBacktracking(String p, boolean[][] board, int r, int c, int[][] path, int step){
        if (r==board.length-1 && c==board[0].length-1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            count+=1;
            System.out.println();
            return;
        }
        if (!board[r][c]) {
            return;
        }
        // This is the initial step where we make the changes and the last step is to revert this changes while coming out of the recursion call: THIS IS CALLED BACKTRACKING;

        // Marking the visited cell as false to avoid visiting that again for this recursion call to avoid stack overflow due to never ending path;
        board[r][c]=false;
        path[r][c]=step;

        if (r<board.length-1) {
            pathBacktracking(p+'D', board, r+1, c, path, step + 1);
        }
        if (c<board[0].length-1) {
            pathBacktracking(p+'R', board, r, c+1, path, step + 1);
        }
        if (r>0) {
            pathBacktracking(p+'U', board, r-1, c, path, step + 1);
        }
        if (c>0) {
            pathBacktracking(p+'L', board, r, c-1, path, step + 1);
        }
        // BACKTRACKING?? : change the changes for other recursion call that were made for the current recursion call;
        //Reverting all the changes that were made for this recursion call so that it will get original state for the next recursion call.
        board[r][c] = true; 
        path[r][c]=0;
    }
}
