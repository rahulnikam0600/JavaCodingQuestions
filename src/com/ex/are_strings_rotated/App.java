package com.ex.are_strings_rotated;

//Check if Two Strings are Rotations of Each Other

public class App {

	public static void main(String[] args) {
		
		String text1 = "Hello";
		String text2 = "Lohel";
		System.out.print(text1 + " & "+ text2);
		text1 = text1.toLowerCase().concat(text1.toLowerCase());
		if(text1.length()/2 == text2.length() && text1.contains(text2.toLowerCase())) {
			System.out.println(" Are Rotation of each-other!");
		}
		else {
			System.out.println(" Are not Rotation of each-other!");
		}
		
	}
}
