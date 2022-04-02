package codingpackage;

import java.util.Arrays;

// using Dynamic programming top-down approach 
public class LongestCommonSubSequence {

	private static int memo[][];

	public static void main(String[] args) {
		//output of this should be "az"
		String s1 = "axyz";
		String s2 = "baz";
		
		
		int m = s1.length();
		int n = s2.length();
		memo = new int[m + 1][n + 1];

		for (int i = 0; i < memo.length; i++) {
			Arrays.fill(memo[i], -1);
		}

		System.out.println("lcs = " + lcs(s1, s2, m, n));

		for (int i = 0; i < memo.length; i++) {
			for (int j = 0; j < memo[i].length; j++) {
				System.out.printf("%5s", memo[i][j]);
			}
			System.out.println();
		}

	}

	private static int lcs(String s1, String s2, int m, int n) {

		if (memo[m][n] != -1)
			return memo[m][n];

		if (m == 0 || n == 0)
			memo[m][n] = 0;

		else {
			if (s1.charAt(m - 1) == s2.charAt(n - 1))
				memo[m][n] = 1 + lcs(s1, s2, m - 1, n - 1);
			else {
				memo[m][n] = Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
			}

		}

		return memo[m][n];
	}

}
