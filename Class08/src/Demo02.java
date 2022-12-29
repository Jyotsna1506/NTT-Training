public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = 10;
		b = 0;
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Exiting main");
	}

}
// the getMessage() will return what type of exception as a message