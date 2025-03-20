package com.ex.check_string_palindrome;

//Check if String is Palindrome
public class App {

	public static void main(String[] args) {
		String word = "Nayan";
		word = word.toLowerCase();
		int start = 0;
		int end = word.length()-1;
		boolean isPalindrome = true;
		while(start <= end) {
			if(word.charAt(start) != word.charAt(end)) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		System.out.println(word + (isPalindrome ? " is Palindrome!" : " is not Palindrome!"));
	}
}
