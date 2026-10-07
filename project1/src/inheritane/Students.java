package inheritane;

public class Students extends Department {

	int stuId = 11;
	String stuname = "Angel";

	public void issueId() {

		System.out.println(stuId);
		System.out.println(stuname);
		System.out.println(depId);
		System.out.println(depname);
		System.out.println(clgId);
		System.out.println(clgname);
	}

	public static void main(String[] args) {
		Students stu = new Students();
		stu.issueId();
		stu.deptDetails();
	}
}
