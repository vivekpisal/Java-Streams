package com.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Question6 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);list.add(1);
		list.add(2);list.add(4);
		list.add(1);list.add(2);
		Map<Integer, Integer> map = new HashMap<>();
		for(int i:list) {
			map.put(i,map.getOrDefault(i,0)+1);
		}
		Set<Integer> set = list.stream().filter(num -> map.containsKey(num) && map.get(num) > 1).collect(Collectors.toSet());
		System.out.println(set);
	}
}
