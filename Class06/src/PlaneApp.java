class Plane {
	void takeOff() {
		System.out.println("Plane tookoff");
	}

	void fly() {
		System.out.println("Plane is flying");
	}

	void land() {
		System.out.println("Plane is landing");
	}
}

class Cargo extends Plane {
	void takeOff() {
		System.out.println("Cargo plane took off");
	}

	void fly() {
		System.out.println("Cargo plane is landing");
	}

	void land() {
		System.out.println("Cargo plane is landing");
	}

	void carryCargo() {
		System.out.println("Carrying cargo");
	}
}

public class PlaneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p = new Plane();
		Cargo c = new Cargo();

		Plane ref;
		ref = c;
		ref.takeOff();
		ref.fly();
		ref.land();
		//ref.carryCargo(); This line gives error because ref is invoked only the methods from parent class.
		//The child class method which is not in the parent class cannot be invoked by ref.
	}

}