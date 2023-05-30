package constructor;

public class Sample13 
{

	String name;
	int age;
	
	Sample13()
	{
		name = "Sourabh";
		age = 30;
	}
	
	public void info() 
	{
	  System.out.println("Name of the employee is " + name + " age is " + age);	
	}
	
	public static void main(String[] args) 
	{
	
		Sample13 s13 = new Sample13();
		s13.info();
		
	}
	
}
