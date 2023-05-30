package constructor;

public class Sample23 
{

	String sname;
	int age;
	
	public Sample23()
	{
		sname="Sourabh";
		age=30;
	}
	
	public void info()
	{
	   System.out.println("Name of the employee is " + sname + " age of the employee is " + age);	
	}
	
	public static void main(String[] args) 
	{
	
		Sample23 s23 = new Sample23();
		s23.info();
		
		
	}
	
}
