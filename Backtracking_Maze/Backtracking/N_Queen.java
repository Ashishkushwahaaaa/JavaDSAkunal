package Backtracking_Maze.Backtracking;

public class N_Queen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueen(board, 0));
    }
    static int nQueen(boolean[][] board, int r){

        if (r==board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // placing the queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {
            // placing the queen if it is safe
            if(isSafe(board, r, col)){
                board[r][col]= true;
                count += nQueen(board, r+1);
                board[r][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int r, int col) {

        // Checking for the vertical column of that cell whether it contains Queen or not, if already contains then we can't keep another.
        for (int i = 0; i < r; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // Checking for the left diagonal of that cell
        int maxleft = Math.min(r,col);
        for (int i = 1; i <=maxleft; i++) {
            if (board[r-i][col-i]) {
                return false;
            }
        }
        // Checking for the right diagonal of that cell
        int maxRight = Math.min(r,board.length-col-1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[r-i][col+i]) {
                return false;
            }
        }
        return true;
    }
    private static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean element : arr) {
                if (element) {
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    
}
