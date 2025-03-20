package com.ex.reverse_string;

public class App {

	public static void main(String[] args) {
		String word = "Rahul";
		String output = "";
		for(int i = word.length()-1; i >= 0; i--) {
			output += word.charAt(i);
		}
		System.out.println(output);
	}
}
