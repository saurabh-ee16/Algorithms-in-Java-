package resursionAndDp;

import java.util.Arrays;

/*You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
*/

public class CoinChange2 {

	public static void main(String[] args) {
		int[] coins = { 1, 3, 4, 5 };
		int sum = 7;
		System.out.println("Minimum no of coins required is = " + countMin(coins, sum));
	}

	private static int countMin(int[] coins, int sum) {
		int memo[] = new int[sum + 1];

		// base case
		memo[0] = 0;

		for (int i = 1; i <= sum; i++) {
			int min = Integer.MAX_VALUE;

			for (int coin : coins) {
				if (i - coin >= 0 && memo[i - coin] != -1)
					min = Math.min(min, memo[i - coin]);
			}

			if (min != Integer.MAX_VALUE)
				memo[i] = 1 + min;
			else
				memo[i] = -1;

		}

		System.out.println(Arrays.toString(memo));
		return memo[sum];
	}

}
