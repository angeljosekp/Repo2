package collections;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		Set<String>names = new HashSet<>();
		names.add("rahul");
		names.add("angel");
		names.add("rahul");// duplicate values are not allowed so only one value will comes in output
		System.out.println(names);
		
		names.remove("rahul");
		System.out.println(names);
		
		System.out.println(names.contains("rahul"));
		
		System.out.println(names.size());
	    names.clear();
		System.out.println(names.isEmpty());
		

	}

}
