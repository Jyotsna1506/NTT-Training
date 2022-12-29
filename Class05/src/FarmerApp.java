import java.util.Scanner;
class Farmer{
	float p,t,SI;
	static float r;
	
	static {
		r=2.5f;
	}
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter principal");
		p=scan.nextFloat();
		System.out.println("Enter Time:");
		t=scan.nextFloat();
	}
	void calSI() {
		SI=(p*t*r)/100;
	}
	void disp() {
		System.out.println("SI is: "+SI);
	}
}
public class FarmerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmer f1,f2,f3;
		f1=new Farmer();
		f2 = new Farmer();
		f3 = new Farmer();
		f1.input();
		f2.input();
		f3.input();
		f1.calSI();
		f2.calSI();
		f3.calSI();
		f1.disp();
		f2.disp();
		f3.disp();
	}

}