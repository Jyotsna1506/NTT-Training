class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}

	void sleep() {
		System.out.println("Animal is sleeping");
	}

	void breathe() {
		System.out.println("Animal is breathing");
	}
}

class Tiger extends Animal {
	void eat() {
		System.out.println("Tiger hunts and eat");
	}
}

class Deer extends Animal {
	void eat() {
		System.out.println("Deer grazes and eat");
	}
}

class Monkey extends Animal {
	void eat() {
		System.out.println("Monkey steals and et");
	}
}

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t = new Tiger();
		Deer d = new Deer();
		Monkey m = new Monkey();

		t.eat();
		t.sleep();
		t.breathe();
		System.out.println("-----------------");
		d.eat();
		d.sleep();
		d.breathe();
		System.out.println("-----------------");
		m.eat();
		m.sleep();
		m.breathe();
	}

}