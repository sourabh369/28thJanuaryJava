package constructor;

public class Sample29 
{

	String sname;
	int age;
	
	Sample29()
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
	
		Sample29 s29 = new Sample29();
		s29.info();
	}
	
	
}
