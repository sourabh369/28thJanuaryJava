package constructor;

public class Sample11 
{

	String name;
	int age;
	
	Sample11()
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
	
		Sample11 s11 = new Sample11();
		s11.info();
		
	}
	
}
