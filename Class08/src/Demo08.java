import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Demo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);
		System.out.println();
		for (int i = 0; i <= v.size() - 1; i++) {
			System.out.println(v.get(i));
		}
		Iterator itr = v.iterator();
		System.out.println();
		while (itr.hasNext() == true) {
			System.out.println(itr.next());
		}
		ListIterator litr = v.listIterator();
		System.out.println();
		while (litr.hasNext() == true) {
			System.out.println(litr.next());
		}
		Enumeration e = v.elements();
		System.out.println();
		while (e.hasMoreElements() == true) {
			System.out.println(e.nextElement());
		}

	}

}