import java.io.IOException;
import java.util.Scanner;

public class CharCnt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s;
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		s = scan.nextLine();
		System.out.println("Enter a character:");
		ch = (char) System.in.read();
		char arr[] = s.toCharArray();
		int count = 0, i, m;
		m = s.length();
		for (i = 0; i <= m - 1; i++) {
			if (arr[i] == ch) {
				count++;
			}
		}
		System.out.println("The count is: " + count);
	}

}