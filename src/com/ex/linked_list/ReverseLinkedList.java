package com.ex.linked_list;

import java.util.Arrays;

public class ReverseLinkedList {

	public static void main(String[] args) {
		var numbers = Arrays.asList(3,4,5,7,8,4,2,2,1);
		var result = numbers.reversed();
		System.out.println(result);
	}
}
