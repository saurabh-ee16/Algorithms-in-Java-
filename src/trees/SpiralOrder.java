package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/**
 * Spiral order or zigzag order traversal of binary tree.
 *
 */
public class SpiralOrder {

	static class Node {

		public int data;
		public Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	static Node newNode(int data) {
		Node node = new Node(data);
		return node;
	}

	public static void main(String[] args) {

		// create tree
		Node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(7);
		root.left.right = newNode(6);
		root.right.left = newNode(5);
		root.right.right = newNode(4);
		System.out.println("ZigZag Order traversal of binary tree is");

		SpiralOrder ob = new SpiralOrder();
		ob.printSpriral(root);

	}

	private void printSpriral(Node root) {
		Stack<Integer> stack = new Stack<>();
		Queue<Node> queue = new LinkedList<>();
		boolean reverse = false;
		queue.add(root);

		while (!queue.isEmpty()) {

			int size = queue.size();

			for (int i = 0; i < size; i++) {
				Node node = queue.poll();
				if (reverse)
					stack.add(node.data);
				else
					System.out.print(node.data + " ");

				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}

			if (reverse) {
				while (!stack.isEmpty()) {
					System.out.print(stack.pop() + " ");
				}
			}
			reverse = !reverse;
		}

	}

}
