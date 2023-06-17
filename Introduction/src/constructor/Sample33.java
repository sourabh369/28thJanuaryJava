package constructor;

public class Sample33 
{
	
	String name;
	int age;
	
	Sample33(String i , int j)
	{
		name=i;
		age=j;
	}
	
	public void info()
	{
		System.out.println("name of the emp is " + name + " age of the emp is " + age);
	}
	
	public static void main(String[] args) 
	{
	
		Sample33 s33 = new Sample33("Sourabh", 30);
		s33.info();
		
	}
	
}
