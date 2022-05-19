package day2java.org;

public class Employee {
	public void empId(int rollnum) {
		System.out.println(rollnum);
		}
	public void empId(String Name,char Gender) {
		System.out.println(Name);
		System.out.println(Gender);
		}
	public void empId(long phono,float Salary) {
		System.out.println(phono);
		
		System.out.println(Salary);
		
		}
	//arguments based on order
	public void empId(Boolean maritial,int age) {
		System.out.println(maritial);
		System.out.println(age);
	  }
	//arguments based on data type
	public void empId(float weight,float height) {
		System.out.println(weight);
		System.out.println(height);
		}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId(5849);
		e.empId("Santhosh",'M');
		e.empId(7299953801l,200f);
		e.empId(true,25);
		e.empId(50f, 5.7f);
		
		
		
		
	}
	
		 
		

	}


