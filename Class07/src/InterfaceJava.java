interface Compute {
	void add();

	void sub();
}

class Demo implements Compute {
	public void add() {
		int a, b, c;
		a = 10;
		b = 20;
		c = a + b;
		System.out.println("The sum is: " + c);
	}

	public void sub() {
		int x, y, z;
		x = 100;
		y = 85;
		z = x - y;
		System.out.println("The difference is: " + z);
	}

	void mul() {
		int a, b, c;
		a = 20;
		b = 10;
		c = a * b;
		System.out.println("The product is: " + c);
	}
}

public class InterfaceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1;
		d1 = new Demo();
		Compute ref;
		ref = d1;

		ref.add();
		ref.sub();
		((Demo) (ref)).mul();// Downcasting method for making mul to work even if it is not in the Compute
								// method.

	}

}