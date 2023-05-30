package methods;

public class Sample19 
{

	public static void m1()
	{
	   System.out.println("Running static method m1");	
	}
	
	public void m2()
	{
	  System.out.println("Running non static method m2");	
	}
	
	public static void main(String[] args) 
	{
	
		m1();
		Sample19 s19 = new Sample19();
		s19.m2();
		Sample20.m3("Sourabh", 30);
		Sample20 s20 = new Sample20();
		s20.m4("Sourabh", 30);
		
		
	}
	
	
}
