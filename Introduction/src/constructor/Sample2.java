package constructor;

public class Sample2 {

	int i;
	int j;
	
	Sample2()
	{
		i = 10;
		j = 20;
	}
	
	public void add() {
		System.out.println(i+j);
	}
	
	public void mul() {
		System.out.println(i*j);
	}
	
	public static void main(String[] args) {
		Sample2 s2 = new Sample2();
		s2.add();
		s2.mul();
		Sample3 s3 = new Sample3();
		s3.employeeDetails();
	}
	
	
	
}
