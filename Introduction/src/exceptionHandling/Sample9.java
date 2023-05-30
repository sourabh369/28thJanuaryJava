package exceptionHandling;

public class Sample9 
{

	public static void main(String[] args) 
	{
	
		String s="abc";
		
		try
		{
			System.out.println(s.charAt(4));
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
			System.out.println("Generic exception handled");
		}
		
		
	}
	
}
