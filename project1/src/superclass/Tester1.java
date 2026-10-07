package superclass;

public class Tester1 extends Employee2 {
	
	Tester1(){
		super();
		System.out.println("tester constructor");
	}

	public static void main(String[] args) {
		Tester1 ts = new Tester1();
	}

}
