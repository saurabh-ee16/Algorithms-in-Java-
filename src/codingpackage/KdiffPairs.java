package codingpackage;

import java.util.Arrays;
import java.util.HashMap;

public class KdiffPairs {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 4, 1, 5 };
		int k = 2;
		System.out.println(findPairs(arr, k));
	}

	public static int findPairs(int[] nums, int k) {

		Arrays.sort(nums);

		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n - 1; i++) {
			
			// search nums[i]+k
			if(Arrays.binarySearch(nums, i+1, n,nums[i]+k)>0) {
				if(!map.containsKey(nums[i]) && !map.containsValue(nums[i]+k)) {
					map.put(nums[i], nums[i]+k);
				}
			}
			
			
			/*
			 * for (int j = i + 1; j < n; j++) {
			 * 
			 * if (Math.abs(nums[i] - nums[j]) > k) break;
			 * 
			 * if (Math.abs(nums[i] - nums[j]) == k) {
			 * 
			 * if (!map.containsKey(nums[i]) && !map.containsValue(nums[j])) {
			 * map.put(nums[i], nums[j]); break; } }
			 * 
			 * }
			 */
		}

		return map.size();

	}
}
