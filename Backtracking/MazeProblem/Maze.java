package Backtracking.MazeProblem;


import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        // System.out.println(countRet(3, 3));
        // count(3, 3);
        // System.out.println(ct);
        // path("", 3, 3);
        // pathRet("", 3, 3);
        // System.out.println(pathRet("", 3, 3));
        // pathDiagonal("", 3, 3);
        // System.out.println();
        // System.out.println(pathDiagonalcount("", 3, 3));
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        // pathRestriction("", board, 0, 0);
        // pathBacktracking("", board, 0, 0);
        int[][] path = new int[board.length][board[0].length];
        pathBacktrackingPrint("", board, 0, 0,path,1);
    }



    
    static int countRet(int r, int c){
        if (r==1 || c==1) {
            return 1;
        }
        int left = countRet(r-1, c);
        int right = countRet(r, c-1);
        return left + right;
    }
    static int ct = 0 ;
    static void count(int r, int c){
        if (r==1 || c==1) {
            ct +=1;
            return ;
        }
        count(r-1, c);
        count(r, c-1);
    }
    static void path(String p, int r, int c){
        if (r==1 && c==1) {
            System.out.print(p + " ");
            return;
        }
        if (r>1) {
            path(p+'D', r-1, c);
        }
        if (c>1) {
            path(p+'R', r, c-1);
        }
    }
    static ArrayList<String> pathRet(String p, int r, int c){
        if (r==1 && c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1) {
            list.addAll(pathRet(p+'D', r-1, c));
        }
        if (c>1) {
            list.addAll(pathRet(p+'R', r, c-1));
        }
        return list;

    }
    static void pathDiagonal(String p, int r, int c){
        if (r==1 && c==1) {
            System.out.print(p + " ");
            return;
        }
        if (r>1) {
            pathDiagonal(p+'D', r-1, c);
        }
        if (r>1 && c>1) {
            pathDiagonal(p+'A', r-1, c-1); //'A' meaning Angle for the diagonal path;
        }
        if (c>1) {
            pathDiagonal(p+'R', r, c-1);
        }
    }
    static int pathDiagonalcount(String p, int r, int c){
        if (r==1 || c==1) {
            return 1;
        }
            int down = pathDiagonalcount(p+'D', r-1, c);
            int diagonal = pathDiagonalcount(p+'A', r-1, c-1);
            int right = pathDiagonalcount(p+'R', r, c-1);
            return down + diagonal + right;
    }

    static void pathRestriction(String p,boolean[][] board, int r, int c){
        if (r==board.length-1 && c==board[0].length-1) {
            System.out.print(p + " ");
            return;
        }
        if (!board[r][c]) {
            return;
        }
        if (r<board.length-1) {
            pathRestriction(p+'D',board, r+1, c);
        }
        if (c<board[0].length-1) {
            pathRestriction(p+'R',board, r, c+1);
        }
    }

    static void pathBacktracking(String p,boolean[][] board, int r, int c){
        if (r==board.length-1 && c==board[0].length-1) {
            System.out.print(p + " ");
            return;
        }
        if (!board[r][c]) {
            return;
        }
        board[r][c]=false;
        if (c>0) {
            pathBacktracking(p+'L',board, r, c-1);
        }
        if (c<board[0].length-1) {
            pathBacktracking(p+'R',board, r, c+1);
        }
        if (r>0) {
            pathBacktracking(p+'U',board, r-1,c);
        }
        if (r<board.length-1) {
            pathBacktracking(p+'D',board, r+1, c);
        }
        board[r][c]=true;
    }


    static void pathBacktrackingPrint(String p,boolean[][] board, int r, int c, int[][] path,int step){
        if (r==board.length-1 && c==board[0].length-1) {
            path[r][c]=step;
            for (int[] row : path) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!board[r][c]) {
            return;
        }
        board[r][c]=false;
        path[r][c]=step;
        if (r<board.length-1) {
            pathBacktrackingPrint(p+'D',board, r+1, c, path, step+1);
        }
        if (c<board[0].length-1) {
            pathBacktrackingPrint(p+'R',board, r, c+1, path, step+1);
        }
        if (r>0) {
            pathBacktrackingPrint(p+'U',board, r-1,c, path, step+1);
        }
        if (c>0) {
            pathBacktrackingPrint(p+'L',board, r, c-1, path, step+1);
        }
        board[r][c]=true;
        path[r][c]=0;
    }
}
