import java.util.Scanner;

/*RTO Application
 * 1. UnderAgeException: if age is <18
 * 2. OverAgeException: if age is >60*/
class UnderAgeException extends Exception {
	public String getMessage() {
		return "Your age is under 18";
	}
}

class OverAgeException extends Exception {
	public String getMessage() {
		return "Your age is above 60";
	}
}

class Age {
	int age;

	Age(int a) {
		age = a;
	}

	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age: ");
		age = scan.nextInt();
	}

	void Elligible() {
		try {
			if (age < 18) {
				throw new UnderAgeException();
			} else if (age > 60) {
				throw new OverAgeException();
			} else {
				System.out.println("You are elligible");
			}
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		} catch (OverAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class RTOApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Age a = new Age(100);
		a.input();
		a.Elligible();
	}

}