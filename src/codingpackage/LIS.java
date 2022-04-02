package codingpackage;

import java.util.Vector;

// longest increasing subsequence O(n*n) time
//dynamic programming
public class LIS {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 4, 5, 1 };
		int n = arr.length;

		// print LIS of arr
		constructPrintLIS(arr, n);
	}

	private static void constructPrintLIS(int[] arr, int n) {
		// L[i] - The longest increasing
		// sub-sequence ends with arr[i]
		Vector<Integer> l[] = new Vector[n];
		for (int i = 0; i < n; i++) {
			l[i] = new Vector<Integer>();
		}

		// L[0] is equal to arr[0]
		l[0].add(arr[0]);

		// Start from index 1
		for (int i = 1; i < n; i++) {

			for (int j = 0; j < i; j++) {
				// L[i] = {Max(L[j])} + arr[i]
				// where j < i and arr[j] < arr[i]
				if (arr[j] < arr[i] && (l[i].size() < l[j].size() + 1)) {
					l[i] = (Vector<Integer>) l[j].clone();
				}

			}
			// L[i] ends with arr[i]
			l[i].add(arr[i]);

		}

		int res = 0;
		// printing all LIS for every element of arr
		for (Vector<Integer> vector : l) {
			res = Math.max(res, vector.size());
			System.out.println(vector);
		}

		// printing longest subsequence size
		System.out.println("longest subsequence size: " + res);

	}

}
