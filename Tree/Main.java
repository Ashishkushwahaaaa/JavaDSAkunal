package Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(scanner);
        // // bt.display();
        // bt.prettyDisplay();

        bt.preOrder();
        bt.inOrder();
        bt.postOrder();

        // BinarySearchTree bst = new BinarySearchTree();
        // int[] nums = new int[]{5,3,8,2,9,7,1,4};
        // bst.populate(nums);
        // bst.display();

        // int[] numsSorted = new int[]{1,2,3,4,5,6,7,8,9};
        // bst.populateSorted(numsSorted);
        // bst.prettyDisplay();

    }
}
