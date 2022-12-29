class Student2 {
	String name;
	int age;
	float height;
	Student2(){
		name = null;
		age = 0;
		height = 0.0f;
	}

	void setData(String s, int a, float h) {
		name = s;
		age = a;
		height = h;
	}
}

public class StudentApp1 {

	public static void main(String[] args) {
		Student2 s1 = new Student2();
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
	}
}