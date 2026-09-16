package CIET;
class Student {
	private String name;
	private int age;
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getName() { // need to place return
		return name;
	}
	int getAge() {
		return age;
	}
}
public class encapsulation {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Ram koteswara Rao");
		s.setAge(21);
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}
}
