public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "RajaRamMohanRoy";
		System.out.println(s.length());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('R'));
		System.out.println(s.lastIndexOf('R'));
		System.out.println(s.contains("Ram"));
		System.out.println(s.contains("Sita"));
		System.out.println(s.endsWith("Roy"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.substring(7));
		System.out.println(s.substring(7,11));
	}

}