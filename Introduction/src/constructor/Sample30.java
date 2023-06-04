package constructor;

public class Sample30 
{

	String sname;
	int age;
	
	
	Sample30(String i , int j)
	{
		sname=i;
		age=j;
	}
	
	public void info()
	{
		System.out.println("Name of the employee is " + sname + " age of the employee is " + age);
	}
	
//	public static void main(String[] args) 
//	{
//		Sample30 s30 = new Sample30("Sourabh", 30);
//		s30.info();
//	}
	
	
}
