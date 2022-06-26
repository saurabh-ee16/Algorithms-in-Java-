package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author saura
 *
 */
/**
 * @author saura
 *
 */
public class BST {
	public int data;
	BST left;
	BST right;

	BST(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public BST() {
		
	}

	public BST newNode(int data) {
		BST newNode = new BST(data);
		return newNode;
	}

	public void insertNode(BST root, int data) {

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
		System.out.print(root.data + " ");
		inOrder(root.right);

	}

	/**
	 * Output of the code 
	 * level order traversal: 15 10 20 8 12 17 25 
	 * Inorder traversal: 8 10 12 15 17 20 25
	 */
	public static void main(String[] args) {
		BST root = new BST(); 
		root = root.newNode(15);
		root.insertNode(root, 10);
		root.insertNode(root, 20);
		root.insertNode(root, 8);
		root.insertNode(root, 12);
		root.insertNode(root, 17);
		root.insertNode(root, 25);
		System.out.print("level order traversal: ");
		levelOrderTraversal(root);
		System.out.print("\nInorder traversal: ");
		inOrder(root);
	}

}
