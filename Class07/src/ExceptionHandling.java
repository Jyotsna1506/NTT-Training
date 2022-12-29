import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entering main");
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = scan.nextInt();
		System.out.println("Enter b: ");
		b = scan.nextInt();
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception");
		} catch (Exception e) {
			System.out.println("Problem deviation");
		}
		// System.out.println("Value of c is: " + c);
		System.out.println("Exiting main");

	}

}
// A try can have multiple catch blocks.