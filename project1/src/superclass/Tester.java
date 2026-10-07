package superclass;

public class Tester extends Employee1 {
	void work() {
		System.out.println("Tester is working");
	}
  void show() {
	  System.out.println("show method");
	  work();
	  super.work();
  }
	public static void main(String[] args) {
		Tester tes = new Tester();
		tes.show();
		
	}

}
