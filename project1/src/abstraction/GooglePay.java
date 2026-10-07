package abstraction;

public class GooglePay extends Payment{
	void makePayment() {
		System.out.println("payment made through GPay");
	}

	public static void main(String[] args) {
		GooglePay GP = new GooglePay();
		GP.makePayment();
		GP.paymentSuccessFull();

}
}