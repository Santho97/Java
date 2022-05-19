package test.org;

public class OverloadingConcept {
	public void employeeDetails() {
		System.out.println("name is ondippuli");
	}

//arguments based on count 
	public void employeeDtails(int age) {
		System.out.println("age");

	}

	public void employeeDtails(int age, int id) {
		System.out.println("ageis" + age);
		System.out.println("id" + id);
	}

	public void employeeDtails(int age, int id, int num) {
		System.out.println("ageis" + age);
		System.out.println("id is" + id);
		System.out.println("number is" + num);

	}

	// based on datatype
	public void employeeDtails(int age, String name) {
		System.out.println("age is" + age);
		System.out.println("name is" + name);
	}

	public void employeeDtails(float salary, String name) {
		System.out.println("salary is" + salary);
		System.out.println("name is" + name);
	}

	// based on order
	public void employeeDtails(int age, long number) {
		System.out.println("age is" + age);
		System.out.println("mobile number is" + number);
	}

	public void employeeDtails(boolean maritialstatus, char gender) {
		System.out.println("status is " + maritialstatus);
		System.out.println("initial is" + gender);
	}

	public static void main(String[] args) {
		OverloadingConcept a = new OverloadingConcept();
		a.employeeDetails();
		a.employeeDtails(25);
		a.employeeDtails(25, 5772);
		a.employeeDtails(25, 5772, 123456789);
		a.employeeDtails(25, "ondippuli");
		a.employeeDtails(25000.000f, "ondippuli");
		a.employeeDtails(25, 9876543210l);
		a.employeeDtails(false, 'm');

	}

}
