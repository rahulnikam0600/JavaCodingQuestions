package com.ex.linked_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		
		var numbers = Arrays.asList(3,4,5,7,8,4,2,2,1);
		
		numbers.stream()
			.filter(e -> Collections.frequency(numbers, e) > 1)
			.distinct()
			.forEach(e -> System.out.print(e+" "));
	}
}
