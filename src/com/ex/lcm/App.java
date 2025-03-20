package com.ex.lcm;
/*
 * GCD(a,b) = GCD(b, a mod b)
 * LCM(a,b) = (a * b) / GCD(a,b)
 */
public class App {

	public static void main(String[] args) {
		int a = 56;
		int b = 98;
		int lcm = a * b / hcf(a, b);
		System.out.println(lcm);
	}
	
	static int hcf(int p, int q) {
		while( p != 0) {
			int temp = p;
			p = q % p;
			q = temp;
		}
		return q;
	}
}
