import java.util.TreeSet;

public class Demo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(100);
		ts.add(120);
		ts.add(90);
		ts.add(95);
		ts.add(80);
		ts.add(50);
		ts.add(30);
		ts.add(10);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.higher(80));
		System.out.println(ts.ceiling(90));
		System.out.println(ts.floor(60));
		System.out.println(ts.floor(35));
		System.out.println(ts.headSet(50));
		System.out.println(ts.tailSet(75));
		System.out.println(ts.subSet(20, 95));
	}

}
