package casting;

public class TestSample 
{

	public static void main(String[] args) 
	{
	
//		Son s1 = new Son();
//		s1.car();
//		s1.flat();
//		s1.money();
		
		
		//Object of son class with reference/datatype of father class
		Father f1 = new Son();
		f1.car();
		f1.flat();
		f1.money();
		
	}
	
}
