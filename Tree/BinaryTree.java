package Tree;

import java.util.Scanner;

public class BinaryTree {
    
    public BinaryTree(){
        
    }
    
    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the value of root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(root, scanner);
    }
    
    private void populate(Node node, Scanner scanner) {
        System.out.println("Do you want to add the left child of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(node.left, scanner);
        }
        System.out.println("Do you want to add the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right child of the " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(node.right, scanner);
        }
    }
    public void display(){
        display(root, "");
    }
    
    private void display(Node node, String indent) {
        if (node == null) {
            return ;
        }        
        System.out.println(indent + node.value);
        display(node.left, indent+"  ");
        display(node.right, indent+"  ");
    }
    
    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }
    private void prettyDisplay(Node node, int level){
        if (node==null) {
            return;
        }
        prettyDisplay(node.right, level+1);
        if (level!=0) {
            for (int i = 0; i < level-1; i++) {
                System.out.print("\t\t");
            }
            System.out.println("|------------->" + node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level+1);
    }


    public void preOrder(){
        System.out.print("PREORDER: ");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node==null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        System.out.print("INORDER: ");
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node node) {
        if (node==null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(){
        System.out.print("POSTORDER: ");
        postOrder(root);
        System.out.println();
    }
    private void postOrder(Node node) {
        if (node==null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }



    private class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
}
