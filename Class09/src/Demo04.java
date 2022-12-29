import java.util.LinkedList;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		ll.addFirst(50);
		ll.addFirst(70);
		System.out.println(ll);
		ll.offerFirst(80);
		ll.offerFirst(90);
		System.out.println(ll);
		ll.addLast(100);
		System.out.println(ll);
		System.out.println();
		System.out.println(ll.peekFirst());// return 1st element.
		System.out.println(ll.peekLast());// return last element.
		System.out.println(ll);
		System.out.println(ll.pollFirst());// return and remove 1st element. if list is empty it returns null.
		System.out.println(ll.pollLast());// return and remove last element. if list is empty it returns null.
		System.out.println(ll);
	}

}
//