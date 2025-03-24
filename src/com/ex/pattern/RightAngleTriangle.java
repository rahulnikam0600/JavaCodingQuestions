package com.ex.pattern;

//Right-Angled Triangle Pattern

public class RightAngleTriangle {

	public static void main(String[] args) {
		int n = 7;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
