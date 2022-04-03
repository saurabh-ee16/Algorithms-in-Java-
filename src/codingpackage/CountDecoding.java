package codingpackage;

/*Input:  digits[] = "121"
Output: 3
// The possible decodings are "ABA", "AU", "LA"

Input: digits[] = "1234"
Output: 3
// The possible decodings are "ABCD", "LCD", "AWD"
*/

// using recursion and DP
public class CountDecoding {
	
	public static void main(String[] args) {
		String str="2611055971756562";
		char digit1[] = { '1', '4', '2', '3' };
		char digit2[]=str.toCharArray();

		System.out.printf("CountWays using recursion is= %d\n", countWays(digit2, digit2.length));
		System.out.printf("CountWays using DP is= %d", countWaysUsingDP(digit2, digit2.length));
	}

	// this method uses DP - top down approach
	private static int countWaysUsingDP(char[] nums, int n) {
		int[] memo = new int[n + 1];
		memo[n] = 1;

		for (int i = n - 1; i >= 0; i--) {

			if (nums[i] != '0')
				memo[i] = memo[i + 1];

			if (i < n - 1 && (nums[i] == '1' || nums[i] == '2' && nums[i + 1] < '7'))
				memo[i] += memo[i + 2];

		}
		return memo[0];

	}

	// this method uses recursion
	private static int countWays(char[] nums, int n) {

		if (n == 0 || n == 1)
			return 1;

		if (nums[0] == '0')
			return 0;

		int count = 0;
		if (nums[n - 1] > '0')
			count = countWays(nums, n - 1);

		if ((nums[n - 2] == '1' || nums[n - 2] == '2') && (nums[n - 1] < '7'))
			count += countWays(nums, n - 2);

		return count;

	}

}
