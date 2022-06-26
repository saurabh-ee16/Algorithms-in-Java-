package trees;

import java.util.HashSet;

public class TwoSumInBst {

	public static void main(String[] args) {

		BST root = new BST();
		root = root.newNode(15);
		root.insertNode(root, 10);
		root.insertNode(root, 20);
		root.insertNode(root, 8);
		root.insertNode(root, 12);
		root.insertNode(root, 17);
		root.insertNode(root, 25);

		HashSet<Integer> set = new HashSet<Integer>();
		int sum = 33;
		boolean isFound = util(root, sum, set);
		
		System.out.println(isFound);
		
	}

	private static boolean util(BST root, int sum, HashSet<Integer> set) {
		if (root == null)
			return false;

		if (util(root.left, sum, set)) {
			return true;
		}

		if (set.contains(sum - root.data))
			return true;
		else
			set.add(root.data);

		return util(root.right, sum, set);

	}

}
