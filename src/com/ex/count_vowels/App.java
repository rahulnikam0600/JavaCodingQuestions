package com.ex.count_vowels;

public class App {

	public static void main(String[] args) {
		String text = "Hellow World! 007 agent";
		text = text.toLowerCase();
		int vowel = 0;
		int consonent = 0;
		for(char ch : text.toCharArray()) {
			if(ch >= 'a' && ch <= 'z') {
				if("aeiou".indexOf(ch) != -1)
					vowel++;
				else {
					consonent++;
				}
			}
		}
		System.out.println("Vowels = "+vowel+" Consonent = "+consonent);
	}
}
