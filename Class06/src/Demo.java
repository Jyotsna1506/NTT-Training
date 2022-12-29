class Parent {
	void disp() {
		System.out.println("Inside parent disp");
	}
}

class Child extends Parent {
	void disp() {
		System.out.println("Inside child disp");
	}
}

class Child2 extends Parent {
	void disp() {
		System.out.println("Inside child2 disp");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child c = new Child();
		Child2 c2 = new Child2();

		Parent ref;
		ref = p;
		ref.disp();

		ref = c;
		ref.disp();

		ref = c2;
		ref.disp();
	}

}