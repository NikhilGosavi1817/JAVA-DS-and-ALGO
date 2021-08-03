package comparatorsAndComparables;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(18, "Virat"));
		students.add(new Student(17, "ABD"));
		students.add(new Student(32, "Maxi"));
		students.add(new Student(3, "Yuzi"));

//		Collections.sort(students, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				if (o1.name.equals(o2.name)) {
//					return o1.marks - o2.marks;
//				} else {
//					return o1.name.compareTo(o2.name);
//				}
//			}
//		});

//		Collections.sort(students, (o1, o2) -> {
//			if (o1.name.equals(o2.name)) {
//				return o1.marks - o2.marks;
//			} else {
//				return o1.name.compareTo(o2.name);
//			}
//		});

//		Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));

		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());

		students.forEach(System.out::println);
	}

}

//class SortByNameThenMarks implements Comparator<Student> {
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		if (o1.name.equals(o2.name)) {
//			return o1.marks - o2.marks;
//		} else {
//			return o1.name.compareTo(o2.name);
//		}
//	}
//
//}