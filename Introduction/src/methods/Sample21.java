package methods;

public class Sample21 
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
		Sample21 s21 = new Sample21();
		s21.m2();
		Sample22 s22 = new Sample22();
		s22.m3("Sourabh", 30);
		Sample22.m4(30);
	}
}
