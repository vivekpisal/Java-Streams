package com.streams;

import java.util.ArrayList;
import java.util.List;

public class Question3 {
	public static void main(String []args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);list.add(11);list.add(9);
		list.add(2);list.add(12);list.add(15);
		int sum = list.stream().map(num -> num*num).filter(num -> num > 100).reduce(0,(num1,num2)-> num1+num2);
		int count = (int) list.stream().map(num -> num*num).filter(num -> num > 100).count();
		System.out.println(sum/count);
	}
}
