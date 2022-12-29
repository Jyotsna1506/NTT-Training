import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		Iterator itr = al.iterator();
		while (itr.hasNext() == true) {
			System.out.println(itr.next());
		}
		System.out.println();

		ListIterator litr = al.listIterator();
		while (litr.hasNext() == true) {
			System.out.println(litr.next());
		}
		System.out.println();

		ListIterator ritr = al.listIterator(al.size());
		while (ritr.hasPrevious() == true) {
			System.out.println(ritr.previous());

		}
	}
}
