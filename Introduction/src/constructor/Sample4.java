package constructor;

public class Sample4 {

	String i;
	double j;
	
	Sample4()
	{
		i = "Sourabh";
		j = 250000d;
	}
	
	public void info() {
		System.out.println("Name of the employee is " + i + " and his salary is "+j);
	}
	
	public static void main(String[] args) {
		Sample4 s4 = new Sample4();
		s4.info();
	}
	
}
