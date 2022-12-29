import java.util.StringTokenizer;

public class StrToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Raja,Ram,Mohan,Roy";
		StringTokenizer stk = new StringTokenizer(s1, ",");
		while (stk.hasMoreElements() == true) {
			String token = stk.nextToken();
			System.out.println(token);
		}

	}

}

/*(s1, ",") in this instead of "," we can give any elements present in the string.
 * It will tokenize from that element.*/