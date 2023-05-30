package constructor;

public class Sample18 
{

	String sname;
	int age;
	
	Sample18(String i , int j)
	{
		sname=i;
		age=j;
	}
	
	Sample18(String i)
	{
		sname=i;
	}
	
	public void info()
	{
		System.out.println("Name of the employee is " + sname + " age is " + age); 
	}
	
	public static void main(String[] args) 
	{
	
		Sample18 s18 = new Sample18("Sourabh", 30);
		s18.info();
		Sample18 s19 = new Sample18("Sourabh");
		s19.info();
		
	}
	
}
