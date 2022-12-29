import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Employee {
	String name;
	int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ",age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class CompareEmployee implements Comparator<Employee> {
	public int compare(Employee x, Employee y) {
		// if (x.getAge() > y.getAge()) {
		// return +1;
		// } else if (x.getAge() < y.getAge()) {
		// return -1;
		// } else {
		// return 0;
		// }
		return (x.getName().compareTo(y.getName()));
	}
}

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s1 = new Employee("Ram", 21);
		Employee s2 = new Employee("Sita", 20);
		Employee s3 = new Employee("Maruti", 22);
		Employee s4 = new Employee("Ravan", 25);

		CompareEmployee es = new CompareEmployee();
		TreeSet<Employee> ts = new TreeSet<Employee>(es);
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