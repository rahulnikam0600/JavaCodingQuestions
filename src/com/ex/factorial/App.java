package com.ex.factorial;
/*
 * Find the Factorial of the number using for loop
 */
public class App {
	public static void main(String[] args) {
		int n = 7;
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println(result);
	}
}
