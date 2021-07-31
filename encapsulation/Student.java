package encapsulation;

public class Student {

	private int age;
	String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 20) {
			System.out.println("your age exceeds");
		} else {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
