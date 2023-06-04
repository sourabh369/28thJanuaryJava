package polymorphism;

public class TestSample6 
{

	public static void main(String[] args) 
	{
	
		//binding of method declaration and definition takes places during compile so called as compile time polymorphism or static binding or early binding ex. is method overloading
		Sample54 s54 = new Sample54();
		s54.add(10, 20);
		s54.add(10, 60, 90);
		
	}
	
	
}
