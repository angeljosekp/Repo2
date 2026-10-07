package exception;

public class Finally {

	public static void main(String[] args) {
		int num1 = 39;
		int num2 = 0;
		try {
			int result = num1 / num2;
			System.out.println(result);
		}
		// catch is optional , we can use try and finally or try, catch and finally
		// these two methods, if we are giving catch then after catch only we can provide finally block.
		catch (Exception ae) {
			ae.printStackTrace();
		} finally {
			System.out.println("connection closed");
		}
		System.out.println("rest of the code");
	}

}
