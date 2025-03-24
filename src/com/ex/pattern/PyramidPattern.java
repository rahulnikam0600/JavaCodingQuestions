package com.ex.pattern;

public class PyramidPattern {

	public static void main(String[] args) {
		int n = 5;
		int star = 1;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n;j++) {
				System.out.print(" ");
			}
			for(int k = 0;k < star;k++) {
				System.out.print("*");
			}
			star+= 2;
			System.out.println();
		}
	}
	
}
