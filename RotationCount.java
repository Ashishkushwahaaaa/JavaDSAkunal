public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int pivot= searchPivot(arr);
        System.out.println(pivot);
        // int count=RotationCount(pivot);
        int RotationCount=pivot+1;

        System.out.println(RotationCount);
    }
    static int searchPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                return mid;
            }
            if (arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if (arr[start]<=arr[mid]) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
