/*Customer exception: ALessThanBException
 * 1. The class must extend the exception class.
 * 2. The class must directly or indirectly related to the throwable class.*/

import java.util.Scanner;

class ALessThanBException extends Exception {
	public String getMessage() {
		//System.out.println("Error in input...a<b");
		return "Error in input...a<b";
	}
}

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter a: ");
		a = scan.nextInt();
		System.out.println("Enter b: ");
		b = scan.nextInt();
		try {
			if (a > b) {
				c = a - b;
				System.out.println("Difference is: " + c);
			} else {
				throw new ALessThanBException();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//System.out.println("Subtraction not possible");
		}
		System.out.println("Exiting main normally");
	}

}