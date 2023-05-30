package methods;

public class Sample15 
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
		Sample15 s15 = new Sample15();
		s15.m2();
		Sample16.m3();
		Sample16 s16 = new Sample16();
		s16.m4();
		
	}
	
}
