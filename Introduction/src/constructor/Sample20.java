package constructor;

public class Sample20 
{

	String name;
	int age;
	
	Sample20(String i , int j)
	{
		name=i;
		age=j;
	}
	
	public void info()
	{
	  System.out.println("Name is " + name + " age is " + age);	
	}
	
	public static void main(String[] args)
	{
	   
		Sample20 s20 = new Sample20("Sourabh", 30);
		s20.info();
		
		
	}
	
}
