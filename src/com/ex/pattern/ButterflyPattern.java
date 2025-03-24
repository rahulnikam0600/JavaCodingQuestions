package com.ex.pattern;

/*
 * Butterfly Pattern

*       *
**     **
***   ***
**** ****
*********
**** ****
***   ***
**     **
*       *


 */

public class ButterflyPattern {

	public static void main(String[] args) {
		int n = 9;
		
		for(int i = 1; i < n*2; i++) {
			if(i < n)
				System.out.println("*".repeat(i)+" ".repeat((n-i)*2-1)+"*".repeat(i));
			else if (i == n)
				System.out.println("*".repeat(n*2-1));
			else
				System.out.println("*".repeat(n*2-i)+" ".repeat((i-n)*2-1)+"*".repeat(n*2-i));
		}
	}
}
