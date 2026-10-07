package exception;

public class Throw {
	public void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("age must be 18 or above");
		}
		System.out.println("eligible");
		System.out.println("rest of the code");
		
	}

	public static void main(String[] args) {
		Throw tw = new Throw();
		tw.validate(3);
		System.out.println("rest of the code2");

	}

}
