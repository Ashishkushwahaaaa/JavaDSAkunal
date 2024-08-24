package Backtracking_Maze.Backtracking;

public class K_Knight {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        kKnight(board, 0, 0, n);
        // System.out.println(count);
    }
    static int count = 0;
    static void kKnight(boolean[][] board, int r, int c, int knights){
        if (knights == 0) {
            display(board);
            count+=1;
            System.out.println(count);
            System.out.println();
            return;
        }
        if ((r==board.length-1 && c==board.length)) {
            return;
        }
        if (c==board.length) {
            kKnight(board, r+1, 0, knights);
            return;
        }
         if(isSafe(board,r,c)){
            board[r][c] = true;
            kKnight(board, r, c+1, knights-1);
            board[r][c] = false;
        }
        kKnight(board, r, c+1, knights);
    }

    private static boolean isSafe(boolean[][] board, int r, int col) {
        // We have a row and column where we have to put a knight then we need to consider those cell from where that knight may be in danger. The cell(which may cause danger) will be firstly checked wheter it is in bound of the board or not through isValid function). It those cell/s are present(in bound of the board) then check whether it has already a knight or not. If there is already a knight(value is true) then it will be danger for the current knight that's why it is not the safe cell for the current knight and hence we return false;

        if (isValid(board,r-2,col-1)) {
            if (board[r-2][col-1]) {
                return false;
            }
        }
        if (isValid(board,r-1,col-2)) {
            if (board[r-1][col-2]) {
                return false;
            }
        }
        if (isValid(board,r-2,col+1)) {
            if (board[r-2][col+1]) {
                return false;
            }
        }
        if (isValid(board,r-1,col+2)) {
            if (board[r-1][col+2]) {
                return false;
            }
        }
        return true;
    }

   private static boolean isValid(boolean[][] board, int r, int col) {
        if (r>=0 && r<board.length && col>=0 && col<board.length) {
            return true;
        }
        return false;
    }
 private static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean position : arr) {
                if (position) {
                    System.out.print("K ");
                }
                else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
