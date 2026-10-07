package multipleinterface;

public class Onlineorder implements Payment, OrderConfirmation{
	public void process() {
		System.out.println("order payment procsessed");
		System.out.println("order confirmed successfully");
	}
	
	public static void main(String[] args) {
		Onlineorder order = new Onlineorder();
		order.process();

	}
	

}
