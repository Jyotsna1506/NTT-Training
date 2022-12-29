import java.util.Scanner;

/*Throwing exception manually
 * 1. Create an exception object using exception class constructor.
 * 2. Throw the exception object using the "throw" keyword.
 * 3.  The newly created object can be caught using the "catch" block.
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = scan.nextInt();
		System.out.println("Enter b: ");
		b = scan.nextInt();
		try {
			if (a >= b) {
				c = a - b;
				System.out.println(c);
			} else {
				// Exception e = new Exception();
				// throw e;
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Subraction not possible");
		}
		System.out.println("Exiting main normally");
		scan.close();
	}

}