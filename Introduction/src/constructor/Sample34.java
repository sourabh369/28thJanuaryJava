package constructor;

public class Sample34 
{

	String name;
	int age;
	
	Sample34()
	{
		name="Sourabh";
		age=30;
	}
	
	public void info()
	{
		System.out.println("Name of the person is " + name + " age is " + age);
	}
	
	public static void main(String[] args) 
	{
	
		Sample34 s34 = new Sample34();
		s34.info();
	}
	
}
