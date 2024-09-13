package Tree;

public class SegmentMain {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,7,6,9,4};
        SegmentTree tree = new SegmentTree(arr);
        System.out.println( tree.query(2, 4));
        System.out.println();
        tree.display();
    }
}
