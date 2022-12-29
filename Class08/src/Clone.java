import java.util.Vector;

public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);

		Vector v1 = (Vector) v.clone();
		System.out.println(v);
		System.out.println(v1);
		v1.add(60);
		v1.add(70);
		System.out.println();
		System.out.println(v);
		System.out.println(v1);
		System.out.println();
		System.out.println(v1.contains(50));
		System.out.println(v1.contains(120));
		System.out.println();
		System.out.println(v1.containsAll(v1));
		System.out.println(v.containsAll(v1));
	}

}