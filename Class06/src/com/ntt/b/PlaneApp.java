/*Run time polymorphism*/
package com.ntt.b;

class Plane {
	void takeOff() {
		System.out.println("Plane took off");
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
		System.out.println("Cargo Plane took off");
	}

	void fly() {
		System.out.println("Cargo Plane is flying");
	}

	void land() {
		System.out.println("Cargo Plane is landing");
	}
}

class Passenger extends Plane {
	void takeOff() {
		System.out.println("Passenger Plane took off");
	}

	void fly() {
		System.out.println("Passenger Plane is flying");
	}

	void land() {
		System.out.println("Passenger Plane is landing");
	}
}

class Fighter extends Plane {
	void takeOff() {
		System.out.println("Fighter Plane took off");
	}

	void fly() {
		System.out.println("Fighter Plane is flying");
	}

	void land() {
		System.out.println("Fighter Plane is landing");
	}
}

class Airport {
	void allowPlane(Plane p) {
		p.takeOff();
		p.fly();
		p.land();
	}
}
/*class Airport {
	void allowPlane(Cargo ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
	void allowPlane(Passenger ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}

	void allowPlane(Fighter ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}*/


public class PlaneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p = new Plane();
		Cargo c = new Cargo();
		Passenger ps = new Passenger();
		Fighter f = new Fighter();
		Airport a = new Airport();

		a.allowPlane(c);
		System.out.println();
		a.allowPlane(ps);
		System.out.println();
		a.allowPlane(f);

	}

}