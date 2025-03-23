package com.ex.rotate_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Rotate an Array to the Right

public class App {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,6,7,8,5,6,8,9);
		int k = 4;
		
		//Rotate Left
		int l = k % numbers.size();
		var left = numbers.stream().skip(l).collect(Collectors.toList());
		left.addAll(numbers.stream().limit(l).collect(Collectors.toList()));
		
		System.out.println(left);
		
		//Rotate Right
		int r = numbers.size() - (k % numbers.size());
		var right = numbers.stream().skip(r).collect(Collectors.toList());
		right.addAll(numbers.stream().limit(r).collect(Collectors.toList()));
		
		System.out.println(right);
		
	}
}
