package methods;

public class Sample13 
{

	public static void main(String[] args) 
	{
	
		m1();
		Sample13 s13 = new Sample13();
		s13.m2();
		Sample14.m4(30);
		Sample14 s14 = new Sample14();
		s14.m3("Sourabh");
	}
	
	
	public static void m1()
	{
	  System.out.println("Running static method m1");	
	}
	
	public void m2()
	{
	  System.out.println("Running non static method m2");	
	}
}
