package com.ex.reverse_number;

public class App {

	public static void main(String[] args) {
		int a = 7586899;
		int result = 0;
		while(a > 0) {
			result *= 10;
			result += a%10;
			a = a/10;
		}
		System.out.println(result);
	}
}
