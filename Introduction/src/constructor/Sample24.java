package constructor;

public class Sample24 
{

	String sname;
	int age;
	
	public Sample24(String i , int j)
	{
		sname=i;
		age=j;
	}
	
	public void info()
	{
	   System.out.println("Name of the employee is " + sname + " age of the employee is " + age);	
	}
	
	public static void main(String[] args) 
	{
	
		Sample24 s24 = new Sample24("Sourabh", 30);
		s24.info();
		
		
	}
	
}
