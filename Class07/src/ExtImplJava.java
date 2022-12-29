class Calculator {
	void add() {
		int a, b, c;
		a = 10;
		b = 20;
		c = a + b;
		System.out.println("The sum is: " + c);
	}
}

interface Computes {
	public void sub();
}

class AdvCompute extends Calculator implements Computes {
	public void sub() {
		int x, y, z;
		x = 100;
		y = 85;
		z = x - y;
		System.out.println("The difference is: " + z);
	}
}

public class ExtImplJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		AdvCompute ac = new AdvCompute();

		c.add();
		ac.sub();

	}

}