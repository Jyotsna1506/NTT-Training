/*Typecasting example*/

class Plane2 {
	void takeOff2() {
		System.out.println("Plane took off");
	}
}

class Fighter2 extends Plane2 {
	void takeOff2() {
		System.out.println("Fighter Plane took off");
	}

	void launch() {
		System.out.println("Fighter Plane launched");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter2 f2 = new Fighter2();
		Plane2 ref;
		ref = f2;
		ref.takeOff2();
		((Fighter2) (ref)).launch();

	}

}