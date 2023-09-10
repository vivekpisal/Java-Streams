package com.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);list.add(12);
		list.add(3);list.add(23);
		list.add(2);list.add(45);
		List<Integer> descOrder = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		List<Integer> ascOrder = list.stream().sorted().collect(Collectors.toList());
		System.out.println(descOrder);
		System.out.println(ascOrder);
	}
}
