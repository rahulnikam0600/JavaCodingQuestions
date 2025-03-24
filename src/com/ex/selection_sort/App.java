package com.ex.selection_sort;

//Selection sort
//Find the smallest number and insert it  at start then second .....

public class App {

	public static void main(String[] args) {
		
		int[] arr = {4,7,5,3,2,8,9,1,6,10};
		
		for(int i = 0; i < arr.length; i++) {
			int indexOfSmallest  = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[indexOfSmallest])
					indexOfSmallest = j;
			}
			int temp = arr[i];
			arr[i] = arr[indexOfSmallest];
			arr[indexOfSmallest] = temp;
		}
		for(var x: arr) System.out.print(x +" ");
	}
}
