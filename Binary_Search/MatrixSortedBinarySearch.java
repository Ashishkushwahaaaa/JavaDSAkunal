package Binary_Search;
import java.util.Arrays;
public class MatrixSortedBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}
        };

        System.out.println(Arrays.toString(Search(arr,9)));
    }

    static int[] binarySearch(int[][] Matrix , int rStart, int cStart, int cEnd, int target){
        while (cStart<=cEnd) {
            int mid = cStart+(cEnd-cStart)/2;
            if (target<Matrix[rStart][mid]) {
                cEnd=mid-1;
            }else if (target>Matrix[rStart][mid]) {
                cStart=mid+1;
            }else{
                return new int[] {rStart,mid};
            }
        }
       return new int[] {-1,-1};
    }

    static int[] Search(int[][] Matrix,int target){
        int rows=Matrix.length;
        int cols = Matrix[0].length;
        if (cols==0) {
            return new int[]{-1,-1};
        }
        if (rows==1) {
            return binarySearch(Matrix, 0, 0, cols-1, target);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid = cols/2;

        while (rStart<(rEnd-1)) {
            int mid=rStart+(rEnd-rStart)/2;
            if (Matrix[mid][cMid]==target) {
                return new int[] {mid,cMid};
            }
            if (Matrix[mid][cMid]>target) {
                rEnd=mid;
            }else{
                rStart=mid;
            }
        }
        //Now we have only two row
        if (target==Matrix[rStart][cMid]) {
            return new int[] {rStart,cMid};
        }
        if (target==Matrix[rStart+1][cMid]) {
            return new int[]{rStart+1,cMid};
        }
        if (target<=Matrix[rStart][cMid-1]) {
            return binarySearch(Matrix, rStart, 0, cMid-1, target);
        }
        if (target>=Matrix[rStart][cMid+1] && target<=Matrix[rStart][cols-1]) {
            return binarySearch(Matrix, rStart, cMid+1, cols-1, target);
        }
        if (target<=Matrix[rStart+1][cMid-1]) {
            return binarySearch(Matrix, rStart+1, 0, cMid-1, target);
        }else{
            return binarySearch(Matrix, rStart+1, cMid+1, cols-1, target);
        }
    //    return new int[] {-1,-1};
    }
}
