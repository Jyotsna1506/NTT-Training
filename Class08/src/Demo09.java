import java.util.Vector;

public class Demo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("Ram");
		v.add("NTT");
		v.add("Sita");
		v.add("NTT");
		v.add("Ravan");
		v.add("NTT");
		v.add("Maruti");
		v.add("xxx");
		v.add("NTT");
		v.add("yyy");
		v.add("NTT");
		v.add("zzz");
		v.add("NTT");
		v.add("aaa");
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.indexOf("NTT"));
		System.out.println(v.indexOf("NTT" , 3));
		System.out.println(v.indexOf("NTT" , 5));
		System.out.println(v.lastIndexOf("NTT"));
		System.out.println(v.lastIndexOf("NTT" , 7));
	}

}