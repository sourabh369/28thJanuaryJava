package constructor;

public class Sample26 
{

	String sname;
	int age;
	
	Sample26(String i , int j)
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
	
		Sample26 s26 = new Sample26("Sourabh", 30);
		s26.info();
		
		
	}
	
	
}
