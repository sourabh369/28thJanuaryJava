package casting;

public class TestSample4 
{

	public static void main(String[] args) 
	{
	
//		Son4 s4 = new Son4();
//		s4.bike();
//		s4.car();
//		s4.flat();
		
		// Sending back super class properties by creating the object of subclass with reference/data type of super class
		Father4 f4 = new Son4();
		f4.car();
		f4.flat();
		f4.money();
		
	}
	
}
