package abstractionInterface;

public class tester implements Employee {

	public static void main(String[] args) {
		tester tes = new tester();
		tes.calculateSalary();
		tes.displayRole();

	}

	@Override
	public void calculateSalary() {
		System.out.println("tester salary : $5000");

	}

	@Override
	public void displayRole() {
		System.out.println("Automation Specialist");

	}

}