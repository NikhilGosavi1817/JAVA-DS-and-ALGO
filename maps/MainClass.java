package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {

//		Map<String, Integer> numbers = new HashMap<>();
//
//		numbers.put("one", 1);
//		numbers.put("two", 2);
//		numbers.put("three", 3);
//
//		numbers.remove("two");
//		numbers.remove("two", 2);
//
//		numbers.putIfAbsent("one", 10);
//
//		System.out.println(numbers);
//		System.out.println(numbers.get("one"));
//		System.out.println(numbers.containsKey("one"));
//		System.out.println(numbers.containsValue(1));
//		System.out.println(numbers.keySet());
//		System.out.println(numbers.values());
//		System.out.println(numbers.entrySet());
//
//		Set<Entry<String, Integer>> entries = numbers.entrySet();
//
//		for (Entry<String, Integer> entry : entries) {
//			entry.setValue(entry.getValue() * 100);
//		}
//		System.out.println(numbers);

		System.out.println(getHash("CAT"));
	}

	public static int getHash(String s) {
		int Hash = 0;
		for (int i = 0; i < s.length(); i++) {
			Hash += s.charAt(i);
		}
		return Hash;
	}
}
