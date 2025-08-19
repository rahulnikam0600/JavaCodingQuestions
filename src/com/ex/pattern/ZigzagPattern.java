package com.ex.pattern;



/*
 
 
  *   *   *  
 * * * * * * 
*   *   *   *

 
 */

public class ZigzagPattern {

	public static void main(String[] args) {
		int n = 3;
		int cols = 9;
		
		for (int i = 1; i <= n; i++) {  // Row loop
            for (int j = 1; j <= cols; j++) {  // Column loop
                // Print '*' at specific positions to create a zig-zag effect
                if ((i + j) % 4 == 0 || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // Move to next linentln();
		}
	}
}
