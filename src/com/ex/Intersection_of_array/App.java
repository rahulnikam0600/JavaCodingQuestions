package com.ex.Intersection_of_array;

import java.util.Arrays;
import java.util.List;

//Find Intersection of Two Arrays

public class App {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,6,7,8,5,6,8,9);
		List<Integer> result = Arrays.asList(2,3,16,17,18,15,6,8,9);
		
		numbers.stream()
			.filter(e -> result.contains(e))
			.distinct()
			.forEach(e -> System.out.print(e+" "));
	}
}
