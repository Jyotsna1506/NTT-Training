import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);

		Iterator itr = ll.iterator();
		while (itr.hasNext() == true) {
			System.out.println(itr.next());
		}
		ListIterator litr = ll.listIterator();
		while (litr.hasNext() == true) {
			System.out.println(litr.next());
		}
		System.out.println();

		ListIterator ritr = ll.listIterator(ll.size());
		while (ritr.hasPrevious() == true) {
			System.out.println(ritr.previous());

		}
		System.out.println();

		Iterator ditr = ll.descendingIterator();
		while (ditr.hasNext() == true) {
			System.out.println(ditr.next());
		}
	}

}
