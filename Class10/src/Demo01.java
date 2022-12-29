import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1[] = { "Raj", "Ramu", "Rohan", "Abi" };
		String str2[] = { "Ram", "Sita", "Maruti", "Ravan" };
		String str3[] = { "Rohan", "Ram", "Sita", "Abi" };

		//TreeSet ts = new TreeSet();//sorted order (Duplicates not allowed)
		LinkedHashSet ts = new LinkedHashSet();// Insertion order (Duplicates not allowed)
		for (int i = 0; i < str1.length; i++) {
			ts.add(str1[i]);
		}
		for (int i = 0; i < str2.length; i++) {
			ts.add(str2[i]);
		}
		for (int i = 0; i < str3.length; i++) {
			ts.add(str3[i]);
		}
		Iterator itr = ts.iterator();
		while (itr.hasNext() == true) {
			System.out.println(itr.next());
		}
	}

}