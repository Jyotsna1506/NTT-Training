import java.util.TreeSet;

public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(90);
		ts.add("Ram");
		ts.add(10.1);
		System.out.println(ts);
	}

}
//this throws an exception called classCast exception
//because multiple dataTypes not allowed.