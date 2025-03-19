package com.ex.swap_numbers;

public class App {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//swap numbers using temp variable
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = "+a+" & b = "+b);
		
		//swap numbers using addition and subtraction
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = "+a+" & b = "+b);
		
		//swap numbers using multiplication and division
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("a = "+a+" & b = "+b);
	}
}
