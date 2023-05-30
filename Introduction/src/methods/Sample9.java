package methods;

public class Sample9 
{

	public static void add(int num1 , int num2)
	{
	  System.out.println(num1+num2);	
	}
	
	public void info(String name , int age)
	{
	  System.out.println("Name is " + name + " age is " +age);	
	}
	
	public static void main(String[] args) 
	{
	
		add(10 , 20);
		Sample9 s9 = new Sample9();
		s9.info("Sourabh", 30);
		Sample10.details("Ankita", 32);
		Sample10 s10 = new Sample10();
		s10.mul(10, 20);
		
	}
	
}
