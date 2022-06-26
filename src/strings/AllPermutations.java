package strings;

/**
 * note : This permutation algorithm will only give correct ans for distinct
 * characters. The below code uses backtracking to generate all permute. Time
 * complexity is O(n*n!)
 * 
 */
public class AllPermutations {

	private int count = 0;

	public static void main(String[] args) {
		String str = "abcd";
		int n = str.length();
		AllPermutations permutation = new AllPermutations();
		permutation.permute(str, 0, n - 1);
		System.out.println("count of permute = " + permutation.count);

	}

	private void permute(String str, int l, int r) {

		if (l == r) {
			System.out.println(str);
			count++;
			return;
		}

		for (int i = l; i <= r; i++) {
			str = this.swap(str, l, i);
			permute(str, l + 1, r);
			str = this.swap(str, l, i);
		}

	}

	private String swap(String str, int l, int i) {
		char ch[] = str.toCharArray();
		char temp = ch[l];
		ch[l] = ch[i];
		ch[i] = temp;
		return String.valueOf(ch);

	}

}
