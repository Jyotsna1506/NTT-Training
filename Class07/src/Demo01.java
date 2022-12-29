public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entering main");
		Demo0 d1 = new Demo0();
		try {
			d1.fun1();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		System.out.println("Exiting main");
	}
}

class Demo0 {
	void fun1() {
		System.out.println("Inside fun1");
		fun2();
	}

	void fun2() {
		System.out.println("Inside fun2");
		int a, b, c;
		a = 10;
		b = 0;
		c = a / b;
		System.out.println(c);
	}
}