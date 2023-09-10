package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {
	public static void main(String []args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);list.add(2);
		list.add(3);list.add(4);
		list.add(5);list.add(6);
		List<Integer> even = list.stream().filter(num -> num%2==0).collect(Collectors.toList());
		List<Integer> odd = list.stream().filter(num -> num%2!=0).collect(Collectors.toList());
		System.out.println(even);
		System.out.println(odd);
	}
}
