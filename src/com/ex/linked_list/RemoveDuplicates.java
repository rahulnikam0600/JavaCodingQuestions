package com.ex.linked_list;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		var numbers = new LinkedList<>(Arrays.asList(3,4,5,7,8,4,2,2,1));
		
		numbers.stream()
			.distinct()
			.forEach(e -> System.out.print(e+" "));
		
	}
}
