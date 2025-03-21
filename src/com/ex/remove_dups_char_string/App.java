package com.ex.remove_dups_char_string;

import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		String text = "Programming";
		
		var charArr = text.toLowerCase().chars()
				.mapToObj(ch -> (char)ch)
				.distinct()
				.collect(Collectors.toList());
		
		String result = "";
		for(char c:charArr) {
			result += c;
		}
		
		System.out.println(result);
	}
}
