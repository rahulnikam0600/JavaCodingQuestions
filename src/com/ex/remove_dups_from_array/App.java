package com.ex.remove_dups_from_array;

import java.util.Arrays;

//Remove Duplicates from an Array

public class App {

	public static void main(String[] args) {
		
		var numbers = Arrays.asList(3,4,-5,7,1,2,8,9,61,7);
		
		numbers.stream()
			.distinct()
			.forEach(e -> System.out.print(e +" "));
	}
}
