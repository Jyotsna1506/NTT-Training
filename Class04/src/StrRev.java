import java.util.*;

public class StrRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the statement:");
		s1 = scan.nextLine();
		int m = s1.length();
		char arr[] = s1.toCharArray();

		for (i = m - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}