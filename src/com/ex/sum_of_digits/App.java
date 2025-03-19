package com.ex.sum_of_digits;

public class App {

	public static void main(String[] args) {
		int num = 7854;
		int sum = 0;
		while(num != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}
}
