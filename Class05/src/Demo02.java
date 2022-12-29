public class Demo02 {
	public static void main(String[] args) {
		System.out.println("Inside String[] args main");
		main(10);//in main an int is accepted... so it goes to int main
	}
	
	public static void main(int a) {
		System.out.println("Inside int main");
		main();//in main nothing is getting accepted... so it goes to void main
	}
	public static void main() {
		System.out.println("Inside 0 parameter main");
	}
}
//in one class, multiple main methods are possible.