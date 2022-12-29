import java.util.Vector;

public class Demo07 {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println();
		v.add(60);
		v.add(70);
		v.add(80);
		v.add(90);
		v.add(100);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println();
		v.add(110);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println();
	}
}
// NOTE:
// when the size and the capacity values becomes equal,
// i.e 10 10, then next when we add a value to the size,
// now the capacity value becomes double.
// thats why we are getting the output after 10 10 is 20 11.
//A vector can hold heterogeneous data.( i.e) multiple data type od datas in same list.
//Ex. v.add(10);
//v.add("Ram");
//v.add(1.12);......