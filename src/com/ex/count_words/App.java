package com.ex.count_words;

import java.util.Arrays;

//Count Words in a String

public class App {

	public static void main(String[] args) {
		
		String text = "Count Words in a String!";
		
		var result = Arrays.asList(text.split("\\W+")).stream()
				.count();
		
		System.out.println("No of words = "+result);
	}
}
