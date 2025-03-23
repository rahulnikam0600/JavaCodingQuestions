package com.ex.find_mejority;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Find Majority Element in an Array

public class App {

	public static void main(String[] args) {
		int[] arr = {3, 3, 4, 2, 3, 3, 3, 2, 4};
		int mejorityLimit = (arr.length % 2 == 0) ? arr.length/2 :(arr.length/2) + 1;
		int major = -1;
		
		outer:
		for(int i=0; i < arr.length/2;i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count >= mejorityLimit)
				major = arr[i];
				break outer;
		}
		System.out.println(major == -1  ? "Not Found":major);
		
		
		//By using stream API
		List<Integer> arrayList = new ArrayList<>();
		for(var a: arr)
			arrayList.add(a);
		
		var result = arrayList.stream()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() >= mejorityLimit)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList())
				.getFirst();
		System.out.println(result);
 	}
}
