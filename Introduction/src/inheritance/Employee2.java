package inheritance;

public class Employee2 extends Companyinfo {

	public void designation() {
		System.out.println("Tester");
	}
	
	public static void main(String[] args) {
		Employee2 e2 = new Employee2();
		e2.Companyname();
		e2.designation();
	}
	
}
