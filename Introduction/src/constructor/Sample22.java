package constructor;

public class Sample22 
{

	String sname;
	int age;
	
	Sample22(String i , int j)
	{
		sname=i;
		age=j;
	}
	
	public void info()
	{
		System.out.println("Name of the employee is " + sname + " age of the employee is " +age);
	}
	
	public static void main(String[] args) 
	{
	
		Sample22 s22 = new Sample22("Sourabh", 30);
		s22.info();
	}
	
}
