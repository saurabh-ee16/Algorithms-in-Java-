package resursionAndDp;

import java.util.Scanner;

// fibonacci with Recursion 
public class Fibonacci2 {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("fibonacci =" + fib(n));

		sc.close();
	}

	private static long fib(int n) {
		
		if(n==1 || n==0)
			return n;
		
		else
			return fib(n-1)+fib(n-2);
		
	}
	

}
