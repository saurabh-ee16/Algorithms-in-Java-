package resursionAndDp;

import java.util.Arrays;

//reverse a string of words "welcome to gfg --> gfg to welcome"
public class ReverseString {

	public static void main(String[] args) {
		String str = "Welcome to gfg";
		char charArray[] = str.toCharArray();
		// naive solution
		naiveReverse(charArray);
		System.out.println("calling naive reverse function: " + String.valueOf(charArray));
	}

	private static void naiveReverse(char[] str) {

		int len = str.length;
		int start = 0;
		int end = 0;
		// reverse individual words
		for (end = 0; end < len; end++) {
			if (str[end] == ' ') {
				reverse(str, start, end - 1);
				start = end + 1;
			}

		}
		reverse(str, start, end - 1); // reversing last word

		// reversing whole string characters
		reverse(str, 0, end - 1);

	}

	private static void reverse(char[] str, int start, int end) {
		while (start <= end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;

			start++;
			end--;
		}

	}

}
