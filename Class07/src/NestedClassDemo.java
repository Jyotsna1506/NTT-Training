class OutterClass {
	static int outer_x = 10;
	int outer_y = 20;
	private static int outer_private = 30;

	static class StaticNestedClass {
		void display() {
			System.out.println("Outer_x : " + outer_x);
			// System.out.println("Outer_y : " + outer_y);
			System.out.println("Outer_private : " + outer_private);
		}
	}
}

public class NestedClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutterClass.StaticNestedClass nestedObject = new OutterClass.StaticNestedClass();
		nestedObject.display();

	}

}

// Line 9 does not work because static variable cannot access the non-static
// variable.