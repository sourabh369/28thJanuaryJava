package exceptionHandling;

public class Sample6 
{

	public static void main(String[] args) 
	{
	
		String s= "Suresh";
		
		
		try
		{
			System.out.println(s.charAt(10));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String exception handled");
		}
		
		System.out.println("Hi");
		
		
	}
	
}
