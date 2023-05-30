package constructor;

public class Sample7 {

	String sname;
	int age;
	
	Sample7()
	{
		sname = "Sourabh";
		age = 30;
	}
	
	public void info() {
		System.out.println("Name of the employee is " + sname + " Age of the employee is " +age);
	}
	
	public static void main(String[] args) {
		Sample7 s7 = new Sample7();
		s7.info();
	}
	
}
