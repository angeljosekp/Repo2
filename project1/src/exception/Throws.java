package exception;

public class Throws {
	public void validate(int age) throws Exception, ArithmeticException {
		if(age<18) {
			throw new ArithmeticException("age must be 18 or above");
		}
		System.out.println("eligible");
		System.out.println("rest of the code");
		
	}

	public static void main(String[] args) {
		Throw tw = new Throw();
		try {
		tw.validate(3);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("rest of the code2");

	}

}
