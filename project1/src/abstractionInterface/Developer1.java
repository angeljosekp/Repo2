package abstractionInterface;

public class Developer1  implements Employee{

	public static void main(String[] args) {
		Developer1 dev = new Developer1();
		dev.calculateSalary();
		dev.displayRole();

	}

	@Override
	public void calculateSalary() {
		System.out.println("dev salary : $8000");
		
	}

	@Override
	public void displayRole() {
		System.out.println("java developer");
		
	}

}
