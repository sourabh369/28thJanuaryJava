package exceptionHandling;

public class Sample13 
{

	public static void main(String[] args) 
	{
	
		String s1= "abc";
		
		try
		{
			System.out.println(s1.charAt(9));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		
		
	}
	
}
