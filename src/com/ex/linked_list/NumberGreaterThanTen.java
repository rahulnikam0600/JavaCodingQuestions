package com.ex.linked_list;

import java.util.Arrays;
import java.util.List;

public class NumberGreaterThanTen {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3,34,6,8,12,3,67,89);
		
		numbers.stream()
			.filter(e -> e > 10)
			.forEach(e -> System.out.print(e+" "));
	}
}
