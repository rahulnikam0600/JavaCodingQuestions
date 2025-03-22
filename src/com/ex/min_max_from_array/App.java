package com.ex.min_max_from_array;

import java.util.Arrays;

//Find Largest and Smallest in Array

public class App {

	public static void main(String[] args) {
		
		var numbers = Arrays.asList(3,4,-5,7,1,2,8,9,61,7);
		
		var min = numbers.stream()
				.min((e1, e2) -> e1.compareTo(e2))
				.orElse(0);
		
		var max = numbers.stream()
				.max((e1, e2) -> e1.compareTo(e2))
				.orElse(0);
		
		System.out.println("Min = "+min+" Max = "+max);
	}
	
}
