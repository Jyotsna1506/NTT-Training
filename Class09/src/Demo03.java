import java.util.Vector;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		v1.add(50);
		System.out.println(v1);

		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(10);
		v2.add(20);
		v2.add(30);
		v2.add(40);
		v2.add(50);
		System.out.println(v2);

		Vector<Integer> v3 = new Vector<Integer>();
		v3.add(100);
		v3.add(20);
		v3.add(30);
		v3.add(40);
		v3.add(50);
		System.out.println(v3);
		System.out.println();
		v1.addAll(v2);
		System.out.println(v1);
		v2.retainAll(v3);
		System.out.println(v2);
	}

}
