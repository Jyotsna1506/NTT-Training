import java.util.Iterator;
import java.util.Vector;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);

		// Fail fast
		// int i;
		// for(i=0;i<=v.size()-1;i++) {
		// System.out.println(v.get(i));
		// v.add(99);
		// }
		// Fail safe: ConcurrentModificationException
		Iterator itr = v.iterator();
		while (itr.hasNext() == true) {
			System.out.println(itr.next());
			v.add(99);
		}
	}

}
