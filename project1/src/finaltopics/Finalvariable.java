package finaltopics;

public class Finalvariable {
	final int speed_limit = 89809;
	public void print() {
		//speed_limit = 4556;error
	}

	public static void main(String[] args) {
		Finalvariable fv = new Finalvariable();
		fv.print();
	}
}
