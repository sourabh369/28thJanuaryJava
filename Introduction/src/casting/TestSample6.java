package casting;

public class TestSample6 
{

	public static void main(String[] args) 
	{
	
		//sending back super class properties by creating an object of subclass with reference/data type of super class is called as casting
		Father6 f6 = new Son6();
		f6.car();
		f6.flat();
		f6.money();
		
	}
	
}
