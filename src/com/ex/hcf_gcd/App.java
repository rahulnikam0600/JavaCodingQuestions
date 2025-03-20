package com.ex.hcf_gcd;

//GCD(a,b) = GCD(b, a mod b)

public class App {

	public static void main(String[] args) {
		int a = 56;
		int b = 98;
		
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		System.out.println(a);
	}
}
