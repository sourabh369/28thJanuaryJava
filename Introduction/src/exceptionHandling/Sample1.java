package exceptionHandling;

public class Sample1 
{

	public static void main(String[] args)
	{
	
		String s = "abc";
		
		try
		{
			System.out.println(s.charAt(3));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			
		}
		
		System.out.println("Hi");
		
	}
	
}
