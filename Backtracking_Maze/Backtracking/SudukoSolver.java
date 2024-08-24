package Backtracking_Maze.Backtracking;

public class SudukoSolver {
    public static void main(String[] args) {
        // int n = 9;
        char[][] sudoku = {
            {'5','3','-','-','7','-','-','-','-'},
            {'6','-','-','1','9','5','-','-','-'},
            {'-','9','8','-','-','-','-','6','-'},
            {'8','-','-','-','6','-','-','-','3'},
            {'4','-','-','8','-','3','-','-','1'},
            {'7','-','-','-','2','-','-','-','6'},
            {'-','6','-','-','-','-','2','8','-'},
            {'-','-','-','4','1','9','-','-','5'},
            {'-','-','-','-','8','-','-','7','9'}
        };

        //This method to solve the sudoku by passing row and column in the argument;
        System.out.println("Row and Column in argument: ");
        // sudokuSolver(sudoku, 0, 0);

        //This is to solve the sudoku without passing row and column in the argument;
        System.out.println("Without Row and Column in argument: ");
        // if (sudokuSolver(sudoku)) {
        //     display(sudoku);
        // }else{
        //     System.out.println("Cannot solve the sudoku");
        // }

        System.out.println("Without returning the value and Without Row and Column in argument: ");
        sudokuSolver2(sudoku);
    }

    // SOLVING WHILE PASSING ROW AND COLUMN IN THE ARGUMENT:
    static void sudokuSolver(char[][] sudoku, int r, int c){
        if (r==sudoku.length-1 && c==sudoku.length) {
            display(sudoku);
            return;
        }
        if (c==sudoku.length) {
            sudokuSolver(sudoku, r+1, 0);
            return;
        }
        if (sudoku[r][c]!='-') {
            sudokuSolver(sudoku, r, c+1);
            return ;
        }
        for (char i = '1'; i <= '9'; i++) {
            if (isSafe(sudoku, r, c,i)) {
                sudoku[r][c] = i;
                sudokuSolver(sudoku, r, c+1);
                sudoku[r][c] = '-';
            }
        }
    }

    // SOLVING WITHOUT ROW AND COLUMN IN THE ARGUMENT:
    static boolean sudokuSolver(char[][] sudoku){
        int n = sudoku.length;
        int r = -1;
        int c = -1;

        boolean EmptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (sudoku[i][j]=='-') {
                    r = i;
                    c = j; 
                    EmptyLeft = false;
                    break;
                }
            }
            if (EmptyLeft==false) {
                //As we now found the empty cell so break the loop here saving the row and column of this cell and go to put correct number at that cell;
                break;
            }
        }
        if (EmptyLeft==true) {
            //Sudoku is solved as we didn't hit any cell which is empty which leads to EmptyLeft remains true;
            return true;
        }
        
        for (char i = '1'; i <= '9'; i++) {
            if (isSafe(sudoku, r, c,i)) {
                sudoku[r][c] = i;
                if (sudokuSolver(sudoku)) {
                    return true;
                }else{
                    //Backtrack
                    sudoku[r][c] = '-';
                }
                
            }
        }
        return false;
    }

    // WITHOUT RETURNING AND WITHOUT PASSING ROW AND COLUMN IN THE ARGUMENT:
    static void sudokuSolver2(char[][] sudoku){
        int n = sudoku.length;
        int r = -1;
        int c = -1;

        boolean EmptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (sudoku[i][j]=='-') {
                    r = i;
                    c = j; 
                    EmptyLeft = false;
                    break;
                }
            }
            if (EmptyLeft==false) {
                //As we now found the empty cell so break the loop here saving the row and column of this cell and go to put correct number at that cell;
                break;
            }
        }
        if (EmptyLeft==true) {
            //Sudoku is solved as we didn't hit any cell which is empty which leads to EmptyLeft remains true;
            display(sudoku);
            return;
        }
        //Backtrack
        for (char i = '1'; i <= '9'; i++) {
            if (isSafe(sudoku, r, c,i)) {
                sudoku[r][c] = i;
                sudokuSolver2(sudoku);
                //Backtrack
                sudoku[r][c] = '-';
            }
        }
        return;
    }

    // ISSAFE METHOD:
    private static boolean isSafe(char[][] sudoku, int r, int c, char i) {
        // Checking rth row for the char i;
        for (int j = 0; j < sudoku.length; j++) {
            if (sudoku[r][j]==i) {
                return false;
            }
        }
        // Checking cth column for the char i;
        for (int j = 0; j < sudoku.length; j++) {
            if (sudoku[j][c]==i) {
                return false;
            }
        }
        for (int j = r-(r%3); j <= r-(r%3)+2; j++) {
            for (int k = c-(c%3); k <= c-(c%3)+2; k++) {
                if (j!=r || k!=c) {
                    if (sudoku[j][k]==i) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // DISPLAY METHOD:
    private static void display(char[][] sudoku) {
        for (char[] arr : sudoku) {
            for (char element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
