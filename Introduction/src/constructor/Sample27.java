package constructor;

public class Sample27 
{

	String sname;
	int age;
	
	Sample27()
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
	
		Sample27 s27 = new Sample27();
		s27.info();
		
	}
	
}
