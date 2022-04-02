package codingpackage;

import java.util.Scanner;

public class Fibonacci3 {

	public static void main(String[] args) {

		// direct formula for nth Fibonacci no.

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("fibonacci =" + (long) fib(n));

		sc.close();

	}

	private static long fib(int n) {

		return (long) ((long) 1 / Math.sqrt(5) * ((Math.pow((1 + Math.sqrt(5)) / 2, n))));

	}

}
