import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student {
	String name;
	int id;

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ",id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

class CompareStudent implements Comparator<Student> {
	public int compare(Student x, Student y) {
		if (x.getId() > y.getId()) {
			return +1;
		} else if (x.getId() < y.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Ram", 21);
		Student s2 = new Student("Sita", 20);
		Student s3 = new Student("Maruti", 22);
		Student s4 = new Student("Ravan", 25);

		CompareStudent cs = new CompareStudent();
		TreeSet<Student> ts = new TreeSet<Student>(cs);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		Iterator itr = ts.iterator();
		while (itr.hasNext() == true) {
			System.out.println(itr.next());
		}

	}

}