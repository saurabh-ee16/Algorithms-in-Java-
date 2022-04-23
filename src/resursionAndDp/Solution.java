package resursionAndDp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		int nums[] = new int[] { 2, 2, 1, 1, 1, 2, 2 };
		int n = majorityElement(nums);

	}

	public static int majorityElement(int[] nums) {

		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i]) + 1);
			else
				map.put(nums[i], 1);

		}

		Set set = map.entrySet();

		Iterator<Entry<Integer, Integer>> itr = set.iterator();

		while (itr.hasNext()) {
			Entry<java.lang.Integer, java.lang.Integer> entry = (Entry<java.lang.Integer, java.lang.Integer>) itr
					.next();

			System.out.println(entry.getValue());

		}

		return 1;

	}

}
