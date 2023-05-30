package constructor;

public class Sample15 
{

	String name;
	int age;
	
	public Sample15()
	{
	   	name = "Sourabh";
	   	age = 30;
	}
	
	public void info()
	{
	  System.out.println("Name is " + name + " age is " + age);	
	}
	
	public static void main(String[] args) 
	{
		Sample15 s15 = new Sample15();
		s15.info();
	}
	
}
