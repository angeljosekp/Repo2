package abstraction;

public class CashOnDelivery extends Payment{

	void makePayment() {
		System.out.println("payment made through CashOnDelivery");
	}

	public static void main(String[] args) {
		CashOnDelivery COD = new CashOnDelivery();
		COD.makePayment();
		COD.paymentSuccessFull();
	}

}
