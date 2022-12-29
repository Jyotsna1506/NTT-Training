public class EqualNotEqual {

	public static void main(String[] args) {
//		String s1 = "Ram";
//		String s2 = "Sita";
		String s1 = new String("Ram");
		String s2 = new String("Ram");
		

//		if (s1.equals(s2)) {
//			System.out.println("Contents of s1 and s2 are equal");
//		} else {
//			System.out.println("Contents of s1 and s2 are not equal");
//		}
		if(s1 == s2) {
			System.out.println("s1 and s2 are pointing to same object");
		}
		else {
			System.out.println("s1 and s2 are not pointing to same object");
		}
		
	}

}
/*Note:
 --> In order to compare the data of the string, the inbuilt method equals() can be used.
 --> In order to compare the address stored in the string variable, the == must be used.
 --> If the string is declared without new keyword, memory is allocated from constant pool, also duplicates are not allowed.
 --> If the string is declared with new keyword, memory is allocated from non-constant pool, it allows the duplicates. Hence we get the output as not same.
 */