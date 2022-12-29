import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		//al.add("Ram");
		//al.add(10.1);
		al.add(30);
		System.out.println(al);

		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Ram");
		al1.add("Sita");
		System.out.println(al1);

	}

}
