package superclass;

public class Tester3 extends Employee3 {
	
	Tester3(String msg){
		super(msg);
		System.out.println("tester constructor");
	}

	public static void main(String[] args) {
		Tester3 ts = new Tester3("angel");
	}

}



