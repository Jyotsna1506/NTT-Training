class Book1{
	private int pages;
	public void setData(int x) {
		if(x>0) {
			pages=x;
		}
	}
	public int getData() {
		return pages;
	}
}

public class BookApp1{
	public static void main(String[]args) {
		Book1 b1;
		b1 = new Book1();
		b1.setData(100);
		int m = b1.getData();
		System.out.println("Value of pages: "+m);
		b1.setData(-99);
		System.out.println("Value of pages: "+m);
	}
}