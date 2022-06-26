package strings;

/**
 * Given a binary string str of length N, the task is to find the maximum count
 * of consecutive substrings str can be divided into such that all the
 * substrings are balanced i.e. they have equal number of 0s and 1s.
 *
 */

public class SplitBinarySubString {

	public static void main(String[] args) {
		String str = "0111100010";
		int n = str.length();

		System.out.println("count = " + maxSubStr(str, n));

	}

	private static int maxSubStr(String str, int n) {
		int balance = 0;
		int l = 0;
		int count = 0;
		int i = 0;
		while (i <= n) {
			if (balance == 0 && i != 0) {
				System.out.println(str.substring(l, i));
				l = i;
				count++;
			}

			if (i < n && str.charAt(i) == '0') {
				balance += -1;

			} else if (i < n && str.charAt(i) == '1') {
				balance += 1;

			}

			i++;
		}

		return count;

	}

}
