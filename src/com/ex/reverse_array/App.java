package com.ex.reverse_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

//Reverse an Array
public class App {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,6,7,8};
		
		int[] resultArray = new int[arr.length];
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			resultArray[j] = arr[i];
		}
		for(int i : resultArray) System.out.print(i+" ");
	}
}
