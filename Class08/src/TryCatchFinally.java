public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = 20;
		b = 0;
		try {
			System.out.println("Try executed");
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Catch executed");
		} finally {
			System.out.println("Finally executed");
		}
	}

}