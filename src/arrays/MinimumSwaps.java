package arrays;

import java.util.Arrays;

/**
 * Minimum swaps required to bring all elements less than or equal to k together
 *
 * 
 */
public class MinimumSwaps {

	public static void main(String[] args) {

		int arr1[] = { 2, 7, 9, 5, 8, 7, 4 };
		int n = arr1.length;
		int k = 5;
		System.out.println("min swaps = " + minSwap(arr1, n, k));
		System.out.println("Array after min swaps = "+Arrays.toString(arr1));

	}

	private static int minSwap(int[] arr, int n, int k) {
		int snowBallSize = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > k)
				snowBallSize++;
			else if (snowBallSize > 0) {
				int tmp = arr[i];
				arr[i] = arr[i - snowBallSize];
				arr[i - snowBallSize] = tmp;
				count++;
			}

		}
		return count;
	}

}
