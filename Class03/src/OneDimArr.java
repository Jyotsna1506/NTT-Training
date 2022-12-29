import java.util.Scanner;

public class OneDimArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println("Enter the elements:");
			a[i] = scan.nextInt();
		}
		for (int i = 0; i <= a.length - 1; i++) {
			//System.out.println("The elements are:");
			System.out.println(a[i]);
		}

	}

}