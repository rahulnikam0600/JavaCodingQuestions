package com.ex.linked_list;

import java.util.Arrays;

public class FindEvenNumbers {

	public static void main(String[] args) {
		var numbers = Arrays.asList(3,4,5,7,8,4,2,2,1);
		numbers.stream()
			.filter(e -> e%2 == 0)
			.forEach(e-> System.out.print(e+" "));
	}
}
