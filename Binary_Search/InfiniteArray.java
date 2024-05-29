
public class InfiniteArray{
    public static void main(String[] args){
        int[] arr = {1,2,4,5,7,8,10,13,15,18,23,25,28,33,36,37,38,41,43,45,46,48,49,50,51,67,69,70,71,73,75,81};
        int target = 51;

        System.out.println(findRange(arr,target));
    }
    static int findRange(int[] arr, int target){
        int start=0,end =1;
        while(target>arr[end]){
            int temp = end + 1;
            end = end + 2*(end-start+1);
            start = temp;
        }
        System.out.println(start + " " + end); // Print the range of the array taken to proceed for the binary search
        return binarySearch(arr,start,end,target);
    }

    static int binarySearch(int[] arr,int start,int end, int target){
        int mid=0;

        while (start<=end) {
            mid = start + (end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

