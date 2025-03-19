package com.ex.check_number_palindrome;

public class App {

	public static void main(String[] args) {
		int num = 235532;
		int temp = num;
		int result = 0;
		while(temp > 0) {
			result *= 10;
			result += temp%10;
			temp /= 10;
		}
		System.out.println(num + ((num == result) ? " is Palindrome!" : " is not Palindrome!"));
	}
}
