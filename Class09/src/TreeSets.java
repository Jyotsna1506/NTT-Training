import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Data inside treeset would be in a sorted manner.
		// Treeset does not allow duplicates
		TreeSet ts = new TreeSet();
		ts.add(90);
		ts.add(50);
		ts.add(10);
		ts.add(25);
		ts.add(90);
		ts.add(50);

		ts.add(90);
		ts.add(50);
		ts.add(10);
		ts.add(25);
		ts.add(90);
		ts.add(50);
		ts.add(0);
		System.out.println(ts);
	}

}
