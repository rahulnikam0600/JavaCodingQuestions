package com.ex.insertion_sort;

//Insertion sort
//select the element from 2nd position and insert it to its right at its required position

public class App {

	public static void main(String[] args) {
		
		int[] arr = {4,7,5,3,2,8,9,1,6,10};
		
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		
		for(var x : arr) System.out.print(x+" ");
		
	}
}
