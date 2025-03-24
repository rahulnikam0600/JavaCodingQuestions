package com.ex.pattern;

//Diamand Pattern

public class Diamand {

	public static void main(String[] args) {
		int n = 5;
		int star = -1;
		for(int i = 0; i < n*2 - 1;  i++) {
			if(i < n) {
				star+=2;
				System.out.print(" ".repeat(n-i)+"*".repeat(star));
			}else {
				star -= 2;
				System.out.print(" ".repeat(2-(n-i))+"*".repeat(star));
			}
			System.out.println();
		}
	}
}
