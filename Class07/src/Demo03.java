public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entering main");
		Demo02 d1 = new Demo02();
		try {
			d1.fun1();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception caught in main");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception caught in main");
		} catch (Exception e) {
			System.out.println("Problem deviation caught in main");
		}
		System.out.println("Exiting main");
	}
}

class Demo02 {
	void fun1() {
		System.out.println("Inside fun1");
		try {
			fun2();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception caught in fun1");
			throw e;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception caught in fun1");
			throw e;
		} catch (Exception e) {
			System.out.println("Problem deviation caught in fun1");
			throw e;
		}
	}

	void fun2() {
		System.out.println("Inside fun2");
		try {
			int a, b, c;
			a = 10;
			b = 0;
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception caught in fun2");
			throw e;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception caught in fun2");
			throw e;
		} catch (Exception e) {
			System.out.println("Problem deviation caught in fun2");
			throw e;
		}
	}
}