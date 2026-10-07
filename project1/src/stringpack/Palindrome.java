package stringpack;

public class Palindrome {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("AMMA");
		String original = sb.toString();
		String reverse = sb.reverse().toString();
		if (original.equals(reverse)) {
			System.out.println("is palindrome");
		} else {

			System.out.println("not palindrome");

		}

	}

}
