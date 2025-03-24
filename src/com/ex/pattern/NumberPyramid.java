package com.ex.pattern;

public class NumberPyramid {

	public static void main(String[] args) {
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			System.out.print(" ".repeat(n-i)+(i+" ").repeat(i));
			System.out.println();
		}
	}
}
