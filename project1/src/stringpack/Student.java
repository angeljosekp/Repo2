package stringpack;

public class Student {
	String name;
	double mark;

	public Student(String name, double mark) {
		this.name = name;
		this.mark = mark;
	}

	public void checkResult() {
		if (mark > 50) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

	public static void main(String[] args) {

		Student st = new Student("Angel", 60);
		st.checkResult();
	}

}
