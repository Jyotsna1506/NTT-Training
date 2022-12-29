class Student {
	String name;
	int age;
	float height;

	public void setData(String name, int age, float height) {
		// TODO Auto-generated method stub
		this.name = name;
		this.age = age;
		this.height = height;

	}
}

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setData("Ramu", 21, 5.5f);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		System.out.println();
	}

}