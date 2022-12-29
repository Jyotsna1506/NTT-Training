public class ForLoop02 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int k = 5; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * (5 - i + 1) - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}