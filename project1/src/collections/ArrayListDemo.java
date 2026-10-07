package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("angel");
		names.add("ann");
		names.add("ami");
		System.out.println(names);
		//to add names
		names.add(1, "claire");
		System.out.println(names);
		//to get value from the given index
		System.out.println(names.get(1));
		//to replace the value
		names.set(3, "serah");
		System.out.println(names);
		//to remove value
		names.remove(2);
		System.out.println(names);
		//to check the value is present in array or not
		System.out.println(names.contains("angel"));
		// to check the size of the array
		System.out.println(names.size());
		//to check array is empty or not
		System.out.println(names.isEmpty());
		//to clear values
		names.clear();
		// to iterate
		System.out.println(names);
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(1));
		}
		
		for(String j: names) {
			System.out.println(j);
		}
		
		//Iterator
		Iterator <String> it = names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}

	}

}
