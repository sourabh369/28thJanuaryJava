package polymorphism;

public class Sample19 extends Sample18
{

	public static void main(String[] args) 
	{
	
		//method declaration and definition gets binded during compile time example of method overloading
		Sample18 s18 = new Sample18();
		s18.add(10, 20);
		s18.add(20, 50, 70);
		
	}
	
}
