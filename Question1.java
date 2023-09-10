package com.streams;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
	public static void main(String []args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Integer sum = list.stream().reduce(0,(num1,num2)->num1+num2);
		System.out.println(sum);
	}
}
