public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String copyFromMe = "Copy this string until you encounter the letter 'g'.";
		StringBuffer copyToMe = new StringBuffer();
		int i = 0;
		char c = copyFromMe.charAt(i);

		do {
			copyToMe.append(c);
			c = copyFromMe.charAt(++i);
		} while (c != 'g');
		System.out.println(copyToMe);
	}

}