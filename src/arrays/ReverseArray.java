package arrays;

import java.util.Arrays;

//reverse the array  
public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 1, 2 };

		System.out.println("array before reverse: " + Arrays.toString(arr));
		reverse(arr, 0, arr.length - 1);
		System.out.println("array after reverse: " + Arrays.toString(arr));
	}

	private static void reverse(int[] arr, int low, int high) {

		if (low > high)
			return;

		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;

		reverse(arr, low + 1, high - 1);

	}

}
