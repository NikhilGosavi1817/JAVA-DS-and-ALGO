package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List<String> fruit = new LinkedList<>();
		List<String> vegetables = new ArrayList<>();

		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Banana");
		Collections.reverse(fruit);

		String[] temp = new String[fruit.size()];
		fruit.toArray(temp);

		for (String e : temp) {
			System.out.println(e);
		}

//		fruit.set(1, "Guava");
//		fruit.remove(2);
//		fruit.clear();

//		List<String> toRemove = new ArrayList<>(); 
//		toRemove.add("Orange");

//		fruit.removeAll(toRemove);
//		System.out.println(fruit);
//		System.out.println(fruit.isEmpty());
//		System.out.println(fruit.contains("Apple"));
//		System.out.println(fruit.size());

//		vegetables.add("Potato");
//		vegetables.add("Onion");
//		vegetables.add("Tomato");
//
//		fruit.addAll(vegetables);

		System.out.println(fruit.get(2));

//		Pair<String, Integer> p1 = new Pair("VIRAT", 18);
//		Pair<String, Boolean> p2 = new Pair("SALMAN", true);
//
//		p1.getDescription();
//		p2.getDescription();
	}

}
