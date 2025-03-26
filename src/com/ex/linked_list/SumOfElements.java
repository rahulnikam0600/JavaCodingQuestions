package com.ex.linked_list;

import java.util.Arrays;

public class SumOfElements {

	public static void main(String[] args) {
		
		var numbers = Arrays.asList(3,4,5,7,8,4,2,2,1);
		
		var result = numbers.stream()
				.reduce((Sum,e) -> Sum = Sum+e)
				.get();
		
		System.out.println(result);
	}
}
