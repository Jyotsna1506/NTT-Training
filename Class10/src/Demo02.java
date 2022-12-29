import java.util.ArrayList;
import java.util.Collections;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(50);
		al.add(90);
		al.add(125);
		al.add(5);

		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
		System.out.println(Collections.frequency(al, 10));
		Collections.replaceAll(al, 10, 999);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.swap(al, 1, 2);
		System.out.println(al);
	}

}