package com.ex.bubble_sort;

//Bubble sort

public class App {

	public static void main(String[] args) {
		
		int[] arr = {4,7,5,3,2,8,9,1,6,10};
		
		for(int i = 0; i < arr.length; i++) {
			boolean swapped = false;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			if(!swapped) break;
		}
		for(int x: arr) {
			System.out.print(x+" ");
		}
	}
}
