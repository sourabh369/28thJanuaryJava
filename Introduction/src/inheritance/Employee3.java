package inheritance;

public class Employee3 extends Companyinfo{
	
	public void Shift() {
		System.out.println("9.30-6.30");
	}
	
	public static void main(String[] args) {
		Employee3 e3 = new Employee3();
		e3.Companyname();
		e3.Shift();
	}

}
