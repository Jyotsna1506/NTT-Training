class Demo03{
	int a,b,c;
	static int x,y,z;
}
public class IntAndStaVar {

	public static void main(String[] args) {
		Demo03 d1,d2,d3;
		d1=new Demo03();
		d2=new Demo03();
		d3=new Demo03();
		
		d1.a=10;
		d1.b=20;
		d1.c=30;
		d1.x=44;
		d1.y=55;
		d1.z=66;
		
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println();
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d1.z);
		
		d2.a=40;
		d2.b=50;
		d2.c=60;
		d2.x=77;
		d2.y=88;
		d2.z=99;
		
		System.out.println("____");
		System.out.println();
		System.out.println(d2.a);
		System.out.println(d2.b);
		System.out.println(d2.c);
		System.out.println();
		System.out.println(d2.x);
		System.out.println(d2.y);
		System.out.println(d2.z);
		
		d3.a=70;
		d3.b=80;
		d3.c=90;
		d3.x=100;
		d3.y=110;
		d3.z=120;
		
		System.out.println("____");
		System.out.println();
		System.out.println(d3.a);
		System.out.println(d3.b);
		System.out.println(d3.c);
		System.out.println();
		System.out.println(d3.x);
		System.out.println(d3.y);
		System.out.println(d3.z);
				
		System.out.println("____");
		System.out.println();
		System.out.println(d3.a);
		System.out.println(d3.b);
		System.out.println(d3.c);
		System.out.println();
		System.out.println(d2.x);
		System.out.println(d2.y);
		System.out.println(d2.z);
	}

}