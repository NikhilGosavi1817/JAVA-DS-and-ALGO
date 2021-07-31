package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

//		Set<String> fruits = new HashSet<>();
//
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Kiwi");
//
//		System.out.println(fruits);

		Set<Integer> x = new HashSet<>();
		x.add(18);
		x.add(37);
		x.add(3);
		x.add(73);

		Set<Integer> y = new HashSet<>();
		y.add(17);
		y.add(32);
		y.add(12);
		y.add(3);

		x.addAll(y);
		x.retainAll(y);

		System.out.println(x.containsAll(y));
		System.out.println(x);

	}

}
