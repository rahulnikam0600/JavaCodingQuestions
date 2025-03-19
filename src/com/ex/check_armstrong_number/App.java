package com.ex.check_armstrong_number;

public class App {

	public static void main(String[] args) {
		
		int num = 153;
		int temp = num;
		int count =0;
		while(temp != 0) {
			temp /= 10;
			count++;
		}
		temp = num;
		int result = 0;
		/*
		while(temp != 0) {
			int x = temp % 10;
			int y = 1;
			temp /= 10;
			for(int i = 0; i < count;i++) {
				y *= x;
			}
			result += y;
		}
		*/
		
		while(temp != 0) {
			result += Math.pow(temp%10, count);
			temp /= 10;
		}
		
		
		System.out.println(num + (num == result ? " is Armstrong!" : " is not Armstrong"));		
	}
}
