package abstraction.org;


public class PartialAbstraction2 extends PartialAbstraction{

	@Override
	public void empAge() {
		System.out.println("25");
		}
	public void comId() {
		System.out.println("999");
	}
	public static void main(String[] args) {
		PartialAbstraction2 p = new PartialAbstraction2();
		p.empAge();
		p.comId();
		p.empId();
		p.empName();
		
		
	}

}
