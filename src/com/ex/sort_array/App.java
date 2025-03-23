package com.ex.sort_array;

//Sort Array Without Using Built-in Functions

public class App {

	public static void main(String[] args) {
		int[] arr = {2,4,6,9,7,8,1,3,5};
		
		for(int i= 0; i < arr.length; i++) {
			for(int j= i+1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int x: arr) {
			System.out.print(x+ " ");
		}
	}
}
