package abstraction.org;

public class Interfa implements FullyAbstraction {
	@Override
	public void empId() {
		System.out.println("dfjh 987");

	}

	@Override
	public void empName() {
		System.out.println("kjh ");

	}

	@Override
	public void empAge() {
		System.out.println("25");

	}

	public static void main(String[] args) {
		
	

	
	//className object name = New classname();
	Interfa i = new Interfa();
	i.empId();
	i.empName();
	i.empAge();
			
	}
	

}
