import java.util.Scanner;
import java.util.StringTokenizer;

public class CntNoOfWrds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a statement:");
		s1 = scan.nextLine();
		StringTokenizer stk = new StringTokenizer(s1, " ");
		int count = 0;
		while (stk.hasMoreElements() == true) {
			String token = stk.nextToken();
			count++;
		}
		System.out.println(count);
	}
}