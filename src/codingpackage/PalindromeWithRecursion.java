package codingpackage;

public class PalindromeWithRecursion {

	public static void main(String[] args) {
		String s1 = "malayalam";

		System.out.println(checkRecursion(s1, 0, s1.length() - 1));

	}

	private static boolean checkRecursion(String s1, int s, int e) {

		if (s > e)
			return true;

		if (s1.charAt(s) != s1.charAt(e))
			return false;

		else if (s1.charAt(s) == s1.charAt(e))
			checkRecursion(s1, s + 1, e - 1);

		return true;

	}

}
