//Without using inbuilt method
import java.util.*;

public class StrToArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Rama";
		int m = s1.length();
		char arr[] = new char[m];
		for (int i = 0; i <= m - 1; i++) {
			arr[i] = s1.charAt(i);
		}
		System.out.println("String Format: " + s1);
		System.out.println();
		System.out.println("Array Format:");
		for (int i = 0; i <= m - 1; i++) {
			System.out.println(arr[i]);
		}
	}

}
//with using inbuilt method
//char arr[] = s1.toCharArray();