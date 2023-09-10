package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Question7 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);list.add(2);
		list.add(3);list.add(4);
		list.add(5);list.add(6);
		Optional<Integer> max = list.stream().max((i,j)->i-j);
		Optional<Integer> min = list.stream().min((i,j)->i-j);
		System.out.println(max.get());
		System.out.println(min.get());
	}
}
