import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		String s;
		int i, j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		s = scan.next();

		int m = s.length();
		char org[] = new char[m];
		char rev[] = new char[m];

		for (i = 0; i <= m - 1; i++) {
			org[i] = s.charAt(i);
		}
		i = m - 1;
		j = 0;
		while (i >= 0) {
			rev[j] = org[i];
			i--;
			j++;
		}
		for (i = 0; i <= m - 1; i++) {
			if (org[i] == rev[i]) {
				continue;
			} else {
				System.out.println("It is not a Palindrome.");
				System.exit(0);
			}
		}
		System.out.println("It is a Palindrome.");
	}

}