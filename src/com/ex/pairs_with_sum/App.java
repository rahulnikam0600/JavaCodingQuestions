package com.ex.pairs_with_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Find All Pairs with a Given Sum

public class App {

	public static void main(String[] args) {
		
		var numbers = Arrays.asList(5, -1, 3, 7, 6, 1, 5, -2, 3, 8);
		int sum = 6;
		List<List<Integer>> result = new ArrayList<>();
		
		for(int i= 0; i < numbers.size(); i++) {
			for (int j = i+1; j < numbers.size(); j++) {
				if(sum- numbers.get(i) == numbers.get(j)) {
					result.add(Arrays.asList(numbers.get(i),numbers.get(j)));
				}
			}
		}
		
		System.out.println(result);
		
	}
}
