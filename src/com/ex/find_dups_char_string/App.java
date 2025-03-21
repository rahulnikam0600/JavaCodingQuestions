package com.ex.find_dups_char_string;

import java.util.Map;
import java.util.stream.Collectors;

//Find the duplicate characters from given string

public class App {

	public static void main(String[] args) {
		String text = "Programming";
		
		text.toLowerCase().chars()
			.mapToObj(ch -> (char)ch)
			.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> e.getValue() > 1)
			.distinct()
			.map(Map.Entry::getKey)
			.forEach(System.out::println);
	}
}
