package com.ex.factorial_without_for;

public class App {

	public static void main(String[] args) {
		int n = 7;
		System.out.println(factorial(n));
	}
	
	public static int factorial(int x) {
		if(x > 1)
			return x * factorial(x - 1);
		else {
			return x;
		}
	}
}
