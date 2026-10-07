package superclass;

public class Developer extends Employee {
	String name ="Claire";
	void display() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public static void main (String [] args) {
		Developer dev = new Developer();
		dev.display();
	}

}
