package com.ex.string_anagrams;

import java.util.Arrays;

public class App {
	
	public static void main(String[] args) {
		String text1 = "Listen";
		String text2 = "Silent";
		
		text1 = text1.replaceAll("\\s", "").toLowerCase();
		text2 = text2.replaceAll("\\s", "").toLowerCase();
		
		var arr1 = text1.toCharArray();
		var arr2 = text2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.print(text1+" & "+ text2 + (Arrays.equals(arr1, arr2) ? " is anagram!" : " is not anagram!"));
	}

}
