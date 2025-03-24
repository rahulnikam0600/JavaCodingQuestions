package com.ex.binary_search;

public class App {

	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int x = 8;
		var result = binarySearch(arr, x);
		System.out.println(result == -1 ? "Not Found" : "Found "+result);
	}
	
	public static int binarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		while(start <= end) {
			int mid = start +(end - start)/2;
			
			if(arr[mid] == target) {
				return target;
			}
			else if(arr[mid] < target) {
				start = mid + 1;
			}
			else {
				end = mid -1;
			}
		}
		
		return -1;
	}
}
