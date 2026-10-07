package abstraction;

public abstract class Payment {
	
	abstract void makePayment();
	
	void paymentSuccessFull() {
		
		System.out.println("payment successfull");
	}

}
