package resursionAndDp;

public class CountDecoding2 {

	public static void main(String[] args) {
		
		System.out.println("countDecoding--------");
		System.out.println("*="+numDecodings("*"));
		System.out.println("1*="+numDecodings("1*"));
		System.out.println("2*="+numDecodings("2*"));
	}

	public static int numDecodings(String s) {
		char nums[] = s.toCharArray();
		int n = nums.length;
		int[] memo = new int[n + 1];
		int M = 1000000007;

		memo[n] = 1;

		for (int i = n - 1; i >= 0; i--) {

			if (nums[i] == '*')
				memo[i] = 9 * memo[i + 1] % M;

			if (nums[i] != '0' && nums[i] != '*')
				memo[i] = memo[i + 1] % M;

			if (i < n - 1 && (nums[i] == '1' || nums[i] == '2' && nums[i + 1] < '7'))
				memo[i] = (memo[i] + memo[i + 2]) % M;

			if (i < n - 1 && (nums[i] == '*' && nums[i + 1] < '7')) {
				memo[i] = (memo[i] + 2 * memo[i + 2]) % M;

			}

			if (i < n - 1 && (nums[i] == '*' && nums[i + 1] == '*')) {
				memo[i] = (memo[i] + 15 * memo[i + 2]) % M;
			}

			if (i < n - 1 && (nums[i] == '1' || nums[i] == '2' && nums[i + 1] == '*')) {
				memo[i] = (memo[i] + 15 * memo[i + 2]) % M;
			}

		}
		return memo[0];
	}

}
