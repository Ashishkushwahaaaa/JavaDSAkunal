package Tree.BFS_DFS;

import java.util.Stack;

public class DFS {
    
    public void DFSstack(Node root){
        Stack<Node> stack = new Stack();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node top = stack.pop();
            System.out.println(top.val);
            if (top.right!=null) {
                stack.add(top.right);
            }
            if (top.left!=null) {
                stack.add(top.left);
            }
        }
    }

    public class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
}
