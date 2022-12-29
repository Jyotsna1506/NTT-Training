class Plane {
	String engine;
	float fuel;
	int wheels;

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
	void carryCargo() {
		System.out.println("Carrying Cargo");
	}
}

class Passenger extends Plane {
	void carryPassengrs() {
		System.out.println("Carrying Passengers");
	}
}

class Fighter extends Plane {
	void carryWepons() {
		System.out.println("Carrying Wepons");
	}
}

public class PlaneApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo c = new Cargo();
		Passenger p = new Passenger();
		Fighter f = new Fighter();

		c.takeOff();
		c.fly();
		c.carryCargo();
		c.land();
		System.out.println("-------------");
		p.takeOff();
		p.fly();
		p.carryPassengrs();
		p.land();
		System.out.println("-------------");
		f.takeOff();
		f.fly();
		f.carryWepons();
		f.land();
	}

}