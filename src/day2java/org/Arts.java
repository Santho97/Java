package day2java.org;

public class Arts extends Education {
	public void bSc() {
		System.out.println("88%");
		}
	public void bed() {
		System.out.println("20%");
		}
	public void ba() {
		System.out.println("5%");
		}
	@Override
	public void ug() {
		System.out.println("40%");
		}
	@Override
	public void pg() {
		System.out.println("35%");
	}
	public static void main(String[] args) {
		Arts a = new Arts();
		a.bSc();
		a.bed();
		a.ba();
		a.ug();
		a.pg();
	}
	
		
		
	}

	
		
	


	
	
	

	
	



