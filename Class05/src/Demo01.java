class Demo{
	Demo(){
		System.out.println("Demo's constructor executed");
	}
	void disp() {
		System.out.println("Inside disp()");
	}
}
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1;
		d1 = new Demo();
		d1.disp();
	}

}