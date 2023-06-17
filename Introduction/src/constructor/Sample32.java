package constructor;

public class Sample32 
{

	String name;
	int age;
	
	Sample32()
	{
		name="Sourabh";
		age=30;
	}
	
	public void info()
	{
		System.out.println("Name of emp is " + name + " age of the employee is " + age);
	}
	
	public static void main(String[] args) 
	{
		Sample32 s32 = new Sample32();
		s32.info();
	}
	
}
