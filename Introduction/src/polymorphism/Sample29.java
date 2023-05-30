package polymorphism;

public class Sample29 
{

	public static void main(String[] args) 
	{
	
		//binding of declaration and definition takes place during run time is called as run time polymorphism
		Sample28 s28 = new Sample28();
		s28.car();
		s28.flat();
		s28.bike();
	}
	
}
