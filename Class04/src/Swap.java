import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a:");
		a = scan.nextInt();
		System.out.println("Enter b:");
		b = scan.nextInt();
		/*c=a;*/ a = a+b;
		/*a=b;*/ b = a-b;
		/*b=c;*/ a = a-b;
		System.out.println(a);
		System.out.println(b);
	}

}