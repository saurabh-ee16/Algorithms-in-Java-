package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    public int data;
    BST left;
    BST right;

    BST(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public static BST newNode(int data) {
        BST newNode = new BST(data);
        return newNode;
    }

    public static void insertNode(BST root, int data) {

        if (data <= root.data && root.left == null) {
            root.left = newNode(data);
        } else if (data > root.data && root.right == null) {
            root.right = newNode(data);
        } else if (data <= root.data) {
            insertNode(root.left, data);
        } else {
            insertNode(root.right, data);
        }

    }

    private static void levelOrderTraversal(BST root) {

        Queue<BST> queue = new LinkedList<BST>();

        if (root == null)
            return;

        queue.add(root);

        while (!queue.isEmpty()) {

            BST node = (BST) queue.element();
            System.out.print(node.data + " ");

            if (node.left != null)
                queue.add(node.left);

            if (node.right != null)
                queue.add(node.right);

            queue.remove();

        }

    }

    private static void inOrder(BST root) {

        if (root == null)
            return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);

    }

    public static void main(String[] args) {
        BST root = newNode(15);
        // insertNode(root, 15);
        insertNode(root, 10);
        insertNode(root, 20);
        insertNode(root, 8);
        insertNode(root, 12);
        insertNode(root, 17);
        insertNode(root, 25);

        levelOrderTraversal(root);
        inOrder(root);
    }

}
