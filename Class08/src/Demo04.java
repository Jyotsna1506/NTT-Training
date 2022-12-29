import java.util.Scanner;

/*Banking Application:
 * 1. NegativeBalanceException
 * 2. MinimumBalanceException*/

class NegativeBalanceException extends Exception {
	public String getMessage() {
		return "You entered negative number";
	}
}

class MinimumBalanceException extends Exception {
	public String getMessage() {
		return "Amount entered is greater than available balance";
	}
}

class Bank {
	int bal, amt;

	Bank(int b) {
		bal = b;
	}

	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn:");
		amt = scan.nextInt();
	}

	void dispatchAmt() {
		try {
			if (amt < 0) {
				throw new NegativeBalanceException();
			} else if (amt > bal) {
				throw new MinimumBalanceException();
			} else {
				bal = bal - amt;
				System.out.println("You can collect your cash");
			}
		} catch (NegativeBalanceException e) {
			System.out.println(e.getMessage());
		} catch (MinimumBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank(5000);
		b.input();
		b.dispatchAmt();

	}

}