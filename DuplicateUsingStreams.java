package set1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateUsingStreams {
	public static void populateData(List<String> list) {
		list.add("java");list.add("spring");list.add("java");list.add("microservices");
		list.add("django");list.add("spring");list.add("jenkins");
	}
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		populateData(list);
		
		// Method 1
		Set<String> set = new HashSet<>();
		Set<String> duplicates = list.stream().filter((ele)-> !set.add(ele)).collect(Collectors.toSet());
		System.out.println(duplicates);
	
		// Method 2
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		Set<String> duplicates1 = map.keySet().stream().filter((ele)-> map.get(ele) > 1).collect(Collectors.toSet());
		System.out.println(duplicates1);
		
		// Method 3
		Set<String> duplicates2 = list.stream().filter(ele -> Collections.frequency(list, ele) > 1).collect(Collectors.toSet());
		System.out.println(duplicates2);
	}
}
