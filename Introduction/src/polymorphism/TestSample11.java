package polymorphism;

public class TestSample11 
{

	public static void main(String[] args) 
	{
		//binding of method declaration and definition takes place during compile time so called as compile time polymorphism
		Sample62 s62 = new Sample62();
		s62.add(10, 30);
		s62.add(50, 50, 60);
	}
	
}
