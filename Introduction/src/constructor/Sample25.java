package constructor;

public class Sample25 
{

	String sname;
	int age;
	
	Sample25()
	{
		sname="Sourabh";
		age=30;
	}
	
	public void info()
	{
	   System.out.println("Name of the employee is " + sname + " age of the employee is " +age);	
	}
	
	public static void main(String[] args) 
	{
	
		Sample25 s25 = new Sample25();
		s25.info();
		
		
		
	}
	
}
