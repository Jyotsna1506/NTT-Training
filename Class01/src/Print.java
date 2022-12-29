public class Print {

	public static void main(String[] args) {
		byte a = Byte.MAX_VALUE;
		byte aa = Byte.MIN_VALUE;
		int b = Integer.MAX_VALUE;
		int bb = Integer.MIN_VALUE;
		float c = Float.MAX_VALUE;
		float cc = Float.MIN_VALUE;
		double d = Double.MAX_VALUE;
		double dd = Double.MIN_VALUE;
		char e = 'A';
		boolean f = true;
		
		System.out.println("The maximum byte value is "+a);
		System.out.println("The minimum byte value is "+aa);
		System.out.println();
		System.out.println("The maximum int value is "+b);
		System.out.println("The minimum int value is "+bb);
		System.out.println();
		System.out.println("The maximum float value is "+c);
		System.out.println("The minimum float value is "+cc);
		System.out.println();
		System.out.println("The maximum double value is "+d);
		System.out.println("The minimum double value is "+dd);
		System.out.println();
		if(Character.isUpperCase(e)) {
			System.out.println("The character is uppercase.");
		}
		else {
			System.out.println("The character is lowercase.");
		}
		System.out.println();
		System.out.println("The value of boolean is "+f);
	}

}//ctrl+shift+f --> Indentation