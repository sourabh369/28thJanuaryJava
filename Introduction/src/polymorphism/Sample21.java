package polymorphism;

public class Sample21
{

	public static void main(String[] args) 
	{
	
		// binding of declaration and definition takes place during run time
		Sample20 s20 = new Sample20();
		s20.add(10, 20);
		s20.add(50, 60, 10);   //method initialization/definition
		
	}
	
}
