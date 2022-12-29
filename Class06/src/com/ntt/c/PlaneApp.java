package com.ntt.c;

abstract class Plane {
	abstract void takeOff();

	abstract void fly();

	abstract void land();
}

class Cargo extends Plane {
	void takeOff() {
		System.out.println("Cargo Plane took off");
	}

	void fly() {
		System.out.println("Cargo plane is flying");
	}

	void land() {
		System.out.println("Cargo plane is landing");
	}
}

class Passenger extends Plane {
	void takeOff() {
		System.out.println("Passenger Plane took off");
	}

	void fly() {
		System.out.println("Passenger plane is flying");
	}

	void land() {
		System.out.println("Passenger plane is landing");
	}
}

class Fighter extends Plane {
	void takeOff() {
		System.out.println("Fighter Plane took off");
	}

	void fly() {
		System.out.println("Fighter plane is flying");
	}

	void land() {
		System.out.println("Fighter plane is landing");
	}
}

class Airport {
	void allowPlane(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class PlaneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo c = new Cargo();
		Passenger p = new Passenger();
		Fighter f = new Fighter();
		Airport a = new Airport();

		a.allowPlane(c);
		System.out.println("----------------");
		a.allowPlane(p);
		System.out.println("----------------");
		a.allowPlane(f);

	}

}