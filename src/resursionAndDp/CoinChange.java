package resursionAndDp;

// Recursive JAVA program for
// coin change problem.

public class CoinChange {

// Driver code
	public static void main(String args[]) {
		int arr[] = { 2, 4, 6 };
		int sum = 6;
		int n = arr.length;

		System.out.println("Recursive_2=" + countWays2(arr, n - 1, sum));
	}

	private static int countWays2(int[] arr, int n, int sum) {

		if (sum == 0)
			return 1;

		if (sum < 0)
			return 0;
		
		if (n < 0 && sum > 0)
			return 0;

		return countWays2(arr, n, sum - arr[n]) + countWays2(arr, n - 1, sum);

	}

}
