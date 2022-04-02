package codingpackage;

import java.util.Arrays;

//Given a string, the task is to find the leftmost character that does not repeat.
public class LeftMostNonRepeatingChar {

	private static final int CHAR = 256;

	public static void main(String args[]) {
		String str1 = "geeksforgeeks";
		String str2 = "apple";
		String str3 = "abcabc";
		System.out.printf("Index of leftmost non-repeating element %s: %d \n", str1, nonRep(str1));
		System.out.printf("Index of leftmost non-repeating element %s: %d \n", str2, nonRep(str2));
		System.out.printf("Index of leftmost non-repeating element %s: %d \n", str3, nonRep(str3));

	}

	private static int nonRep(String str) {
		int visited[] = new int[CHAR];
		Arrays.fill(visited, -1);
		int res = Integer.MAX_VALUE;
		for (char c : str.toCharArray()) {
			if (visited[c] == -1) {
				visited[c] = str.indexOf(c);
			} else
				visited[c] = -2;
		}

		for (int i = 0; i < CHAR; i++) {
			if (visited[i] >= 0)
				res = Math.min(res, visited[i]);

		}

		return res==Integer.MAX_VALUE?-1:res;
	}

}
