package codingpackage;

// find max sub array of odd-even alternate elements
public class MaxSubArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 5, 10, 20, 6, 3, 8 };
		int result = getMaxSubArray(arr);
		System.out.println(result);

	}
	
	// this returns the length of max sub array
	public static int getMaxSubArray(int arr[]) {
		int n = arr.length;
		int count = 0;
		int result = 0;

		for (int i = 0; i <= n - 2; i++) {
			if ((arr[i] % 2 == 0 && arr[i + 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i + 1] % 2 == 0)) {
				count += 1;
				result = Math.max(result, count);
			} else {
				count = 0;
			}
		}

		return result + 1;
	}

}
