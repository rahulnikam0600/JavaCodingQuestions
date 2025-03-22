package com.ex.second_largest_number;

import java.util.Arrays;

//Find Second Largest Number

public class App {

	public static void main(String[] args) {
		var numbers = Arrays.asList(3,4,-5,7,1,2,8,9,61,7);
		
		var secondMax = numbers.stream()
			.distinct()
			.sorted((e1, e2) -> e2.compareTo(e1))
			.skip(1)
			.findFirst()
			.orElse(-1);
		
		System.out.println(secondMax);
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for(int x: numbers) {
			if(max < x) {
				secMax = max;
				max = x;
			}
		}
		System.out.println(secMax);
	}
}
