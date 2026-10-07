package collections;

import java.util.ArrayList;

public class Nongenericcollections {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		names.add("anu");
		names.add(100);
		names.add(10.5);
		String name =(String)names.get(0);
		int number =(Integer)names.get(2);
		}

	}

	
