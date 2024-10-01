package Tree.BFS_DFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS{

    private TreeNode root;
    public BFS(){
        
    }
        
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentList = new ArrayList<>(levelSize);
            for(int i = 0; i < levelSize; i++){ //different level has different no of element so running for that much time.
                TreeNode currentNode = queue.poll();
                currentList.add(currentNode.val);
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentList); //Adding list(containing all element of current level) in the result list.
        }
        return result;
    }

    public TreeNode findSuccessor(TreeNode root,int val){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            // We must add the currentNode's child to the queue first before checking for the for the currentNode.val because if the value mathces then we have to return the node just next to it and let if we don't have any next node to it then it will return the null but then it should return the child of this current node as a successor which we haven't added;
            if (currentNode.left!=null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right!=null) {
                queue.offer(currentNode.right);
            }
            if(currentNode.val==val){
                break;
            }
        }
        return queue.peek();
    }


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        int flag = 0;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addFirst(root);
        while(!deque.isEmpty()){
            int levelSize = deque.size();
            List<Integer> currentList = new ArrayList<>(levelSize);
            for(int i = 0; i < levelSize; i++){ 
                if(flag==0){
                    TreeNode currentNode = deque.removeFirst();
                    currentList.add(currentNode.val);
                    if(currentNode.left!=null){
                        deque.addLast(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        deque.addLast(currentNode.right);
                    }
                }
                if(flag==1){
                    TreeNode currentNode = deque.removeLast();
                    currentList.add(currentNode.val);
                    if(currentNode.right!=null){
                        deque.addFirst(currentNode.right);
                    }
                    if(currentNode.left!=null){
                        deque.addFirst(currentNode.left);
                    }
                }
            }
            result.add(currentList); 
            flag =flag^1;
        }
        return result;
    }








    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
}
