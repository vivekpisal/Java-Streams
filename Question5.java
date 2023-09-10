package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);list.add(4);
		list.add(20);list.add(200);
		list.add(5);
		List<Integer> startWith2 = list.stream().filter(num -> num.toString().startsWith("2")).collect(Collectors.toList());
		System.out.println(startWith2);
	}
}
