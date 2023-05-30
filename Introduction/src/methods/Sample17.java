package methods;

public class Sample17 
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
		Sample17 s17 = new Sample17();
		s17.m2();
		Sample18.m3();
		Sample18 s18 = new Sample18();
		s18.m4();
		
	}
	
}
