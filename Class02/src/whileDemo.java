public class whileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String copyFrom = "Copy this string until you encounter the letter 'g'.";
		StringBuffer copyTo = new StringBuffer();
		int i = 0;
		char c = copyFrom.charAt(i);

		while (c != 'g') {
			copyTo.append(c);
			c = copyFrom.charAt(++i);
		}
		System.out.println(copyTo);
	}
}