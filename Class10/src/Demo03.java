import java.util.ArrayList;
import java.util.Collections;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		ArrayList al2 = new ArrayList();
		al2.add(60);
		al2.add(70);
		al2.add(80);
		al2.add(90);
		al2.add(100);

		System.out.println(al);
		System.out.println(al2);

		boolean status = Collections.disjoint(al, al2);
		System.out.println(status);
		al2.add(10);
		status = Collections.disjoint(al, al2);
		System.out.println(status);
		System.out.println(al);
		System.out.println(al2);
		
		Collections.rotate(al, 3);
		System.out.println(al);
		
	}

}
//only same datatype functions is avaiable in arraylist.