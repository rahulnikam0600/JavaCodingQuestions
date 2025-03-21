package com.ex.check_if_all_digits;

public class App {

	public static void main(String[] args) {
		String str = "89798";
		boolean isDigits = true;
		
		if(str == null || str.isEmpty() || str.isBlank())
			isDigits = false;
		else {
			for(char c : str.toCharArray()) {
				if(!Character.isDigit(c)) {
					isDigits = false;
					break;
				}
			}
		}
		System.out.println(str+(isDigits ? " is digit":" is not digits"));
	}
}
