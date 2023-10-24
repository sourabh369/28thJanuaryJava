package constructor;

public class Sample35 
{

	String name;
	int age;
	
	Sample35(String i , int j)
	{
		name=i;
		age=j;
	}
	
	public void info()
	{
		System.out.println("Name of the person is " + name + " age is " + age);
	}
	
	public static void main(String[] args) 
	{
	
		Sample35 s35 = new Sample35("Sourabh", 30);
		s35.info();
	}
	
}
