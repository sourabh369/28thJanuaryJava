package constructor;

public class Sample12 
{

	String name;
	int age;
	
	Sample12(String a , int b)
	{
		name = a;
		age = b;
	}
	
	Sample12(String a)
	{
//		this("Sourabh" , 30);
		name = a;
	}
	
	public void info() 
	{
	   System.out.println("Name is " + name + " age is " + age);	
	}
	
	public static void main(String[] args) 
	{
		Sample12 s12 = new Sample12("Ashish", 30);
		s12.info();
		
		Sample12 s13 = new Sample12("Ankita");
		s13.info();
	}
	
}
