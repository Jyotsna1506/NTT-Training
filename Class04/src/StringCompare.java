import java.util.*;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = "ccde";
		String s2 = "ccda";

		int m = s1.compareTo(s2);
		System.out.println("The value of m is: " + m);
		if (m == 0) {
			System.out.println("S1 is equal to s2");
		} else if (m > 0) {
			System.out.println("s1 is greater than s2");
		} else {
			System.out.println("s1 is lesser than s2");
		}

	}

}