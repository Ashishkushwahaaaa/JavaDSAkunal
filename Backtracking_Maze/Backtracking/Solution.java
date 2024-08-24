package Backtracking_Maze.Backtracking;

public class Solution {
    public static void main(String[] args) {
        char[][] sudoku = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        
        solveSudoku(sudoku);
    }
    public static void solveSudoku(char[][] board){

        int c = -1;
        int r = -1;
        boolean EmptyLeft = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]=='.') {
                    r=i;
                    c=j;
                    EmptyLeft = false;
                    break;
                }
            }
            if (EmptyLeft==false) {
                break;
            }   
        }
        if (EmptyLeft==true) {
            display(board);
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, r, c,(char)('0'+i))) {
                char ch = (char)('0'+i);
                board[r][c] = ch;
                solveSudoku(board);
                board[r][c] = '.';
            }
        }
    }
    public static boolean isSafe(char[][] board, int r, int c, char i) {
        // Checking rth row for the char i;
        for (int j = 0; j < board.length; j++) {
            if (board[r][j]==i) {
                return false;
            }
        }
        // Checking cth column for the char i;
        for (int j = 0; j < board.length; j++) {
            if (board[j][c]==i) {
                return false;
            }
        }
        for (int j = r-(r%3); j <= r-(r%3)+2; j++) {
            for (int k = c-(c%3); k <= c-(c%3)+2; k++) {
                if (j!=r || k!=c) {
                    if (board[j][k]==i) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void display(char[][] board) {
        for (char[] arr : board) {
            for (char element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
