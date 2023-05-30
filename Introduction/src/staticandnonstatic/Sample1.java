package staticandnonstatic;

public class Sample1 
{

	static int age = 30;
	String name = "Sourabh";
	
	public void info()
	{
	   System.out.println(age);
	   System.out.println(name);
	}
	
	public static void info1()
	{
	   System.out.println(age);
	   Sample1 s1 = new Sample1();
	   System.out.println(s1.name);
	}
	
	public static void main(String[] args) 
	{
	
		Sample1 s1 = new Sample1();
		s1.info();
		System.out.println("---------");
		info1();
		
	}
	
}
