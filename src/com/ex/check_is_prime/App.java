package com.ex.check_is_prime;

public class App {
	public static void main(String[] args) {
		int n = 68;
		System.out.println(isPrime(n) ? (n+" is Prime"):(n + " is not Prime"));
		
	}
	public static boolean isPrime(int x) {
		
		for(int i = 2; i <= x/2; i++) {
			if(x%i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
