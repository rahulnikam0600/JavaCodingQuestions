package com.ex.pattern;

//Hollow Pyramid

public class HollowPyramid {

	public static void main(String[] args) {
		int n = 9;
		int space = 1;
		for(int i = 0; i < n; i++) {
			System.out.print(" ".repeat(n-i));
			if(i == n - 1)
				System.out.print("*".repeat(n*2-1));
			else if(i == 0) {
				System.out.print("*");
			}
			else {
				System.out.print("*"+" ".repeat(space)+"*");
				space += 2;
			}
			System.out.println();
		}
	}
}
