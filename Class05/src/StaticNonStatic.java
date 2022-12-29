class Demo3{
	int a,b,c;
	static int x,y,z;
	
	Demo3(){
		System.out.println("Demo03 constuctor executed");
	}
	static {
		System.out.println("Static block executed");
	}
	{
		System.out.println("Non-static block executed");
	}
	
	static void staticDisp() {
		System.out.println("Static method executed");
	}
	void nonstaticDisp() {
		System.out.println("Non-static method executed");
	}
}
public class StaticNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d3;
		d3 = new Demo3();
		d3.nonstaticDisp();
		d3.staticDisp();
	}

}