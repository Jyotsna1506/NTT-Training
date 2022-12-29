class A1 {
	int i;
}

class B1 extends A1 {
	int i;

	void setData(int x, int y) {
		super.i = x;//i=x-->O/P is 20.
		i = y;
	}

	void disp() {
		System.out.println("A's Value is: " + super.i);//i--> O/P is 20.
		System.out.println("B's Value is: " + i);
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1;
		b1 = new B1();
		b1.setData(10, 20);
		b1.disp();

	}

}

//Note:
//super keyword is used to without changing the value in the parent class.
//every time child class get accessed first. so the values get changed in the parent class also.