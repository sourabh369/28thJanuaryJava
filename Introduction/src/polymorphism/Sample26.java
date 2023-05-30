package polymorphism;

public class Sample26 extends Sample25
{

	public static void main(String[] args) 
	{
	
		//binding of declaration and definition during compile time is called compile time polymorphism
		Sample25 s25 = new Sample25();
		s25.add(30,50);
		s25.add(10, 30, 80);
		
	}
	
}
