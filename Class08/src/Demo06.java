import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		Scanner scan = new Scanner(System.in);
		int i, choice;
		i = 0;
		do {
			System.out.println("Enter an element: ");
			a[i] = scan.nextInt();
			i++;
			System.out.println("Do you want to continue:");
			System.out.println("1. Yes");
			System.out.println("2. No");
			choice = scan.nextInt();
		} while (choice == 1);
		for (i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
	}

}