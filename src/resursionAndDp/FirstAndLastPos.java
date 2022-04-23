package resursionAndDp;

import java.util.Arrays;

// find first and last occurrence of target element in O(lognN) time using binary search. 
public class FirstAndLastPos {

	public static void main(String[] args) {
		int arr[] = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		System.out.println(Arrays.toString(searchRange(arr, target)));
	}

	public static int[] searchRange(int[] nums, int target) {
		int i = leftBinarySearch(nums, 0, nums.length - 1, target);
		if (i == -1)
			return new int[] { -1, -1 };

		int j = rightBinarySearch(nums, 0, nums.length - 1, target);

		return new int[] { i, j };

	}

	private static int rightBinarySearch(int[] nums, int i, int j, int target) {
		int start = i;
		int end = j;
		int idx = -1;

		while (start <= end) {
			int middle = start + (end - start) / 2;
			
			if(nums[middle]==target) {
				idx=middle;
				start=middle+1;
			}
			
			else if (nums[middle] < target)
				start = middle + 1;
			else
				end = middle - 1;


		}
		return idx;
	}

	private static int leftBinarySearch(int[] nums, int i, int j, int target) {
		int start = i;
		int end = j;
		int idx = -1;
		while (start <= end) {
			int middle = start + (end - start) / 2;

			if (nums[middle] == target) {
				idx = middle;
				end = middle - 1;
			}

			else if (target < nums[middle])
				end = middle - 1;
			else
				start = middle + 1;

		}
		return idx;

	}

}
