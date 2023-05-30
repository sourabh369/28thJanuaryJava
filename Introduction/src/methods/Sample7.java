package methods;

public class Sample7 
{

	public void m1() 
	{
	   System.out.println("Running non static method");	
	}
	
	public static void m2() 
	{
	   System.out.println("Running static method");	
	}
	
	public static void main(String[] args) 
	{
		Sample7 s7 = new Sample7();
		s7.m1();
		m2();
		Sample8.m4();
		Sample8 s8 = new Sample8();
		s8.m3();
	}
	
}
