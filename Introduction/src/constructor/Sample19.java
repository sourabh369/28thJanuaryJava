package constructor;

public class Sample19 
{

	String name;
	int age;
	
	Sample19()
	{
		name="Sourabh";
		age=30;
	}
	
	public void info()
	{
	  System.out.println("Name is " + name + " age is " +age);	
	}
	
	public static void main(String[] args) 
	{
	
		Sample19 s19 = new Sample19();
		s19.info();
			
		
	}
	
}
