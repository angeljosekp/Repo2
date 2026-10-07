package stringpack;

public class BufferString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");

		// to add values at the end = append method
		sb.append(" java");
		System.out.println(sb);

		// to insert values anywhere = insert()
		sb.insert(0, "hai ");
		System.out.println(sb);

		// to replace the value with other value = replace
		sb.replace(10, 15, "world");
		System.out.println(sb);

		// to delete the value= delete
		sb.delete(0, 4);
		System.out.println(sb);

		// to delete one character from the given word = deleteCharAt()
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		// reverse()
		sb.reverse();
		System.out.println(sb);
		
		//charAt()
		System.out.println(sb.charAt(2));
		
		//length()
		System.out.println(sb.length());
		
		//capacity()
		System.out.println(sb.capacity());
		
		// toString
		String str = sb.toString();
		System.out.println(str);

	}

}
