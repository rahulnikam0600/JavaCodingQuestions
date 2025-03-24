package com.ex.linear_search;

public class App {

	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int x = 52;
		var result = linearSearch(arr, x);
		System.out.println(result == -1 ? "Not Found" : "Found at index "+result);
	}
	
	public static int linearSearch(int[] arr, int target) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target)
				return i;
		}
		return -1;
	}
}
