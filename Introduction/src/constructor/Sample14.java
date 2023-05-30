package constructor;

public class Sample14 
{

	String name;
	int age;
	
	Sample14(String a , int b)
	{
		name = a;
		age = b;
	}
	
	public void info()
	{
	   System.out.println("Name of the employee is " + name + " age is " +age);	
	}
	
	public static void main(String[] args) 
	{
		Sample14 s14 = new Sample14("Sourabh", 30);
		s14.info();
		Sample14 s15 = new Sample14("Ankita", 32);
		s15.info();
	}
	
}
