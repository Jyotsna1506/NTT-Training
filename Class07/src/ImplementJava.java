interface Connection{
	void connect();
	void query();
	void close();
}
class Oracle implements Connection{
	public void connect() {
		System.out.println("Connection established with oracle DB");
	}
	public void query() {
		System.out.println("Data is extracted from oracle DB");
	}
	public void close() {
		System.out.println("Connection closed with oracle DB");
	}
}
class SyBase implements Connection{
	public void connect() {
		System.out.println("Connection established with SyBase DB");
	}
	public void query() {
		System.out.println("Data is extracted from SyBase DB");
	}
	public void close() {
		System.out.println("Connection closed with SyBase DB");
	}
}
class Informics implements Connection{
	public void connect() {
		System.out.println("Connection established with informics DB");
	}
	public void query() {
		System.out.println("Data is extracted from informics DB");
	}
	public void close() {
		System.out.println("Connection closed with informics DB");
	}
}

class ConnectToDB{
	void allowConnection(Connection ref) {
		ref.connect();
		ref.query();
		ref.close();
	}
}

public class ImplementJava {

	public static void main(String[] args) {
		Oracle o = new Oracle();
		SyBase s = new SyBase();
		Informics i = new Informics();
		ConnectToDB c = new ConnectToDB();
		
		c.allowConnection(o);
		System.out.println("----------");
		c.allowConnection(s);
		System.out.println("----------");
		c.allowConnection(i);
	}

}