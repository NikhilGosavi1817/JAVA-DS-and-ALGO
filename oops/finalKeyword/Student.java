package oops.finalKeyword;

public final class Student {

	int rollNo;
	String name;
	
	public final void getDescription() {
		System.out.println("The student name is "+name);
	}
	
//	final int rollNo;
//	final String name;
//
//	{
//		rollNo = 18;
//	}
//
//	public Student() {
//		name = "VIRAT";
//	}
}