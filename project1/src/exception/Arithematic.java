package exception;

public class Arithematic {

	public static void main(String[] args) {
		int num1 = 39;
		int num2 = 0;
		try {
			int result;
			result = num1 / num2;
			System.out.println(result);
		} catch (Exception ae) {
			ae.printStackTrace();
			//or
			//System.out.println(ae.getMessage());
		}
		System.out.println("rest of the code");
	}

}
