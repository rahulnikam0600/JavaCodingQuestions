package com.ex.first_nonrepeat_char;

import java.util.Collections;
import java.util.stream.Collectors;

//Find First Non-Repeating Character

public class App {

	public static void main(String[] args) {
		
		String text = "swiss";
		
		var charList = text.toLowerCase().chars()
			.mapToObj(ch -> (char)ch)
			.collect(Collectors.toList());
		
		charList.stream()
			.filter(ch -> Collections.frequency(charList, ch) == 1)
			.limit(1)
			.forEach(System.out::println);
	}
}
