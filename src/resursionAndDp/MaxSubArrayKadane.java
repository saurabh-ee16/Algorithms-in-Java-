package resursionAndDp;

//finding max sum of sub arrays using Kadane algorithm
public class MaxSubArrayKadane {

	public static void main(String[] args) {
		int arr[] = new int[] { -5, 1, -2, 3, -1, 2, -2 };
		int result[] = getMaxSubArray(arr, arr.length);
		System.out.println(result[0]);
		for(int i=result[1];i<=result[2];i++) {
			System.out.print(arr[i]+",");
		}
	}

	private static int[] getMaxSubArray(int[] arr, int n) {
		int res = arr[0];
		int maxEnding = arr[0];
		int low = 0;
		int high = 0;
		for (int i = 1; i < n; i++) {

			if (maxEnding + arr[i] < arr[i]) {
				low = i;
				maxEnding = arr[i];
			} else
				maxEnding = Math.max(maxEnding + arr[i], arr[i]);

			if (res > maxEnding) {
				high=i-1;
			}
			else
				res=maxEnding;
			// res = Math.max(maxEnding, res);

		}
		return new int[] {res,low,high};

	}
}
