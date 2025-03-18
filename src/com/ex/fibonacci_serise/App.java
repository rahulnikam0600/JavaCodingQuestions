package com.ex.fibonacci_serise;

import java.util.Iterator;

/*
 * Print the Fibonacci sequence
 * 0 1 1 2 3 5 8 13 21 34 ..........
 */

public class App {
	public static void main(String[] args) {
		int n = 8;
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for (int i = 0; i < n; i++) {
			int next = a+b;
			System.out.print(next+" ");
			a = b;
			b = next;
		}
	}
}
