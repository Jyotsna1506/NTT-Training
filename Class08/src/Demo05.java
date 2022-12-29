public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entering main");
		try {
			System.out.println("Try executed");
			int a[] = new int[999999999];
		} catch (Exception e) {
			System.out.println("Exception Caught");
		} finally {
			System.out.println("Finally executed");
		}
		System.out.println("Exiting main");
	}
}