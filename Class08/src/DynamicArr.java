import java.util.Scanner;
import java.util.Vector;

public class DynamicArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		Scanner scan = new Scanner(System.in);
		int i, choice, data;
		i = 0;
		do {
			System.out.println("Enter an element: ");
			data = scan.nextInt();
			v.add(data);
			System.out.println("Do you want to continue:");
			System.out.println("1. Yes");
			System.out.println("2. No");
			choice = scan.nextInt();
		} while (choice == 1);

		System.out.println(v);
	}

}