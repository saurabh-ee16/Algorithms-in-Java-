import java.util.Arrays;

import codingpackage.CoinChange;

public class codechef1 {

	public static void main(String[] args) {
		int res=coinChange(new int[]{1,2,5},11);
		System.out.println(res);
	}

	public static int coinChange(int[] coins, int sum) {
		int n = coins.length;
		Arrays.sort(coins);
		return helper(coins, n, sum);

	}

	private static int helper(int[] coins, int n, int sum) {
		int res=0;
		
		for(int i=n-1;i>=0;i--) {
			res=sum/coins[i];
			int rem=sum%coins[i];
			
			if(Arrays.binarySearch(coins, rem)>=0)
				res++;
			
			
		}

		return res;
		
	}

}