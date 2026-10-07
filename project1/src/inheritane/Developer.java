package inheritane;

public class Developer extends Employee {
	
	void writecode() {
		System.out.println(name + " is writing java code");
	}

	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.writecode();
		dev.login();

	}

}
