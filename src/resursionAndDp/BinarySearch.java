package resursionAndDp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		int target = 4600;
		List<Integer> list = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("MOCK_DATA.csv"));
			String line;
			while ((line = br.readLine()) != null) {
				list.add(Integer.valueOf(line));
			}

		} catch (NumberFormatException | IOException e) {

			System.out.println(e.getMessage());
		}
		int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

		Arrays.sort(arr);

		int index = search(arr, 0, arr.length - 1, target);
		if (index < 0)
			System.out.println("Not found");
		else
			System.out.printf("arr[%d]=%d", index, arr[index]);
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
