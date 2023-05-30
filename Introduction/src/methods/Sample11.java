package methods;

public class Sample11 
{

	public static void m1()
	{
	  System.out.println("Running static regular method");	
	}
	
	public void m2()
	{
	  System.out.println("Running non static regular method");	
	}
	
	public static void main(String[] args) 
	{
	
		m1();
		Sample11 s11 = new Sample11();
		s11.m2();
		Sample12.m3("Sourabh", 30);
		Sample12 s12 = new Sample12();
		s12.m4("Sourabh", 30);
		
	}
	
}
