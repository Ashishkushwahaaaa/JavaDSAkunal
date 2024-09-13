package Tree;

public class SegmentTree {


    public class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        // public Node(int data){
        //     this.data = data;
        // }
        public Node( int startInterval, int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;
    public SegmentTree(int[] arr){
        root = constructTree(arr, 0, arr.length-1);
    }
    // To construct a segment tree it takes O(n);
    public Node constructTree(int[] arr, int start, int end){
        if (start==end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start, end);
        int mid = (start+end)/2;
        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid+1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public int query(int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }
    private int query(Node node, int qsi, int qei) {
        
        if (node.startInterval>=qsi && node.endInterval<=qei) {
            // node is completely lying inside the query
            return node.data;
        }else if (node.startInterval>qei || node.endInterval<qsi) {
            // completly outside;(these nodes have ranges which does does not contains answer);
            return 0;
        }else{
            // Partial overlapping(need to go more inside)
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value){
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int value){
        if (index>=node.startInterval && index<=node.endInterval) {
            if (index==node.startInterval && index==node.endInterval) {
                node.data = value;
                return node.data;
            }else{
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                return leftAns + rightAns;
            }
        }
        return node.data;
    }

    public void display(){
       display(this.root);
    }
    private void display(Node node){
        String str = "";
        if (node.left!=null) {
            str = str + "Interval: [" + node.left.startInterval + ", " + node.left.endInterval + "] , Data = " + node.left.data + "  =>  ";
        }else{
            str = str + "no left child  =>  ";
        }

        // for this current child: 
        str = str + "Interval: [" + node.startInterval + "-" + node.endInterval + "] and Data: " + node.data + "  <=  ";

        if (node.right!=null) {
            str = str + "Interval: [" + node.right.startInterval + "-" + node.right.endInterval + "] and Data: " + node.right.data;
        }else{
            str = str + "no right child";
        }

        System.out.println(str);

        // Call recursion;
        if (node.left!=null) {
            display(node.left);
        }
        if (node.right!=null) {
            display(node.right);
        }
    }

}
