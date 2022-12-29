import java.util.Vector;

public class Demo01 {

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
		v.insertElementAt(99, 3);
		System.out.println(v);
		v.setElementAt(99, 1);
		System.out.println(v);
		v.removeElementAt(4);
		//v.removeAllElements();
		//System.out.println(v);
		v.setSize(15);
		System.out.println(v.size());
		v.setSize(6);
		System.out.println(v.size());
		System.out.println(v);
	}

}
