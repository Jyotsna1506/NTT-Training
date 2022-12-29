class Student {
	String name;
	int age;
	float height;

	Student() {
		name = null;
		age = 0;
		height = 0.0f;
	}

	Student(String s, int a, float h) {
		name = s;
		age = a;
		height = h;
	}
}

public class StudentApp {
	public static void main(String[] args) {
		Student s1;
		s1 = new Student("Rama", 18, 5.5f);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		System.out.println();

		Student s2;
		s2 = new Student(/*"Sita", 18, 4.5f*/);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.height);
	}
}