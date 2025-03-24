package com.ex.pattern;

import java.util.Iterator;

/*
 * 
 * Pascal's Triangle
    1    
   1 1   
  1 2 1  
 1 3 3 1 
1 4 6 4 1

 */

public class PascalsTriangle {

	public static void main(String[] args) {
		int n = 5;
		for(int i = 0; i < 5; i++) {
			System.out.print(" ".repeat(n-i));
			int number = 1;
			for(int j = 0; j <= i; j++) {
				System.out.print(number+" ");
				number = number * (i - j) /(j+1);
			}
			System.out.println();
		}
	}
}
