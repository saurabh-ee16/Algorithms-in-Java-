package resursionAndDp;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

	public static void main(String[] args) {
		int target = 78;
		int arr[] = new Random().ints(0,100).distinct().limit(100).toArray();
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		int index = search(arr, 0, arr.length - 1, target);
		if (index < 0)
			System.out.println("Not found");
		else
			System.out.printf("arr[%d]=%d", target, arr[index]);
	}

	public static int search(int[] arr, int s, int e, int target) {

		int m = (s + e) / 2;

		if (arr[m] == target)
			return m;

		if (s > e)
			return -1;

		return target > arr[m] ? search(arr, m + 1, e, target) : search(arr, 0, m - 1, target);

	}

}
