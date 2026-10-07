package abstraction;

public class UPI extends Payment{
	
	void makePayment() {
		System.out.println("payment made through UPI");
	}

	public static void main(String[] args) {
		UPI upi = new UPI();
		upi.makePayment();
		upi.paymentSuccessFull();
		
	}

}
