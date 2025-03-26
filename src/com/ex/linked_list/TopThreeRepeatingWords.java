package com.ex.linked_list;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TopThreeRepeatingWords {

	public static void main(String[] args) {
		
		var text = "This is repeat word. Repeat word is get repeated in every sentence. Every sentence is having atleast one repeat word.";
		
		var result = Arrays.stream(text.split("\\W+"))
				.map(word -> word.toLowerCase())
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()))
				.entrySet()
				.stream()
				.sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
				.limit(3)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		
		System.out.println(result);
	}
}
