package resursionAndDp;

//Josephus problem or game of death
public class JosephusProblem {

	// for given n and k, find last person standing after game of death

	public static void main(String[] args) {
		int n = 14;
		int k = 7;
		System.out.println(jos(n, k));

	}

	private static int jos(int n, int k) {

		if (n == 1 && k > 0)
			return 1;

		return (jos(n - 1, k) + k - 1) % n + 1;

	}

}
