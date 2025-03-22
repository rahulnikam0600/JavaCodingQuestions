package com.ex.missing_from_array;

import java.util.Arrays;
import java.util.stream.IntStream;

//Find Missing Number in an Array (1 to N)

public class App {

	public static void main(String[] args) {
		var numbers = Arrays.asList(3,4,-5,7,1,2,10,9,6,7);
		int n = 10;
		
		IntStream.range(1, n)
			.filter(e -> !numbers.contains(e))
			.forEach(e -> System.out.print(e+" "));
	}
}
