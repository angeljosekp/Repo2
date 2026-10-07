package stringpack;

public class StringDemo {

	public static void main(String[] args) {
		System.out.println("hello  world");
		String str = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		// to find string length = length()
		System.out.println(str.length());
		
		// to fetch the given character from the string = charAt()
		System.out.println(str.charAt(2));
		
		// to convert given string to capital letter = toUppercase
		System.out.println(str.toUpperCase());

		// to convert given string to small letter toLowerCase();
		System.out.println(str.toLowerCase());

		// to check given 2 string content are same = equals()
		System.out.println(str.equals(str2));

		// to ignore lower case and upper case during comparing the two string contents are same = equalsIgnoresCase();
		System.out.println(str.equalsIgnoreCase(str2));

		System.out.println(str == str3);

		String str4 = "I am learning java";
		// to check the string contains given value = contains method
		System.out.println(str4.contains("lear"));

		//  to fetch the value from given positions = substring
		System.out.println(str4.substring(4));
		System.out.println(str4.substring(0, 4));

		// to replace the value =  replace method
		System.out.println(str4.replace("java", "python"));
		
		// to trim the vacant spaces = trim
		String a= "   java   ";
		System.out.println(a.trim());
		
		// to check given string have value or not = isEmpty
		String a1 = "  ";
		System.out.println(a1.isEmpty());

	}

}
