package strings;

/*
 * The above programs don’t work for duplicate characters.
 * To make them work for duplicate characters,find all the characters that are smaller(include equal this time also),do the same as above but,this time divide the rank so formed by p!where p is the count of occurrences of the repeating character.
*/
public class LexicographicRank {

	private static int CHAR = 256;

	public static void main(String[] args) {
		String str = "dcb";
		System.out.printf("Rank of the String %s is %d", str, findRank(str));

	}

	private static long fact(long n) {

		return (n == 0 || n == 1) ? 1 : fact(n - 1) * n;

	}

	private static long findRank(String str) {
		int n = str.length();
		long mul = fact(n);
		int count[] = new int[CHAR];
		long rank = 1;

		for (int i = 0; i < n; i++)
			count[str.charAt(i)]++;

		for (int i = 1; i < CHAR; i++)
			count[i] += count[i - 1];

		for (int i = 0; i < n; i++) {
			mul = mul / (n - i);

			rank = rank + count[str.charAt(i) - 1] * mul;

			// update count array
			for (int j = str.charAt(i); j < CHAR; j++) {
				count[j]--;
			}

		}

		return rank;
	}

}
