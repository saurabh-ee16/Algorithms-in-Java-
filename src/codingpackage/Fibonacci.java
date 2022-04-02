package codingpackage;

import java.util.Arrays;
import java.util.Scanner;

// fibonacci with Dynamic programming
public class Fibonacci {

	public static long memo[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		memo = new long[n + 1];
		Arrays.fill(memo, -1);
		System.out.println("fibonacci =" + fib(n));
		
		sc.close();

	}

	public static long fib(int n) {

		if (memo[n] != -1)
			return memo[n];

		else {
			long res;

			if (n == 1 || n == 0)
				return n;

			else
				res = fib(n - 1) + fib(n - 2);

			memo[n] = res;

		}

		return memo[n];

	}

}