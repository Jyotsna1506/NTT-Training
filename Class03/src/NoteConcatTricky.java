public class NoteConcatTricky {

	public static void main(String[] args) {
		String s1 = "Sita" + "Ram";
		String s2 = "Sita" + "Ram";
		System.out.println(s1);
		System.out.println(s2);
		String s3, s4;
		s3 = s1 + s2;
		s4 = s1 + s2;
		if (s3 == s4) {
			System.out.println("Same");
		} else {
			System.out.println("Not same");
		}
	}
}
/*Note:
--> During concatenation if variables are used, the memory is allocated from the non-constant pool.
 */